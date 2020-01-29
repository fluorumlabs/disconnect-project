package js.util.iterable;

import org.teavm.jso.JSBody;


public  interface StringIterableIterable extends StringIterable {
    @JSBody(script = "return this[Symbol.iterator]()")
    @Override
    StringIterableIterator getIterator();
}
