package js.web.geolocation;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface PositionOptions extends Any {
    @JSProperty
    boolean isEnableHighAccuracy();

    @JSProperty
    void setEnableHighAccuracy(boolean enableHighAccuracy);

    @JSProperty
    double getMaximumAge();

    @JSProperty
    void setMaximumAge(double maximumAge);

    @JSProperty
    double getTimeout();

    @JSProperty
    void setTimeout(double timeout);

}
