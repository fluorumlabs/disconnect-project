package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface HTMLTableHeaderCellElement extends HTMLTableCellElement {
    @JSProperty
    String getScope();

    @JSProperty
    void setScope(String scope);

    @JSBody(script = "return HTMLTableHeaderCellElement.prototype")
    static HTMLTableHeaderCellElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLTableHeaderCellElement()")
    static HTMLTableHeaderCellElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
