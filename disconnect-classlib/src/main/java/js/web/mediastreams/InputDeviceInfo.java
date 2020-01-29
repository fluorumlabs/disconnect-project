package js.web.mediastreams;

import org.teavm.jso.JSBody;


public interface InputDeviceInfo extends MediaDeviceInfo {
        MediaTrackCapabilities getCapabilities();

        @JSBody(script = "return InputDeviceInfo.prototype")
        static InputDeviceInfo prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new InputDeviceInfo()")
        static InputDeviceInfo create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
