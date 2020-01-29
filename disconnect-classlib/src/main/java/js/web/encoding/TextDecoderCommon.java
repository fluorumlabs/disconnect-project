package js.web.encoding;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface TextDecoderCommon extends Any {
        /**
         * Returns encoding's name, lowercased.
         */
        @JSProperty
        String getEncoding();

        /**
         * Returns true if error mode is "fatal", and false otherwise.
         */
        @JSProperty
        boolean isFatal();

        /**
         * Returns true if ignore BOM flag is set, and false otherwise.
         */
        @JSProperty
        boolean isIgnoreBOM();

        }
