package js.web.canvas;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** The CanvasRenderingContext2D interface, part of the Canvas API, provides the 2D rendering context for the drawing surface of a <canvas> element. It is used for drawing shapes, text, images, and other objects. */
public interface CanvasRenderingContext2D extends CanvasCompositing, CanvasDrawImage, CanvasDrawPath, CanvasFillStrokeStyles, CanvasFilters, CanvasImageData, CanvasImageSmoothing, CanvasPath, CanvasPathDrawingStyles, CanvasRect, CanvasShadowStyles, CanvasState, CanvasText, CanvasTextDrawingStyles, CanvasTransform, CanvasUserInterface, RenderingContext {
    @JSProperty
    HTMLCanvasElement getCanvas();

    @JSBody(script = "return CanvasRenderingContext2D.prototype")
    static CanvasRenderingContext2D prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CanvasRenderingContext2D()")
    static CanvasRenderingContext2D create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
