package js.web.webcrypto;

import js.lang.Any;
import js.util.buffers.ArrayBufferView;
import org.teavm.jso.JSBody;


public interface RandomSource extends Any {
    @JSBody(script = "return RandomSource.prototype")
    static RandomSource prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RandomSource()")
    static RandomSource create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    <T extends ArrayBufferView> T getRandomValues(T array);

}
