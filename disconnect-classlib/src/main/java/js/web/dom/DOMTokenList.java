package js.web.dom;

import js.util.function.IntKeyStringConsumer;
import js.util.collections.IntStringPair;
import js.util.collections.StringArrayLike;
import js.util.iterable.IntIterableIterator;
import js.util.iterable.IterableIterator;
import js.util.iterable.StringIterableIterator;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** A set of space-separated tokens. Such a set is returned by Element.classList, HTMLLinkElement.relList, HTMLAnchorElement.relList, HTMLAreaElement.relList, HTMLIframeElement.sandbox, or HTMLOutputElement.htmlFor. It is indexed beginning with 0 as with JavaScript Array objects. DOMTokenList is always case-sensitive. */
public interface DOMTokenList extends StringArrayLike {
    /**
     * Returns the number of tokens.
     */
    @JSProperty
     int getLength();

    /**
     * Returns the associated set as string.
     *
     * Can be set, to change the associated attribute.
     */
    @JSProperty
     String getValue();

    @JSProperty
     void setValue(String value);

    /**
     * Adds all arguments passed, except those already present.
     *
     * Throws a "SyntaxError" DOMException if one of the arguments is the empty string.
     *
     * Throws an "InvalidCharacterError" DOMException if one of the arguments contains any ASCII whitespace.
     */
    @JSBody(params = {"tokens"}, script="this.add.apply(this, tokens);")
     void add(@JSByRef String... tokens);
    /**
     * Returns true if token is present, and false otherwise.
     */
     boolean contains(String token);
    /**
     * Returns the token with index index.
     */
    @Nullable
     String item(int index);
    /**
     * Removes arguments passed, if they are present.
     *
     * Throws a "SyntaxError" DOMException if one of the arguments is the empty string.
     *
     * Throws an "InvalidCharacterError" DOMException if one of the arguments contains any ASCII whitespace.
     */
    @JSBody(params = {"tokens"}, script="this.remove.apply(this, tokens);")
     void remove(@JSByRef String... tokens);
    /**
     * Replaces token with newToken.
     *
     * Returns true if token was replaced with newToken, and false otherwise.
     *
     * Throws a "SyntaxError" DOMException if one of the arguments is the empty string.
     *
     * Throws an "InvalidCharacterError" DOMException if one of the arguments contains any ASCII whitespace.
     */
     void replace(String oldToken, String newToken);
    /**
     * Returns true if token is in the associated attribute's supported tokens. Returns false otherwise.
     *
     * Throws a TypeError if the associated attribute has no supported tokens defined.
     */
     boolean supports(String token);
    /**
     * If force is not given, "toggles" token, removing it if it's present and adding it if it's not present. If force is true, adds token (same as add()). If force is false, removes token (same as remove()).
     *
     * Returns true if token is now present, and false otherwise.
     *
     * Throws a "SyntaxError" DOMException if token is empty.
     *
     * Throws an "InvalidCharacterError" DOMException if token contains any spaces.
     */
     boolean toggle(String token, boolean force);
     boolean toggle(String token);
     void forEach(IntKeyStringConsumer<DOMTokenList> callbackfn);
    @JSIndexer
     String get(int index);

     IterableIterator<IntStringPair> entries();
     IntIterableIterator keys();
     StringIterableIterator values();

    @JSBody(script = "return DOMTokenList.prototype")
    static DOMTokenList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMTokenList()")
    static DOMTokenList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
