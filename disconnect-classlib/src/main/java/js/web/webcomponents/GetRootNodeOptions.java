package js.web.webcomponents;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface GetRootNodeOptions extends Any {
    @JSProperty
    boolean isComposed();

    @JSProperty
    void setComposed(boolean composed);

}
