package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;

/**
 * An object providing methods which are not dependent on any particular document. Such an object is returned by the Document.implementation property.
 */
public interface DOMImplementation extends Any {
    @JSBody(script = "return DOMImplementation.prototype")
    static DOMImplementation prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMImplementation()")
    static DOMImplementation create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    Document createDocument(String namespaceURI, String qualifiedName, DocumentType doctype);

    DocumentType createDocumentType(String qualifiedName, String publicId, String systemId);

    Document createHTMLDocument(String title);

    Document createHTMLDocument();

    @Deprecated
    @JSBody(params = {"args"}, script = "this.hasFeature.apply(this, args);")
    boolean hasFeature(@JSByRef Any... args);

}
