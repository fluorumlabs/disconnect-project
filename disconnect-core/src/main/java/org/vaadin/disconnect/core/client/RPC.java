package org.vaadin.disconnect.core.client;

import org.teavm.interop.Async;
import org.teavm.interop.AsyncCallback;
import org.teavm.jso.ajax.XMLHttpRequest;
import org.vaadin.disconnect.core.client.internals.DisconnectUtils;

import java.io.IOException;
import java.io.Serializable;

/**
 * Created by Artem Godin on 8/19/2019.
 */
public class RPC {
    public static final String ENDPOINT = "/rpc";

    public static class Request implements Serializable {
        public Request(Object[] args) {
            this.arguments = args;
        }

        public Object[] arguments;
    }

    public static void callPostIgnore(String endpoint, Object... arguments) {
        RPC.Request request = new Request(arguments);
        String payload = Convert.toString(request);

        try {
            callPostBackend(endpoint, payload);
        } catch (IOException ignored) {
            // ignore
        }
    }

    public static void callGetIgnore(String endpoint, Object... arguments) {
        RPC.Request request = new Request(arguments);
        String payload = Convert.toString(request);

        try {
            callGetBackend(endpoint, payload);
        } catch (IOException ignored) {
            // ignore
        }
    }

    public static <T extends Serializable> T callPost(String endpoint, Class<T> result, Object... arguments) {
        RPC.Request request = new Request(arguments);
        String payload = Convert.toString(request);
        String response = null;

        try {
            response = callPostBackend(endpoint, payload);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return Convert.toSerializable(response, result);
    }

    public static void callPost(String endpoint, Object... arguments) {
        RPC.Request request = new Request(arguments);
        String payload = Convert.toString(request);

        try {
            callPostBackend(endpoint, payload);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return;
    }

    @Async
    public static native String callPostBackend(String endpoint, String payload) throws IOException;

    private static void callPostBackend(String endpoint, String payload, AsyncCallback<String> callback) {
        XMLHttpRequest xhr = XMLHttpRequest.create();
        xhr.open("post", endpoint);
        xhr.setOnReadyStateChange(() -> {
            if (xhr.getReadyState() != XMLHttpRequest.DONE) {
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

    public static <T extends Serializable> T callGet(String endpoint, Class<T> result, Object... arguments) {
        RPC.Request request = new Request(arguments);
        String payload = DisconnectUtils.base64UrlEncode(Convert.toString(request));
        String response = null;

        try {
            response = callGetBackend(endpoint, payload);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return Convert.toSerializable(response, result);
    }

    public static void callGet(String endpoint, Object... arguments) {
        RPC.Request request = new Request(arguments);
        String payload = DisconnectUtils.base64UrlEncode(Convert.toString(request));

        try {
            callGetBackend(endpoint, payload);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return;
    }

    @Async
    public static native String callGetBackend(String endpoint, String payload) throws IOException;

    private static void callGetBackend(String endpoint, String payload, AsyncCallback<String> callback) {
        XMLHttpRequest xhr = XMLHttpRequest.create();
        xhr.open("get", endpoint + "?payload=" + payload);
        xhr.setOnReadyStateChange(() -> {
            if (xhr.getReadyState() != XMLHttpRequest.DONE) {
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

}
