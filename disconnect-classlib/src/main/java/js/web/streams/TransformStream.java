package js.web.streams;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface TransformStream<I extends Any, O extends Any> {
        @JSProperty
        ReadableStream<O> getReadable();

        @JSProperty
        WritableStream<I> getWritable();

        @JSBody(script = "return TransformStream.prototype")
        static TransformStream prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new TransformStream()")
        static TransformStream create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="transformer", script = "return new TransformStream(transformer)")
        static <I extends Any, O extends Any>  TransformStream<I, O> create(Transformer<I, O> transformer) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"transformer","writableStrategy"}, script = "return new TransformStream(transformer, writableStrategy)")
        static<I extends Any, O extends Any>  TransformStream<I, O> create(Transformer<I, O> transformer, QueuingStrategy<I> writableStrategy) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"transformer","writableStrategy","readableStrategy"}, script = "return new TransformStream(transformer, writableStrategy, readableStrategy)")
         static <I extends Any, O extends Any> TransformStream<I, O> create(Transformer<I, O> transformer, QueuingStrategy<I> writableStrategy, QueuingStrategy<O> readableStrategy) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
