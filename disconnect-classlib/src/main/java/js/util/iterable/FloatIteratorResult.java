package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface FloatIteratorResult extends Any {
    @JSProperty
    boolean getDone();

    @JSProperty
    void setDone(boolean done);

    @JSProperty
    float getValue();

    @JSProperty
    void setValue(float value);

}
