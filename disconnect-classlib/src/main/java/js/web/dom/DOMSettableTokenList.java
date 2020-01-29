package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface DOMSettableTokenList extends DOMTokenList {
    @JSBody(script = "return DOMSettableTokenList.prototype")
    static DOMSettableTokenList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMSettableTokenList()")
    static DOMSettableTokenList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getValue();

    @JSProperty
    void setValue(String value);


}
