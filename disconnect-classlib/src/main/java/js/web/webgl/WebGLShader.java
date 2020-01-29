package js.web.webgl;

import org.teavm.jso.JSBody;

/** The WebGLShader is part of the WebGL API and can either be a vertex or a fragment shader. A WebGLProgram requires both types of shaders. */
        public interface WebGLShader extends WebGLObject {
            @JSBody(script = "return WebGLShader.prototype")
            static WebGLShader prototype() {
                throw new UnsupportedOperationException("Available only in JavaScript");
            }

            @JSBody(script = "return new WebGLShader()")
            static WebGLShader create() {
                throw new UnsupportedOperationException("Available only in JavaScript");
            }

        }
