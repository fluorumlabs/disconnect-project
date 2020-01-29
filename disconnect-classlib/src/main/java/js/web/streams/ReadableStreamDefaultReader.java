package js.web.streams;

import js.lang.Any;
import js.lang.JsVoid;
import js.lang.Promise;
import js.lang.VoidPromise;
import org.teavm.jso.JSProperty;


public interface ReadableStreamDefaultReader<R extends Any> extends Any {
        @JSProperty
        VoidPromise getClosed();
        VoidPromise cancel(Any reason);
        VoidPromise cancel();
        Promise<ReadableStreamReadResult<R>> read();
        void releaseLock();
        }
