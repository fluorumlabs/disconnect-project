package js.extras;

import js.lang.Unknown;
import js.util.JS;
import org.teavm.jso.JSBody;


public abstract class JsBit implements Unknown {
    @JSBody(params = "value", script = "return value")
    public static native  <T extends JsBit> T of(int value);

    public static <T extends JsBit> T from(String jsEval) {
        return JS.eval(jsEval).cast();
    }

}
