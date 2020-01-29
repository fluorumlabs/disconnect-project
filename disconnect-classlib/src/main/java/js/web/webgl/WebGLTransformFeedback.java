package js.web.webgl;

import org.teavm.jso.JSBody;


public interface WebGLTransformFeedback extends WebGLObject {
    @JSBody(script = "return WebGLTransformFeedback.prototype")
    static WebGLTransformFeedback prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WebGLTransformFeedback()")
    static WebGLTransformFeedback create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
