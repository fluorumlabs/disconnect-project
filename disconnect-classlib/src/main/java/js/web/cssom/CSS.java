package js.web.cssom;

import org.teavm.jso.JSBody;

/**
 * Holds useful CSS-related methods. No object with this interface are it contains only static methods and therefore is a utilitarian interface implemented.
 */
public final class CSS {
    @JSBody(params = "value", script = "return CSS.escape(value)")
    public static native String escape(String value);

    @JSBody(params = {"property", "value"}, script = "return CSS.supports(property, value)")
    public static native boolean supports(String property, String value);

    @JSBody(params = {"property"}, script = "return CSS.supports(property)")
    public static native boolean supports(String property);
}
