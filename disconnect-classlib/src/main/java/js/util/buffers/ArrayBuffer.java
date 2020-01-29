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
     * Read-only. The length of the ArrayBuffer (in bytes).
     */
    @JSProperty
    int getByteLength();

    /**
     * Returns a section of an ArrayBuffer.
     */
    ArrayBuffer slice(int begin, int end);
    ArrayBuffer slice(int begin);

    @JSBody(params = "byteLength", script = "return new ArrayBuffer(byteLength)")
    static ArrayBuffer create(int byteLength) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return ArrayBuffer.prototype")
    static ArrayBuffer prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
