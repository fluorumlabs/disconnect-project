package js.web.mediastreams;

import js.extras.JsEnum;

 //"license-request" | "license-renewal" | "license-release" |
//        "individualization-request";
        public abstract class MediaKeySessionType extends JsEnum {
public static final MediaKeySessionType TEMPORARY = JsEnum.of("temporary");
public static final MediaKeySessionType PERSISTENT_LICENSE = JsEnum.of("persistent-license");

}
