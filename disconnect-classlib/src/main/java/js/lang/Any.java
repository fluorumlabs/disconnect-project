package js.lang;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;


public interface Any extends JSObject {
    @JSBody(script = "return {};")
    static <T extends Any> T empty() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
