package js.web.canvas;

import js.lang.Any;
import js.util.iterable.DoubleIterable;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;


public interface CanvasPathDrawingStyles extends Any {
    @JSProperty
    CanvasLineCap getLineCap();

    @JSProperty
    void setLineCap(CanvasLineCap lineCap);

    @JSProperty
    double getLineDashOffset();

    @JSProperty
    void setLineDashOffset(double lineDashOffset);

    @JSProperty
    CanvasLineJoin getLineJoin();

    @JSProperty
    void setLineJoin(CanvasLineJoin lineJoin);

    @JSProperty
    double getLineWidth();

    @JSProperty
    void setLineWidth(double lineWidth);

    @JSProperty
    double getMiterLimit();

    @JSProperty
    void setMiterLimit(double miterLimit);

    double[] getLineDash();

    void setLineDash(double[] segments);

    void setLineDash(DoubleIterable segments);
}
