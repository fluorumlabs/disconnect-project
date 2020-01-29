package js.web.dom;

import org.teavm.jso.JSBody;

/** The HTMLDocument property of Window objects is an alias that browsers expose for the Document interface object. */
public interface HTMLDocument extends Document {
    @JSBody(script = "return HTMLDocument.prototype")
    static HTMLDocument prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLDocument()")
    static HTMLDocument create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
