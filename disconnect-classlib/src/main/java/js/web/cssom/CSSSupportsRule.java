package js.web.cssom;

import org.teavm.jso.JSBody;

/**
 * An object representing a single CSS @supports at-rule. It implements the CSSConditionRule interface, and therefore the CSSRule and CSSGroupingRule interfaces with a type value of 12 (CSSRule.SUPPORTS_RULE).
 */
public interface CSSSupportsRule extends CSSConditionRule {

    @JSBody(script = "return CSSSupportsRule.prototype")
    static CSSSupportsRule prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSSupportsRule()")
    static CSSSupportsRule create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
