package js.web.dom;


import org.teavm.jso.JSBody;

import javax.annotation.Nullable;

/**
 * A minimal document object that has no parent. It is used as a lightweight version of Document that stores a segment of a document structure comprised of nodes just like a standard document. The key difference is that because the document fragment isn't part of the active document tree structure, changes made to the fragment don't affect the document, cause reflow, or incur any performance impact that can occur when changes are made.
 */
public interface DocumentFragment extends Node, NonElementParentNode, ParentNode {
    @JSBody(script = "return DocumentFragment.prototype")
    static DocumentFragment prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DocumentFragment()")
    static DocumentFragment create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Nullable
    HTMLElement getElementById(String elementId);

}
