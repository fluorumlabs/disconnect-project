package js.web.webgl;

import org.teavm.jso.JSBody;

/** Part of the WebGL API and represents an opaque texture object providing storage and state for texturing operations. */
        public interface WebGLTexture extends WebGLObject {
            @JSBody(script = "return WebGLTexture.prototype")
            static WebGLTexture prototype() {
                throw new UnsupportedOperationException("Available only in JavaScript");
            }

            @JSBody(script = "return new WebGLTexture()")
            static WebGLTexture create() {
                throw new UnsupportedOperationException("Available only in JavaScript");
            }

        }
