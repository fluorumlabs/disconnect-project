package js.web.fetch;

import js.lang.Promise;
import js.util.buffers.Uint8Array;
import js.web.dom.Blob;
import js.web.dom.BufferSource;
import js.web.dom.FormData;
import js.web.dom.URLSearchParams;
import js.web.streams.ReadableStream;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** This Fetch API interface represents the response to a request. */
        public interface Response extends Body {
        @JSProperty
        Headers getHeaders();

        @JSProperty
        boolean isOk();

        @JSProperty
        boolean isRedirected();

        @JSProperty
        double getStatus();

        @JSProperty
        String getStatusText();

        @JSProperty
        Promise<Headers> getTrailer();
        @JSProperty
        ResponseType getType();

        @JSProperty
        String getUrl();

        Response clone();

        @JSBody(script = "return Response.prototype")
        static Response prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new Response()")
        static Response create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="body", script = "return new Response(body)")
        static Response create(Blob body) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }
        @JSBody(params="body", script = "return new Response(body)")
        static Response create(BufferSource body) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }
        @JSBody(params="body", script = "return new Response(body)")
        static Response create(FormData body) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }
        @JSBody(params="body", script = "return new Response(body)")
        static Response create(URLSearchParams body) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }
        @JSBody(params="body", script = "return new Response(body)")
        static Response create(ReadableStream<Uint8Array> body) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }
        @JSBody(params="body", script = "return new Response(body)")
        static Response create(String body) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"body","init"}, script = "return new Response(body, init)")
        static Response create(@Nullable Blob body, ResponseInit init) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }
        @JSBody(params={"body","init"}, script = "return new Response(body, init)")
        static Response create(@Nullable BufferSource body, ResponseInit init) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }
        @JSBody(params={"body","init"}, script = "return new Response(body, init)")
        static Response create(@Nullable FormData body, ResponseInit init) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }
        @JSBody(params={"body","init"}, script = "return new Response(body, init)")
        static Response create(@Nullable URLSearchParams body, ResponseInit init) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }
        @JSBody(params={"body","init"}, script = "return new Response(body, init)")
        static Response create(@Nullable ReadableStream<Uint8Array> body, ResponseInit init) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }
        @JSBody(params={"body","init"}, script = "return new Response(body, init)")
        static Response create(@Nullable String body, ResponseInit init) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return Response.error()")
        static Response error() {
                throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"url","status"}, script = "return Response.redirect(url, status)")
        static Response redirect(String url, int status) {
                throw new UnsupportedOperationException("Available only in JavaScript");
        }
        @JSBody(params={"url"}, script = "return Response.redirect(url)")
        static Response redirect(String url) {
                throw new UnsupportedOperationException("Available only in JavaScript");
        }

}
