package com.github.fluorumlabs.disconnect.core;

import js.lang.Any;
import js.lang.JsObject;
import js.lang.Unknown;
import js.util.JSON;
import js.web.channelmessaging.MessageEvent;
import js.web.webworkers.Worker;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.teavm.interop.Async;
import org.teavm.interop.AsyncCallback;
import org.teavm.jso.JSBody;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class IPC {
	private static final Logger log = LoggerFactory.getLogger(IPC.class);

	private static final Map<String, Worker> WORKERS = new HashMap<>();
	private static final Map<String, AsyncCallback<String>> TASKS = new HashMap<>();

	public static void callIgnore(String endpoint, String method, Serializable arguments) {
		log.debug("Serialization start");
		String payload = method + JSON.stringify(convertToArray(ObjectMirror.from(arguments)));
		log.debug("Serialization end");

		try {
			callBackend(endpoint, method, payload);
		} catch (IOException ignored) {
			// ignore
		}
	}

	public static <T extends Serializable> void call(String endpoint, String method, Serializable arguments,
													 Serializable result) {
		log.debug("Serialization start");
		String payload = JSON.stringify(convertToArray(ObjectMirror.from(arguments)));
		log.debug("Serialization end");

		try {
			IPCExceptionResult exceptionResult = new IPCExceptionResult();
			Any returnValue = JSON.parse(callBackend(endpoint, method, payload));
			JsObject.assign(ObjectMirror.from(exceptionResult), returnValue);
			if (exceptionResult.exceptionClass != null) {
				throw new ServerSideException(exceptionResult.exceptionClass, exceptionResult.exceptionMessage);
			}
			JsObject.assign(ObjectMirror.from(result), returnValue);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void call(String endpoint, String method, Serializable arguments) {
		log.debug("Serialization start");
		String payload = JSON.stringify(convertToArray(ObjectMirror.from(arguments)));
		log.debug("Serialization end");

		try {
			IPCExceptionResult exceptionResult = new IPCExceptionResult();
			Any returnValue = JSON.parse(callBackend(endpoint, method, payload));
			JsObject.assign(ObjectMirror.from(exceptionResult), returnValue);
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
			Worker newWorker = Worker.create("bin/" + endpoint);
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
	private static native Unknown convertToArray(ObjectMirror<?> x);

}
