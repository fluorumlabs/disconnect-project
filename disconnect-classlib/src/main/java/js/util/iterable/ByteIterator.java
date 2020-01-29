package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;

import java.util.Iterator;


public interface ByteIterator extends Any {
    @JSBody(script = "return this.next()")
    ByteIteratorResult doNext();
    @JSBody(params="value", script ="return this.return(value)")
    ByteIteratorResult doReturn(byte value);
    @JSBody(script ="return this.return()")
    ByteIteratorResult doReturn();
    @JSBody(params="e", script ="return this.throw(e)")
    ByteIteratorResult doThrow(Any e);
    @JSBody(script ="return this.throw()")
    ByteIteratorResult doThrow();

    default Iterator<Byte> getJavaIterator() {
        return new ByteIteratorWrapper(this);
    }
}
