package js.web.mediastreams;

import js.extras.JsEnum;

public abstract class MediaKeyMessageType extends JsEnum {
    public static final MediaKeyMessageType LICENSE_REQUEST = JsEnum.of("license-request");

    public static final MediaKeyMessageType LICENSE_RENEWAL = JsEnum.of("license-renewal");

    public static final MediaKeyMessageType LICENSE_RELEASE = JsEnum.of("license-release");

    public static final MediaKeyMessageType INDIVIDUALIZATION_REQUEST = JsEnum.of("individualization-request");


}
