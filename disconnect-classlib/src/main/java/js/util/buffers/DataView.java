package js.util.buffers;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface DataView extends ArrayBufferView, Any {
    @JSBody(params = {"buffer", "byteOffset", "byteLength"}, script = "return new DataView(buffer, byteOffset, byteLength)")
    static DataView create(ArrayBuffer buffer, int byteOffset, int byteLength) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"buffer", "byteOffset"}, script = "return new DataView(buffer, byteOffset)")
    static DataView create(ArrayBuffer buffer, int byteOffset) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"buffer"}, script = "return new DataView(buffer)")
    static DataView create(ArrayBuffer buffer) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Gets the Float32 value at the specified byte offset from the start of the view. There is
     * no alignment constraint; multi-byte values may be fetched from any offset.
     *
     * @param byteOffset The place in the buffer at which the value should be retrieved.
     */
    float getFloat32(int byteOffset, boolean littleEndian);

    float getFloat32(int byteOffset);

    /**
     * Gets the Float64 value at the specified byte offset from the start of the view. There is
     * no alignment constraint; multi-byte values may be fetched from any offset.
     *
     * @param byteOffset The place in the buffer at which the value should be retrieved.
     */
    double getFloat64(int byteOffset, boolean littleEndian);

    double getFloat64(int byteOffset);

    /**
     * Gets the Int8 value at the specified byte offset from the start of the view. There is
     * no alignment constraint; multi-byte values may be fetched from any offset.
     *
     * @param byteOffset The place in the buffer at which the value should be retrieved.
     */
    byte getInt8(int byteOffset);

    /**
     * Gets the Int16 value at the specified byte offset from the start of the view. There is
     * no alignment constraint; multi-byte values may be fetched from any offset.
     *
     * @param byteOffset The place in the buffer at which the value should be retrieved.
     */
    short getInt16(int byteOffset, boolean littleEndian);

    short getInt16(int byteOffset);

    /**
     * Gets the Int32 value at the specified byte offset from the start of the view. There is
     * no alignment constraint; multi-byte values may be fetched from any offset.
     *
     * @param byteOffset The place in the buffer at which the value should be retrieved.
     */
    int getInt32(int byteOffset, boolean littleEndian);

    int getInt32(int byteOffset);

    /**
     * Gets the Uint8 value at the specified byte offset from the start of the view. There is
     * no alignment constraint; multi-byte values may be fetched from any offset.
     *
     * @param byteOffset The place in the buffer at which the value should be retrieved.
     */
    short getUint8(int byteOffset);

    /**
     * Gets the Uint16 value at the specified byte offset from the start of the view. There is
     * no alignment constraint; multi-byte values may be fetched from any offset.
     *
     * @param byteOffset The place in the buffer at which the value should be retrieved.
     */
    int getUint16(int byteOffset, boolean littleEndian);

    int getUint16(int byteOffset);

    /**
     * Gets the Uint32 value at the specified byte offset from the start of the view. There is
     * no alignment constraint; multi-byte values may be fetched from any offset.
     *
     * @param byteOffset The place in the buffer at which the value should be retrieved.
     */
    int getUint32(int byteOffset, boolean littleEndian);

    int getUint32(int byteOffset);

    /**
     * Stores an Float32 value at the specified byte offset from the start of the view.
     *
     * @param byteOffset   The place in the buffer at which the value should be set.
     * @param value        The value to set.
     * @param littleEndian If false or undefined, a big-endian value should be written,
     *                     otherwise a little-endian value should be written.
     */
    void setFloat32(int byteOffset, float value, boolean littleEndian);

    void setFloat32(int byteOffset, float value);

    /**
     * Stores an Float64 value at the specified byte offset from the start of the view.
     *
     * @param byteOffset   The place in the buffer at which the value should be set.
     * @param value        The value to set.
     * @param littleEndian If false or undefined, a big-endian value should be written,
     *                     otherwise a little-endian value should be written.
     */
    void setFloat64(int byteOffset, double value, boolean littleEndian);

    void setFloat64(int byteOffset, double value);

    /**
     * Stores an Int8 value at the specified byte offset from the start of the view.
     *
     * @param byteOffset The place in the buffer at which the value should be set.
     * @param value      The value to set.
     */
    void setInt8(int byteOffset, byte value);

    /**
     * Stores an Int16 value at the specified byte offset from the start of the view.
     *
     * @param byteOffset   The place in the buffer at which the value should be set.
     * @param value        The value to set.
     * @param littleEndian If false or undefined, a big-endian value should be written,
     *                     otherwise a little-endian value should be written.
     */
    void setInt16(int byteOffset, short value, boolean littleEndian);

    void setInt16(int byteOffset, short value);

    /**
     * Stores an Int32 value at the specified byte offset from the start of the view.
     *
     * @param byteOffset   The place in the buffer at which the value should be set.
     * @param value        The value to set.
     * @param littleEndian If false or undefined, a big-endian value should be written,
     *                     otherwise a little-endian value should be written.
     */
    void setInt32(int byteOffset, int value, boolean littleEndian);

    void setInt32(int byteOffset, int value);

    /**
     * Stores an Uint8 value at the specified byte offset from the start of the view.
     *
     * @param byteOffset The place in the buffer at which the value should be set.
     * @param value      The value to set.
     */
    void setUint8(int byteOffset, short value);

    /**
     * Stores an Uint16 value at the specified byte offset from the start of the view.
     *
     * @param byteOffset   The place in the buffer at which the value should be set.
     * @param value        The value to set.
     * @param littleEndian If false or undefined, a big-endian value should be written,
     *                     otherwise a little-endian value should be written.
     */
    void setUint16(int byteOffset, int value, boolean littleEndian);

    void setUint16(int byteOffset, int value);

    /**
     * Stores an Uint32 value at the specified byte offset from the start of the view.
     *
     * @param byteOffset   The place in the buffer at which the value should be set.
     * @param value        The value to set.
     * @param littleEndian If false or undefined, a big-endian value should be written,
     *                     otherwise a little-endian value should be written.
     */
    void setUint32(int byteOffset, int value, boolean littleEndian);

    void setUint32(int byteOffset, int value);

}
