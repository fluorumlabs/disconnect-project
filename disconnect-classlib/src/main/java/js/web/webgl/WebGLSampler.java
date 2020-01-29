package js.web.webgl;

import org.teavm.jso.JSBody;


public interface WebGLSampler extends WebGLObject {
    @JSBody(script = "return WebGLSampler.prototype")
    static WebGLSampler prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WebGLSampler()")
    static WebGLSampler create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
