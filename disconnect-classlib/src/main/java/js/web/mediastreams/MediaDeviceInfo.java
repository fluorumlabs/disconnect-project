package js.web.mediastreams;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The MediaDevicesInfo interface contains information that describes a single media input or output device.
 */
public interface MediaDeviceInfo extends Any {
    @JSBody(script = "return MediaDeviceInfo.prototype")
    static MediaDeviceInfo prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new MediaDeviceInfo()")
    static MediaDeviceInfo create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getDeviceId();

    @JSProperty
    String getGroupId();

    @JSProperty
    MediaDeviceKind getKind();

    @JSProperty
    String getLabel();

    Unknown toJSON();

}
