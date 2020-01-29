package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface IntIteratorResult extends Any {
    @JSProperty
    boolean getDone();

    @JSProperty
    void setDone(boolean done);

    @JSProperty
    int getValue();

    @JSProperty
    void setValue(int value);

}
