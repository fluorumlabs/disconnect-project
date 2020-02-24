package js.util.buffers;

import js.lang.Any;
import js.web.dom.BufferSource;
import org.teavm.jso.JSProperty;


/**
 * The interface Array buffer view.
 */
public interface ArrayBufferView extends Any, BufferSource {
    /**
     * The ArrayBuffer instance referenced by the array.
     *
     * @return the buffer
     */
    @JSProperty
    ArrayBuffer getBuffer();

    /**
     * The length in bytes of the array.
     *
     * @return the byte length
     */
    @JSProperty
    int getByteLength();

    /**
     * The offset in bytes of the array.
     *
     * @return the byte offset
     */
    @JSProperty
    int getByteOffset();
}
