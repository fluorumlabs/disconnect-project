package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface ShortIteratorResult extends Any {
    @JSProperty
    boolean getDone();

    @JSProperty
    void setDone(boolean done);

    @JSProperty
    short getValue();

    @JSProperty
    void setValue(short value);

}
