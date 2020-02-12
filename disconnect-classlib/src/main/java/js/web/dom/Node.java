package js.web.dom;


import js.extras.JsEnum;
import js.web.webcomponents.GetRootNodeOptions;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Node is an interface from which a number of DOM API object types inherit. It allows those types to be treated similarly; for example, inheriting the same set of methods, or being tested in the same way.
 */
public interface Node extends EventTarget {
    @JSBody(script = "return Node.prototype")
    static Node prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Node()")
    static Node create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns node's node document's document base URL.
     */
    @JSProperty
    String getBaseURI();

    /**
     * Returns the children.
     */
    @JSProperty
    NodeListOf<ChildNode> getChildNodes();

    /**
     * Returns the first child.
     */
    @JSProperty
    @Nullable
    ChildNode getFirstChild();

    /**
     * Returns true if node is connected and false otherwise.
     */
    @JSProperty
    boolean isIsConnected();

    /**
     * Returns the last child.
     */
    @JSProperty
    @Nullable
    ChildNode getLastChild();

    @Deprecated
    @JSProperty
    @Nullable
    String getNamespaceURI();

    /**
     * Returns the next sibling.
     */
    @JSProperty
    @Nullable
    ChildNode getNextSibling();

    /**
     * Returns a string appropriate for the type of node.
     */
    @JSProperty
    String getNodeName();

    /**
     * Returns the type of node.
     */
    @JSProperty
    NodeType getNodeType();

    @JSProperty
    @Nullable
    String getNodeValue();

    @JSProperty
    void setNodeValue(String nodeValue);

    /**
     * Returns the node document. Returns null for documents.
     */
    @JSProperty
    @Nullable
    Document getOwnerDocument();

    /**
     * Returns the parent element.
     */
    @JSProperty
    @Nullable
    HTMLElement getParentElement();

    /**
     * Returns the parent.
     */
    @JSProperty
    @Nullable
    ParentNode getParentNode();

    /**
     * Returns the previous sibling.
     */
    @JSProperty
    @Nullable
    Node getPreviousSibling();

    @JSProperty
    @Nullable
    String getTextContent();

    @JSProperty
    void setTextContent(String textContent);

    <T extends Node> T appendChild(T newChild);

    /**
     * Returns a copy of node. If deep is true, the copy also includes the node's descendants.
     */
    Node cloneNode(boolean deep);

    Node cloneNode();

    /**
     * Returns a bitmask indicating the position of other relative to node.
     */
    DocumentPosition compareDocumentPosition(Node other);

    /**
     * Returns true if other is an inclusive descendant of node, and false otherwise.
     */
    boolean contains(@Nullable Node other);

    /**
     * Returns node's root.
     */
    Node getRootNode(GetRootNodeOptions options);

    Node getRootNode();

    /**
     * Returns whether node has children.
     */
    boolean hasChildNodes();

    <T extends Node> T insertBefore(T newChild, @Nullable Node refChild);

    boolean isDefaultNamespace(@Nullable String namespace);

    /**
     * Returns whether node and otherNode have the same properties.
     */
    boolean isEqualNode(@Nullable Node otherNode);

    boolean isSameNode(@Nullable Node otherNode);

    @Nullable
    String lookupNamespaceURI(String prefix);

    @Nullable
    String lookupPrefix(@Nullable String namespace);

    /**
     * Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes.
     */
    void normalize();

    <T extends Node> T removeChild(T oldChild);

    <T extends Node> T replaceChild(Node newChild, T oldChild);

    abstract class NodeType extends JsEnum {
        public static final NodeType ATTRIBUTE_NODE = JsEnum.from("Node.ATTRIBUTE_NODE");

        /**
         * node is a CDATASection node.
         */
        public static final NodeType CDATA_SECTION_NODE = JsEnum.from("Node.CDATA_SECTION_NODE");

        /**
         * node is a Comment node.
         */
        public static final NodeType COMMENT_NODE = JsEnum.from("Node.COMMENT_NODE");

        /**
         * node is a DocumentFragment node.
         */
        public static final NodeType DOCUMENT_FRAGMENT_NODE = JsEnum.from("Node.DOCUMENT_FRAGMENT_NODE");

        /**
         * node is a document.
         */
        public static final NodeType DOCUMENT_NODE = JsEnum.from("Node.DOCUMENT_NODE");

        /**
         * node is a doctype.
         */
        public static final NodeType DOCUMENT_TYPE_NODE = JsEnum.from("Node.DOCUMENT_TYPE_NODE");

        /**
         * node is an element.
         */
        public static final NodeType ELEMENT_NODE = JsEnum.from("Node.ELEMENT_NODE");

        public static final NodeType ENTITY_NODE = JsEnum.from("Node.ENTITY_NODE");

        public static final NodeType ENTITY_REFERENCE_NODE = JsEnum.from("Node.ENTITY_REFERENCE_NODE");

        public static final NodeType NOTATION_NODE = JsEnum.from("Node.NOTATION_NODE");

        /**
         * node is a ProcessingInstruction node.
         */
        public static final NodeType PROCESSING_INSTRUCTION_NODE = JsEnum.from("Node.PROCESSING_INSTRUCTION_NODE");

        /**
         * node is a Text node.
         */
        public static final NodeType TEXT_NODE = JsEnum.from("Node.TEXT_NODE");
    }

    abstract class DocumentPosition extends JsEnum {
        /**
         * Set when other is a descendant of node.
         */
        public static final DocumentPosition DOCUMENT_POSITION_CONTAINED_BY = JsEnum.from("Node.DOCUMENT_POSITION_CONTAINED_BY");

        /**
         * Set when other is an ancestor of node.
         */
        public static final DocumentPosition DOCUMENT_POSITION_CONTAINS = JsEnum.from("Node.DOCUMENT_POSITION_CONTAINS");

        /**
         * Set when node and other are not in the same tree.
         */
        public static final DocumentPosition DOCUMENT_POSITION_DISCONNECTED = JsEnum.from("Node.DOCUMENT_POSITION_DISCONNECTED");

        /**
         * Set when other is following node.
         */
        public static final DocumentPosition DOCUMENT_POSITION_FOLLOWING = JsEnum.from("Node.DOCUMENT_POSITION_FOLLOWING");

        public static final DocumentPosition DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = JsEnum.from("Node.DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC");

        /**
         * Set when other is preceding node.
         */
        public static final DocumentPosition DOCUMENT_POSITION_PRECEDING = JsEnum.from("Node.DOCUMENT_POSITION_PRECEDING");

    }

}
