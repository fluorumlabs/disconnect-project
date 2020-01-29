package js.web.deviceorientation;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface DeviceMotionEventAcceleration extends Any {
    @JSProperty
    double getX();

    @JSProperty
    double getY();

    @JSProperty
    double getZ();

}
