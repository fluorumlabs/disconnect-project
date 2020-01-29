package js.web.canvas;

import js.annotations.Experimental;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


@Experimental
public interface ImageBitmapRenderingContext extends Any, RenderingContext, OffscreenRenderingContext {
    @JSBody(script = "return ImageBitmapRenderingContext.prototype")
    static ImageBitmapRenderingContext prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new ImageBitmapRenderingContext()")
    static ImageBitmapRenderingContext create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the canvas element that the context is bound to.
     */
    @JSProperty
    Unknown getCanvas();

    /**
     * Transfers the underlying bitmap data from imageBitmap to context, and the bitmap becomes the contents of the canvas element to which context is bound.
     */
    void transferFromImageBitmap(@Nullable ImageBitmap bitmap);

}
