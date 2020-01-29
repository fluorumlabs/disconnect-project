package js.web.deviceorientation;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface DeviceMotionEventAccelerationInit extends Any {
    @JSProperty
    double getX();

    @JSProperty
    void setX(double x);

    @JSProperty
    double getY();

    @JSProperty
    void setY(double y);

    @JSProperty
    double getZ();

    @JSProperty
    void setZ(double z);

}
