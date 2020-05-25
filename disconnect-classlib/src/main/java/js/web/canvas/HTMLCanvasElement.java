package js.web.canvas;

import js.lang.Any;
import js.util.function.JsConsumer;
import js.web.dom.Blob;
import js.web.dom.HTMLElement;
import js.web.webgl.TexImageSource;
import js.web.webgl.WebGL2RenderingContext;
import js.web.webgl.WebGLContextAttributes;
import js.web.webgl.WebGLRenderingContext;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides properties and methods for manipulating the layout and presentation of &lt;canvas&gt; elements. The
 * HTMLCanvasElement interface also inherits the properties and methods of the HTMLElement interface.
 */
public interface HTMLCanvasElement extends HTMLElement, TexImageSource {
    /**
     * Prototype html canvas element.
     *
     * @return the html canvas element
     */
    @JSBody(script = "return HTMLCanvasElement.prototype")
    static HTMLCanvasElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Create html canvas element.
     *
     * @return the html canvas element
     */
    @JSBody(script = "return new HTMLCanvasElement()")
    static HTMLCanvasElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Gets or sets the height of a canvas element on a document.
     *
     * @return the height
     */
    @JSProperty
    double getHeight();

    /**
     * Sets height.
     *
     * @param height the height
     */
    @JSProperty
    void setHeight(double height);

    /**
     * Gets or sets the width of a canvas element on a document.
     *
     * @return the width
     */
    @JSProperty
    double getWidth();

    /**
     * Sets width.
     *
     * @param width the width
     */
    @JSProperty
    void setWidth(double width);

    /**
     * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a
     * canvas element in a document. A context object includes information about colors, line widths, fonts, and
     * other graphic parameters that can be drawn on a canvas.
     *
     * @param options the options
     *
     * @return the 2 d context
     */
    @Nullable
    default CanvasRenderingContext2D get2DContext(CanvasRenderingContext2DSettings options) {
        return getContext("2d", options);
    }

    /**
     * Gets 2 d context.
     *
     * @return the 2 d context
     */
    @Nullable
    default CanvasRenderingContext2D get2DContext() {
        return getContext("2d");
    }

    /**
     * Gets bitmap renderer context.
     *
     * @param options the options
     *
     * @return the bitmap renderer context
     */
    @Nullable
    default ImageBitmapRenderingContext getBitmapRendererContext(ImageBitmapRenderingContextSettings options) {
        return getContext("bitmaprenderer", options);
    }

    /**
     * Gets bitmap renderer context.
     *
     * @return the bitmap renderer context
     */
    @Nullable
    default ImageBitmapRenderingContext getBitmapRendererContext() {
        return getContext("bitmaprenderer");
    }

    /**
     * Gets web gl context.
     *
     * @param options the options
     *
     * @return the web gl context
     */
    @Nullable
    default WebGLRenderingContext getWebGLContext(WebGLContextAttributes options) {
        return getContext("webgl", options);
    }

    /**
     * Gets web gl context.
     *
     * @return the web gl context
     */
    @Nullable
    default WebGLRenderingContext getWebGLContext() {
        return getContext("webgl");
    }

    /**
     * Gets web gl 2 context.
     *
     * @param options the options
     *
     * @return the web gl 2 context
     */
    @Nullable
    default WebGL2RenderingContext getWebGL2Context(WebGLContextAttributes options) {
        return getContext("webgl2", options);
    }

    /**
     * Gets web gl 2 context.
     *
     * @return the web gl 2 context
     */
    @Nullable
    default WebGL2RenderingContext getWebGL2Context() {
        return getContext("webgl2");
    }

    /**
     * Gets context.
     *
     * @param <T>       the type parameter
     * @param contextId the context id
     * @param options   the options
     *
     * @return the context
     */
    @Nullable
    <T extends RenderingContext> T getContext(String contextId, Any options);

    /**
     * Gets context.
     *
     * @param <T>       the type parameter
     * @param contextId the context id
     *
     * @return the context
     */
    @Nullable
    <T extends RenderingContext> T getContext(String contextId);

    /**
     * To blob.
     *
     * @param callback the callback
     * @param type     the type
     * @param quality  the quality
     */
    void toBlob(JsConsumer<Blob> callback, String type, double quality);

    /**
     * To blob.
     *
     * @param callback the callback
     * @param type     the type
     */
    void toBlob(JsConsumer<Blob> callback, String type);

    /**
     * To blob.
     *
     * @param callback the callback
     */
    void toBlob(JsConsumer<Blob> callback);

    /**
     * Returns the content of the current canvas as an image that you can use as a source for another canvas or an
     * HTML element.
     *
     * @param type    The standard MIME type for the image format to return. If you do not specify this parameter, the
     *                default value is a PNG format image.
     * @param quality the quality
     *
     * @return the string
     */
    String toDataURL(String type, double quality);

    /**
     * To data url string.
     *
     * @param type the type
     *
     * @return the string
     */
    String toDataURL(String type);

    /**
     * To data url string.
     *
     * @return the string
     */
    String toDataURL();

    /**
     * Transfer control to offscreen offscreen canvas.
     *
     * @return the offscreen canvas
     */
    OffscreenCanvas transferControlToOffscreen();

}
