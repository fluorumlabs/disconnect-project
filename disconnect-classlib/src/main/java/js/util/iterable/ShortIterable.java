package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface ShortIterable extends Any {
    @JSBody(script = "return this[Symbol.iterator]()")
    ShortIterator getIterator();

    default Iterable<Short> iterable() {
        return () -> getIterator().getJavaIterator();
    }
}
