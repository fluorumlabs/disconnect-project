package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface StyleMedia extends Any {
        @JSProperty
        String getType();

        boolean matchMedium(String mediaquery);

        @JSBody(script = "return StyleMedia.prototype")
        static StyleMedia prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new StyleMedia()")
        static StyleMedia create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
