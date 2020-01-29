package js.util.iterable;

import org.teavm.jso.JSBody;


public interface IntIterableIterable extends IntIterable {
    @JSBody(script = "return this[Symbol.iterator]()")
    @Override
    IntIterableIterator getIterator();
}
