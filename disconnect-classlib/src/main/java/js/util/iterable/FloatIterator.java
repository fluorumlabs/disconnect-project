package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;

import java.util.Iterator;


public interface FloatIterator extends Any {
    @JSBody(script = "return this.next()")
    FloatIteratorResult doNext();

    @JSBody(params = "value", script = "return this.return(value)")
    FloatIteratorResult doReturn(float value);

    @JSBody(script = "return this.return()")
    FloatIteratorResult doReturn();

    @JSBody(params = "e", script = "return this.throw(e)")
    FloatIteratorResult doThrow(Any e);

    @JSBody(script = "return this.throw()")
    FloatIteratorResult doThrow();

    default Iterator<Float> getJavaIterator() {
        return new FloatIteratorWrapper(this);
    }
}
