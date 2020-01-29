package js.web.canvas;

import js.lang.Any;
import js.web.dom.DOMMatrix2DInit;
import org.teavm.jso.JSBody;

/**
 * An opaque object describing a pattern, based on an image, a canvas, or a video, created by the CanvasRenderingContext2D.createPattern() method.
 */
public interface CanvasPattern extends Any {
    @JSBody(script = "return CanvasPattern.prototype")
    static CanvasPattern prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CanvasPattern()")
    static CanvasPattern create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets the transformation matrix that will be used when rendering the pattern during a fill or stroke painting operation.
     */
    void setTransform(DOMMatrix2DInit transform);

    void setTransform();

}
