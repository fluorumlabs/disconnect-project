package js.web.deviceorientation;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Provides information about the amount of acceleration the device is experiencing along all three axes. */
public interface DeviceAcceleration extends Any {
    @JSProperty
    double  getX();

    @JSProperty
    double  getY();

    @JSProperty
    double  getZ();

    @JSBody(script = "return DeviceAcceleration.prototype")
    static DeviceAcceleration prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DeviceAcceleration()")
    static DeviceAcceleration create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
