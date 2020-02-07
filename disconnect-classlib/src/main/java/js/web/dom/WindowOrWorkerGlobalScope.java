package js.web.dom;

import js.extras.Handle;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Promise;
import js.util.function.JsRunnable;
import js.web.canvas.ImageBitmap;
import js.web.canvas.ImageBitmapSource;
import js.web.fetch.Request;
import js.web.fetch.RequestInit;
import js.web.fetch.Response;
import js.web.indexeddb.IDBFactory;
import js.web.performance.Performance;
import js.web.serviceworker.CacheStorage;
import js.web.webcrypto.Crypto;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;


public interface WindowOrWorkerGlobalScope extends Any {
    @JSProperty
    CacheStorage getCaches();

    @JSProperty
    Crypto getCrypto();

    @JSProperty
    IDBFactory getIndexedDB();

    @JSProperty
    String getOrigin();

    @JSProperty
    Performance getPerformance();

    String atob(String data);

    String btoa(String data);

    void clearInterval(IntervalHandle handle);

    void clearTimeout(TimeoutHandle handle);

    Promise<ImageBitmap> createImageBitmap(ImageBitmapSource image);

    Promise<ImageBitmap> createImageBitmap(ImageBitmapSource image, int sx, int sy, int sw, int sh);

    Promise<Response> fetch(Request input, RequestInit init);

    Promise<Response> fetch(Request input);

    Promise<Response> fetch(String input, RequestInit init);

    Promise<Response> fetch(String input);

    void queueMicrotask(JsFunction callback);

    @JSBody(params = {"handler", "timeout", "arguments"}, script = "this.setInterval.apply(this, [handler, timeout].concat(arguments))")
    IntervalHandle setInterval(String handler, double timeout, Any... arguments);

    @JSBody(params = {"handler", "timeout", "arguments"}, script = "this.setTimeout.apply(this, [handler, timeout].concat(arguments))")
    TimeoutHandle setTimeout(String handler, double timeout, Any... arguments);

    @JSBody(params = {"handler", "timeout", "arguments"}, script = "this.setInterval.apply(this, [handler, timeout].concat(arguments))")
    IntervalHandle setInterval(JsFunction handler, double timeout, Any... arguments);

    @JSBody(params = {"handler", "timeout", "arguments"}, script = "this.setTimeout.apply(this, [handler, timeout].concat(arguments))")
    TimeoutHandle setTimeout(JsFunction handler, double timeout, Any... arguments);

    IntervalHandle setInterval(JsRunnable handler, double timeout);

    TimeoutHandle setTimeout(JsRunnable handler, double timeout);

    abstract class IntervalHandle extends Handle {

    }

    abstract class TimeoutHandle extends Handle {
    }

}
