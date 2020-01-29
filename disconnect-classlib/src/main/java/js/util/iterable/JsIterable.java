package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface JsIterable<T extends Any> extends Any {
    @JSBody(script = "return this[Symbol.iterator]()")
    <R extends JsIterator<T>> R getIterator();

    default Iterable<T> iterable() {
        return () -> getIterator().getJavaIterator();
    }
}
