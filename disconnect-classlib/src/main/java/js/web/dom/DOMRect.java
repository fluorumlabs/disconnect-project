package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface DOMRect extends DOMRectReadOnly {
    @JSProperty
    double getHeight();

    @JSProperty
    void setHeight(double height);

    @JSProperty
    double getWidth();

    @JSProperty
    void setWidth(double width);

    @JSProperty
    double getX();

    @JSProperty
    void setX(double x);

    @JSProperty
    double getY();

    @JSProperty
    void setY(double y);

    @JSBody(script = "return DOMRect.prototype")
    static DOMRect prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMRect()")
    static DOMRect create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"x","y","width","height"}, script = "return new DOMRect(x,y,width,height)")
    static DOMRect create(double x, double y, double width, double height) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params={"x","y","width"}, script = "return new DOMRect(x,y,width)")
    static DOMRect create(double x, double y, double width) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params={"x","y"}, script = "return new DOMRect(x,y)")
    static DOMRect create(double x, double y) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params={"x"}, script = "return new DOMRect(x)")
    static DOMRect create(double x) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"other"}, script = "return DOMRect.fromRect(other)")
    static DOMRect fromRect(DOMRectInit other) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(script = "return DOMRect.fromRect()")
    static DOMRect fromRect() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
