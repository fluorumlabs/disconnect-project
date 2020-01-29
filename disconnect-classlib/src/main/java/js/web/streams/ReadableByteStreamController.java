package js.web.streams;

import js.lang.Any;
import js.util.buffers.ArrayBufferView;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ReadableByteStreamController extends Any {
    @JSProperty
    @Nullable
    ReadableStreamBYOBRequest getByobRequest();

    @JSProperty
    int getDesiredSize();

    void close();

    void enqueue(ArrayBufferView chunk);

    void error(Any error);

    void error();
}
