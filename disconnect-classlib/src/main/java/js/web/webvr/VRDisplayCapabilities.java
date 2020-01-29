package js.web.webvr;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * This WebVR API interface describes the capabilities of a VRDisplay — its features can be used to perform VR device capability tests, for example can it return position information.
 */
public interface VRDisplayCapabilities extends Any {
    @JSBody(script = "return VRDisplayCapabilities.prototype")
    static VRDisplayCapabilities prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new VRDisplayCapabilities()")
    static VRDisplayCapabilities create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isCanPresent();

    @JSProperty
    boolean isHasExternalDisplay();

    @JSProperty
    boolean isHasOrientation();

    @JSProperty
    boolean isHasPosition();

    @JSProperty
    int getMaxLayers();


}
