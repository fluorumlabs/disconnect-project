package com.github.fluorumlabs.disconnect.core.components.html.scripting;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.lang.Any;
import js.util.function.JsConsumer;
import js.web.canvas.*;
import js.web.dom.Blob;
import js.web.webgl.WebGL2RenderingContext;
import js.web.webgl.WebGLContextAttributes;
import js.web.webgl.WebGLRenderingContext;

import java.util.Optional;

@Tag("canvas")
public class Canvas extends HtmlComponent<HTMLCanvasElement> {
    /**
     * Gets or sets the height of a canvas element on a document.
     *
     * @return the height
     */
    public double getHeight() {
        return getElement().getHeight();
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(double height) {
        getElement().setHeight(height);
    }

    /**
     * Gets or sets the width of a canvas element on a document.
     *
     * @return the width
     */
    public double getWidth() {
        return getElement().getWidth();
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(double width) {
        getElement().setWidth(width);
    }

    /**
     * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a
     * canvas element in a document. A context object includes information about colors, line widths, fonts, and
     * other graphic parameters that can be drawn on a canvas.
     *
     * @param options the options
     *
     * @return the 2 d context
     */
    public Optional<CanvasRenderingContext2D> get2DContext(CanvasRenderingContext2DSettings options) {
        return Optional.ofNullable(getElement().get2DContext(options));
    }

    /**
     * Gets 2 d context.
     *
     * @return the 2 d context
     */
    public Optional<CanvasRenderingContext2D> get2DContext() {
        return Optional.ofNullable(getElement().get2DContext());
    }

    /**
     * Gets bitmap renderer context.
     *
     * @param options the options
     *
     * @return the bitmap renderer context
     */
    public Optional<ImageBitmapRenderingContext> getBitmapRendererContext(ImageBitmapRenderingContextSettings options) {
        return Optional.ofNullable(getElement().getBitmapRendererContext(options));
    }

    /**
     * Gets bitmap renderer context.
     *
     * @return the bitmap renderer context
     */
    public Optional<ImageBitmapRenderingContext> getBitmapRendererContext() {
        return Optional.ofNullable(getElement().getBitmapRendererContext());
    }

    /**
     * Gets web gl context.
     *
     * @param options the options
     *
     * @return the web gl context
     */
    public Optional<WebGLRenderingContext> getWebGLContext(WebGLContextAttributes options) {
        return Optional.ofNullable(getElement().getWebGLContext(options));
    }

    /**
     * Gets web gl context.
     *
     * @return the web gl context
     */
    public Optional<WebGLRenderingContext> getWebGLContext() {
        return Optional.ofNullable(getElement().getWebGLContext());
    }

    /**
     * Gets web gl 2 context.
     *
     * @param options the options
     *
     * @return the web gl 2 context
     */
    public Optional<WebGL2RenderingContext> getWebGL2Context(WebGLContextAttributes options) {
        return Optional.ofNullable(getElement().getWebGL2Context(options));
    }

    /**
     * Gets web gl 2 context.
     *
     * @return the web gl 2 context
     */
    public Optional<WebGL2RenderingContext> getWebGL2Context() {
        return Optional.ofNullable(getElement().getWebGL2Context());
    }

    /**
     * Gets context.
     *
     * @param contextId the context id
     * @param options   the options
     *
     * @return the context
     */
    public <T extends RenderingContext> Optional<T> getContext(String contextId, Any options) {
        return Optional.ofNullable(getElement().getContext(contextId, options));
    }

    /**
     * Gets context.
     *
     * @param contextId the context id
     *
     * @return the context
     */
    public <T extends RenderingContext> Optional<T> getContext(String contextId) {
        return Optional.ofNullable(getElement().getContext(contextId));
    }

    /**
     * To blob.
     * @param callback the callback
     * @param type     the type
     * @param quality  the quality
     */
    public void toBlob(JsConsumer<Blob> callback, String type, double quality) {
        getElement().toBlob(callback, type, quality);
    }

    /**
     * To blob.
     *  @param callback the callback
     * @param type     the type
     */
    public void toBlob(JsConsumer<Blob> callback, String type) {
        getElement().toBlob(callback, type);
    }

    /**
     * To blob.
     *
     * @param callback the callback
     */
    public void toBlob(JsConsumer<Blob> callback) {
        getElement().toBlob(callback);
    }

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
    public String toDataURL(String type, double quality) {
        return getElement().toDataURL(type, quality);
    }

    /**
     * To data url string.
     *
     * @param type the type
     *
     * @return the string
     */
    public String toDataURL(String type) {
        return getElement().toDataURL(type);
    }

    /**
     * To data url string.
     *
     * @return the string
     */
    public String toDataURL() {
        return getElement().toDataURL();
    }

    /**
     * Transfer control to offscreen offscreen canvas.
     *
     * @return the offscreen canvas
     */
    public OffscreenCanvas transferControlToOffscreen() {
        return getElement().transferControlToOffscreen();
    }
}
