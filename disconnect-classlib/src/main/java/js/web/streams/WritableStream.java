package js.web.streams;

import js.lang.Any;
import js.lang.VoidPromise;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * This Streams API interface provides a standard abstraction for writing streaming data to a destination, known as a sink. This object comes with built-in backpressure and queuing.
 */
public interface WritableStream<W extends Any> extends Any {
    @JSBody(script = "return WritableStream.prototype")
    static WritableStream prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WritableStream()")
    static WritableStream create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "underlyingSink", script = "return new WritableStream(underlyingSink)")
    static <W extends Any> WritableStream<W> create(UnderlyingSink<W> underlyingSink) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"underlyingSink", "strategy"}, script = "return new WritableStream(underlyingSink, strategy)")
    static <W extends Any> WritableStream<W> create(UnderlyingSink<W> underlyingSink, QueuingStrategy<W> strategy) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isLocked();

    VoidPromise abort(Any reason);

    VoidPromise abort();

    WritableStreamDefaultWriter<W> getWriter();


}
