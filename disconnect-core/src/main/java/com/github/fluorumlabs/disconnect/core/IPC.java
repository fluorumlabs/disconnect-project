package com.github.fluorumlabs.disconnect.core;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectConfig;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.core.utils.SerDes;
import com.github.fluorumlabs.disconnect.core.utils.Serialized;
import js.lang.Any;
import js.lang.JsObject;
import js.lang.Unknown;
import js.util.JSON;
import js.web.channelmessaging.MessageEvent;
import js.web.webworkers.Worker;
import org.apache.commons.lang3.StringUtils;
import org.teavm.interop.Async;
import org.teavm.interop.AsyncCallback;
import org.teavm.jso.JSBody;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class IPC {
	private static final Map<String, Worker> WORKERS = new HashMap<>();
	private static final Map<String, AsyncCallback<String>> TASKS = new HashMap<>();

	public static void callIgnore(String endpoint, String method, Serializable arguments) {
		String payload = method + JSON.stringify(convertToArray(SerDes.serialize(arguments)));

		try {
			callBackend(endpoint, method, payload);
		} catch (IOException ignored) {
			// ignore
		}
	}

	public static <T extends Serializable> void call(String endpoint, String method, Serializable arguments,
													 Serializable result) {
		String payload = JSON.stringify(convertToArray(SerDes.serialize(arguments)));

		try {
			Any returnValue = JSON.parse(callBackend(endpoint, method, payload));
			IPCExceptionResult exceptionResult = SerDes.deserialize(returnValue.cast(), IPCExceptionResult.class);
			if (exceptionResult.exceptionClass != null) {
				throw new ServerSideException(exceptionResult.exceptionClass, exceptionResult.exceptionMessage);
			}
			Mirrored<Serializable> mirror = SerDes.mirror(result);
			JsObject.assign(mirror, returnValue);
			SerDes.deserialize(mirror.cast(), result.getClass());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void call(String endpoint, String method, Serializable arguments) {
		String payload = JSON.stringify(convertToArray(SerDes.serialize(arguments)));

		try {
			Any returnValue = JSON.parse(callBackend(endpoint, method, payload));
			IPCExceptionResult exceptionResult = SerDes.deserialize(returnValue.cast(), IPCExceptionResult.class);
			if (exceptionResult.exceptionClass != null) {
				throw new ServerSideException(exceptionResult.exceptionClass, exceptionResult.exceptionMessage);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Async
	public static native String callBackend(String endpoint, String method, String payload) throws IOException;

	private static void callBackend(String endpoint, String method, String payload, AsyncCallback<String> callback) {
		String id = method + ":" + generateUniqueKey();

		TASKS.put(id, callback);

		Worker worker = WORKERS.computeIfAbsent(endpoint, key -> {
			Worker newWorker = Worker.create(DisconnectConfig.getWebHost()+"/bin/" + endpoint);
			newWorker.addMessageEventListener(IPC::handleResponse);
			return newWorker;
		});

		worker.postMessage(Unknown.of(id+payload));
	}

	private static void handleResponse(MessageEvent event) {
		String result = event.getData().stringValue();

		String id = StringUtils.substringBefore(result, "{");
		AsyncCallback<String> stringAsyncCallback = TASKS.get(id);
		if (stringAsyncCallback != null) {
			TASKS.remove(id);
			stringAsyncCallback.complete(result.substring(id.length()));
		}
	}

	@JSBody(script = "return String(Math.random()).slice(2);")
	private static native String generateUniqueKey();

	@JSBody(params = "x", script = "return Object.entries(x).reduce(function(ini,[k,v]) { ini[k]=v; return ini },[])")
	private static native Unknown convertToArray(Serialized<?> x);

}
