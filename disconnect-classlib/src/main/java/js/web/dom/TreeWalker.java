package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;

/** The nodes of a document subtree and a position within them. */
        public interface TreeWalker extends Any {
        @JSProperty
        Node getCurrentNode();

        @JSProperty
        void setCurrentNode(Node currentNode);

        @JSProperty
        @Nullable
        NodeFilter getFilter();

        @JSProperty
        Node getRoot();

        @JSProperty
        double getWhatToShow();

        @Nullable Node firstChild();
        @Nullable Node lastChild();
        @Nullable Node nextNode();
        @Nullable Node nextSibling();
        @Nullable Node parentNode();
        @Nullable Node previousNode();
        @Nullable Node previousSibling();

        @JSBody(script = "return TreeWalker.prototype")
        static TreeWalker prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new TreeWalker()")
        static TreeWalker create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
