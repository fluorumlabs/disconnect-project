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


public interface WebGLRenderingContextOverloads extends Any {
        void bufferData(int target, int size, int usage);
        void bufferData(int target, @Nullable BufferSource data, int usage);
        void bufferSubData(int target, int offset, BufferSource data);
        void compressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ArrayBufferView data);
        void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ArrayBufferView data);
        void readPixels(int x, int y, int width, int height, int format, int type, @Nullable ArrayBufferView pixels);
        void texImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, @Nullable ArrayBufferView pixels);
        void texImage2D(int target, int level, int internalformat, int format, int type, TexImageSource source);
        void texSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, @Nullable ArrayBufferView pixels);
        void texSubImage2D(int target, int level, int xoffset, int yoffset, int format, int type, TexImageSource source);
        void uniform1fv(@Nullable WebGLUniformLocation location, Float32Array v);
        void uniform1fv(@Nullable WebGLUniformLocation location, FloatIterable v);
        void uniform1fv(@Nullable WebGLUniformLocation location, @JSByRef double[] v);
        void uniform1iv(@Nullable WebGLUniformLocation location, Int32Array v);
        void uniform1iv(@Nullable WebGLUniformLocation location, IntIterable v);
        void uniform1iv(@Nullable WebGLUniformLocation location, @JSByRef int[] v);
        void uniform2fv(@Nullable WebGLUniformLocation location, Float32Array v);
        void uniform2fv(@Nullable WebGLUniformLocation location, FloatIterable v);
        void uniform2fv(@Nullable WebGLUniformLocation location, @JSByRef double[] v);
        void uniform2iv(@Nullable WebGLUniformLocation location, Int32Array v);
        void uniform2iv(@Nullable WebGLUniformLocation location, IntIterable v);
        void uniform2iv(@Nullable WebGLUniformLocation location, @JSByRef int[] v);
        void uniform3fv(@Nullable WebGLUniformLocation location, Float32Array v);
        void uniform3fv(@Nullable WebGLUniformLocation location, FloatIterable v);
        void uniform3fv(@Nullable WebGLUniformLocation location, @JSByRef double[] v);
        void uniform3iv(@Nullable WebGLUniformLocation location, Int32Array v);
        void uniform3iv(@Nullable WebGLUniformLocation location, IntIterable v);
        void uniform3iv(@Nullable WebGLUniformLocation location, @JSByRef int[] v);
        void uniform4fv(@Nullable WebGLUniformLocation location, Float32Array v);
        void uniform4fv(@Nullable WebGLUniformLocation location, FloatIterable v);
        void uniform4fv(@Nullable WebGLUniformLocation location, @JSByRef double[] v);
        void uniform4iv(@Nullable WebGLUniformLocation location, Int32Array v);
        void uniform4iv(@Nullable WebGLUniformLocation location, IntIterable v);
        void uniform4iv(@Nullable WebGLUniformLocation location, @JSByRef int[] v);
        void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array value);
        void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose, FloatIterable value);
        void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] value);
        void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array value);
        void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose, FloatIterable value);
        void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] value);
        void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array value);
        void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose, FloatIterable value);
        void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] value);
        }
