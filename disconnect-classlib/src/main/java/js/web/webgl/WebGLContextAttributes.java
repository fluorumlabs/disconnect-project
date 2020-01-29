package js.web.webgl;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface WebGLContextAttributes extends Any {
    @JSProperty
    boolean isAlpha();

    @JSProperty
    void setAlpha(boolean alpha);

    @JSProperty
    boolean isAntialias();

    @JSProperty
    void setAntialias(boolean antialias);

    @JSProperty
    boolean isDepth();

    @JSProperty
    void setDepth(boolean depth);

    @JSProperty
    boolean isDesynchronized();

    @JSProperty
    void setDesynchronized(boolean desynchronized);

    @JSProperty
    boolean isFailIfMajorPerformanceCaveat();

    @JSProperty
    void setFailIfMajorPerformanceCaveat(boolean failIfMajorPerformanceCaveat);

    @JSProperty
    @Nullable
    WebGLPowerPreference getPowerPreference();

    @JSProperty
    void setPowerPreference(WebGLPowerPreference powerPreference);

    @JSProperty
    boolean isPremultipliedAlpha();

    @JSProperty
    void setPremultipliedAlpha(boolean premultipliedAlpha);

    @JSProperty
    boolean isPreserveDrawingBuffer();

    @JSProperty
    void setPreserveDrawingBuffer(boolean preserveDrawingBuffer);

    @JSProperty
    boolean isStencil();

    @JSProperty
    void setStencil(boolean stencil);

}
