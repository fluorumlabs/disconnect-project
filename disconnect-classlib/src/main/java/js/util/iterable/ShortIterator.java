package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;

import java.util.Iterator;


public interface ShortIterator extends Any {
    @JSBody(script = "return this.next()")
    ShortIteratorResult doNext();
    @JSBody(params="value", script ="return this.return(value)")
    ShortIteratorResult doReturn(short value);
    @JSBody(script ="return this.return()")
    ShortIteratorResult doReturn();
    @JSBody(params="e", script ="return this.throw(e)")
    ShortIteratorResult doThrow(Any e);
    @JSBody(script ="return this.throw()")
    ShortIteratorResult doThrow();

    default Iterator<Short> getJavaIterator() {
        return new ShortIteratorWrapper(this);
    }
}
