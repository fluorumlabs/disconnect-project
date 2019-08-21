package com.github.fluorumlabs.disconnect.core.client;

import org.teavm.interop.Async;
import org.teavm.interop.AsyncCallback;
import org.teavm.jso.ajax.XMLHttpRequest;

import java.io.IOException;
import java.io.Serializable;

/**
 * Created by Artem Godin on 8/19/2019.
 */
public class RPC {
    public static final String ENDPOINT = "/_rpc";

    public static class Request implements Serializable {
        public Request(String service, String method, Object[] args) {
            this.arguments = args;
            this.service = service;
            this.method = method;
        }

        public Object[] arguments;
        public String service;
        public String method;
    }

    public static <T extends Serializable> T call(String service, String method, Class<T> result, Object... arguments) {
        RPC.Request request = new Request(service, method, arguments);
        String payload = Convert.toString(request);
        String response = null;

        try {
            response = callBackend(payload);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return Convert.toSerializable(response, result);
    }

    @Async
    public static native String callBackend(String payload) throws IOException;

    private static void callBackend(String payload, AsyncCallback<String> callback) {
        XMLHttpRequest xhr = XMLHttpRequest.create();
        xhr.open("post", ENDPOINT);
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

}
