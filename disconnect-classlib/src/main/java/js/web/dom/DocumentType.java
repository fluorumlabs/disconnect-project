package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * A Node containing a doctype.
 */
public interface DocumentType extends Node, ChildNode {
    @JSBody(script = "return DocumentType.prototype")
    static DocumentType prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DocumentType()")
    static DocumentType create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getName();

    @JSProperty
    String getPublicId();

    @JSProperty
    String getSystemId();

}
