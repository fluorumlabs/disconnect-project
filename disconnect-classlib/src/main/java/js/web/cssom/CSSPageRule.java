package js.web.cssom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * CSSPageRule is an interface representing a single CSS @page rule. It implements the CSSRule interface with a type value of 6 (CSSRule.PAGE_RULE).
 */
public interface CSSPageRule extends CSSRule {
    @JSBody(script = "return CSSPageRule.prototype")
    static CSSPageRule prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSPageRule()")
    static CSSPageRule create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getPseudoClass();

    @JSProperty
    String getSelector();

    @JSProperty
    String getSelectorText();

    @JSProperty
    void setSelectorText(String selectorText);

    @JSProperty
    CSSStyleDeclaration getStyle();

}
