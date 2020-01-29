package js.web.canvas;

import js.annotations.Experimental;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


@Experimental
public interface OffscreenCanvasRenderingContext2D extends CanvasCompositing, CanvasDrawImage, CanvasDrawPath, CanvasFillStrokeStyles, CanvasFilters, CanvasImageData, CanvasImageSmoothing, CanvasPath, CanvasPathDrawingStyles, CanvasRect, CanvasShadowStyles, CanvasState, CanvasText, CanvasTextDrawingStyles, CanvasTransform, OffscreenRenderingContext {
    @JSBody(script = "return OffscreenCanvasRenderingContext2D.prototype")
    static OffscreenCanvasRenderingContext2D prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new OffscreenCanvasRenderingContext2D()")
    static OffscreenCanvasRenderingContext2D create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    OffscreenCanvas getCanvas();

    void commit();

}
