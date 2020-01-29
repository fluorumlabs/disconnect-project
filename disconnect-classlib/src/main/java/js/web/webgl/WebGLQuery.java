package js.web.webgl;

import org.teavm.jso.JSBody;


public interface WebGLQuery extends WebGLObject {
                @JSBody(script = "return WebGLQuery.prototype")
                static WebGLQuery prototype() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

                @JSBody(script = "return new WebGLQuery()")
                static WebGLQuery create() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

        }
