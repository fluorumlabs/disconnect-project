package js.web.touchevents;

import js.web.dom.EventTarget;
import js.web.dom.TouchType;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** A single contact point on a touch-sensitive device. The contact point is commonly a finger or stylus and the device may be a touchscreen or trackpad. */
        public interface Touch extends Any {
        @JSProperty
        double getAltitudeAngle();

        @JSProperty
        double getAzimuthAngle();

        @JSProperty
        double getClientX();

        @JSProperty
        double getClientY();

        @JSProperty
        double getForce();

        @JSProperty
        int getIdentifier();

        @JSProperty
        double getPageX();

        @JSProperty
        double getPageY();

        @JSProperty
        double getRadiusX();

        @JSProperty
        double getRadiusY();

        @JSProperty
        double getRotationAngle();

        @JSProperty
        double getScreenX();

        @JSProperty
        double getScreenY();

        @JSProperty
        EventTarget getTarget();

        @JSProperty
        TouchType getTouchType();

        @JSBody(script = "return Touch.prototype")
        static Touch prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="touchInitDict", script = "return new Touch(touchInitDict)")
        static Touch create(TouchInit touchInitDict) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
