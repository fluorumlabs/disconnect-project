package js.lang;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;


public abstract class JsVoid implements Any {
    public static final JsVoid VOID = getVoidValue();

    @JSBody(script = "return;")
    private static native JsVoid getVoidValue();
}
