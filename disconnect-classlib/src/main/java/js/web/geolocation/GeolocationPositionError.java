package js.web.geolocation;

import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * The reason of an error occurring when using the geolocating device.
 */
public interface GeolocationPositionError extends Any {
    @JSProperty
    Code getCode();

    @JSProperty
    String getMessage();

    abstract class Code extends JsEnum {
        public static final Code PERMISSION_DENIED = JsEnum.from("return GeolocationPositionError.PERMISSION_DENIED");


        public static final Code POSITION_UNAVAILABLE = JsEnum.from("return GeolocationPositionError.POSITION_UNAVAILABLE");


        public static final Code TIMEOUT = JsEnum.from("return GeolocationPositionError.TIMEOUT");
    }


}
