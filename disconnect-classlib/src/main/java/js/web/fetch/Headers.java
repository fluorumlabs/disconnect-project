package js.web.fetch;

import js.lang.Any;
import js.util.function.StringKeyStringConsumer;
import js.util.collections.StringPair;
import js.util.iterable.IterableIterable;
import js.util.iterable.IterableIterator;
import js.util.iterable.StringIterableIterator;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;

/** This Fetch API interface allows you to perform various actions on HTTP request and response headers. These actions include retrieving, setting, adding to, and removing. A Headers object has an associated header list, which is initially empty and consists of zero or more name and value pairs.  You can add to this using methods like append() (see Examples.) In all methods of this interface, header names are matched by case-insensitive byte sequence. */
public interface Headers extends IterableIterable<StringPair>, Any {
     void append(String name, String value);
     void delete(String name);
    @Nullable
     String get(String name);
     boolean has(String name);
     void set(String name, String value);
     void forEach(StringKeyStringConsumer<Headers> callbackfn);

    /**
     * Returns an iterator allowing to go through all key/value pairs contained in this object.
     */
     IterableIterator<StringPair> entries();
    /**
     * Returns an iterator allowing to go through all keys of the key/value pairs contained in this object.
     */
     StringIterableIterator keys();
    /**
     * Returns an iterator allowing to go through all values of the key/value pairs contained in this object.
     */
     StringIterableIterator values();

    @JSBody(script = "return Headers.prototype")
    static Headers prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Headers()")
    static Headers create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
