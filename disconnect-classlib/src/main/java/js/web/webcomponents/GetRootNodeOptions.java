package js.web.webcomponents;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface GetRootNodeOptions extends Any {
    @JSProperty
    boolean isComposed();

    @JSProperty
    void setComposed(boolean composed);

}
