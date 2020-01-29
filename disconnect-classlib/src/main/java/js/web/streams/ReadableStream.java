package js.web.streams;

import js.extras.JsEnum;
import js.lang.Any;
import js.lang.VoidPromise;
import js.util.buffers.Uint8Array;
import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * This Streams API interface represents a readable stream of byte data. The Fetch API offers a concrete instance of a ReadableStream through the body property of a Response object.
 */
public interface ReadableStream<R extends Any> extends Any {
    @JSBody(script = "return ReadableStream.prototype")
    static ReadableStream prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "underlyingSource", script = "return new ReadableStream(underlyingSource)")
    static ReadableStream<Uint8Array> create(UnderlyingByteSource underlyingSource) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"underlyingSource", "strategy"}, script = "return new ReadableStream(underlyingSource, strategy)")
    static ReadableStream<Uint8Array> create(UnderlyingByteSource underlyingSource, Strategy strategy) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new ReadableStream()")
    static <R extends Any> ReadableStream<R> create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "underlyingSource", script = "return new ReadableStream(underlyingSource)")
    static <R extends Any> ReadableStream<R> create(UnderlyingSource<R> underlyingSource) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"underlyingSource", "strategy"}, script = "return new ReadableStream(underlyingSource, strategy)")
    static <R extends Any> ReadableStream<R> create(UnderlyingSource<R> underlyingSource, QueuingStrategy<R> strategy) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isLocked();

    VoidPromise cancel(Any reason);

    VoidPromise cancel();

    ReadableStreamBYOBReader getReader(Options options);

    ReadableStreamDefaultReader<R> getReader();

    <T extends Any> ReadableStream<T> pipeThrough(PipeThrough<R, T> pipeThrough, PipeOptions options);

    <T extends Any> ReadableStream<T> pipeThrough(PipeThrough<R, T> pipeThrough);

    VoidPromise pipeTo(WritableStream<R> dest, PipeOptions options);

    VoidPromise pipeTo(WritableStream<R> dest);

    Array<ReadableStream<R>> tee();

    interface Options extends Any {
        @JSProperty
        OptionsMode getMode();

        @JSProperty
        void setMode(OptionsMode mode);
    }

    interface PipeThrough<R extends Any, T extends Any> extends Any {
        @JSProperty
        WritableStream<R> getWritable();

        @JSProperty
        void setWritable(WritableStream<R> writable);

        @JSProperty
        ReadableStream<T> getReadable();

        @JSProperty
        void setReadable(ReadableStream<T> readable);

    }

    interface Strategy extends Any {
        @JSProperty
        int getHighWaterMark();

        @JSProperty
        void setHighWaterMark(int highWaterMark);

        @JSProperty
        int getSize();

        @JSProperty
        void setSize(int size);
    }

    abstract class OptionsMode extends JsEnum {
        public static final OptionsMode BYOB = JsEnum.of("byob");

    }


}
