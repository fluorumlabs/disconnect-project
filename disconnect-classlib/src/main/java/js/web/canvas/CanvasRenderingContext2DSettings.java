package js.web.canvas;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface CanvasRenderingContext2DSettings extends Any {
    @JSProperty
    boolean isAlpha();

    @JSProperty
    void setAlpha(boolean alpha);

    @JSProperty
    boolean isDesynchronized();

    @JSProperty
    void setDesynchronized(boolean desynchronized);

}
