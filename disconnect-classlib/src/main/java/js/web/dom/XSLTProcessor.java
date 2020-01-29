package js.web.dom;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;

/**
 * An XSLTProcessor applies an XSLT stylesheet transformation to an XML document to produce a new XML document as output. It has methods to load the XSLT stylesheet, to manipulate <param xsl> parameter values, and to apply the transformation to documents.
 */
public interface XSLTProcessor extends Any {
    @JSBody(script = "return XSLTProcessor.prototype")
    static XSLTProcessor prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new XSLTProcessor()")
    static XSLTProcessor create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    void clearParameters();

    Unknown getParameter(String namespaceURI, String localName);

    void importStylesheet(Node style);

    void removeParameter(String namespaceURI, String localName);

    void reset();

    void setParameter(String namespaceURI, String localName, Any value);

    Document transformToDocument(Node source);

    DocumentFragment transformToFragment(Node source, Document document);

}
