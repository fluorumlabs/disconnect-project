package js.web.cssom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * A single condition CSS at-rule, which consists of a condition and a statement block. It is a child of CSSGroupingRule.
 */
public interface CSSConditionRule extends CSSGroupingRule {
    @JSBody(script = "return CSSConditionRule.prototype")
    static CSSConditionRule prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSConditionRule()")
    static CSSConditionRule create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getConditionText();

    @JSProperty
    void setConditionText(String conditionText);
}
