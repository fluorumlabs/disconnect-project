package js.web.cssom;

import js.lang.Any;
import js.web.dom.DOMRect;
import js.web.dom.Node;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface CaretPosition extends Any {
    @JSProperty
    int getOffset();

    @JSProperty
    Node getOffsetNode();

    @Nullable
    DOMRect getClientRect();

    @JSBody(script = "return CaretPosition.prototype")
    static CaretPosition prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CaretPosition()")
    static CaretPosition create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
