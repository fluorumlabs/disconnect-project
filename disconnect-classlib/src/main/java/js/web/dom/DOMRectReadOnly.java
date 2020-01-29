package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface DOMRectReadOnly extends Any {
    @JSProperty
    double getBottom();

    @JSProperty
    double getHeight();

    @JSProperty
    double getLeft();

    @JSProperty
    double getRight();

    @JSProperty
    double getTop();

    @JSProperty
    double getWidth();

    @JSProperty
    double getX();

    @JSProperty
    double getY();

    Any toJSON();

    @JSBody(script = "return DOMRectReadOnly.prototype")
    static DOMRectReadOnly prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMRectReadOnly()")
    static DOMRectReadOnly create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"x","y","width","height"}, script = "return new DOMRectReadOnly(x,y,width,height)")
    static DOMRectReadOnly create(double x, double y, double width, double height) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params={"x","y","width"}, script = "return new DOMRectReadOnly(x,y,width)")
    static DOMRectReadOnly create(double x, double y, double width) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params={"x","y"}, script = "return new DOMRectReadOnly(x,y)")
    static DOMRectReadOnly create(double x, double y) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params={"x"}, script = "return new DOMRectReadOnly(x)")
    static DOMRectReadOnly create(double x) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"other"}, script = "return DOMRectReadOnly.fromRect(other)")
    static DOMRectReadOnly fromRect(DOMRectInit other) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(script = "return DOMRect.fromRect()")
    static DOMRectReadOnly fromRect() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
