package js.web.canvas;

import js.annotations.Experimental;
import js.lang.Any;
import js.lang.Promise;
import js.web.dom.Blob;
import js.web.dom.EventTarget;
import js.web.webgl.TexImageSource;
import js.web.webgl.WebGL2RenderingContext;
import js.web.webgl.WebGLContextAttributes;
import js.web.webgl.WebGLRenderingContext;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


@Experimental
public interface OffscreenCanvas extends EventTarget, CanvasImageSource, TexImageSource {
    @JSBody(script = "return OffscreenCanvas.prototype")
    static OffscreenCanvas prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"width", "height"}, script = "return new OffscreenCanvas(width, height)")
    static OffscreenCanvas create(int width, int height) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
     * <p>
     * They can be set, to replace the bitmap with a new, transparent black bitmap of the specified dimensions (effectively resizing it).
     */
    @JSProperty
    int getHeight();

    @JSProperty
    void setHeight(int height);

    /**
     * These attributes return the dimensions of the OffscreenCanvas object's bitmap.
     * <p>
     * They can be set, to replace the bitmap with a new, transparent black bitmap of the specified dimensions (effectively resizing it).
     */
    @JSProperty
    int getWidth();

    @JSProperty
    void setWidth(int width);

    /**
     * Returns a promise that will fulfill with a new Blob object representing a file containing the image in the OffscreenCanvas object.
     * <p>
     * The argument, if provided, is a dictionary that controls the encoding options of the image file to be created. The type field specifies the file format and has a default value of "image/png"; that type is also used if the requested type isn't supported. If the image format supports variable quality (such as "image/jpeg"), then the quality field is a number in the range 0.0 to 1.0 inclusive indicating the desired quality level for the resulting image.
     */
    Promise<Blob> convertToBlob(ImageEncodeOptions options);

    Promise<Blob> convertToBlob();

    /**
     * Returns an object that exposes an API for drawing on the OffscreenCanvas object. contextId specifies the desired API: "2d", "bitmaprenderer", "webgl", or "webgl2". options is handled by that API.
     * <p>
     * This specification defines the "2d" context below, which is similar but distinct from the "2d" context that is created from a canvas element. The WebGL specifications define the "webgl" and "webgl2" contexts. [WEBGL]
     * <p>
     * Returns null if the canvas has already been initialized with another context type (e.g., trying to get a "2d" context after getting a "webgl" context).
     */
    @Nullable
    default OffscreenCanvasRenderingContext2D get2DContext(CanvasRenderingContext2DSettings options) {
        return getContext(OffscreenRenderingContextId.CONTEXT_2D, options);
    }

    @Nullable
    default OffscreenCanvasRenderingContext2D get2DContext() {
        return getContext(OffscreenRenderingContextId.CONTEXT_2D);
    }

    @Nullable
    default ImageBitmapRenderingContext getBitmapRendererContext(ImageBitmapRenderingContextSettings options) {
        return getContext(OffscreenRenderingContextId.CONTEXT_BITMAPRENDERER, options);
    }

    @Nullable
    default ImageBitmapRenderingContext getBitmapRendererContext() {
        return getContext(OffscreenRenderingContextId.CONTEXT_BITMAPRENDERER);
    }

    @Nullable
    default WebGLRenderingContext getWebGLContext(WebGLContextAttributes options) {
        return getContext(OffscreenRenderingContextId.CONTEXT_WEBGL, options);
    }

    @Nullable
    default WebGLRenderingContext getWebGLContext() {
        return getContext(OffscreenRenderingContextId.CONTEXT_WEBGL);
    }

    @Nullable
    default WebGL2RenderingContext getWebGL2Context(WebGLContextAttributes options) {
        return getContext(OffscreenRenderingContextId.CONTEXT_WEBGL2, options);
    }

    @Nullable
    default WebGL2RenderingContext getWebGL2Context() {
        return getContext(OffscreenRenderingContextId.CONTEXT_WEBGL2);
    }

    @Nullable
    <T extends OffscreenRenderingContext> T getContext(OffscreenRenderingContextId contextId, Any options);

    @Nullable
    <T extends OffscreenRenderingContext> T getContext(OffscreenRenderingContextId contextId);

    /**
     * Returns a newly created ImageBitmap object with the image in the OffscreenCanvas object. The image in the OffscreenCanvas object is replaced with a new blank image.
     */
    ImageBitmap transferToImageBitmap();

}
