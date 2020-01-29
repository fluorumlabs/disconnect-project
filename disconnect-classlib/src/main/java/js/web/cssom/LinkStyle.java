package js.web.cssom;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface LinkStyle extends Any {
    @JSProperty
    @Nullable
    StyleSheet getSheet();

}
