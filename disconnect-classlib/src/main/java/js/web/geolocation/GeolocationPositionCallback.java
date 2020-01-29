package js.web.geolocation;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;


@JSFunctor
@FunctionalInterface
        public interface GeolocationPositionCallback extends JSObject {
        void accept(GeolocationPosition position);
        }
