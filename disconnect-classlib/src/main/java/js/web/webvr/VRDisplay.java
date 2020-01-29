package js.web.webvr;

import js.lang.VoidPromise;
import js.util.function.JsDoubleConsumer;
import js.util.collections.Array;
import js.util.iterable.JsIterable;
import js.web.dom.AnimationFrameProvider;
import js.web.dom.EventTarget;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** This WebVR API interface represents any VR device supported by this API. It includes generic information such as device IDs and descriptions, as well as methods for starting to present a VR scene, retrieving eye parameters and display capabilities, and other important functionality. */
        public interface VRDisplay extends EventTarget {
        @JSProperty
        VRDisplayCapabilities getCapabilities();

        @JSProperty
        double getDepthFar();

        @JSProperty
        void setDepthFar(double depthFar);

        @JSProperty
        double getDepthNear();

        @JSProperty
        void setDepthNear(double depthNear);

        @JSProperty
        int getDisplayId();

        @JSProperty
        String getDisplayName();

        @JSProperty
        boolean isIsConnected();

        @JSProperty
        boolean isIsPresenting();

        @JSProperty
        @Nullable
        VRStageParameters  getStageParameters();

        void cancelAnimationFrame(int handle);
        VoidPromise exitPresent();
        VREyeParameters getEyeParameters(String whichEye);
        boolean getFrameData(VRFrameData frameData);
        Array<VRLayer> getLayers();
        @Deprecated
        VRPose getPose();
        AnimationFrameProvider.AnimationFrameHandle requestAnimationFrame(JsDoubleConsumer callback);
        VoidPromise requestPresent(@JSByRef VRLayer... layers);
        VoidPromise requestPresent(Array<VRLayer> layers);
        VoidPromise requestPresent(JsIterable<VRLayer> layers);
        void resetPose();
        void submitFrame(VRPose pose);
        void submitFrame();

        @JSBody(script = "return VRDisplay.prototype")
        static VRDisplay prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new VRDisplay()")
        static VRDisplay create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
