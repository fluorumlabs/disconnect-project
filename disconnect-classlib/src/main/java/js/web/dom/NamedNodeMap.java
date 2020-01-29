package js.web.dom;


import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;

/**
 * A collection of Attr objects. Objects inside a NamedNodeMap are not in any particular order, unlike NodeList, although they may be accessed by an index as in an array.
 */
public interface NamedNodeMap extends ArrayLike<Attr> {

    @JSBody(script = "return NamedNodeMap.prototype")
    static NamedNodeMap prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new NamedNodeMap()")
    static NamedNodeMap create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Nullable
    Attr getNamedItem(String qualifiedName);

    @Nullable
    Attr getNamedItemNS(@Nullable String namespace, String localName);

    Attr removeNamedItem(String qualifiedName);

    Attr removeNamedItemNS(@Nullable String namespace, String localName);

    @Nullable
    Attr setNamedItem(Attr attr);

    @Nullable
    Attr setNamedItemNS(Attr attr);

}
