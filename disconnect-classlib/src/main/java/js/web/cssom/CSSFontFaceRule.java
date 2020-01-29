package js.web.cssom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface CSSFontFaceRule extends CSSRule {
    @JSProperty
    CSSStyleDeclaration getStyle();

    @JSBody(script = "return CSSFontFaceRule.prototype")
    static CSSFontFaceRule prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSFontFaceRule()")
    static CSSFontFaceRule create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
