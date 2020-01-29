package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface DoubleIteratorResult extends Any {
    @JSProperty
    boolean getDone();

    @JSProperty
    void setDone(boolean done);

    @JSProperty
    double getValue();

    @JSProperty
    double setValue(float value);

}
