package com.github.fluorumlabs.disconnect.core.toolchain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import org.apache.commons.lang3.StringUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.takes.Request;
import org.takes.Response;
import org.takes.Take;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;
import org.takes.http.BkBasic;
import org.takes.http.BkSafe;
import org.takes.http.FtBasic;
import org.takes.rs.RsEmpty;
import org.takes.rs.RsHtml;
import org.takes.tk.TkClasspath;
import org.teavm.debugging.information.DebugInformation;
import org.teavm.debugging.information.SourceLocation;
import org.teavm.model.MethodReference;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/**
 * Created by Artem Godin on 4/21/2020.
 */
public class DisconnectTestRunner extends Runner implements Filterable {
	private final Class<?> testClass;

	private final WebDriver driver;

	private final Semaphore semaphore = new Semaphore(0, false);

	private final ObjectMapper objectMapper = new ObjectMapper();

	private boolean shutdownServer;

	private Description suiteDescription;

	private String testFileName;

	private DebugInformation debugInformation;

	private List<Method> filteredChildren;

	private Map<Method, Description> descriptions = new ConcurrentHashMap<>();

	private Map<String, Consumer<TestResult>> testCallbacks = new ConcurrentHashMap<>();

	/**
	 * Instantiates a new Disconnect test runner.
	 *
	 * @param testClass the test class
	 */
	public DisconnectTestRunner(Class<?> testClass) {
		this.testClass = testClass;
		this.testFileName = StringUtils.replaceChars(testClass.getName(), '.', '_');

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		try (InputStream debugInformationSource = getClass().getResourceAsStream("/static/bin/" + testFileName + ".js" +
				".teavmdbg")) {
			debugInformation = DebugInformation.read(debugInformationSource);
		} catch (IOException e) {
			throw new IllegalStateException("Missing debug information", e);
		}
	}

	@Override
	public Description getDescription() {
		if (suiteDescription == null) {
			suiteDescription = Description.createSuiteDescription(testClass);
			for (Method child : getFilteredChildren()) {
				suiteDescription.addChild(describeChild(child));
			}
		}
		return suiteDescription;
	}

	@Override
	public void run(RunNotifier notifier) {
		Description description = getDescription();
		notifier.fireTestStarted(description);
		try {
			int currentPort = runDevServer();

			Map<String, Method> methodsToRun = new HashMap<>();
			testCallbacks.put("-", (res) -> handleTestSuiteResult(notifier, res));

			for (Method filteredChild : getFilteredChildren()) {
				Description methodDescription = describeChild(filteredChild);

				if (filteredChild.getAnnotation(Ignore.class) != null) {
					notifier.fireTestIgnored(methodDescription);
				} else {
					methodsToRun.put(filteredChild.getName(), filteredChild);
					testCallbacks.put(filteredChild.getName(), (res) -> handleTestResult(notifier,
							filteredChild.getName(), methodsToRun, res));
					notifier.fireTestStarted(methodDescription);
				}
			}
			String requestedTests = String.join(",", methodsToRun.keySet());

			driver.get("http://localhost:" + currentPort + "/index.html?" + requestedTests);

			if (!semaphore.tryAcquire(15, TimeUnit.MINUTES)) {
				// Tests timed out
				shutdownServer = true;

				throw new TimeoutException("Test execution timed out");
			}

			driver.close();
		} catch (Exception e) {
			notifier.fireTestFailure(new Failure(description, e));
		}
	}

	private void handleTestSuiteResult(RunNotifier notifier, TestResult res) {
		stopDevServer();

		if (res.getResult().equals("ok")) {
			return;
		}

		String result = res.getResult();
		String message = res.getMessage();
		notifier.fireTestFailure(new Failure(getDescription(), parseException(result, message, res.getTrace())));
	}

	private void handleTestResult(RunNotifier notifier, String method, Map<String, Method> methodsToRun, TestResult res) {
		Method test = methodsToRun.get(method);
		Description description = describeChild(test);
		String result = res.getResult();
		if ("ok".equals(result)) {
			notifier.fireTestFinished(description);
			return;
		}

		Test testAnnotation = test.getAnnotation(Test.class);

		String message = res.getMessage();
		if (testAnnotation != null && testAnnotation.expected().getName().equals(result)) {
			notifier.fireTestFinished(description);
			return;
		}

		notifier.fireTestFailure(new Failure(description, parseException(result, message, res.getTrace())));
	}

