package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;

import java.util.Iterator;


public interface IntIterator extends Any {
    @JSBody(script = "return this.next()")
    IntIteratorResult doNext();
    @JSBody(params="value", script ="return this.return(value)")
    IntIteratorResult doReturn(int value);
    @JSBody(script ="return this.return()")
    IntIteratorResult doReturn();
    @JSBody(params="e", script ="return this.throw(e)")
    IntIteratorResult doThrow(Any e);
    @JSBody(script ="return this.throw()")
    IntIteratorResult doThrow();

    default Iterator<Integer> getJavaIterator() {
        return new IntIteratorWrapper(this);
    }
}
