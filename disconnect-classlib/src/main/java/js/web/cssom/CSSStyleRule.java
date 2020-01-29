package js.web.cssom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** CSSStyleRule represents a single CSS style rule. It implements the CSSRule interface with a type value of 1 (CSSRule.STYLE_RULE). */
public interface CSSStyleRule extends CSSRule {
    @JSProperty
    String getSelectorText();

    @JSProperty
    void setSelectorText(String selectorText);

    @JSProperty
    CSSStyleDeclaration getStyle();

    @JSBody(script = "return CSSStyleRule.prototype")
    static CSSStyleRule prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSStyleRule()")
    static CSSStyleRule create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }


}
