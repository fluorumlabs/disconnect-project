package js.web.canvas;

import js.lang.Any;
import js.util.buffers.Transferable;
import js.web.webgl.TexImageSource;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface ImageBitmap extends Any, CanvasImageSource, TexImageSource, Transferable {
    @JSBody(script = "return ImageBitmap.prototype")
    static ImageBitmap prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new ImageBitmap()")
    static ImageBitmap create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the intrinsic height of the image, in CSS pixels.
     */
    @JSProperty
    double getHeight();

    /**
     * Returns the intrinsic width of the image, in CSS pixels.
     */
    @JSProperty
    double getWidth();

    /**
     * Releases imageBitmap's underlying bitmap data.
     */
    void close();

}
