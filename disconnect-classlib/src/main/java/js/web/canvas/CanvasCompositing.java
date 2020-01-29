package js.web.canvas;

import org.teavm.jso.JSProperty;

import js.lang.Any;


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
