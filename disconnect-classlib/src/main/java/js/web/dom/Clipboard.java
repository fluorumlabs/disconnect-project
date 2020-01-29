package js.web.dom;

import js.lang.StringPromise;
import js.lang.VoidPromise;
import org.teavm.jso.JSBody;


public interface Clipboard extends EventTarget {
    @JSBody(script = "return Clipboard.prototype")
    static Clipboard prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Clipboard()")
    static Clipboard create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    StringPromise readText();

    VoidPromise writeText(String data);

}
