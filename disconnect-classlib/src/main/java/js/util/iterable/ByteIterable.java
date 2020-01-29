package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface ByteIterable extends Any {
    @JSBody(script = "return this[Symbol.iterator]()")
    <T extends ByteIterator> T getIterator();

    default Iterable<Byte> iterable() {
        return () -> getIterator().getJavaIterator();
    }
}
