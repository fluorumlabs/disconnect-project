package js.web.webgl;

import org.teavm.jso.JSBody;

/**
 * Part of the WebGL API and represents a buffer that can contain an image, or can be source or target of an rendering operation.
 */
public interface WebGLRenderbuffer extends WebGLObject {
    @JSBody(script = "return WebGLRenderbuffer.prototype")
    static WebGLRenderbuffer prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WebGLRenderbuffer()")
    static WebGLRenderbuffer create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
