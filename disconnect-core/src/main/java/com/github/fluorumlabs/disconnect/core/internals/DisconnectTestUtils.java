package com.github.fluorumlabs.disconnect.core.internals;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.JsString;
import js.util.JSON;
import js.web.dom.Window;
import js.web.fetch.RequestInit;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.platform.Platform;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Artem Godin on 4/21/2020.
 */
@NpmPackage(name = "stacktracey", version = "1.2.127")
@Import(symbols = "StackTracey", module = "stacktracey", defaultExport = true)
public final class DisconnectTestUtils {
	private DisconnectTestUtils() {
	}

	public static Set<String> getMethodsToTest() {
		Set<String> result = new HashSet<>();

		String search = Window.LOCATION.getSearch();
		if (search.isEmpty()) {
			return result;
		}

		for (JsString jsString : JsString.of(search.substring(1)).split(",").iterable()) {
			result.add(jsString.toString());
		}

		return result;
	}

	public static void ok(String method) {
		ResultData resultData = Any.empty();
		resultData.setMethod(method);
		resultData.setResult("ok");

		RequestInit requestInit = Any.empty();
		requestInit.setBody(JSON.stringify(resultData));
		requestInit.setMethod("POST");

		Window.CONSOLE.log(method + ": ok");
		Window.WINDOW.fetch("/test-result", requestInit);
	}

	public static void fail(String method, Throwable t) {
		ResultData resultData = Any.empty();
		resultData.setMethod(method);
		resultData.setResult(t.getClass().getName());
		resultData.setMessage(t.getMessage());
		resultData.setTrace(getStackTrace(Platform.getPlatformObject(t)));

		RequestInit requestInit = Any.empty();
		requestInit.setBody(JSON.stringify(resultData));
		requestInit.setMethod("POST");

		Window.CONSOLE.warn(method + ": " + t.getClass().getName());
		Window.WINDOW.fetch("/test-result", requestInit);
	}

	public static void epicOk() {
		ResultData resultData = Any.empty();
		resultData.setMethod("-");
		resultData.setResult("ok");

		RequestInit requestInit = Any.empty();
		requestInit.setBody(JSON.stringify(resultData));
		requestInit.setMethod("POST");

		Window.CONSOLE.log("Suite: ok");
		Window.WINDOW.fetch("/test-result", requestInit);
	}

	public static void epicFail(Throwable t) {
		ResultData resultData = Any.empty();
		resultData.setMethod("-");
		resultData.setResult(t.getClass().getName());
		resultData.setMessage(t.getMessage());
		resultData.setTrace(getStackTrace(Platform.getPlatformObject(t)));

		RequestInit requestInit = Any.empty();
		requestInit.setBody(JSON.stringify(resultData));
		requestInit.setMethod("POST");

		Window.CONSOLE.warn("Suite: " + t.getClass().getName());
		Window.WINDOW.fetch("/test-result", requestInit);
	}

	@JSBody(params = "ex", script = "var trace = new StackTracey(ex.$jsException).withSources;\n" +
			"var result = trace.map(function (x) {\n" +
			"    return {\n" +
			"        callee: x.callee,\n" +
			"        file: x.fileName,\n" +
			"        line: x.line,\n" +
			"        column: x.column,\n" +
			"    };\n" +
			"});\n" +
			"\n" +
			"return result")
	private static native JSObject getStackTrace(JSObject ex);

	private interface ResultData extends Any {
		@JSProperty
		void setMethod(String method);

		@JSProperty
		void setResult(String result);

		@JSProperty
		void setMessage(String message);

		@JSProperty
		void setTrace(JSObject trace);
	}
}
