package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides special properties and methods (beyond those of the regular object HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of map elements.
 */
public interface HTMLMapElement extends HTMLElement {
    @JSBody(script = "return HTMLMapElement.prototype")
    static HTMLMapElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLMapElement()")
    static HTMLMapElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Retrieves a collection of the area objects defined for the given map object.
     */
    @JSProperty
    HTMLCollection getAreas();

    /**
     * Sets or retrieves the name of the object.
     */
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

}
