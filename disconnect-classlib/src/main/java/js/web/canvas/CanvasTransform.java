package js.web.canvas;

import js.lang.Any;
import js.web.dom.DOMMatrix;
import js.web.dom.DOMMatrix2DInit;


public interface CanvasTransform extends Any {
    DOMMatrix getTransform();

    void setTransform(DOMMatrix2DInit transform);

    void resetTransform();

    void rotate(double angle);

    void scale(double x, double y);

    void setTransform(double a, double b, double c, double d, double e, double f);

    void setTransform();

    void transform(double a, double b, double c, double d, double e, double f);

    void translate(double x, double y);
}
