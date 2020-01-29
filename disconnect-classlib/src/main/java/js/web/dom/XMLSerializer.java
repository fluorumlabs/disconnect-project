package js.web.dom;

import org.teavm.jso.JSBody;

import js.lang.Any;

/** Provides the serializeToString() method to construct an XML string representing a DOM tree. */
        public interface XMLSerializer extends Any {
        String serializeToString(Node root);
        @JSBody(script = "return XMLSerializer.prototype")
        static XMLSerializer prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new XMLSerializer()")
        static XMLSerializer create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
