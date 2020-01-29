package js.web.webgl;

import js.lang.Any;
import js.lang.Unknown;
import js.util.buffers.Float32Array;
import js.util.collections.Array;
import js.util.iterable.FloatIterable;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface WebGLRenderingContextBase extends Any {
    @JSProperty
    Unknown getCanvas();

    @JSProperty
    int getDrawingBufferHeight();

    @JSProperty
    int getDrawingBufferWidth();

    void activeTexture(int texture);

    void attachShader(WebGLProgram program, WebGLShader shader);

    void bindAttribLocation(WebGLProgram program, int index, String name);

    void bindBuffer(int target, @Nullable WebGLBuffer buffer);

    void bindFramebuffer(int target, @Nullable WebGLFramebuffer framebuffer);

    void bindRenderbuffer(int target, @Nullable WebGLRenderbuffer renderbuffer);

    void bindTexture(int target, @Nullable WebGLTexture texture);

    void blendColor(double red, double green, double blue, double alpha);

    void blendEquation(int mode);

    void blendEquationSeparate(int modeRGB, int modeAlpha);

    void blendFunc(int sfactor, int dfactor);

    void blendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

    int checkFramebufferStatus(int target);

    void clear(int mask);

    void clearColor(double red, double green, double blue, double alpha);

    void clearDepth(double depth);

    void clearStencil(int s);

    void colorMask(boolean red, boolean green, boolean blue, boolean alpha);

    void compileShader(WebGLShader shader);

    void copyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border);

    void copyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);

    @Nullable
    WebGLBuffer createBuffer();

    @Nullable
    WebGLFramebuffer createFramebuffer();

    @Nullable
    WebGLProgram createProgram();

    @Nullable
    WebGLRenderbuffer createRenderbuffer();

    @Nullable
    WebGLShader createShader(int type);

    @Nullable
    WebGLTexture createTexture();

    void cullFace(int mode);

    void deleteBuffer(@Nullable WebGLBuffer buffer);

    void deleteFramebuffer(@Nullable WebGLFramebuffer framebuffer);

    void deleteProgram(@Nullable WebGLProgram program);

    void deleteRenderbuffer(@Nullable WebGLRenderbuffer renderbuffer);

    void deleteShader(@Nullable WebGLShader shader);

    void deleteTexture(@Nullable WebGLTexture texture);

    void depthFunc(int func);

    void depthMask(boolean flag);

    void depthRange(double zNear, double zFar);

    void detachShader(WebGLProgram program, WebGLShader shader);

    void disable(int cap);

    void disableVertexAttribArray(int index);

    void drawArrays(int mode, int first, int count);

    void drawElements(int mode, int count, int type, int offset);

    void enable(int cap);

    void enableVertexAttribArray(int index);

    void finish();

    void flush();

    void framebufferRenderbuffer(int target, int attachment, int renderbuffertarget, @Nullable WebGLRenderbuffer renderbuffer);

    void framebufferTexture2D(int target, int attachment, int textarget, @Nullable WebGLTexture texture, int level);

    void frontFace(int mode);

    void generateMipmap(int target);

    @Nullable
    WebGLActiveInfo getActiveAttrib(WebGLProgram program, int index);

    @Nullable
    WebGLActiveInfo getActiveUniform(WebGLProgram program, int index);

    @Nullable
    Array<WebGLShader> getAttachedShaders(WebGLProgram program);

    int getAttribLocation(WebGLProgram program, String name);

    Unknown getBufferParameter(int target, int pname);

    @Nullable
    WebGLContextAttributes getContextAttributes();

    int getError();

    Unknown getExtension(String extensionName);

    Unknown getFramebufferAttachmentParameter(int target, int attachment, int pname);

    Unknown getParameter(int pname);

    @Nullable
    String getProgramInfoLog(WebGLProgram program);

    Unknown getProgramParameter(WebGLProgram program, int pname);

    Unknown getRenderbufferParameter(int target, int pname);

    @Nullable
    String getShaderInfoLog(WebGLShader shader);

    Unknown getShaderParameter(WebGLShader shader, int pname);

    @Nullable
    WebGLShaderPrecisionFormat getShaderPrecisionFormat(int shadertype, int precisiontype);

    @Nullable
    String getShaderSource(WebGLShader shader);

    @Nullable
    String[] getSupportedExtensions();

    Unknown getTexParameter(int target, int pname);

    Unknown getUniform(WebGLProgram program, WebGLUniformLocation location);

    @Nullable
    WebGLUniformLocation getUniformLocation(WebGLProgram program, String name);

    Unknown getVertexAttrib(int index, int pname);

    int getVertexAttribOffset(int index, int pname);

    void hint(int target, int mode);

    boolean isBuffer(@Nullable WebGLBuffer buffer);

    boolean isContextLost();

    boolean isEnabled(int cap);

    boolean isFramebuffer(@Nullable WebGLFramebuffer framebuffer);

    boolean isProgram(@Nullable WebGLProgram program);

    boolean isRenderbuffer(@Nullable WebGLRenderbuffer renderbuffer);

    boolean isShader(@Nullable WebGLShader shader);

    boolean isTexture(@Nullable WebGLTexture texture);

    void lineWidth(double width);

    void linkProgram(WebGLProgram program);

    void pixelStorei(int pname, int param);

    void pixelStorei(int pname, boolean param);

    void polygonOffset(double factor, double units);

    void renderbufferStorage(int target, int internalformat, int width, int height);

    void sampleCoverage(double value, boolean invert);

    void scissor(int x, int y, int width, int height);

    void shaderSource(WebGLShader shader, String source);

    void stencilFunc(int func, int ref, int mask);

    void stencilFuncSeparate(int face, int func, int ref, int mask);

    void stencilMask(int mask);

    void stencilMaskSeparate(int face, int mask);

    void stencilOp(int fail, int zfail, int zpass);

    void stencilOpSeparate(int face, int fail, int zfail, int zpass);

    void texParameterf(int target, int pname, double param);

    void texParameteri(int target, int pname, int param);

    void uniform1f(@Nullable WebGLUniformLocation location, double x);

    void uniform1i(@Nullable WebGLUniformLocation location, int x);

    void uniform2f(@Nullable WebGLUniformLocation location, double x, double y);

    void uniform2i(@Nullable WebGLUniformLocation location, int x, int y);

    void uniform3f(@Nullable WebGLUniformLocation location, double x, double y, double z);

    void uniform3i(@Nullable WebGLUniformLocation location, int x, int y, int z);

    void uniform4f(@Nullable WebGLUniformLocation location, double x, double y, double z, double w);

    void uniform4i(@Nullable WebGLUniformLocation location, int x, int y, int z, int w);

    void useProgram(@Nullable WebGLProgram program);

    void validateProgram(WebGLProgram program);

    void vertexAttrib1f(int index, double x);

    void vertexAttrib1fv(int index, Float32Array values);

    void vertexAttrib1fv(int index, FloatIterable values);

    void vertexAttrib1fv(int index, @JSByRef double[] values);

    void vertexAttrib2f(int index, double x, double y);

    void vertexAttrib2fv(int index, Float32Array values);

    void vertexAttrib2fv(int index, FloatIterable values);

    void vertexAttrib2fv(int index, @JSByRef double[] values);

    void vertexAttrib3f(int index, double x, double y, double z);

    void vertexAttrib3fv(int index, Float32Array values);

    void vertexAttrib3fv(int index, FloatIterable values);

    void vertexAttrib3fv(int index, @JSByRef double[] values);

    void vertexAttrib4f(int index, double x, double y, double z, double w);

    void vertexAttrib4fv(int index, Float32Array values);

    void vertexAttrib4fv(int index, FloatIterable values);

    void vertexAttrib4fv(int index, double values);

    void vertexAttribPointer(int index, int size, int type, boolean normalized, int stride, int offset);

    void viewport(int x, int y, int width, int height);
}
