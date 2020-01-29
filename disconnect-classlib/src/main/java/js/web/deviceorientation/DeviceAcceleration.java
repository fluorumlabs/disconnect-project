package js.web.deviceorientation;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides information about the amount of acceleration the device is experiencing along all three axes.
 */
public interface DeviceAcceleration extends Any {
    @JSBody(script = "return DeviceAcceleration.prototype")
    static DeviceAcceleration prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DeviceAcceleration()")
    static DeviceAcceleration create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getX();

    @JSProperty
    double getY();

    @JSProperty
    double getZ();

}
