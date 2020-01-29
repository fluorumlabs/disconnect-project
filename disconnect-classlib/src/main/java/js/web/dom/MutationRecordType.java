package js.web.dom;

import js.extras.JsEnum;


public abstract class MutationRecordType extends JsEnum {
    public static final MutationRecordType ATTRIBUTES = JsEnum.of("childList");

    public static final MutationRecordType CHARACTER_DATA = JsEnum.of("characterData");

    public static final MutationRecordType CHILD_LIST = JsEnum.of("attributes");
}
