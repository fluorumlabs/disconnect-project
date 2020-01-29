package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface FloatIterable extends Any {
    @JSBody(script = "return this[Symbol.iterator]()")
     FloatIterator getIterator();

    default Iterable<Float> iterable() {
        return () -> getIterator().getJavaIterator();
    }
}
