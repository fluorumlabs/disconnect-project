package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;

@Deprecated
public interface Audio extends Any {
                @JSBody(script = "return new Audio()")
                static HTMLAudioElement create() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

                @JSBody(params="src", script = "return new Audio(src)")
                static HTMLAudioElement create(String src) {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

}
