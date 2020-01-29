package js.web.dom;

import org.teavm.jso.JSBody;

/** Provides special properties (beyond the HTMLElement object interface it also has available to it by inheritance) to manipulate <datalist> elements and their content. */
public interface HTMLDataListElement extends HTMLElement {
    @JSBody(script = "return HTMLDataListElement.prototype")
    static HTMLDataListElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLDataListElement()")
    static HTMLDataListElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
