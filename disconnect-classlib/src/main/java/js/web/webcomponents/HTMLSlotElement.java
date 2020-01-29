package js.web.webcomponents;

import js.util.collections.Array;
import js.web.dom.Element;
import js.web.dom.HTMLElement;
import js.web.dom.Node;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface HTMLSlotElement extends HTMLElement {
    @JSBody(script = "return HTMLSlotElement.prototype")
    static HTMLSlotElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLSlotElement()")
    static HTMLSlotElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    Array<Element> assignedElements(AssignedNodesOptions options);

    Array<Element> assignedElements();

    Array<Node> assignedNodes(AssignedNodesOptions options);

    Array<Node> assignedNodes();

}
