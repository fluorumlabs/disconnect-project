package js.web.webgl;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * The EXT_texture_filter_anisotropic extension is part of the WebGL API and exposes two constants for anisotropic filtering (AF).
 */
public interface EXT_texture_filter_anisotropic extends Any {
    @JSProperty
    int getMAX_TEXTURE_MAX_ANISOTROPY_EXT();

    @JSProperty
    int getTEXTURE_MAX_ANISOTROPY_EXT();

}
