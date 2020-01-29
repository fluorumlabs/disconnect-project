package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ElementCreationOptions extends Any {
    @JSProperty
    @Nullable
    String getIs();

    @JSProperty
    void setIs(String is);

}
