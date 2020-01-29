package js.web.streams;

import org.teavm.jso.JSProperty;

import js.lang.Any;
import js.util.buffers.ArrayBufferView;


public interface ReadableStreamBYOBRequest extends Any {
        @JSProperty
        ArrayBufferView getView();

        void respond(int bytesWritten);
        void respondWithNewView(ArrayBufferView view);
        }
