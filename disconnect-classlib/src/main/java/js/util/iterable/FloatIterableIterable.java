package js.util.iterable;

import org.teavm.jso.JSBody;


public interface FloatIterableIterable extends FloatIterable {
    @JSBody(script = "return this[Symbol.iterator]()")
    @Override
    FloatIterableIterator getIterator();
}
