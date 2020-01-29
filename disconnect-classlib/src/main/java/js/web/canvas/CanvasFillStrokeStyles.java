package js.web.canvas;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.lang.Unknown;


public interface CanvasFillStrokeStyles extends Any {
    @JSProperty
    Unknown getFillStyle();

    @JSProperty
    void setFillStyle(String fillStyle);
    @JSProperty
    void setFillStyle(CanvasGradient fillStyle);
    @JSProperty
    void setFillStyle(CanvasPattern fillStyle);

    @JSProperty
    Unknown getStrokeStyle();

    @JSProperty
    void setStrokeStyle(String strokeStyle);
    @JSProperty
    void setStrokeStyle(CanvasGradient strokeStyle);
    @JSProperty
    void setStrokeStyle(CanvasPattern strokeStyle);

    CanvasGradient createLinearGradient(double x0, double y0, double x1, double y1);
    @Nullable
    CanvasPattern createPattern(CanvasImageSource image, String repetition);
    CanvasGradient createRadialGradient(double x0, double y0, double r0, double x1, double y1, double r1);
}
