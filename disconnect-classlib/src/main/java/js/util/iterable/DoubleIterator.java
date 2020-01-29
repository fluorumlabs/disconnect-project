package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSBody;

import java.util.Iterator;


public interface DoubleIterator extends Any {
    @JSBody(script = "return this.next()")
    DoubleIteratorResult doNext();

    @JSBody(params = "value", script = "return this.return(value)")
    DoubleIteratorResult doReturn(double value);

    @JSBody(script = "return this.return()")
    DoubleIteratorResult doReturn();

    @JSBody(params = "e", script = "return this.throw(e)")
    DoubleIteratorResult doThrow(Any e);

    @JSBody(script = "return this.throw()")
    DoubleIteratorResult doThrow();

    default Iterator<Double> getJavaIterator() {
        return new DoubleIteratorWrapper(this);
    }
}
