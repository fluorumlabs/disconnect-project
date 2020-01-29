package js.web.canvas;

import js.annotations.Experimental;
import js.extras.JsEnum;


@Experimental
public abstract class OffscreenRenderingContextId extends JsEnum {
    public static final OffscreenRenderingContextId CONTEXT_2D = JsEnum.of("2d");

    public static final OffscreenRenderingContextId CONTEXT_BITMAPRENDERER = JsEnum.of("bitmaprenderer");

    public static final OffscreenRenderingContextId CONTEXT_WEBGL = JsEnum.of("webgl");

    public static final OffscreenRenderingContextId CONTEXT_WEBGL2 = JsEnum.of("webgl2");
}
