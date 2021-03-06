package js.web.webvr;

import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * This WebVR API interface represents represents the event object of WebVR-related events (see the list of WebVR window extensions).
 */
public interface VRDisplayEvent extends Event {
    @JSBody(script = "return VRDisplayEvent.prototype")
    static VRDisplayEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new VRDisplayEvent(type, eventInitDict)")
    static VRDisplayEvent create(String type, VRDisplayEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new VRDisplayEvent(type)")
    static VRDisplayEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    VRDisplay getDisplay();

    @JSProperty
    @Nullable
    VRDisplayEventReason getReason();


    interface VRDisplayEventInit extends EventInit {
        @JSProperty
        VRDisplay getDisplay();

        @JSProperty
        void setDisplay(VRDisplay display);

        @JSProperty
        @Nullable
        VRDisplayEventReason getReason();

        @JSProperty
        void setReason(VRDisplayEventReason reason);

    }
}
