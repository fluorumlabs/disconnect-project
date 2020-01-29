package js.web.streams;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface TransformStreamDefaultController<O extends Any> extends Any {
        @JSProperty
        int  getDesiredSize();

        void enqueue(O chunk);
        void error(Any reason);
        void error();
        void terminate();
        }
