package js.web.webgl;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Part of the WebGL API and represents the information returned by calling the WebGLRenderingContext.getShaderPrecisionFormat() method. */
        public interface WebGLShaderPrecisionFormat extends Any {
        @JSProperty
        int getPrecision();

        @JSProperty
        int getRangeMax();

        @JSProperty
        int getRangeMin();

        @JSBody(script = "return WebGLShaderPrecisionFormat.prototype")
        static WebGLShaderPrecisionFormat prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new WebGLShaderPrecisionFormat()")
        static WebGLShaderPrecisionFormat create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
