package js.web.canvas;

import js.annotations.Experimental;
import js.web.dom.DOMMatrix2DInit;
import org.teavm.jso.JSBody;

/**
 * This Canvas 2D API interface is used to declare a path that can then be used on a CanvasRenderingContext2D object. The path methods of the CanvasRenderingContext2D interface are also present on this interface, which gives you the convenience of being able to retain and replay your path whenever desired.
 */
@Experimental
public interface Path2D extends CanvasPath {
    @JSBody(script = "return Path2D.prototype")
    static Path2D prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Path2D()")
    static Path2D create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "path", script = "return new Path2D(path)")
    static Path2D create(Path2D path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "path", script = "return new Path2D(path)")
    static Path2D create(String path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Adds to the path the path given by the argument.
     */
    void addPath(Path2D path, DOMMatrix2DInit transform);

    void addPath(Path2D path);

}
