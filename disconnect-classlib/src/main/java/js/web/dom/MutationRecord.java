package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;

/** A MutationRecord represents an individual DOM mutation. It is the object that is passed to MutationObserver's callback. */
        public interface MutationRecord extends Any {
        /**
         * Return the nodes added and removed respectively.
         */
        @JSProperty
        NodeList getAddedNodes();

        /**
         * Returns the local name of the changed attribute, and null otherwise.
         */
        @JSProperty
        @Nullable
        String  getAttributeName();

        /**
         * Returns the namespace of the changed attribute, and null otherwise.
         */
        @JSProperty
        @Nullable
        String  getAttributeNamespace();

        /**
         * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
         */
        @JSProperty
        @Nullable
        Node getNextSibling();

        /**
         * The return value depends on type. For "attributes", it is the value of the changed attribute before the change. For "characterData", it is the data of the changed node before the change. For "childList", it is null.
         */
        @JSProperty
        @Nullable
        String  getOldValue();

        /**
         * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
         */
        @JSProperty
        @Nullable
        Node getPreviousSibling();

        /**
         * Return the nodes added and removed respectively.
         */
        @JSProperty
        NodeList getRemovedNodes();

        /**
         * Returns the node the mutation affected, depending on the type. For "attributes", it is the element whose attribute changed. For "characterData", it is the CharacterData node. For "childList", it is the node whose children changed.
         */
        @JSProperty
        Node getTarget();

        /**
         * Returns "attributes" if it was an attribute mutation. "characterData" if it was a mutation to a CharacterData node. And "childList" if it was a mutation to the tree of nodes.
         */
        @JSProperty
        MutationRecordType getType();

        @JSBody(script = "return MutationRecord.prototype")
        static MutationRecord prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new MutationRecord()")
        static MutationRecord create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
