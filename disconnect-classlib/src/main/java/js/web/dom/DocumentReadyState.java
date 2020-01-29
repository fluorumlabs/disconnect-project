package js.web.dom;

import js.extras.JsEnum;


public abstract class DocumentReadyState extends JsEnum {
    public static final DocumentReadyState LOADING = JsEnum.of("loading");

    public static final DocumentReadyState INTERACTIVE = JsEnum.of("interactive");

    public static final DocumentReadyState COMPLETE = JsEnum.of("complete");
}
