package js.web.webgl;

import org.teavm.jso.JSBody;

/** Part of the WebGL API and represents an opaque buffer object storing data such as vertices or colors. */
        public interface WebGLBuffer extends WebGLObject {
                @JSBody(script = "return WebGLBuffer.prototype")
                static WebGLBuffer prototype() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

                @JSBody(script = "return new WebGLBuffer()")
                static WebGLBuffer create() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

        }
