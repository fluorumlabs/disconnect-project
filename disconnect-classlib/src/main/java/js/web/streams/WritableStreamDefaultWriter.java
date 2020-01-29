package js.web.streams;

import js.lang.Any;
import js.lang.JsVoid;
import js.lang.Promise;
import js.lang.VoidPromise;
import org.teavm.jso.JSProperty;

/** This Streams API interface is the object returned by WritableStream.getWriter() and once created locks the < writer to the WritableStream ensuring that no other streams can write to the underlying sink. */
        public interface WritableStreamDefaultWriter<W extends Any> {
        @JSProperty
        VoidPromise getClosed();
        @JSProperty
        int  getDesiredSize();

    @JSProperty
    VoidPromise getReady();
    VoidPromise abort(Any reason);
    VoidPromise abort();
    VoidPromise close();
        void releaseLock();
    VoidPromise write(W chunk);
        }
