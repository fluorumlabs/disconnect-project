package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;

import java.util.Iterator;


public interface JsIterator<T extends Any> extends Any {
    @JSBody(script = "return this.next()")
    IteratorResult<T> doNext();

    @JSBody(params = "value", script = "return this.return(value)")
    IteratorResult<T> doReturn(T value);

    @JSBody(script = "return this.return()")
    IteratorResult<T> doReturn();

    @JSBody(params = "e", script = "return this.throw(e)")
    IteratorResult<T> doThrow(Any e);

    @JSBody(script = "return this.throw()")
    IteratorResult<T> doThrow();

    default Iterator<T> getJavaIterator() {
        return new IteratorWrapper<>(this);
    }
}
