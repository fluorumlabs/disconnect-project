package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface JsIterable<T extends Any> extends Any {
    @JSBody(script = "return this[Symbol.iterator]()")
    JsIterator<T> getIterator();

    default Iterable<T> iterable() {
        return () -> getIterator().getJavaIterator();
    }
}
