package js.web.streams;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface ReadableStreamReadResult<T extends Any> extends Any{
        @JSProperty
        boolean isDone();

        @JSProperty
        void setDone(boolean done);

        @JSProperty
        T getValue();

        @JSProperty
        void setValue(T value);

        }
