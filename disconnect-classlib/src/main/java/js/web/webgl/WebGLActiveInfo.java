package js.web.webgl;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Part of the WebGL API and represents the information returned by calling the WebGLRenderingContext.getActiveAttrib() and WebGLRenderingContext.getActiveUniform() methods. */
        public interface WebGLActiveInfo extends Any {
        @JSProperty
        String getName();

        @JSProperty
        int getSize();

        @JSProperty
        int getType();

        @JSBody(script = "return WebGLActiveInfo.prototype")
        static WebGLActiveInfo prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new WebGLActiveInfo()")
        static WebGLActiveInfo create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
