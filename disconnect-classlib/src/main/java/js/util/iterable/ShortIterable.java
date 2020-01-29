package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface ShortIterable extends Any {
    @JSBody(script = "return this[Symbol.iterator]()")
    <T extends ShortIterator> T getIterator();

    default Iterable<Short> iterable() {
        return () -> getIterator().getJavaIterator();
    }
}
