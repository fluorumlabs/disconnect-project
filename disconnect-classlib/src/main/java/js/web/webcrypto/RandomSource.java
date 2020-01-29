package js.web.webcrypto;

import org.teavm.jso.JSBody;

import js.lang.Any;
import js.util.buffers.ArrayBufferView;


public interface RandomSource extends Any {
        <T extends ArrayBufferView> T getRandomValues(T array);

        @JSBody(script = "return RandomSource.prototype")
        static RandomSource prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new RandomSource()")
        static RandomSource create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
