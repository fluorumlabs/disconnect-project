package com.github.fluorumlabs.disconnect.core;

import com.github.fluorumlabs.disconnect.core.utils.BeanProperties;
import com.github.fluorumlabs.disconnect.core.utils.SerDes;
import com.github.fluorumlabs.disconnect.core.utils.Serialized;
import js.lang.Any;
import js.lang.Unknown;
import js.util.JSON;
import js.web.webworkers.DedicatedWorkerGlobalScope;
import org.apache.commons.lang3.StringUtils;
import org.teavm.jso.JSBody;
import org.teavm.metaprogramming.*;
import org.teavm.metaprogramming.reflect.ReflectMethod;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.github.fluorumlabs.disconnect.core.internals.CamelCaseUtils.toKebabCase;
import static org.teavm.metaprogramming.Metaprogramming.emit;
import static org.teavm.metaprogramming.Metaprogramming.lazy;

/**
 * Created by Artem Godin on 2/28/2020.
 */
@CompileTime
public final class IPCHandler {
	private IPCHandler() {
	}

	public static void setupIPC(Class<?> clazz, Object instance) {
		DedicatedWorkerGlobalScope.SELF.addMessageEventListener(evt -> {
			handle(clazz, instance, evt.getData().stringValue());
		});
	}

	@Meta
	private static native void handle(Class<?> clazz, Object instance, String payload);

	private static void handle(ReflectClass<?> clazz, Value<Object> instance, Value<String> payload) {
		List<ReflectMethod> methods = Arrays.stream(clazz.getDeclaredMethods())
				.filter(reflectMethod -> Modifier.isPublic(reflectMethod.getModifiers()) && !Modifier.isStatic(reflectMethod.getModifiers()))
				.collect(Collectors.toList());

		String base = clazz.getName();

		Value<String> idValue = emit(() -> StringUtils.substringBefore(payload.get(), "["));
		Value<String> methodName = emit(() -> StringUtils.substringBefore(idValue.get(), ":"));
		Value<String> realPayload = emit(() -> payload.get().substring(idValue.get().length()));

		for (ReflectMethod method : methods) {
			if (method.getName().startsWith("<")) {
				continue;
			}
			String methodBase = base + StringUtils.capitalize(method.getName());
			String currentMethodName = toKebabCase(method.getName());
			int parameterCount = method.getParameterCount();

			ReflectClass<?> arguments = Metaprogramming.findClass(methodBase + "Arguments");
			ReflectClass<?> result = Metaprogramming.findClass(methodBase + "Result");

			Value<Serializable> argumentValue =
					lazy(() -> {
						Serializable serializable = SerDes.deserialize(convertToObject(JSON.parse(realPayload.get())),(Class<Serializable>) arguments.asJavaClass());

						return serializable;
					});

			Value<Serializable> resultValue = emit(() -> {
				try {
					return (Serializable)result.asJavaClass().newInstance();
				} catch (InstantiationException | IllegalAccessException e) {
					throw new IllegalStateException("Cannot create instance of "+result.asJavaClass().getName(), e);
				}
			});
			Value<Object[]> argumentArray = emit(() -> new Object[parameterCount]);

			for (int i = 0; i < method.getParameterCount(); i++) {
				int iFinal = i;
				String argName = "arg"+i;
				Value<Object[]> argumentArrayFinal = argumentArray;
				argumentArray = lazy(() -> {
					Object[] intermediate = argumentArrayFinal.get();
					intermediate[iFinal] = BeanProperties.read(arguments.asJavaClass(),
							argumentValue.get(), argName);
					return intermediate;
				});
			}

			Value<Object[]> argumentArrayFinal = argumentArray;
			Value<Object> callResult = lazy(() -> method.invoke(instance.get(), argumentArrayFinal.get()));

			if ("void".equals(method.getReturnType().getName())) {
				emit(() -> {
					if (currentMethodName.equals(methodName.get())) {
						callResult.get();
					}
				});
			} else {
				emit(() -> {
					if (currentMethodName.equals(methodName.get())) {
						BeanProperties.write(result.asJavaClass(), resultValue.get(), "result", callResult.get());
						String returnedValue = idValue.get()+JSON.stringify(SerDes.serialize(resultValue.get()));
						DedicatedWorkerGlobalScope.SELF.postMessage(Unknown.of(returnedValue));
					}
				});
			}
		}
	}

	@JSBody(params = "x", script = "return Object.entries(x).reduce(function(ini,[k,v]) { ini[k]=v; return ini },{})")
	private static native <T extends Serializable> Serialized<T> convertToObject(Any x);

}
