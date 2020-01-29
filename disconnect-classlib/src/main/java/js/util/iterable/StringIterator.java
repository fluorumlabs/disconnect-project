package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;

import java.util.Iterator;


public interface StringIterator extends Any {
    @JSBody(script = "return this.next()")
    StringIteratorResult doNext();

    @JSBody(params = "value", script = "return this.return(value)")
    StringIteratorResult doReturn(int value);

    @JSBody(script = "return this.return()")
    StringIteratorResult doReturn();

    @JSBody(params = "e", script = "return this.throw(e)")
    StringIteratorResult doThrow(Any e);

    @JSBody(script = "return this.throw()")
    StringIteratorResult doThrow();

    default Iterator<String> getJavaIterator() {
        return new StringIteratorWrapper(this);
    }
}
