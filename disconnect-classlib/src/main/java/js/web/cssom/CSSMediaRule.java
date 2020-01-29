package js.web.cssom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** A single CSS @media rule. It implements the CSSConditionRule interface, and therefore the CSSGroupingRule and the CSSRule interface with a type value of 4 (CSSRule.MEDIA_RULE). */
public interface CSSMediaRule extends CSSConditionRule {
    @JSProperty
    MediaList getMedia();

    @JSBody(script = "return CSSMediaRule.prototype")
    static CSSMediaRule prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSMediaRule()")
    static CSSMediaRule create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
