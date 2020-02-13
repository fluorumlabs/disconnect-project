package com.github.fluorumlabs.disconnect.core;

import com.github.fluorumlabs.disconnect.core.adapters.ObjectAdapter;
import com.github.fluorumlabs.disconnect.core.internals.DisconnectConfig;
import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import js.lang.Any;
import js.lang.JsObject;
import js.lang.Unknown;
import js.util.JSON;
import js.web.dom.XMLHttpRequest;
import js.web.serversideevents.EventSource;
import org.teavm.interop.Async;
import org.teavm.interop.AsyncCallback;
import org.teavm.jso.JSBody;

import java.io.IOException;
import java.io.Serializable;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;


public class RPC {
	public static final String ENDPOINT = "/rpc";

	public static void callPostIgnore(String endpoint, Serializable arguments) {
		String payload = JSON.stringify(convertToArray(ObjectMirror.from(arguments)));

		try {
			callPostBackend(endpoint, payload);
		} catch (IOException ignored) {
			// ignore
		}
	}

	public static void callGetIgnore(String endpoint, Serializable arguments) {
		String payload = JSON.stringify(convertToArray(ObjectMirror.from(arguments)));

		try {
			callGetBackend(endpoint, payload);
		} catch (IOException ignored) {
			// ignore
		}
	}

	public static <T extends Serializable> Stream<T> callSse(String endpoint, Serializable arguments,
										 Serializable resultBuffer) {
		String payload = DisconnectUtils.base64UrlEncode(JSON.stringify(convertToArray(ObjectMirror.from(arguments))));
		String url = DisconnectConfig.getRpcHost() + endpoint + "?payload=" + payload;

		AsyncSpliterator<T> asyncSpliterator = new AsyncSpliterator<>();

		EventSource eventSource = EventSource.create(url);
		eventSource.addErrorEventListener(evt -> {
			eventSource.close();
			asyncSpliterator.completeExceptionally(new ConnectionClosedException());
		});
		eventSource.addMessageEventListener(evt -> {
			RPCExceptionResult exceptionResult = new RPCExceptionResult();
			Any returnValue = JSON.parse(evt.getData().stringValue());
			JsObject.assign(ObjectMirror.from(exceptionResult), returnValue);
			if (exceptionResult.exceptionClass != null) {
				asyncSpliterator.completeExceptionally(new ServerSideException(exceptionResult.exceptionClass,
						exceptionResult.exceptionMessage));
				eventSource.close();
			} else {
				JsObject.assign(ObjectMirror.from(resultBuffer), returnValue);
				asyncSpliterator.push(ObjectAdapter.readField(resultBuffer.getClass(), resultBuffer, "result"));
			}
		});

		return StreamSupport.stream(asyncSpliterator, false);
	}

	public static <T extends Serializable> void callPost(String endpoint, Serializable arguments, Serializable result) {
		String payload = JSON.stringify(convertToArray(ObjectMirror.from(arguments)));

		try {
			RPCExceptionResult exceptionResult = new RPCExceptionResult();
			Any returnValue = JSON.parse(callPostBackend(endpoint, payload));
			JsObject.assign(ObjectMirror.from(exceptionResult), returnValue);
			if (exceptionResult.exceptionClass != null) {
				throw new ServerSideException(exceptionResult.exceptionClass, exceptionResult.exceptionMessage);
			}
			JsObject.assign(ObjectMirror.from(result), returnValue);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void callPost(String endpoint, Serializable arguments) {
		RPCExceptionResult result = new RPCExceptionResult();
		String payload = JSON.stringify(convertToArray(ObjectMirror.from(arguments)));

		try {
			RPCExceptionResult exceptionResult = new RPCExceptionResult();
			Any returnValue = JSON.parse(callPostBackend(endpoint, payload));
			JsObject.assign(ObjectMirror.from(exceptionResult), returnValue);
			if (exceptionResult.exceptionClass != null) {
				throw new ServerSideException(exceptionResult.exceptionClass, exceptionResult.exceptionMessage);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Async
	public static native String callPostBackend(String endpoint, String payload) throws IOException;

	private static void callPostBackend(String endpoint, String payload, AsyncCallback<String> callback) {
		XMLHttpRequest xhr = XMLHttpRequest.create();
		xhr.open("post", DisconnectConfig.getRpcHost() + endpoint);
		xhr.setOnreadystatechange((e) -> {
			if (xhr.getReadyState() != XMLHttpRequest.ReadyState.DONE) {
				return;
			}

			int statusGroup = xhr.getStatus() / 100;
			if (statusGroup != 2 && statusGroup != 3) {
				callback.error(new IOException("HTTP status: " +
						xhr.getStatus() + " " + xhr.getStatusText()));
			} else {
				callback.complete(xhr.getResponseText());
			}
		});
		xhr.send(payload);
	}

	public static <T extends Serializable> void callGet(String endpoint, Serializable arguments,
														Serializable result) {
		String payload = DisconnectUtils.base64UrlEncode(JSON.stringify(convertToArray(ObjectMirror.from(arguments))));

		try {
			RPCExceptionResult exceptionResult = new RPCExceptionResult();
			Any returnValue = JSON.parse(callGetBackend(endpoint, payload));
			JsObject.assign(ObjectMirror.from(exceptionResult), returnValue);
			if (exceptionResult.exceptionClass != null) {
				throw new ServerSideException(exceptionResult.exceptionClass, exceptionResult.exceptionMessage);
			}
			JsObject.assign(ObjectMirror.from(result), returnValue);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void callGet(String endpoint, Serializable arguments) {
		String payload = DisconnectUtils.base64UrlEncode(JSON.stringify(convertToArray(ObjectMirror.from(arguments))));

		try {
			RPCExceptionResult exceptionResult = new RPCExceptionResult();
			Any returnValue = JSON.parse(callGetBackend(endpoint, payload));
			JsObject.assign(ObjectMirror.from(exceptionResult), returnValue);
			if (exceptionResult.exceptionClass != null) {
				throw new ServerSideException(exceptionResult.exceptionClass, exceptionResult.exceptionMessage);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Async
	public static native String callGetBackend(String endpoint, String payload) throws IOException;

	private static void callGetBackend(String endpoint, String payload, AsyncCallback<String> callback) {

		XMLHttpRequest xhr = XMLHttpRequest.create();
		xhr.open("get", DisconnectConfig.getRpcHost() + endpoint + "?payload=" + payload);
		xhr.setOnreadystatechange((e) -> {
			if (xhr.getReadyState() != XMLHttpRequest.ReadyState.DONE) {
				return;
			}

			int statusGroup = xhr.getStatus() / 100;
			if (statusGroup != 2 && statusGroup != 3) {
				callback.error(new IOException("HTTP status: " +
						xhr.getStatus() + " " + xhr.getStatusText()));
			} else {
				callback.complete(xhr.getResponseText());
			}
		});
		xhr.send();
	}

	@JSBody(params = "x", script = "return Object.entries(x).reduce(function(ini,[k,v]) { ini[k]=v; return ini },[])")
	private static native Unknown convertToArray(ObjectMirror<?> x);
}
