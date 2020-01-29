package js.web.dom;

import org.teavm.jso.JSBody;

/**
 * The XPathEvaluator interface allows to compile and evaluate XPath expressions.
 */
public interface XPathEvaluator extends XPathEvaluatorBase {
    @JSBody(script = "return XPathEvaluator.prototype")
    static XPathEvaluator prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new XPathEvaluator()")
    static XPathEvaluator create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
