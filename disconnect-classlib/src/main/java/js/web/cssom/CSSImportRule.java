package js.web.cssom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface CSSImportRule extends CSSRule {
    @JSBody(script = "return CSSImportRule.prototype")
    static CSSImportRule prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSImportRule()")
    static CSSImportRule create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getHref();

    @JSProperty
    MediaList getMedia();

    @JSProperty
    CSSStyleSheet getStyleSheet();

}