	private Throwable parseException(String className, String message, List<StackTraceyEntry> trace) {
		Throwable exception;

		if (AssertionError.class.getName().equals(className)) {
			exception = new AssertionError(message);
		} else {
			try {
				Class<?> exceptionClass = Class.forName(className);
				MethodHandle constructor = MethodHandles.publicLookup().findConstructor(exceptionClass,
						MethodType.methodType(void.class, String.class));
				exception = (Throwable) constructor.invoke(message);
			} catch (Throwable e) {
				exception = new RuntimeException(className + ": " + message);
			}
		}

		StackTraceElement[] stackTraceElements = trace.stream()
				.filter(stackTraceyEntry -> !StringUtils.equalsAny(stackTraceyEntry.getCallee(), "$rt_exception", "$rt_throw"))
				.map(stackTraceyEntry -> {
					String declaringClass;
					String methodName;
					String fileName = null;
					int lineNumber = -2;

					if (stackTraceyEntry.getFile() == null) {
						declaringClass = "..";
						methodName = stackTraceyEntry.getCallee();

						return new StackTraceElement(declaringClass, methodName, fileName, lineNumber);
					}

					if (stackTraceyEntry.getFile().equals("classes.js")) {
						SourceLocation sourceLocation =
								debugInformation.getSourceLocation(stackTraceyEntry.getLine()-1,
								stackTraceyEntry.getColumn()-1);

						MethodReference method = debugInformation.getMethodAt(stackTraceyEntry.getLine()-1,
								stackTraceyEntry.getColumn()-1);

						if (method != null) {
							declaringClass = method.getClassName();
							methodName = method.getName();

							if (sourceLocation != null && sourceLocation.getFileName() != null) {
								String[] split = StringUtils.split(sourceLocation.getFileName(), "/");
								fileName = split[split.length-1];
								lineNumber = sourceLocation.getLine();
							} else {
								lineNumber = -1;
							}
							return new StackTraceElement(declaringClass, methodName, fileName, lineNumber);
						}
					}

					declaringClass = "..";
					methodName = stackTraceyEntry.getCallee();
					fileName = stackTraceyEntry.getFile();
					lineNumber = stackTraceyEntry.getLine();

					return new StackTraceElement(declaringClass, methodName, fileName, lineNumber);
				}).toArray(StackTraceElement[]::new);

		exception.setStackTrace(stackTraceElements);

		return exception;
	}

	private List<Method> getFilteredChildren() {
		if (filteredChildren == null) {
			filteredChildren = getChildren();
		}
		return filteredChildren;
	}

	private List<Method> getChildren() {
		List<Method> children = new ArrayList<>();
		Class<?> cls = testClass;
		Set<String> foundMethods = new HashSet<>();
		while (cls != Object.class) {
			for (Method method : cls.getDeclaredMethods()) {
				if (foundMethods.add(method.getName()) && isTestMethod(method)) {
					children.add(method);
				}
			}
			cls = cls.getSuperclass();
		}

		return children;
	}

	private boolean isTestMethod(Method method) {
		if (TestCase.class.isAssignableFrom(method.getDeclaringClass())) {
			return method.getName().startsWith("test") && method.getName().length() > 4
					&& Character.isUpperCase(method.getName().charAt(4));
		} else {
			return method.isAnnotationPresent(Test.class);
		}
	}

	private Description describeChild(Method child) {
		return descriptions.computeIfAbsent(child, method -> Description.createTestDescription(testClass,
				method.getName()));
	}

	private String getTestHtml() {
		return "<html><head></head><body><script src=\"/static/bin/" + testFileName + ".js" +
				"\"" +
				" itemType=\"module\"></script></body></html>";
	}

	// FtBasic closes ServerSocket automatically
	private int runDevServer() throws IOException {
		shutdownServer = false;

		@SuppressWarnings("resource") ServerSocket serverSocket = new ServerSocket(0, 50,
				InetAddress.getLoopbackAddress());

		new Thread(() -> {
			try {
				new FtBasic(new BkSafe(new BkBasic(new TkFork(
						new FkRegex("/test-result", new TkTestResult()),
						new FkRegex("/index.html", new RsHtml(getTestHtml())),
						new FkRegex(".*", new TkClasspath(""))
				))), serverSocket).start(() -> shutdownServer);
			} catch (IOException e) {
				throw new RuntimeException("Cannot serve compiled tests", e);
			}
		}).start();

		return serverSocket.getLocalPort();
	}

	private void stopDevServer() {
		shutdownServer = true;
		semaphore.release();
	}

	@Override
	public void filter(Filter filter) throws NoTestsRemainException {
		for (Iterator<Method> iterator = getFilteredChildren().iterator(); iterator.hasNext(); ) {
			Method method = iterator.next();
			if (filter.shouldRun(describeChild(method))) {
				filter.apply(method);
			} else {
				iterator.remove();
			}
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class TestResult implements Serializable {
		private String method;
		private String result;
		private String message;
		private List<StackTraceyEntry> trace;

		public String getMethod() {
			return method;
		}

		public void setMethod(String method) {
			this.method = method;
		}

		public String getResult() {
			return result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public List<StackTraceyEntry> getTrace() {
			return trace;
		}

		public void setTrace(List<StackTraceyEntry> trace) {
			this.trace = trace;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class StackTraceyEntry implements Serializable {
		private String file;

		private String callee;

		private int line;

		private int column;

		public String getFile() {
			return file;
		}

		public void setFile(String file) {
			this.file = file;
		}

		public String getCallee() {
			return callee;
		}

		public void setCallee(String callee) {
			this.callee = callee;
		}

		public int getLine() {
			return line;
		}

		public void setLine(int line) {
			this.line = line;
		}

		public int getColumn() {
			return column;
		}

		public void setColumn(int column) {
			this.column = column;
		}
	}

	private class TkTestResult implements Take {
		@Override
		public Response act(Request req) throws Exception {
			TestResult testResult = objectMapper.readValue(req.body(), TestResult.class);

			String method = testResult.getMethod();

			testCallbacks.get(method).accept(testResult);
			testCallbacks.remove(method);
			if (testCallbacks.isEmpty()) {
				stopDevServer();
			}

			return new RsEmpty();
		}
	}

}
