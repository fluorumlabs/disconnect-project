package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** A DOM element's attribute as an object. In most DOM methods, you will probably directly retrieve the attribute as a string (e.g., Element.getAttribute(), but certain functions (e.g., Element.getAttributeNode()) or means of iterating give Attr types. */
public interface Attr extends Node {
    @JSProperty
    String getLocalName();

    @JSProperty
    String getName();

    @JSProperty
    @Nullable
    String  getNamespaceURI();

    @JSProperty
    @Nullable
    Element getOwnerElement();

    @JSProperty
    @Nullable
    String  getPrefix();

    @JSProperty
    boolean isSpecified();

    @JSProperty
    String getValue();

    @JSProperty
    void setValue(String value);

    @JSBody(script = "return Attr.prototype")
    static Attr prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Attr()")
    static Attr create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }


}
