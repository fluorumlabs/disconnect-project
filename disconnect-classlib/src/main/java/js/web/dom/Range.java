package js.web.dom;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** A fragment of a document that can contain nodes and parts of text nodes. */
        public interface Range extends AbstractRange {
        /**
         * Returns the node, furthest away from the document, that is an ancestor of both range's start node and end node.
         */
        @JSProperty
        Node getCommonAncestorContainer();

        DocumentFragment cloneContents();
        Range cloneRange();
        void collapse(boolean toStart);
        void collapse();
        int compareBoundaryPoints(Mode how, Range sourceRange);
        /**
         * Returns −1 if the point is before the range, 0 if the point is in the range, and 1 if the point is after the range.
         */
        int comparePoint(Node node, int offset);
        DocumentFragment createContextualFragment(String fragment);
        void deleteContents();
        void detach();
        DocumentFragment extractContents();
        DOMRect getBoundingClientRect();
        DOMRectList getClientRects();
        void insertNode(Node node);
        /**
         * Returns whether range intersects node.
         */
        boolean intersectsNode(Node node);
        boolean isPointInRange(Node node, int offset);
        void selectNode(Node node);
        void selectNodeContents(Node node);
        void setEnd(Node node, int offset);
        void setEndAfter(Node node);
        void setEndBefore(Node node);
        void setStart(Node node, int offset);
        void setStartAfter(Node node);
        void setStartBefore(Node node);
        void surroundContents(Node newParent);


        abstract class Mode extends JsEnum{
        public static final Mode END_TO_END = JsEnum.from("return Range.END_TO_END");

        public static final Mode END_TO_START = JsEnum.from("return Range.END_TO_START");

        public static final Mode START_TO_END = JsEnum.from("return Range.START_TO_END");

        public static final Mode START_TO_START = JsEnum.from("return Range.START_TO_START");}

@JSBody(script = "return Range.prototype")
static Range prototype() {
    throw new UnsupportedOperationException("Available only in JavaScript");
}

@JSBody(script = "return new Range()")
static Range create() {
    throw new UnsupportedOperationException("Available only in JavaScript");
}

        }
