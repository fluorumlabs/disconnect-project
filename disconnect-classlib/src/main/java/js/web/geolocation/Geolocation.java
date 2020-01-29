package js.web.geolocation;

import js.lang.Any;

/** An object able to programmatically obtain the position of the device. It gives Web content access to the location of the device. This allows a Web site or app to offer customized results based on the user's location. */
public interface Geolocation extends Any {
    void clearWatch(int watchId);
    void getCurrentPosition(GeolocationPositionCallback successCallback, GeolocationPositionErrorCallback errorCallback, PositionOptions options);
    void getCurrentPosition(GeolocationPositionCallback successCallback, GeolocationPositionErrorCallback errorCallback);
    void getCurrentPosition(GeolocationPositionCallback successCallback);
    int watchPosition(GeolocationPositionCallback successCallback, GeolocationPositionErrorCallback errorCallback, PositionOptions options);
    int watchPosition(GeolocationPositionCallback successCallback, GeolocationPositionErrorCallback errorCallback);
    int watchPosition(GeolocationPositionCallback successCallback);
}
