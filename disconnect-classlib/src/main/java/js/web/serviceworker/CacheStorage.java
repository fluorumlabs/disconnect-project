package js.web.serviceworker;

import js.lang.Any;
import js.lang.BooleanPromise;
import js.lang.JsString;
import js.lang.Promise;
import js.util.collections.Array;
import js.web.fetch.Request;
import js.web.fetch.Response;
import org.teavm.jso.JSBody;

/**
 * The storage for Cache objects.
 */
public interface CacheStorage extends Any {
    @JSBody(script = "return CacheStorage.prototype")
    static CacheStorage prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CacheStorage()")
    static CacheStorage create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    BooleanPromise delete(String cacheName);

    BooleanPromise has(String cacheName);

    Promise<Array<JsString>> keys();

    Promise<Response> match(Request request, CacheQueryOptions options);

    Promise<Response> match(Request request);

    Promise<Response> match(String request, CacheQueryOptions options);

    Promise<Response> match(String request);

    Promise<Cache> open(String cacheName);

}
