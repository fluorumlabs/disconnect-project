package js.web.webgl;

import org.teavm.jso.JSBody;

/** The WebGLProgram is part of the WebGL API and is a combination of two compiled WebGLShaders consisting of a vertex shader and a fragment shader (both written in GLSL). */
        public interface WebGLProgram extends WebGLObject {
                @JSBody(script = "return WebGLProgram.prototype")
                static WebGLProgram prototype() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

                @JSBody(script = "return new WebGLProgram()")
                static WebGLProgram create() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

        }
