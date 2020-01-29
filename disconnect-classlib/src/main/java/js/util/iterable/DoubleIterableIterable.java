package js.util.iterable;

import org.teavm.jso.JSBody;


public interface DoubleIterableIterable extends DoubleIterable {
    @JSBody(script = "return this[Symbol.iterator]()")
    @Override
    DoubleIterableIterator getIterator();
}
