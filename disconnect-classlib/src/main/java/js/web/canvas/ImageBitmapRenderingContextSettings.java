package js.web.canvas;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface ImageBitmapRenderingContextSettings extends Any {
    @JSProperty
    boolean isAlpha();

    @JSProperty
    void setAlpha(boolean alpha);

}
