package js.web.touchevents;

import js.lang.Any;
import js.web.dom.EventTarget;
import js.web.dom.TouchType;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface TouchInit extends Any {
    @JSProperty
    double getAltitudeAngle();

    @JSProperty
    void setAltitudeAngle(double altitudeAngle);

    @JSProperty
    double getAzimuthAngle();

    @JSProperty
    void setAzimuthAngle(double azimuthAngle);

    @JSProperty
    double getClientX();

    @JSProperty
    void setClientX(double clientX);

    @JSProperty
    double getClientY();

    @JSProperty
    void setClientY(double clientY);

    @JSProperty
    double getForce();

    @JSProperty
    void setForce(double force);

    @JSProperty
    int getIdentifier();

    @JSProperty
    void setIdentifier(int identifier);

    @JSProperty
    double getPageX();

    @JSProperty
    void setPageX(double pageX);

    @JSProperty
    double getPageY();

    @JSProperty
    void setPageY(double pageY);

    @JSProperty
    double getRadiusX();

    @JSProperty
    void setRadiusX(double radiusX);

    @JSProperty
    double getRadiusY();

    @JSProperty
    void setRadiusY(double radiusY);

    @JSProperty
    double getRotationAngle();

    @JSProperty
    void setRotationAngle(double rotationAngle);

    @JSProperty
    int getScreenX();

    @JSProperty
    void setScreenX(int screenX);

    @JSProperty
    int getScreenY();

    @JSProperty
    void setScreenY(int screenY);

    @JSProperty
    EventTarget getTarget();

    @JSProperty
    void setTarget(EventTarget target);

    @JSProperty
    @Nullable
    TouchType getTouchType();

    @JSProperty
    void setTouchType(TouchType touchType);

}
