package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface BarProp extends Any {
    @JSProperty
    boolean isVisible();

    @JSBody(script = "return BarProp.prototype")
    static BarProp prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new BarProp()")
    static BarProp create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
