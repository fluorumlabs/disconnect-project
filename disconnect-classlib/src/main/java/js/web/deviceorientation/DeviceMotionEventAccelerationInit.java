package js.web.deviceorientation;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface DeviceMotionEventAccelerationInit extends Any {
    @JSProperty
    double  getX();

    @JSProperty
    void setX(double x);

    @JSProperty
    double  getY();

    @JSProperty
    void setY(double y);

    @JSProperty
    double  getZ();

    @JSProperty
    void setZ(double z);

}
