package js.web.webgl;

import js.lang.Any;
import js.util.buffers.ArrayBufferView;
import js.util.buffers.Float32Array;
import js.util.buffers.Int32Array;
import js.util.iterable.FloatIterable;
import js.util.iterable.IntIterable;
import js.web.dom.BufferSource;
import org.teavm.jso.JSByRef;

import javax.annotation.Nullable;


public interface WebGL2RenderingContextOverloads extends Any {
    void bufferData(int target, int size, int usage);

    void bufferData(int target, @Nullable BufferSource srcData, int usage);

    void bufferData(int target, ArrayBufferView srcData, int usage, int srcOffset, int length);

    void bufferData(int target, ArrayBufferView srcData, int usage, int srcOffset);

    void bufferSubData(int target, int dstByteOffset, BufferSource srcData);

    void bufferSubData(int target, int dstByteOffset, ArrayBufferView srcData, int srcOffset, int length);

    void bufferSubData(int target, int dstByteOffset, ArrayBufferView srcData, int srcOffset);

    void compressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, int offset);

    void compressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ArrayBufferView srcData, int srcOffset, int srcLengthOverride);

    void compressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ArrayBufferView srcData, int srcOffset);

    void compressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ArrayBufferView srcData);

    void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, int offset);

    void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ArrayBufferView srcData, int srcOffset, int srcLengthOverride);

    void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ArrayBufferView srcData, int srcOffset);

    void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ArrayBufferView srcData);

    void readPixels(int x, int y, int width, int height, int format, int type, @Nullable ArrayBufferView dstData);

    void readPixels(int x, int y, int width, int height, int format, int type, int offset);

    void readPixels(int x, int y, int width, int height, int format, int type, ArrayBufferView dstData, int dstOffset);

    void texImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable ArrayBufferView pixels);

    void texImage2D(int target, int level, int internalformat, int format, int type, TexImageSource source);

    void texImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, int pboOffset);

    void texImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, TexImageSource source);

    void texImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ArrayBufferView srcData, int srcOffset);

    void texSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, @Nullable ArrayBufferView pixels);

    void texSubImage2D(int target, int level, int xoffset, int yoffset, int format, int type, TexImageSource source);

    void texSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int pboOffset);

    void texSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, TexImageSource source);

    void texSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ArrayBufferView srcData, int srcOffset);

    void uniform1fv(@Nullable WebGLUniformLocation location, Float32Array data, int srcOffset, int srcLength);

    void uniform1fv(@Nullable WebGLUniformLocation location, FloatIterable data, int srcOffset, int srcLength);

    void uniform1fv(@Nullable WebGLUniformLocation location, @JSByRef double[] data, int srcOffset, int srcLength);

    void uniform1iv(@Nullable WebGLUniformLocation location, Int32Array data, int srcOffset, int srcLength);

    void uniform1iv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset, int srcLength);

    void uniform1iv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset, int srcLength);

    void uniform2fv(@Nullable WebGLUniformLocation location, Float32Array data, int srcOffset, int srcLength);

    void uniform2fv(@Nullable WebGLUniformLocation location, FloatIterable data, int srcOffset, int srcLength);

    void uniform2fv(@Nullable WebGLUniformLocation location, @JSByRef double[] data, int srcOffset, int srcLength);

    void uniform2iv(@Nullable WebGLUniformLocation location, Int32Array data, int srcOffset, int srcLength);

    void uniform2iv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset, int srcLength);

    void uniform2iv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset, int srcLength);

    void uniform3fv(@Nullable WebGLUniformLocation location, Float32Array data, int srcOffset, int srcLength);

    void uniform3fv(@Nullable WebGLUniformLocation location, FloatIterable data, int srcOffset, int srcLength);

    void uniform3fv(@Nullable WebGLUniformLocation location, @JSByRef double[] data, int srcOffset, int srcLength);

    void uniform3iv(@Nullable WebGLUniformLocation location, Int32Array data, int srcOffset, int srcLength);

    void uniform3iv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset, int srcLength);

    void uniform3iv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset, int srcLength);

    void uniform4fv(@Nullable WebGLUniformLocation location, Float32Array data, int srcOffset, int srcLength);

    void uniform4fv(@Nullable WebGLUniformLocation location, FloatIterable data, int srcOffset, int srcLength);

    void uniform4fv(@Nullable WebGLUniformLocation location, @JSByRef double[] data, int srcOffset, int srcLength);

    void uniform4iv(@Nullable WebGLUniformLocation location, Int32Array data, int srcOffset, int srcLength);

    void uniform4iv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset, int srcLength);

    void uniform4iv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset, int srcLength);

    void uniform1fv(@Nullable WebGLUniformLocation location, Float32Array data, int srcOffset);

    void uniform1fv(@Nullable WebGLUniformLocation location, FloatIterable data, int srcOffset);

    void uniform1fv(@Nullable WebGLUniformLocation location, @JSByRef double[] data, int srcOffset);

    void uniform1iv(@Nullable WebGLUniformLocation location, Int32Array data, int srcOffset);

    void uniform1iv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset);

    void uniform1iv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset);

    void uniform2fv(@Nullable WebGLUniformLocation location, Float32Array data, int srcOffset);

    void uniform2fv(@Nullable WebGLUniformLocation location, FloatIterable data, int srcOffset);

    void uniform2fv(@Nullable WebGLUniformLocation location, @JSByRef double[] data, int srcOffset);

    void uniform2iv(@Nullable WebGLUniformLocation location, Int32Array data, int srcOffset);

    void uniform2iv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset);

    void uniform2iv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset);

    void uniform3fv(@Nullable WebGLUniformLocation location, Float32Array data, int srcOffset);

    void uniform3fv(@Nullable WebGLUniformLocation location, FloatIterable data, int srcOffset);

    void uniform3fv(@Nullable WebGLUniformLocation location, @JSByRef double[] data, int srcOffset);

    void uniform3iv(@Nullable WebGLUniformLocation location, Int32Array data, int srcOffset);

    void uniform3iv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset);

    void uniform3iv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset);

    void uniform4fv(@Nullable WebGLUniformLocation location, Float32Array data, int srcOffset);

    void uniform4fv(@Nullable WebGLUniformLocation location, FloatIterable data, int srcOffset);

    void uniform4fv(@Nullable WebGLUniformLocation location, @JSByRef double[] data, int srcOffset);

    void uniform4iv(@Nullable WebGLUniformLocation location, Int32Array data, int srcOffset);

    void uniform4iv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset);

    void uniform4iv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset);

    void uniform1fv(@Nullable WebGLUniformLocation location, Float32Array data);

    void uniform1fv(@Nullable WebGLUniformLocation location, FloatIterable data);

    void uniform1fv(@Nullable WebGLUniformLocation location, @JSByRef double[] data);

    void uniform1iv(@Nullable WebGLUniformLocation location, Int32Array data);

    void uniform1iv(@Nullable WebGLUniformLocation location, IntIterable data);

    void uniform1iv(@Nullable WebGLUniformLocation location, @JSByRef int[] data);

    void uniform2fv(@Nullable WebGLUniformLocation location, Float32Array data);

    void uniform2fv(@Nullable WebGLUniformLocation location, FloatIterable data);

    void uniform2fv(@Nullable WebGLUniformLocation location, @JSByRef double[] data);

    void uniform2iv(@Nullable WebGLUniformLocation location, Int32Array data);

    void uniform2iv(@Nullable WebGLUniformLocation location, IntIterable data);

    void uniform2iv(@Nullable WebGLUniformLocation location, @JSByRef int[] data);

    void uniform3fv(@Nullable WebGLUniformLocation location, Float32Array data);

    void uniform3fv(@Nullable WebGLUniformLocation location, FloatIterable data);

    void uniform3fv(@Nullable WebGLUniformLocation location, @JSByRef double[] data);

    void uniform3iv(@Nullable WebGLUniformLocation location, Int32Array data);

    void uniform3iv(@Nullable WebGLUniformLocation location, IntIterable data);

    void uniform3iv(@Nullable WebGLUniformLocation location, @JSByRef int[] data);

    void uniform4fv(@Nullable WebGLUniformLocation location, Float32Array data);

    void uniform4fv(@Nullable WebGLUniformLocation location, FloatIterable data);

    void uniform4fv(@Nullable WebGLUniformLocation location, @JSByRef double[] data);

    void uniform4iv(@Nullable WebGLUniformLocation location, Int32Array data);

    void uniform4iv(@Nullable WebGLUniformLocation location, IntIterable data);

    void uniform4iv(@Nullable WebGLUniformLocation location, @JSByRef int[] data);

    void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset, int srcLength);

    void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose, FloatIterable data, int srcOffset, int srcLength);

    void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset, int srcLength);

    void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset, int srcLength);

    void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose, FloatIterable data, int srcOffset, int srcLength);

    void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset, int srcLength);

    void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset, int srcLength);

    void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose, FloatIterable data, int srcOffset, int srcLength);

    void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset, int srcLength);

    void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset);

    void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose, FloatIterable data, int srcOffset);

    void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset);

    void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset);

    void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose, FloatIterable data, int srcOffset);

    void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset);

    void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset);

    void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose, FloatIterable data, int srcOffset);

    void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset);

    void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data);

    void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose, FloatIterable data);

    void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data);

    void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data);

    void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose, FloatIterable data);

    void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data);

    void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data);

    void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose, FloatIterable data);

    void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data);
}
