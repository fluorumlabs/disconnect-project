package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * An iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order.
 */
public interface NodeIterator extends Any {
    @JSBody(script = "return NodeIterator.prototype")
    static NodeIterator prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new NodeIterator()")
    static NodeIterator create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    NodeFilter getFilter();

    @JSProperty
    boolean isPointerBeforeReferenceNode();

    @JSProperty
    Node getReferenceNode();

    @JSProperty
    Node getRoot();

    @JSProperty
    int getWhatToShow();

    void detach();

    @Nullable
    Node nextNode();

    @Nullable
    Node previousNode();

}
