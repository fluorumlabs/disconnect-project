package js.web.streams;

import js.lang.Any;
import js.util.buffers.ArrayBufferView;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams.
 */
public interface ByteLengthQueuingStrategy extends QueuingStrategy<ArrayBufferView> {
    @JSBody(script = "return ByteLengthQueuingStrategy.prototype")
    static ByteLengthQueuingStrategy prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "options", script = "return new ByteLengthQueuingStrategy(options)")
    static ByteLengthQueuingStrategy create(Options options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    int getHighWaterMark();

    @JSProperty
    void setHighWaterMark(int highWaterMark);

    int size(ArrayBufferView chunk);

    interface Options extends Any {
        @JSProperty
        int getHighWaterMark();

        @JSProperty
        void setHighWaterMark(int highWaterMark);
    }

}
