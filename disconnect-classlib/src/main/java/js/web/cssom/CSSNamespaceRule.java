package js.web.cssom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** An object representing a single CSS @namespace at-rule. It implements the CSSRule interface, with a type value of 10 (CSSRule.NAMESPACE_RULE). */
public interface CSSNamespaceRule extends CSSRule {
    @JSProperty
    String getNamespaceURI();

    @JSProperty
    String getPrefix();

    @JSBody(script = "return CSSNamespaceRule.prototype")
    static CSSNamespaceRule prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSNamespaceRule()")
    static CSSNamespaceRule create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
