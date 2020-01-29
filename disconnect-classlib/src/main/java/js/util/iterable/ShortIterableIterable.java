package js.util.iterable;

import org.teavm.jso.JSBody;


public interface ShortIterableIterable extends ShortIterable {
    @JSBody(script = "return this[Symbol.iterator]()")
    @Override
    ShortIterableIterator getIterator();
}
