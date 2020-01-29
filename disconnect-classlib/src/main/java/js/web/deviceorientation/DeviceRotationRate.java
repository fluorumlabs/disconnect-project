package js.web.deviceorientation;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Provides information about the rate at which the device is rotating around all three axes. */
public interface DeviceRotationRate extends Any {
    @JSProperty
    double  getAlpha();

    @JSProperty
    double  getBeta();

    @JSProperty
    double  getGamma();

    @JSBody(script = "return DeviceRotationRate.prototype")
    static DeviceRotationRate prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DeviceRotationRate()")
    static DeviceRotationRate create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
