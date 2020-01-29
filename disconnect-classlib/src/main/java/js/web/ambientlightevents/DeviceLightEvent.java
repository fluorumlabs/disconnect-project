package js.web.ambientlightevents;

import js.annotations.Experimental;
import js.annotations.NonStandard;
import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The DeviceLightEvent provides web developers with information from photo sensors or similiar detectors about ambient light levels near the device. For example this may be useful to adjust the screen's brightness based on the current ambient light level in order to save energy or provide better readability.
 */
@Experimental
@NonStandard
public interface DeviceLightEvent extends Event {
    @JSBody(script = "return DeviceLightEvent.prototype")
    static DeviceLightEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new DeviceLightEvent(type, eventInitDict)")
    static DeviceLightEvent create(String type, DeviceLightEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new DeviceLightEvent(type)")
    static DeviceLightEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getValue();


    interface DeviceLightEventInit extends EventInit {
        @JSProperty
        double getValue();

        @JSProperty
        void setValue(double value);

    }
}
