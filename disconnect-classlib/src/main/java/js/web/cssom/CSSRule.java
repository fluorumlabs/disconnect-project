package js.web.cssom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;

import js.extras.JsEnum;

/** A single CSS rule. There are several types of rules, listed in the Type constants section below. */
public interface CSSRule extends Any {
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
        public static final Type CHARSET_RULE = JsEnum.from("return CSSRule.CHARSET_RULE");
        public static final Type FONT_FACE_RULE = JsEnum.from("return CSSRule.FONT_FACE_RULE");
        public static final Type IMPORT_RULE = JsEnum.from("return CSSRule.IMPORT_RULE");
        public static final Type KEYFRAMES_RULE = JsEnum.from("return CSSRule.KEYFRAMES_RULE");
        public static final Type KEYFRAME_RULE = JsEnum.from("return CSSRule.KEYFRAME_RULE");
        public static final Type MEDIA_RULE = JsEnum.from("return CSSRule.MEDIA_RULE");
        public static final Type NAMESPACE_RULE = JsEnum.from("return CSSRule.NAMESPACE_RULE");
        public static final Type PAGE_RULE = JsEnum.from("return CSSRule.PAGE_RULE");
        public static final Type STYLE_RULE = JsEnum.from("return CSSRule.STYLE_RULE");
        public static final Type SUPPORTS_RULE = JsEnum.from("return CSSRule.SUPPORTS_RULE");
        public static final Type UNKNOWN_RULE = JsEnum.from("return CSSRule.UNKNOWN_RULE");
        public static final Type VIEWPORT_RULE = JsEnum.from("return CSSRule.VIEWPORT_RULE");


    }

    @JSBody(script = "return CSSRule.prototype")
    static CSSRule prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSRule()")
    static CSSRule create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
