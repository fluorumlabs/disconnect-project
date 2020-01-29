package js.web.streams;

import js.lang.Any;

/**
 * This Streams API interface represents a controller allowing control of a WritableStream's state. When constructing a WritableStream, the underlying sink is given a corresponding WritableStreamDefaultController instance to manipulate.
 */
public interface WritableStreamDefaultController extends Any {
    void error(Any error);

    void error();
}
