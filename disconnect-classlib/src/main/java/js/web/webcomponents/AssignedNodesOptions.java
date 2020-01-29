package js.web.webcomponents;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface AssignedNodesOptions extends Any {
    @JSProperty
    boolean isFlatten();

    @JSProperty
    void setFlatten(boolean flatten);

}
