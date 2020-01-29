package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface IterableIterable<T extends Any> extends JsIterable<T> {
    @JSBody(script = "return this[Symbol.iterator]()")
    @Override
    IterableIterator<T> getIterator();
}
