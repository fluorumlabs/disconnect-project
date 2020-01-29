package js.web.dom;

import org.teavm.jso.JSBody;

/** Provides access to the properties of <audio> elements, as well as methods to manipulate them. It derives from the HTMLMediaElement interface. */
public interface HTMLAudioElement extends HTMLMediaElement {
    @JSBody(script = "return HTMLAudioElement.prototype")
    static HTMLAudioElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLAudioElement()")
    static HTMLAudioElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
