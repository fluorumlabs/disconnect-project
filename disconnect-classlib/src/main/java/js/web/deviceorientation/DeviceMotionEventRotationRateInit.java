package js.web.deviceorientation;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface DeviceMotionEventRotationRateInit extends Any {
    @JSProperty
    double  getAlpha();

    @JSProperty
    void setAlpha(double alpha);

    @JSProperty
    double  getBeta();

    @JSProperty
    void setBeta(double beta);

    @JSProperty
    double  getGamma();

    @JSProperty
    void setGamma(double gamma);

}
