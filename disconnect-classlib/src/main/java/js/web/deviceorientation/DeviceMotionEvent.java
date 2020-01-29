package js.web.deviceorientation;


import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** The DeviceMotionEvent provides web developers with information about the speed of changes for the device's position and orientation. */
public interface DeviceMotionEvent extends Event {
    @JSProperty
    @Nullable
    DeviceMotionEventAcceleration getAcceleration();

    @JSProperty
    @Nullable
    DeviceMotionEventAcceleration getAccelerationIncludingGravity();

    @JSProperty
    double getInterval();

    @JSProperty
    @Nullable
    DeviceMotionEventRotationRate getRotationRate();

    @JSBody(script = "return DeviceMotionEvent.prototype")
    static DeviceMotionEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"type","eventInitDict"}, script = "return new DeviceMotionEvent(type, eventInitDict)")
    static DeviceMotionEvent create(String type, DeviceMotionEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="type", script = "return new DeviceMotionEvent(type)")
    static DeviceMotionEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }


    interface DeviceMotionEventInit extends EventInit {
        @JSProperty
        @Nullable
        DeviceMotionEventAccelerationInit getAcceleration();

        @JSProperty
        void setAcceleration(DeviceMotionEventAccelerationInit acceleration);

        @JSProperty
        @Nullable
        DeviceMotionEventAccelerationInit getAccelerationIncludingGravity();

        @JSProperty
        void setAccelerationIncludingGravity(DeviceMotionEventAccelerationInit accelerationIncludingGravity);

        @JSProperty
        double getInterval();

        @JSProperty
        void setInterval(double interval);

        @JSProperty
        @Nullable
        DeviceMotionEventRotationRateInit getRotationRate();

        @JSProperty
        void setRotationRate(DeviceMotionEventRotationRateInit rotationRate);

    }
}
