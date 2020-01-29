package js.web.encoding;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface TextEncoderCommon extends Any {
        /**
         * Returns "utf-8".
         */
        @JSProperty
        String getEncoding();

        }
