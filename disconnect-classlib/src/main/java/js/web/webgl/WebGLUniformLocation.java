package js.web.webgl;

import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * Part of the WebGL API and represents the location of a uniform variable in a shader program.
 */
public interface WebGLUniformLocation extends Any {
    @JSBody(script = "return WebGLUniformLocation.prototype")
    static WebGLUniformLocation prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WebGLUniformLocation()")
    static WebGLUniformLocation create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
