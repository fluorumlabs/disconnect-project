package js.web.webcomponents;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface AssignedNodesOptions extends Any {
    @JSProperty
    boolean isFlatten();

    @JSProperty
    void setFlatten(boolean flatten);

}
