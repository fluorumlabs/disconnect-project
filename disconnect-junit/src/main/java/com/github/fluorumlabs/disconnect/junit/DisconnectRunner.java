package com.github.fluorumlabs.disconnect.junit;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Artem Godin on 4/21/2020.
 */
public class DisconnectRunner extends Runner {
	private final Class<?> testClass;

	private Description suiteDescription;

	public DisconnectRunner(Class<?> testClass) {
		this.testClass = testClass;
	}

	@Override
	public Description getDescription() {
		if (suiteDescription == null) {
			suiteDescription = Description.createSuiteDescription(testClass);
			for (Method child : getChildren()) {
				suiteDescription.addChild(describeChild(child));
			}
		}
		return suiteDescription;
	}

	@Override
	public void run(RunNotifier notifier) {

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
		return Description.createTestDescription(testClass,
				child.getName());
	}
}
