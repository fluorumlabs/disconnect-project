package js.web.dom;

import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import js.util.collections.StringKeyValue;
import js.util.function.IntKeyConsumer;
import js.util.iterable.IterableIterable;
import js.util.iterable.IterableIterator;
import js.util.iterable.StringIterableIterator;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;

/**
 * Provides a way to easily construct a set of key/value pairs representing form fields and their values, which can then be easily sent using the XMLHttpRequest.send() method. It uses the same format a form would use if the encoding type were set to "multipart/form-data".
 */
public interface FormData extends IterableIterable<StringKeyValue<Unknown>>, Any {
    @JSBody(script = "return FormData.prototype")
    static FormData prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new FormData()")
    static FormData create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "form", script = "return new FormData(form)")
    static FormData create(HTMLFormElement form) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    void append(String name, String value, String fileName);

    void append(String name, Blob value, String fileName);

    void append(String name, String value);

    void append(String name, Blob value);

    void delete(String name);

    @Nullable
    Unknown get(String name);

    Array<Unknown> getAll(String name);

    boolean has(String name);

    void set(String name, String value, String fileName);

    void set(String name, Blob value, String fileName);

    void set(String name, String value);

    void set(String name, Blob value);

    void forEach(IntKeyConsumer<Unknown, FormData> callbackfn);

    IterableIterator<StringKeyValue<Unknown>> entries();

    /**
     * Returns an list of keys in the array
     */
    StringIterableIterator keys();

    /**
     * Returns an list of values in the array
     */
    IterableIterator<Unknown> values();

}
