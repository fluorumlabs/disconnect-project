package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface StyleMedia extends Any {
    @JSBody(script = "return StyleMedia.prototype")
    static StyleMedia prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new StyleMedia()")
    static StyleMedia create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getType();

    boolean matchMedium(String mediaquery);

}
