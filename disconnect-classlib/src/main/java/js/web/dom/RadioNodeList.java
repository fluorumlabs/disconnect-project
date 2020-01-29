package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface RadioNodeList extends NodeList {
        @JSProperty
         String getValue();

        @JSProperty
         void setValue(String value);

        @JSBody(script = "return RadioNodeList.prototype")
        static RadioNodeList prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new RadioNodeList()")
        static RadioNodeList create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
