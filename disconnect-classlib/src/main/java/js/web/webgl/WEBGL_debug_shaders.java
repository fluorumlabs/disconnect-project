package js.web.webgl;

import js.lang.Any;


public interface WEBGL_debug_shaders extends Any {
    String getTranslatedShaderSource(WebGLShader shader);
}
