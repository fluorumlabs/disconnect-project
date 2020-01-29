package js.web.cssom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Any CSS at-rule that contains other rules nested within it.
 */
public interface CSSGroupingRule extends CSSRule {
    @JSBody(script = "return CSSGroupingRule.prototype")
    static CSSGroupingRule prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSGroupingRule()")
    static CSSGroupingRule create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    CSSRuleList getCssRules();

    void deleteRule(int index);

    int insertRule(String rule, int index);

}
