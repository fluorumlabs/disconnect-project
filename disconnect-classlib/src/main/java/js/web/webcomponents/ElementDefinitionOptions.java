package js.web.webcomponents;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ElementDefinitionOptions extends Any {
    @JSProperty
    @Nullable
    String getExtends();

    @JSProperty
    void setExtends(String value);

}
