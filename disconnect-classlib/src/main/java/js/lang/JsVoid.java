package js.lang;

import org.teavm.jso.JSBody;


/**
 * The type Js void.
 */
public abstract class JsVoid implements Any {
	/**
	 * The constant VOID.
	 */
	public static final JsVoid VOID = getVoidValue();

    @JSBody(script = "return;")
    private static native JsVoid getVoidValue();
}
