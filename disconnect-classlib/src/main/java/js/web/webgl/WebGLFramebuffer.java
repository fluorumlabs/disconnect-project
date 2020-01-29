package js.web.webgl;

import org.teavm.jso.JSBody;

/**
 * Part of the WebGL API and represents a collection of buffers that serve as a rendering destination.
 */
public interface WebGLFramebuffer extends WebGLObject {
    @JSBody(script = "return WebGLFramebuffer.prototype")
    static WebGLFramebuffer prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WebGLFramebuffer()")
    static WebGLFramebuffer create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
