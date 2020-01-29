package js.web.dom;

import org.teavm.jso.JSBody;

import js.lang.Any;

/** This interface is a compiled XPath expression that can be evaluated on a document or specific node to return information its DOM tree. */
        public interface XPathExpression extends Any {
        XPathResult evaluate(Node contextNode, int type, XPathResult result);
        XPathResult evaluate(Node contextNode, int type);
        XPathResult evaluate(Node contextNode);

        @JSBody(script = "return XPathExpression.prototype")
        static XPathExpression prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new XPathExpression()")
        static XPathExpression create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
