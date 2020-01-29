package js.web.canvas;

import js.lang.Any;
import js.lang.Unknown;
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

/** Provides properties and methods for manipulating the layout and presentation of <canvas> elements. The HTMLCanvasElement interface also inherits the properties and methods of the HTMLElement interface. */
public interface HTMLCanvasElement extends HTMLElement, TexImageSource {
    /**
     * Gets or sets the height of a canvas element on a document.
     */
    @JSProperty
    double getHeight();

    @JSProperty
    void setHeight(double height);

    /**
     * Gets or sets the width of a canvas element on a document.
     */
    @JSProperty
    double getWidth();

    @JSProperty
    void setWidth(double width);

    /**
     * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
     * @param contextId The identifier (ID) of the type of canvas to create. Internet Explorer 9 and Internet Explorer 10 support only a 2-D context using canvas.getContext("2d"); IE11 Preview also supports 3-D or WebGL context using canvas.getContext("experimental-webgl");
     */
    @Nullable
    default CanvasRenderingContext2D get2DContext(CanvasRenderingContext2DSettings options) {
        return getContext("2d", options);
    }
    @Nullable
    default CanvasRenderingContext2D get2DContext() {
        return getContext("2d");
    }

    @Nullable
    default ImageBitmapRenderingContext getBitmapRendererContext(ImageBitmapRenderingContextSettings options) {
        return getContext("bitmaprenderer", options);
    }
    @Nullable
    default ImageBitmapRenderingContext getBitmapRendererContext() {
        return getContext("bitmaprenderer");
    }

    @Nullable
    default WebGLRenderingContext getWebGLContext(WebGLContextAttributes options) {
        return getContext("webgl", options);
    }
    @Nullable
    default WebGLRenderingContext getWebGLContext() {
        return getContext("webgl");
    }

    @Nullable
    default WebGL2RenderingContext getWebGL2Context(WebGLContextAttributes options) {
        return getContext("webgl2", options);
    }
    @Nullable
    default WebGL2RenderingContext getWebGL2Context() {
        return getContext("webgl2");
    }

    @Nullable
    <T extends RenderingContext> T getContext(String contextId, Any options);
    @Nullable
    <T extends RenderingContext> T getContext(String contextId);
    void toBlob(JsConsumer<Blob> callback, String type, Unknown quality);
    void toBlob(JsConsumer<Blob> callback, String type);
    void toBlob(JsConsumer<Blob> callback);
    /**
     * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
     * @param type The standard MIME type for the image format to return. If you do not specify this parameter, the default value is a PNG format image.
     */
    String toDataURL(String type, Unknown quality);
    String toDataURL(String type);
    String toDataURL();
    OffscreenCanvas transferControlToOffscreen();

    @JSBody(script = "return HTMLCanvasElement.prototype")
    static HTMLCanvasElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLCanvasElement()")
    static HTMLCanvasElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
