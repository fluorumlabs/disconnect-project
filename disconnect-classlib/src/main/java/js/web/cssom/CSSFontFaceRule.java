package js.web.cssom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface CSSFontFaceRule extends CSSRule {
    @JSBody(script = "return CSSFontFaceRule.prototype")
    static CSSFontFaceRule prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSFontFaceRule()")
    static CSSFontFaceRule create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    CSSStyleDeclaration getStyle();

}
