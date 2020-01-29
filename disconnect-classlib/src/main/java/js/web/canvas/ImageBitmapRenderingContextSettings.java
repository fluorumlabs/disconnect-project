package js.web.canvas;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface ImageBitmapRenderingContextSettings extends Any {
    @JSProperty
    boolean isAlpha();

    @JSProperty
    void setAlpha(boolean alpha);

}
