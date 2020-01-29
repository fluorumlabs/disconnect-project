package js.web.deviceorientation;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface DeviceMotionEventRotationRate extends Any {
    @JSProperty
    double  getAlpha();

    @JSProperty
    double  getBeta();

    @JSProperty
    double  getGamma();

}
