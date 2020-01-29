package js.web.dom;

import javax.annotation.Nullable;import js.lang.Any;



public interface XPathEvaluatorBase extends Any {
        XPathExpression createExpression(String expression, XPathNSResolver resolver);
        XPathExpression createExpression(String expression);
        XPathNSResolver createNSResolver(Node nodeResolver);
        XPathResult evaluate(String expression, Node contextNode, @Nullable XPathNSResolver resolver, int type, XPathResult result);
        XPathResult evaluate(String expression, Node contextNode, @Nullable XPathNSResolver resolver, int type);
        XPathResult evaluate(String expression, Node contextNode, XPathNSResolver resolver);
        XPathResult evaluate(String expression, Node contextNode);
        }
