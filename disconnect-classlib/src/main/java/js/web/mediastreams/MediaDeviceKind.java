package js.web.mediastreams;

import js.extras.JsEnum;

public abstract class MediaDeviceKind extends JsEnum {
    public static final MediaDeviceKind AUDIO_INPUT = JsEnum.of("audioinput");

    public static final MediaDeviceKind AUDIO_OUTPUT = JsEnum.of("audiooutput");

    public static final MediaDeviceKind VIDEO_INPUT = JsEnum.of("videoinput");


}
