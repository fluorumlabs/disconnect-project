package js.web.webcomponents;

import js.web.dom.DocumentFragment;
import js.web.dom.Element;
import js.web.dom.InnerHTML;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface ShadowRoot extends DocumentFragment, DocumentOrShadowRoot, InnerHTML {
    @JSBody(script = "return ShadowRoot.prototype")
    static ShadowRoot prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new ShadowRoot()")
    static ShadowRoot create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    Element getHost();

    @JSProperty
    ShadowRootMode getMode();

}
