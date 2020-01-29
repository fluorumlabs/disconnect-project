package js.web.geolocation;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * The position of the concerned device at a given time. The position, represented by a Coordinates object, comprehends the 2D position of the device, on a spheroid representing the Earth, but also its altitude and its speed.
 */
public interface GeolocationPosition extends Any {
    @JSProperty
    GeolocationCoordinates getCoords();

    @JSProperty
    double getTimestamp();

}
