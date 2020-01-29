package js.web.serviceworker;

import js.lang.Any;
import js.lang.BooleanPromise;
import js.lang.Promise;
import js.lang.VoidPromise;
import js.util.collections.Array;
import js.util.collections.ReadonlyArray;
import js.util.iterable.JsIterable;
import js.web.fetch.Request;
import js.web.fetch.Response;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;

/**
 * Provides a storage mechanism for Request / Response object pairs that are cached, for example as part of the ServiceWorker life cycle. Note that the Cache interface is exposed to windowed scopes as well as workers. You don't have to use it in conjunction with service workers, even though it is defined in the service worker spec.
 */
public interface Cache extends Any {
    @JSBody(script = "return Cache.prototype")
    static Cache prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Cache()")
    static Cache create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    VoidPromise add(Request request);

    VoidPromise add(String request);

    @JSBody(params = "requests", script = "return this.addAll.apply(this, requests)")
    VoidPromise addAll(@JSByRef Request... requests);

    @JSBody(params = "requests", script = "return this.addAll.apply(this, requests)")
    VoidPromise addAll(@JSByRef String... requests);

    VoidPromise addAll(Array<Request> requests);

    VoidPromise addAll(JsIterable<Request> requests);

    BooleanPromise delete(Request request, CacheQueryOptions options);

    BooleanPromise delete(String request, CacheQueryOptions options);

    BooleanPromise delete(Request request);

    BooleanPromise delete(String request);

    Promise<ReadonlyArray<Request>> keys(Request request, CacheQueryOptions options);

    Promise<ReadonlyArray<Request>> keys(String request, CacheQueryOptions options);

    Promise<ReadonlyArray<Request>> keys(Request request);

    Promise<ReadonlyArray<Request>> keys(String request);

    Promise<ReadonlyArray<Request>> keys();

    Promise<Response> match(Request request, CacheQueryOptions options);

    Promise<Response> match(String request, CacheQueryOptions options);

    Promise<Response> match(Request request);

    Promise<Response> match(String request);

    Promise<ReadonlyArray<Response>> matchAll(Request request, CacheQueryOptions options);

    Promise<ReadonlyArray<Response>> matchAll(String request, CacheQueryOptions options);

    Promise<ReadonlyArray<Response>> matchAll(Request request);

    Promise<ReadonlyArray<Response>> matchAll(String request);

    Promise<ReadonlyArray<Response>> matchAll();

    VoidPromise put(Request request, Response response);

    VoidPromise put(String request, Response response);

}
