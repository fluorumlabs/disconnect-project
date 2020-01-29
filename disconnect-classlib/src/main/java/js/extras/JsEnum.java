package js.extras;

import js.lang.Unknown;
import js.util.JS;
import org.teavm.jso.JSBody;


public abstract class JsEnum implements Unknown {
    @JSBody(params = "value", script = "return value")
    public static native  <T extends JsEnum> T of(String value);

    @JSBody(params = "value", script = "return value")
    public static native  <T extends JsEnum> T of(int value);

    @JSBody(params = "value", script = "return value")
    public static native  <T extends JsEnum> T of(double value);

    @JSBody(params = "value", script = "return value")
    public static native  <T extends JsEnum> T of(boolean value);

    public static <T extends JsEnum> T from(String jsEval) {
        return JS.eval(jsEval).cast();
    }

}
