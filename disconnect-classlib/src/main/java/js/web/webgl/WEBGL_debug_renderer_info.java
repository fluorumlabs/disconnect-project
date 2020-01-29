package js.web.webgl;

import org.teavm.jso.JSProperty;

import js.lang.Any;

/** The WEBGL_debug_renderer_info extension is part of the WebGL API and exposes two constants with information about the graphics driver for debugging purposes. */
        public interface WEBGL_debug_renderer_info extends Any {
        @JSProperty
        int getUNMASKED_RENDERER_WEBGL();

        @JSProperty
        int getUNMASKED_VENDOR_WEBGL();

        }
