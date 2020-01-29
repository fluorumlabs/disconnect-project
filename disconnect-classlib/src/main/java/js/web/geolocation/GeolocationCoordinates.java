package js.web.geolocation;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * The position and altitude of the device on Earth, as well as the accuracy with which these properties are calculated.
 */
public interface GeolocationCoordinates extends Any {
    @JSProperty
    double getAccuracy();

    @JSProperty
    double getAltitude();

    @JSProperty
    double getAltitudeAccuracy();

    @JSProperty
    double getHeading();

    @JSProperty
    double getLatitude();

    @JSProperty
    double getLongitude();

    @JSProperty
    double getSpeed();

}
