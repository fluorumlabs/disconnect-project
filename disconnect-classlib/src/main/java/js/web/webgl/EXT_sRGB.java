package js.web.webgl;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface EXT_sRGB extends Any {
    @JSProperty
    int getFRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT();

    @JSProperty
    int getSRGB8_ALPHA8_EXT();

    @JSProperty
    int getSRGB_ALPHA_EXT();

    @JSProperty
    int getSRGB_EXT();

}
