package js.web.fetch;

import js.extras.JsEnum;

public abstract class RequestDestination extends JsEnum {
    public static final RequestDestination NONE = JsEnum.of("none");

    public static final RequestDestination AUDIO = JsEnum.of("audio");

    public static final RequestDestination AUDIO_WORKLET = JsEnum.of("audioworklet");

    public static final RequestDestination DOCUMENT = JsEnum.of("document");

    public static final RequestDestination EMBED = JsEnum.of("embed");

    public static final RequestDestination FONT = JsEnum.of("font");

    public static final RequestDestination IMAGE = JsEnum.of("image");

    public static final RequestDestination MANIFEST = JsEnum.of("manifest");

    public static final RequestDestination OBJECT = JsEnum.of("object");

    public static final RequestDestination PAINT_WORKLET = JsEnum.of("paintworklet");

    public static final RequestDestination REPORT = JsEnum.of("report");

    public static final RequestDestination SCRIPT = JsEnum.of("script");

    public static final RequestDestination SHARED_WORKER = JsEnum.of("sharedworker");

    public static final RequestDestination STYLE = JsEnum.of("style");

    public static final RequestDestination TRACK = JsEnum.of("track");

    public static final RequestDestination VIDEO = JsEnum.of("video");

    public static final RequestDestination WORKER = JsEnum.of("worker");

    public static final RequestDestination XSLT = JsEnum.of("xslt");

}
