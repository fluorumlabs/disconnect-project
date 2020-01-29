package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * Provides the ability to parse XML or HTML source code from a string into a DOM Document.
 */
public interface DOMParser extends Any {
    @JSBody(script = "return DOMParser.prototype")
    static DOMParser prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMParser()")
    static DOMParser create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    Document parseFromString(String str, SupportedType type);

}
