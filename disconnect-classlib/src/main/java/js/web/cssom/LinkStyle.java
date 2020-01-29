package js.web.cssom;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface LinkStyle extends Any {
        @JSProperty
        @Nullable
        StyleSheet getSheet();

        }
