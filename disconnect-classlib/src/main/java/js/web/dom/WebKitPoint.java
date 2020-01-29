package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


@Deprecated
public interface WebKitPoint extends Any {
        @JSProperty
        double getX();

        @JSProperty
        void setX(double x);

        @JSProperty
        double getY();

        @JSProperty
        void setY(double y);

        @JSBody(script = "return WebKitPoint.prototype")
        static WebKitPoint prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new WebKitPoint()")
        static WebKitPoint create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="x", script = "return new WebKitPoint(x)")
        static WebKitPoint create(double x) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"x","y"}, script = "return new WebKitPoint(x, y)")
        static WebKitPoint create(double x, double y) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
