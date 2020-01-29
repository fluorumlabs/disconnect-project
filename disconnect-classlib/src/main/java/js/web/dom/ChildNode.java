package js.web.dom;

import org.teavm.jso.JSBody;

import org.teavm.jso.JSByRef;


public interface ChildNode extends Node {
    /**
     * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     */
    @JSBody(params = "nodes", script = "return this.after.apply(this, nodes)")
    void after(@JSByRef String... nodes);
    @JSBody(params = "nodes", script = "return this.after.apply(this, nodes)")
    void after(@JSByRef Node... nodes);
    /**
     * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     */
    @JSBody(params = "nodes", script = "return this.before.apply(this, nodes)")
    void before(@JSByRef String... nodes);
    @JSBody(params = "nodes", script = "return this.before.apply(this, nodes)")
    void before(Node... nodes);
    /**
     * Removes node.
     */
    void remove();
    /**
     * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     */
    @JSBody(params = "nodes", script = "return this.replaceWith().apply(this, nodes)")
    void replaceWith(@JSByRef String... nodes);
    @JSBody(params = "nodes", script = "return this.replaceWith().apply(this, nodes)")
    void replaceWith(@JSByRef Node... nodes);
}
