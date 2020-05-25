package js.web.dom;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public abstract class Dir extends JsEnum {
    public static final Dir LTR = JsEnum.of("ltr");
    public static final Dir RTL = JsEnum.of("rlt");
}
