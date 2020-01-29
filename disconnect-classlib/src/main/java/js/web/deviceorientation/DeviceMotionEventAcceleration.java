package js.web.deviceorientation;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface DeviceMotionEventAcceleration extends Any {
    @JSProperty
    double  getX();

    @JSProperty
    double  getY();

    @JSProperty
    double  getZ();

}
