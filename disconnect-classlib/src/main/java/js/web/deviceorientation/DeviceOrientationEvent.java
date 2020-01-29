package js.web.deviceorientation;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The DeviceOrientationEvent provides web developers with information from the physical orientation of the device running the web page.
 */
public interface DeviceOrientationEvent extends Event {
    @JSBody(script = "return DeviceOrientationEvent.prototype")
    static DeviceOrientationEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new DeviceOrientationEvent(type, eventInitDict)")
    static DeviceOrientationEvent create(String type, DeviceOrientationEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new DeviceOrientationEvent(type)")
    static DeviceOrientationEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isAbsolute();

    @JSProperty
    double getAlpha();

    @JSProperty
    double getBeta();

    @JSProperty
    double getGamma();


    interface DeviceOrientationEventInit extends EventInit {
        @JSProperty
        boolean isAbsolute();

        @JSProperty
        void setAbsolute(boolean absolute);

        @JSProperty
        double getAlpha();

        @JSProperty
        void setAlpha(double alpha);

        @JSProperty
        double getBeta();

        @JSProperty
        void setBeta(double beta);

        @JSProperty
        double getGamma();

        @JSProperty
        void setGamma(double gamma);

    }
}
