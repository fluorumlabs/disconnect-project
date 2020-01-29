package js.web.canvas;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface CanvasCompositing extends Any {
    @JSProperty
    double getGlobalAlpha();

    @JSProperty
    void setGlobalAlpha(double globalAlpha);

    @JSProperty
    String getGlobalCompositeOperation();

    @JSProperty
    void setGlobalCompositeOperation(String globalCompositeOperation);

}
