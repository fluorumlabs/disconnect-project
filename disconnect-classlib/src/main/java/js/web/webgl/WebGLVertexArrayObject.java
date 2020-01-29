package js.web.webgl;

import org.teavm.jso.JSBody;


public interface WebGLVertexArrayObject extends WebGLObject {
            @JSBody(script = "return WebGLVertexArrayObject.prototype")
            static WebGLVertexArrayObject prototype() {
                throw new UnsupportedOperationException("Available only in JavaScript");
            }

            @JSBody(script = "return new WebGLVertexArrayObject()")
            static WebGLVertexArrayObject create() {
                throw new UnsupportedOperationException("Available only in JavaScript");
            }

        }
