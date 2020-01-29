package js.util.iterable;

import org.teavm.jso.JSBody;


public interface ByteIterableIterable extends ByteIterable {
    @JSBody(script = "return this[Symbol.iterator]()")
    @Override
    ByteIterableIterator getIterator();
}
