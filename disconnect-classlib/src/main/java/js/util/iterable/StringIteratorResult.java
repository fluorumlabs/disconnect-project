package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface StringIteratorResult extends Any {
    @JSProperty
    boolean getDone();

    @JSProperty
    void setDone(boolean done);

    @JSProperty
    String getValue();

    @JSProperty
    void setValue(String value);

}
