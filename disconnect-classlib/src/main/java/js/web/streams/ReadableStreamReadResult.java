package js.web.streams;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface ReadableStreamReadResult<T extends Any> extends Any {
    @JSProperty
    boolean isDone();

    @JSProperty
    void setDone(boolean done);

    @JSProperty
    T getValue();

    @JSProperty
    void setValue(T value);

}
