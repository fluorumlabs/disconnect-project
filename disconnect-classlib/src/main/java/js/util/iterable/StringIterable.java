package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface StringIterable extends Any {
    @JSBody(script = "return this[Symbol.iterator]()")
    StringIterator getIterator();

    default Iterable<String> iterable() {
        return () -> getIterator().getJavaIterator();
    }
}
