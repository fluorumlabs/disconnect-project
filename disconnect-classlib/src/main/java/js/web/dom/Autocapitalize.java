package js.web.dom;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public abstract class Autocapitalize extends JsEnum {
    public static final Autocapitalize CHARACTERS = JsEnum.of("characters");
    public static final Autocapitalize WORDS = JsEnum.of("words");
    public static final Autocapitalize SENTENCES = JsEnum.of("sentences");
    public static final Autocapitalize NONE = JsEnum.of("none");
}
