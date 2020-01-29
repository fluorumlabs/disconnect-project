package js.web.webgl;

import js.lang.Any;
import js.lang.Unknown;
import js.util.buffers.ArrayBufferView;
import js.util.buffers.Float32Array;
import js.util.buffers.Int32Array;
import js.util.buffers.Uint32Array;
import js.util.iterable.DoubleIterable;
import js.util.iterable.IntIterable;
import js.util.iterable.StringIterable;
import org.teavm.jso.JSByRef;

import javax.annotation.Nullable;


public interface WebGL2RenderingContextBase extends Any {
    void beginQuery(int target, WebGLQuery query);

    void beginTransformFeedback(int primitiveMode);

    void bindBufferBase(int target, int index, @Nullable WebGLBuffer buffer);

    void bindBufferRange(int target, int index, @Nullable WebGLBuffer buffer, int offset, int size);

    void bindSampler(int unit, @Nullable WebGLSampler sampler);

    void bindTransformFeedback(int target, @Nullable WebGLTransformFeedback tf);

    void bindVertexArray(@Nullable WebGLVertexArrayObject array);

    void blitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter);

    void clearBufferfi(int buffer, int drawbuffer, double depth, int stencil);

    void clearBufferfv(int buffer, int drawbuffer, Float32Array values, int srcOffset);

    void clearBufferfv(int buffer, int drawbuffer, DoubleIterable values, int srcOffset);

    void clearBufferfv(int buffer, int drawbuffer, @JSByRef double[] values, int srcOffset);

    void clearBufferfv(int buffer, int drawbuffer, Float32Array values);

    void clearBufferfv(int buffer, int drawbuffer, DoubleIterable values);

    void clearBufferfv(int buffer, int drawbuffer, @JSByRef double[] values);

    void clearBufferiv(int buffer, int drawbuffer, Int32Array values, int srcOffset);

    void clearBufferiv(int buffer, int drawbuffer, IntIterable values, int srcOffset);

    void clearBufferiv(int buffer, int drawbuffer, @JSByRef int[] values, int srcOffset);

    void clearBufferiv(int buffer, int drawbuffer, Int32Array values);

    void clearBufferiv(int buffer, int drawbuffer, IntIterable values);

    void clearBufferiv(int buffer, int drawbuffer, @JSByRef int[] values);

    void clearBufferuiv(int buffer, int drawbuffer, Uint32Array values, int srcOffset);

    void clearBufferuiv(int buffer, int drawbuffer, IntIterable values, int srcOffset);

    void clearBufferuiv(int buffer, int drawbuffer, @JSByRef int[] values, int srcOffset);

    void clearBufferuiv(int buffer, int drawbuffer, Uint32Array values);

    void clearBufferuiv(int buffer, int drawbuffer, IntIterable values);

    void clearBufferuiv(int buffer, int drawbuffer, @JSByRef int[] values);

    int clientWaitSync(WebGLSync sync, int flags, int timeout);

    void compressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, int offset);

    void compressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, ArrayBufferView srcData, int srcOffset, int srcLengthOverride);

    void compressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, ArrayBufferView srcData, int srcOffset);

    void compressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, ArrayBufferView srcData);

    void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, int offset);

    void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ArrayBufferView srcData, int srcOffset, int srcLengthOverride);

    void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ArrayBufferView srcData, int srcOffset);

    void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ArrayBufferView srcData);

    void copyBufferSubData(int readTarget, int writeTarget, int readOffset, int writeOffset, int size);

    void copyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height);

    @Nullable
    WebGLQuery createQuery();

    @Nullable
    WebGLSampler createSampler();

    @Nullable
    WebGLTransformFeedback createTransformFeedback();

    @Nullable
    WebGLVertexArrayObject createVertexArray();

    void deleteQuery(@Nullable WebGLQuery query);

    void deleteSampler(@Nullable WebGLSampler sampler);

    void deleteSync(@Nullable WebGLSync sync);

    void deleteTransformFeedback(@Nullable WebGLTransformFeedback tf);

    void deleteVertexArray(@Nullable WebGLVertexArrayObject vertexArray);

    void drawArraysInstanced(int mode, int first, int count, int instanceCount);

    void drawBuffers(@JSByRef int... buffers);

    void drawBuffers(IntIterable buffers);

    void drawElementsInstanced(int mode, int count, int type, int offset, int instanceCount);

    void drawRangeElements(int mode, int start, int end, int count, int type, int offset);

    void endQuery(int target);

    void endTransformFeedback();

    @Nullable
    WebGLSync fenceSync(int condition, int flags);

    void framebufferTextureLayer(int target, int attachment, @Nullable WebGLTexture texture, int level, int layer);

    @Nullable
    String getActiveUniformBlockName(WebGLProgram program, int uniformBlockIndex);

    Unknown getActiveUniformBlockParameter(WebGLProgram program, int uniformBlockIndex, int pname);

    Unknown getActiveUniforms(WebGLProgram program, @JSByRef int[] uniformIndices, int pname);

    Unknown getActiveUniforms(WebGLProgram program, IntIterable uniformIndices, int pname);

    void getBufferSubData(int target, int srcByteOffset, ArrayBufferView dstBuffer, int dstOffset, int length);

    void getBufferSubData(int target, int srcByteOffset, ArrayBufferView dstBuffer, int dstOffset);

    void getBufferSubData(int target, int srcByteOffset, ArrayBufferView dstBuffer);

    int getFragDataLocation(WebGLProgram program, String name);

    Unknown getIndexedParameter(int target, int index);

    Unknown getInternalformatParameter(int target, int internalformat, int pname);

    @Nullable
    WebGLQuery getQuery(int target, int pname);

    Unknown getQueryParameter(WebGLQuery query, int pname);

    Unknown getSamplerParameter(WebGLSampler sampler, int pname);

    Unknown getSyncParameter(WebGLSync sync, int pname);

    @Nullable
    WebGLActiveInfo getTransformFeedbackVarying(WebGLProgram program, int index);

    int getUniformBlockIndex(WebGLProgram program, String uniformBlockName);

    @Nullable
    int[] getUniformIndices(WebGLProgram program, @JSByRef String... uniformNames);

    void invalidateFramebuffer(int target, @JSByRef int... attachments);

    void invalidateFramebuffer(int target, IntIterable attachments);

    void invalidateSubFramebuffer(int target, @JSByRef int[] attachments, int x, int y, int width, int height);

    void invalidateSubFramebuffer(int target, IntIterable attachments, int x, int y, int width, int height);

    boolean isQuery(@Nullable WebGLQuery query);

    boolean isSampler(@Nullable WebGLSampler sampler);

    boolean isSync(@Nullable WebGLSync sync);

    boolean isTransformFeedback(@Nullable WebGLTransformFeedback tf);

    boolean isVertexArray(@Nullable WebGLVertexArrayObject vertexArray);

    void pauseTransformFeedback();

    void readBuffer(int src);

    void renderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height);

    void resumeTransformFeedback();

    void samplerParameterf(WebGLSampler sampler, int pname, double param);

    void samplerParameteri(WebGLSampler sampler, int pname, int param);

    void texImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, int pboOffset);

    void texImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, TexImageSource source);

    void texImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @Nullable ArrayBufferView srcData);

    void texImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ArrayBufferView srcData, int srcOffset);

    void texStorage2D(int target, int levels, int internalformat, int width, int height);

    void texStorage3D(int target, int levels, int internalformat, int width, int height, int depth);

    void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int pboOffset);

    void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, TexImageSource source);

    void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Nullable ArrayBufferView srcData, int srcOffset);

    void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Nullable ArrayBufferView srcData);

    void transformFeedbackVaryings(WebGLProgram program, @JSByRef String[] varyings, int bufferMode);

    void transformFeedbackVaryings(WebGLProgram program, StringIterable varyings, int bufferMode);

    void uniform1ui(@Nullable WebGLUniformLocation location, int v0);

    void uniform1uiv(@Nullable WebGLUniformLocation location, Uint32Array data, int srcOffset, int srcLength);

    void uniform1uiv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset, int srcLength);

    void uniform1uiv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset, int srcLength);

    void uniform1uiv(@Nullable WebGLUniformLocation location, Uint32Array data, int srcOffset);

    void uniform1uiv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset);

    void uniform1uiv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset);

    void uniform1uiv(@Nullable WebGLUniformLocation location, Uint32Array data);

    void uniform1uiv(@Nullable WebGLUniformLocation location, IntIterable data);

    void uniform1uiv(@Nullable WebGLUniformLocation location, @JSByRef int[] data);

    void uniform2ui(@Nullable WebGLUniformLocation location, int v0, int v1);

    void uniform2uiv(@Nullable WebGLUniformLocation location, Uint32Array data, int srcOffset, int srcLength);

    void uniform2uiv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset, int srcLength);

    void uniform2uiv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset, int srcLength);

    void uniform2uiv(@Nullable WebGLUniformLocation location, Uint32Array data, int srcOffset);

    void uniform2uiv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset);

    void uniform2uiv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset);

    void uniform2uiv(@Nullable WebGLUniformLocation location, Uint32Array data);

    void uniform2uiv(@Nullable WebGLUniformLocation location, IntIterable data);

    void uniform2uiv(@Nullable WebGLUniformLocation location, @JSByRef int[] data);

    void uniform3ui(@Nullable WebGLUniformLocation location, int v0, int v1, int v2);

    void uniform3uiv(@Nullable WebGLUniformLocation location, Uint32Array data, int srcOffset, int srcLength);

    void uniform3uiv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset, int srcLength);

    void uniform3uiv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset, int srcLength);

    void uniform3uiv(@Nullable WebGLUniformLocation location, Uint32Array data, int srcOffset);

    void uniform3uiv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset);

    void uniform3uiv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset);

    void uniform3uiv(@Nullable WebGLUniformLocation location, Uint32Array data);

    void uniform3uiv(@Nullable WebGLUniformLocation location, IntIterable data);

    void uniform3uiv(@Nullable WebGLUniformLocation location, @JSByRef int[] data);

    void uniform4ui(@Nullable WebGLUniformLocation location, int v0, int v1, int v2, int v3);

    void uniform4uiv(@Nullable WebGLUniformLocation location, Uint32Array data, int srcOffset, int srcLength);

    void uniform4uiv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset, int srcLength);

    void uniform4uiv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset, int srcLength);

    void uniform4uiv(@Nullable WebGLUniformLocation location, Uint32Array data, int srcOffset);

    void uniform4uiv(@Nullable WebGLUniformLocation location, IntIterable data, int srcOffset);

    void uniform4uiv(@Nullable WebGLUniformLocation location, @JSByRef int[] data, int srcOffset);

    void uniform4uiv(@Nullable WebGLUniformLocation location, Uint32Array data);

    void uniform4uiv(@Nullable WebGLUniformLocation location, IntIterable data);

    void uniform4uiv(@Nullable WebGLUniformLocation location, @JSByRef int[] data);

    void uniformBlockBinding(WebGLProgram program, int uniformBlockIndex, int uniformBlockBinding);

    void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset, int srcLength);

    void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data, int srcOffset, int srcLength);

    void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset, int srcLength);

    void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset, int srcLength);

    void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data, int srcOffset, int srcLength);

    void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset, int srcLength);

    void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset, int srcLength);

    void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data, int srcOffset, int srcLength);

    void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset, int srcLength);

    void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset, int srcLength);

    void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data, int srcOffset, int srcLength);

    void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset, int srcLength);

    void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset, int srcLength);

    void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data, int srcOffset, int srcLength);

    void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset, int srcLength);

    void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset, int srcLength);

    void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data, int srcOffset, int srcLength);

    void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset, int srcLength);

    void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset);

    void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data, int srcOffset);

    void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset);

    void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset);

    void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data, int srcOffset);

    void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset);

    void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset);

    void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data, int srcOffset);

    void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset);

    void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset);

    void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data, int srcOffset);

    void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset);

    void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset);

    void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data, int srcOffset);

    void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset);

    void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data, int srcOffset);

    void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data, int srcOffset);

    void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data, int srcOffset);

    void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data);

    void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data);

    void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data);

    void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data);

    void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data);

    void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data);

    void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data);

    void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data);

    void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data);

    void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data);

    void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data);

    void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data);

    void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data);

    void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data);

    void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data);

    void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose, Float32Array data);

    void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose, IntIterable data);

    void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose, @JSByRef double[] data);

    void vertexAttribDivisor(int index, int divisor);

    void vertexAttribI4i(int index, int x, int y, int z, int w);

    void vertexAttribI4iv(int index, Int32Array values);

    void vertexAttribI4iv(int index, IntIterable values);

    void vertexAttribI4iv(int index, @JSByRef int[] values);

    void vertexAttribI4ui(int index, int x, int y, int z, int w);

    void vertexAttribI4uiv(int index, Uint32Array values);

    void vertexAttribI4uiv(int index, IntIterable values);

    void vertexAttribI4uiv(int index, @JSByRef int[] values);

    void vertexAttribIPointer(int index, int size, int type, int stride, int offset);

    void waitSync(WebGLSync sync, int flags, int timeout);
}
