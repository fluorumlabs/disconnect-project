package js.extras;

import js.lang.Unknown;
import org.teavm.jso.JSBody;


public abstract class JsBitField<T extends JsBit> implements Unknown {
    @JSBody(script = "return 0")
    public native void clear();

    @JSBody(params = "value", script = "return this | value")
    public native JsBitField<T> add(T value);

    @JSBody(params = "value", script = "return this & ~value")
    public native JsBitField<T> remove(T value);

    @JSBody(params = "value", script = "return this ^ value")
    public native JsBitField<T> toggle(T value);

    @JSBody(params = "value", script = "return !!(this & value)")
    public native boolean contains(T value);

    @JSBody(script = "return 0")
    public static native <T extends JsBit> JsBitField<T> empty();
}
