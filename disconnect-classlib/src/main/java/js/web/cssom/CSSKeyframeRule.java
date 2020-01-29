package js.web.cssom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * An object representing a set of style for a given keyframe. It corresponds to the contains of a single keyframe of a @keyframes at-rule. It implements the CSSRule interface with a type value of 8 (CSSRule.KEYFRAME_RULE).
 */
public interface CSSKeyframeRule extends CSSRule {
    @JSBody(script = "return CSSKeyframeRule.prototype")
    static CSSKeyframeRule prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSKeyframeRule()")
    static CSSKeyframeRule create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getKeyText();

    @JSProperty
    void setKeyText(String keyText);

    @JSProperty
    CSSStyleDeclaration getStyle();

}
