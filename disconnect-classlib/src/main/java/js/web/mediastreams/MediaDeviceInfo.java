package js.web.mediastreams;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;
import js.lang.Unknown;

/** The MediaDevicesInfo interface contains information that describes a single media input or output device. */
        public interface MediaDeviceInfo extends Any {
        @JSProperty
        String getDeviceId();

        @JSProperty
        String getGroupId();

        @JSProperty
        MediaDeviceKind getKind();

        @JSProperty
        String getLabel();

        Unknown toJSON();

        @JSBody(script = "return MediaDeviceInfo.prototype")
        static MediaDeviceInfo prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new MediaDeviceInfo()")
        static MediaDeviceInfo create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
