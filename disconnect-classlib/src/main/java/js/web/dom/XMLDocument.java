package js.web.dom;

import org.teavm.jso.JSBody;

/** An XML document. It inherits from the generic Document and does not add any specific methods or properties to nevertheless it, several algorithms behave differently with the two types of documents. */
        public interface XMLDocument extends Document {
            @JSBody(script = "return XMLDocument.prototype")
            static XMLDocument prototype() {
                throw new UnsupportedOperationException("Available only in JavaScript");
            }
            @JSBody(script = "return new XMLDocument()")
            static XMLDocument create() {
                throw new UnsupportedOperationException("Available only in JavaScript");
            }

        }
