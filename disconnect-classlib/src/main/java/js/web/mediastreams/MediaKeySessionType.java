package js.web.mediastreams;

import js.extras.JsEnum;

public abstract class MediaKeySessionType extends JsEnum {
    public static final MediaKeySessionType TEMPORARY = JsEnum.of("temporary");

    public static final MediaKeySessionType PERSISTENT_LICENSE = JsEnum.of("persistent-license");

}
