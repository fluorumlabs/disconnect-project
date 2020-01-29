package js.web.dom;

import js.util.collections.ArrayLike;
import js.util.collections.IntKeyValue;
import js.util.function.IntKeyConsumer;
import js.util.iterable.IntIterableIterator;
import js.util.iterable.IterableIterator;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * NodeList objects are collections of nodes, usually returned by properties such as Node.childNodes and methods such as document.querySelectorAll().
 */
public interface NodeList extends ArrayLike<Node> {
    @JSBody(script = "return NodeList.prototype")
    static NodeList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new NodeList()")
    static NodeList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the number of nodes in the collection.
     */
    @JSProperty
    int getLength();

    /**
     * Returns the node with index index from the collection. The nodes are sorted in tree order.
     */
    @Nullable
    Node item(int index);

    /**
     * Performs the specified action for each node in an list.
     *
     * @param callbackfn A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the list.
     * @param thisArg    An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
     */
    void forEach(IntKeyConsumer<Node, NodeList> callbackfn);

    /**
     * Returns an array of key, value pairs for every entry in the list.
     */
    IterableIterator<IntKeyValue<Node>> entries();

    /**
     * Returns an list of keys in the list.
     */
    IntIterableIterator keys();

    /**
     * Returns an list of values in the list.
     */
    IterableIterator<Node> values();

}
