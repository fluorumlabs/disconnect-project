package js.web.cssom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * An object representing a complete set of keyframes for a CSS animation. It corresponds to the contains of a whole @keyframes at-rule. It implements the CSSRule interface with a type value of 7 (CSSRule.KEYFRAMES_RULE).
 */
public interface CSSKeyframesRule extends CSSRule {
    @JSBody(script = "return CSSKeyframesRule.prototype")
    static CSSKeyframesRule prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSKeyframesRule()")
    static CSSKeyframesRule create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    CSSRuleList getCssRules();

    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    void appendRule(String rule);

    void deleteRule(String select);

    @Nullable
    CSSKeyframeRule findRule(String select);

}
