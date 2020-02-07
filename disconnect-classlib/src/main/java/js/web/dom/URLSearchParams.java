package js.web.dom;

import js.lang.Any;
import js.lang.JsString;
import js.util.StringRecord;
import js.util.collections.Array;
import js.util.collections.StringPair;
import js.util.function.StringKeyStringConsumer;
import js.util.iterable.IterableIterable;
import js.util.iterable.IterableIterator;
import js.util.iterable.StringIterableIterator;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 1/23/2020.
 */
public interface URLSearchParams extends IterableIterable<StringPair>, Any {
    @JSBody(script = "return URLSearchParams.prototype")
    static URLSearchParams prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new URLSearchParams()")
    static URLSearchParams create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "init", script = "return new URLSearchParams(init)")
    static URLSearchParams create(Array<Array<JsString>> init) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "init", script = "return new URLSearchParams(init)")
    static URLSearchParams create(Array<JsString>... init) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "init", script = "return new URLSearchParams(init)")
    static URLSearchParams create(String[]... init) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "init", script = "return new URLSearchParams(init)")
    static URLSearchParams create(StringRecord init) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "init", script = "return new URLSearchParams(init)")
    static URLSearchParams create(String init) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "init", script = "return new URLSearchParams(init)")
    static URLSearchParams create(URLSearchParams init) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Appends a specified key/value pair as a new search parameter.
     */
    void append(String name, String value);

    /**
     * Deletes the given search parameter, and its associated value, from the list of all search parameters.
     */
    void delete(String name);

    /**
     * Returns the first value associated to the given search parameter.
     */
    @Nullable
    String get(String name);

    /**
     * Returns all the values association with a given search parameter.
     */
    String[] getAll(String name);

    /**
     * Returns a Boolean indicating if such a search parameter exists.
     */
    boolean has(String name);

    /**
     * Sets the value associated to a given search parameter to the given value. If there were several values, delete the others.
     */
    void set(String name, String value);

    void sort();

    void forEach(StringKeyStringConsumer<URLSearchParams> callbackfn);

    /**
     * Returns an array of key, value pairs for every entry in the search params.
     */
    IterableIterator<StringPair> entries();

    /**
     * Returns a list of keys in the search params.
     */
    StringIterableIterator keys();

    /**
     * Returns a list of values in the search params.
     */
    StringIterableIterator values();


}
