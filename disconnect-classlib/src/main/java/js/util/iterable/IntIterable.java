package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface IntIterable extends Any {
    @JSBody(script = "return this[Symbol.iterator]()")
    <T extends IntIterator> T getIterator();

    default Iterable<Integer> iterable() {
        return () -> getIterator().getJavaIterator();
    }
}
