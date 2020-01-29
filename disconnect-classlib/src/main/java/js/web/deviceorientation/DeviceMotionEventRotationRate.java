package js.web.deviceorientation;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface DeviceMotionEventRotationRate extends Any {
    @JSProperty
    double getAlpha();

    @JSProperty
    double getBeta();

    @JSProperty
    double getGamma();

}
