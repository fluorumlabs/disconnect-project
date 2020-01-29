package js.web.webgl;

import js.lang.Any;
import org.teavm.jso.JSBody;


public interface WebGLObject extends Any {
    @JSBody(script = "return WebGLObject.prototype")
    static WebGLObject prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WebGLObject()")
    static WebGLObject create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
