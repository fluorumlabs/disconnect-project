package js.web.canvas;

import js.lang.Any;
import org.teavm.jso.JSProperty;


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
