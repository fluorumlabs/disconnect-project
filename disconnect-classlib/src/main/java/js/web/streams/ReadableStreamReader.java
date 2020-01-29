package js.web.streams;

import js.lang.Any;
import js.lang.Promise;
import js.lang.VoidPromise;
import org.teavm.jso.JSBody;


public interface ReadableStreamReader<R extends Any> extends Any {
        VoidPromise cancel();
        Promise<ReadableStreamReadResult<R>> read();
        void releaseLock();

        @JSBody(script = "return ReadableStreamReader.prototype")
        static ReadableStreamReader prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new ReadableStreamReader()")
        static ReadableStreamReader create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
