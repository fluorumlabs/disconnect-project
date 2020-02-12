package js.web.cssom;

import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A single CSS rule. There are several types of rules, listed in the Type constants section below.
 */
public interface CSSRule extends Any {
    @JSBody(script = "return CSSRule.prototype")
    static CSSRule prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSRule()")
    static CSSRule create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getCssText();

    @JSProperty
    void setCssText(String cssText);

    @JSProperty
    @Nullable
    CSSRule getParentRule();

    @JSProperty
    @Nullable
    CSSStyleSheet getParentStyleSheet();

    @JSProperty
    Type getType();

    abstract class Type extends JsEnum {
        public static final Type CHARSET_RULE = JsEnum.from("CSSRule.CHARSET_RULE");

        public static final Type FONT_FACE_RULE = JsEnum.from("CSSRule.FONT_FACE_RULE");

        public static final Type IMPORT_RULE = JsEnum.from("CSSRule.IMPORT_RULE");

        public static final Type KEYFRAMES_RULE = JsEnum.from("CSSRule.KEYFRAMES_RULE");

        public static final Type KEYFRAME_RULE = JsEnum.from("CSSRule.KEYFRAME_RULE");

        public static final Type MEDIA_RULE = JsEnum.from("CSSRule.MEDIA_RULE");

        public static final Type NAMESPACE_RULE = JsEnum.from("CSSRule.NAMESPACE_RULE");

        public static final Type PAGE_RULE = JsEnum.from("CSSRule.PAGE_RULE");

        public static final Type STYLE_RULE = JsEnum.from("CSSRule.STYLE_RULE");

        public static final Type SUPPORTS_RULE = JsEnum.from("CSSRule.SUPPORTS_RULE");

        public static final Type UNKNOWN_RULE = JsEnum.from("CSSRule.UNKNOWN_RULE");

        public static final Type VIEWPORT_RULE = JsEnum.from("CSSRule.VIEWPORT_RULE");
    }

}
