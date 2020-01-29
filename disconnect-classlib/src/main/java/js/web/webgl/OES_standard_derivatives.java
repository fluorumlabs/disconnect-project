package js.web.webgl;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * The OES_standard_derivatives extension is part of the WebGL API and adds the GLSL derivative functions dFdx, dFdy, and fwidth.
 */
public interface OES_standard_derivatives extends Any {
    @JSProperty
    int getFRAGMENT_SHADER_DERIVATIVE_HINT_OES();

}
