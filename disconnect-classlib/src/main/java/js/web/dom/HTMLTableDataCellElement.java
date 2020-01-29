package js.web.dom;

import org.teavm.jso.JSBody;


public interface HTMLTableDataCellElement extends HTMLTableCellElement {
    @JSBody(script = "return HTMLTableDataCellElement.prototype")
    static HTMLTableDataCellElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLTableDataCellElement()")
    static HTMLTableDataCellElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
