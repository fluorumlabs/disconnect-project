package js.web.streams;

import js.lang.Any;
import js.lang.Promise;
import js.lang.VoidPromise;
import js.util.buffers.ArrayBufferView;
import org.teavm.jso.JSProperty;


public interface ReadableStreamBYOBReader extends Any {
        @JSProperty
        VoidPromise getClosed();

        VoidPromise cancel(Any reason);
        VoidPromise cancel();
        <T extends ArrayBufferView> Promise<ReadableStreamReadResult<T>> read(T view);
        void releaseLock();
        }
