package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface IteratorResult<T extends Any> extends Any {
    @JSProperty
    boolean getDone();

    @JSProperty
    void setDone(boolean done);

    @JSProperty
    T getValue();

    @JSProperty
    void setValue(T value);

}
