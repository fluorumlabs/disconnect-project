package js.web.streams;

import js.lang.Any;
import js.util.buffers.ArrayBufferView;
import org.teavm.jso.JSProperty;


public interface ReadableStreamBYOBRequest extends Any {
    @JSProperty
    ArrayBufferView getView();

    void respond(int bytesWritten);

    void respondWithNewView(ArrayBufferView view);
}
