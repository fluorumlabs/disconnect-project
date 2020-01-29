package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * This interface is a compiled XPath expression that can be evaluated on a document or specific node to return information its DOM tree.
 */
public interface XPathExpression extends Any {
    @JSBody(script = "return XPathExpression.prototype")
    static XPathExpression prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new XPathExpression()")
    static XPathExpression create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    XPathResult evaluate(Node contextNode, int type, XPathResult result);

    XPathResult evaluate(Node contextNode, int type);

    XPathResult evaluate(Node contextNode);

}
