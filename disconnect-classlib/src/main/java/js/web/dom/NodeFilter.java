package js.web.dom;

import js.extras.JsBit;
import js.extras.JsEnum;
import js.lang.Any;

/**
 * An object used to filter the nodes in a NodeIterator or TreeWalker. They don't know anything about the DOM or how to traverse nodes; they just know how to evaluate a single node against the provided filter.
 */
public interface NodeFilter extends Any {
    FilterResult acceptNode(Node node);

    abstract class FilterResult extends JsEnum {

        public static final FilterResult FILTER_ACCEPT = JsEnum.from("NodeFilter.FILTER_ACCEPT");

        public static final FilterResult FILTER_REJECT = JsEnum.from("NodeFilter.FILTER_REJECT");

        public static final FilterResult FILTER_SKIP = JsEnum.from("NodeFilter.FILTER_SKIP");
    }

    abstract class FilterShow extends JsBit {

        public static final FilterShow SHOW_ALL = JsBit.from("return NodeFilter.SHOW_ALL");

        public static final FilterShow SHOW_ATTRIBUTE = JsBit.from("return NodeFilter.SHOW_ATTRIBUTE");

        public static final FilterShow SHOW_CDATA_SECTION = JsBit.from("return NodeFilter.SHOW_CDATA_SECTION");

        public static final FilterShow SHOW_COMMENT = JsBit.from("return NodeFilter.SHOW_COMMENT");

        public static final FilterShow SHOW_DOCUMENT = JsBit.from("return NodeFilter.SHOW_DOCUMENT");

        public static final FilterShow SHOW_DOCUMENT_FRAGMENT = JsBit.from("return NodeFilter.SHOW_DOCUMENT_FRAGMENT");

        public static final FilterShow SHOW_DOCUMENT_TYPE = JsBit.from("return NodeFilter.SHOW_DOCUMENT_TYPE");

        public static final FilterShow SHOW_ELEMENT = JsBit.from("return NodeFilter.SHOW_ELEMENT");

        public static final FilterShow SHOW_ENTITY = JsBit.from("return NodeFilter.SHOW_ENTITY");

        public static final FilterShow SHOW_ENTITY_REFERENCE = JsBit.from("return NodeFilter.SHOW_ENTITY_REFERENCE");

        public static final FilterShow SHOW_NOTATION = JsBit.from("return NodeFilter.SHOW_NOTATION");

        public static final FilterShow SHOW_PROCESSING_INSTRUCTION = JsBit.from("return NodeFilter.SHOW_PROCESSING_INSTRUCTION");

        public static final FilterShow SHOW_TEXT = JsBit.from("return NodeFilter.SHOW_TEXT");
    }

}
