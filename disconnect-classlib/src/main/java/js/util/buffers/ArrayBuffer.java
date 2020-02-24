package js.util.buffers;

import js.lang.Any;
import js.web.dom.BufferSource;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Represents a raw buffer of binary data, which is used to store data for the
 * different typed arrays. ArrayBuffers cannot be read from or written to directly,
 * but can be passed to a typed array or DataView Object to interpret the raw
 * buffer as needed.
 */
public interface ArrayBuffer extends Any, BufferSource, Transferable {
    /**
     * Create array buffer.
     *
     * @param byteLength the byte length
     *
     * @return the array buffer
     */
    @JSBody(params = "byteLength", script = "return new ArrayBuffer(byteLength)")
    static ArrayBuffer create(int byteLength) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Prototype array buffer.
     *
     * @return the array buffer
     */
    @JSBody(script = "return ArrayBuffer.prototype")
    static ArrayBuffer prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Read-only. The length of the ArrayBuffer (in bytes).
     *
     * @return the byte length
     */
    @JSProperty
    int getByteLength();

    /**
     * Returns a section of an ArrayBuffer.
     *
     * @param begin the begin
     * @param end   the end
     *
     * @return the array buffer
     */
    ArrayBuffer slice(int begin, int end);

    /**
     * Slice array buffer.
     *
     * @param begin the begin
     *
     * @return the array buffer
     */
    ArrayBuffer slice(int begin);
}
