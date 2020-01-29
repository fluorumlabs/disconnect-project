package js.web.dom;

import js.util.collections.ArrayLike;
import js.util.collections.IntKeyValue;
import js.util.function.IntKeyConsumer;
import js.util.iterable.IntIterableIterator;
import js.util.iterable.IterableIterator;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface NodeListOf<TNode extends Node> extends ArrayLike<TNode> {
    /**
     * Returns the number of nodes in the collection.
     */
    @JSProperty
    int getLength();

    @Nullable
    TNode item(int index);

    /**
     * Performs the specified action for each node in an list.
     *
     * @param callbackfn A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the list.
     * @param thisArg    An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
     */
    void forEach(IntKeyConsumer<TNode, NodeListOf<TNode>> callbackfn);

    /**
     * Returns an array of key, value pairs for every entry in the list.
     */
    IterableIterator<IntKeyValue<TNode>> entries();

    /**
     * Returns an list of keys in the list.
     */
    IntIterableIterator keys();

    /**
     * Returns an list of values in the list.
     */
    IterableIterator<TNode> values();

}
