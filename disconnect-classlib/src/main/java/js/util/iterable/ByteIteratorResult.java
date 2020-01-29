package js.util.iterable;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface ByteIteratorResult extends Any {
    @JSProperty
    boolean getDone();

    @JSProperty
    void setDone(boolean done);

    @JSProperty
    byte getValue();

    @JSProperty
    void setValue(byte value);

}
