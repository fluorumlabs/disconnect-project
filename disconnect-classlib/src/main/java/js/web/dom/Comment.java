package js.web.dom;

import org.teavm.jso.JSBody;

/** Textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view. */
public interface Comment extends CharacterData {
    @JSBody(script = "return Comment.prototype")
    static Comment prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="data", script = "return new Comment(data)")
    static Comment create(String data) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Comment()")
    static Comment create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
