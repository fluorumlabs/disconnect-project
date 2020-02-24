package js.web.dom;

import org.teavm.jso.JSBody;

/**
 * A &lt;picture&gt; HTML element. It doesn't implement specific properties or methods.
 */
public interface HTMLPictureElement extends HTMLElement {
    @JSBody(script = "return HTMLPictureElement.prototype")
    static HTMLPictureElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLPictureElement()")
    static HTMLPictureElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
