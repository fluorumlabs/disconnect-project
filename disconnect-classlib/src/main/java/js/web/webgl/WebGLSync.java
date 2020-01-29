package js.web.webgl;

import org.teavm.jso.JSBody;


public interface WebGLSync extends WebGLObject {
            @JSBody(script = "return WebGLSync.prototype")
            static WebGLSync prototype() {
                throw new UnsupportedOperationException("Available only in JavaScript");
            }

            @JSBody(script = "return new WebGLSync()")
            static WebGLSync create() {
                throw new UnsupportedOperationException("Available only in JavaScript");
            }

        }
