package js.util.buffers;

import js.lang.Any;
import js.web.dom.BufferSource;
import org.teavm.jso.JSProperty;


public interface ArrayBufferView extends Any, BufferSource {
    /**
     * The ArrayBuffer instance referenced by the array.
     */
    @JSProperty
    ArrayBuffer getBuffer();

    /**
     * The length in bytes of the array.
     */
    @JSProperty
    int getByteLength();

    /**
     * The offset in bytes of the array.
     */
    @JSProperty
    int getByteOffset();
}
