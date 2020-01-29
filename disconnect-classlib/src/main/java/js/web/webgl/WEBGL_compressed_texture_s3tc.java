package js.web.webgl;

import org.teavm.jso.JSProperty;

import js.lang.Any;

/** The WEBGL_compressed_texture_s3tc extension is part of the WebGL API and exposes four S3TC compressed texture formats. */
        public interface WEBGL_compressed_texture_s3tc extends Any {
        @JSProperty
        int getCOMPRESSED_RGBA_S3TC_DXT1_EXT();

        @JSProperty
        int getCOMPRESSED_RGBA_S3TC_DXT3_EXT();

        @JSProperty
        int getCOMPRESSED_RGBA_S3TC_DXT5_EXT();

        @JSProperty
        int getCOMPRESSED_RGB_S3TC_DXT1_EXT();

        }
