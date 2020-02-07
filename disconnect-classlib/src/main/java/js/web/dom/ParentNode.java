package js.web.dom;


import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ParentNode extends Node {
    @JSProperty
    int getChildElementCount();

    /**
     * Returns the child elements.
     */
    @JSProperty
    HTMLCollection getChildren();

    /**
     * Returns the first child that is an element, and null otherwise.
     */
    @JSProperty
    @Nullable
    Element getFirstElementChild();

    /**
     * Returns the last child that is an element, and null otherwise.
     */
    @JSProperty
    @Nullable
    Element getLastElementChild();

    /**
     * Inserts nodes after the last child of node, while replacing strings in nodes with equivalent Text nodes.
     * <p>
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     */
    @JSBody(params = "nodes", script = "this.append.apply(this, nodes)")
    void append(Node... nodes);

    void append(Array<Node> nodes);

    @JSBody(params = "nodes", script = "this.append.apply(this, nodes)")
    void append(String... nodes);

    /**
     * Inserts nodes before the first child of node, while replacing strings in nodes with equivalent Text nodes.
     * <p>
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     */
    @JSBody(params = "nodes", script = "this.prepend.apply(this, nodes)")
    void prepend(Node... nodes);

    void prepend(Array<Node> nodes);

    @JSBody(params = "nodes", script = "this.prepend.apply(this, nodes)")
    void prepend(String... nodes);

    /**
     * Returns the first element that is a descendant of node that matches selectors.
     */
    @Nullable
    <E extends Element> E querySelector(String selectors);

    /**
     * Returns all element descendants of node that match selectors.
     */
    <E extends Element> NodeListOf<E> querySelectorAll(String selectors);
}
