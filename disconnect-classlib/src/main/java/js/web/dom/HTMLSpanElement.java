package js.web.dom;

import org.teavm.jso.JSBody;

/**
 * A &lt;span&gt; element and derives from the HTMLElement interface, but without implementing any additional properties or methods.
 */
public interface HTMLSpanElement extends HTMLElement {
    @JSBody(script = "return HTMLSpanElement.prototype")
    static HTMLSpanElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLSpanElement()")
    static HTMLSpanElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
