package js.web.streams;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface ReadableStreamDefaultController<R extends Any> extends Any {
        @JSProperty
        int  getDesiredSize();

        void close();
        void enqueue(R chunk);
        void error(Any error);
        void error();
        }
