package js.web.streams;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface ReadableStreamDefaultController<R extends Any> extends Any {
    @JSProperty
    int getDesiredSize();

    void close();

    void enqueue(R chunk);

    void error(Any error);

    void error();
}
