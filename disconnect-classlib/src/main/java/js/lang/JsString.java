package js.lang;

import js.extras.JsEnum;
import js.intl.CollatorOptions;
import js.util.RegExp;
import js.util.RegExpMatchArray;
import js.util.iterable.StringIterable;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

import javax.annotation.Nullable;


public interface JsString extends StringIterable, Any {

    @JSBody(params = "value", script = "return value")
    static JsString of(String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "value", script = "return String(value)")
    static JsString create(Any value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "value", script = "return String()")
    static JsString create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return String.prototype")
    static JsString prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "codes", script = "return String.fromCharCode.apply(null, codes)")
    static JsString fromCharCode(@JSByRef int... codes) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Return the String value whose elements are, in order, the elements in the List elements.
     * If length is 0, the empty string is returned.
     */
    @JSBody(params = "codes", script = "return String.fromCodePoint.apply(null, codes)")
    static JsString fromCodePoint(@JSByRef int... codes) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * String.raw is intended for use as a tag function of a Tagged Template String. When called
     * as such the first argument will be a well formed template call site object and the rest
     * parameter will contain the substitution values.
     *
     * @param template      A well-formed template string call site representation.
     * @param substitutions A set of substitution values.
     */
    @JSBody(params = {"template", "substitutions"}, script = "return String.raw.apply(null, [template].concat(substitutions))")
    static String raw(TemplateStringsArray template, Any... substitutions) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns a string representation of a string.
     */
    String toString();

    @JSBody(params = "pos", script = "return this.charAt(pos)")
    String charAt(int pos);

    /**
     * Returns the Unicode value of the character at the specified location.
     *
     * @param index The zero-based index of the desired character. If there is no character at the specified index, NaN is returned.
     */
    int charCodeAt(int index);

    /**
     * Returns a string that contains the concatenation of two or more strings.
     *
     * @param strings The strings to append to the end of the string.
     */
    @JSBody(params = "strings", script = "return this.concat.apply(this, strings)")
    String concat(@JSByRef String... strings);

    /**
     * Returns the position of the first occurrence of a substring.
     *
     * @param searchString The substring to search for in the string
     * @param position     The index at which to begin searching the String object. If omitted, search starts at the beginning of the string.
     */
    int indexOf(String searchString, int position);

    int indexOf(String searchString);

    /**
     * Returns the last occurrence of a substring in the string.
     *
     * @param searchString The substring to search for.
     * @param position     The index at which to begin searching. If omitted, the search begins at the end of the string.
     */
    int lastIndexOf(String searchString, int position);

    int lastIndexOf(String searchString);

    /**
     * Determines whether two strings are equivalent in the current locale.
     *
     * @param that String to compare to target string
     */
    int localeCompare(String that);

    /**
     * Determines whether two strings are equivalent in the current or specified locale.
     *
     * @param that    String to compare to target string
     * @param locales A locale string or array of locale strings that contain one or more language or locale tags. If you include more than one locale string, list them in descending order of priority so that the first entry is the preferred locale. If you omit this parameter, the default locale of the JavaScript runtime is used. This parameter must conform to BCP 47 standards; see the Intl.Collator object for details.
     * @param options An object that contains one or more properties that specify comparison options. see the Intl.Collator object for details.
     */
    int localeCompare(String that, String locales, CollatorOptions options);

    int localeCompare(String that, @JSByRef String[] locales, CollatorOptions options);

    int localeCompare(String that, String locales);

    int localeCompare(String that, @JSByRef String[] locales);

    /**
     * Matches a string with a regular expression, and returns an array containing the results of that search.
     *
     * @param regexp A variable name or string literal containing the regular expression pattern and flags.
     */
    @Nullable
    RegExpMatchArray match(String regexp);

    @Nullable
    RegExpMatchArray match(RegExp regexp);

    /**
     * Replaces text in a string, using a regular expression or search string.
     *
     * @param searchValue  A string to search for.
     * @param replaceValue A string containing the text to replace for every successful match of searchValue in this string.
     */
    String replace(String searchValue, String replaceValue);

    String replace(RegExp searchValue, String replaceValue);

    /**
     * Replaces text in a string, using a regular expression or search string.
     *
     * @param searchValue A string to search for.
     * @param replacer    A function that returns the replacement text.
     */
    String replace(String searchValue, Replacer replacer);

    String replace(RegExp searchValue, Replacer replacer);

    /**
     * Finds the first substring match in a regular expression search.
     *
     * @param regexp The regular expression pattern and applicable flags.
     */
    int search(String regexp);

    int search(RegExp regexp);

    /**
     * Returns a section of a string.
     *
     * @param start The index to the beginning of the specified portion of stringObj.
     * @param end   The index to the end of the specified portion of stringObj. The substring includes the characters up to, but not including, the character indicated by end.
     *              If this value is not specified, the substring continues to the end of stringObj.
     */
    String slice(int start, int end);

    String slice(int start);

    String slice();

    /**
     * Split a string into substrings using the specified separator and return them as an array.
     *
     * @param separator A string that identifies character or characters to use in separating the string. If omitted, a single-element array containing the entire string is returned.
     * @param limit     A value used to limit the number of elements returned in the array.
     */
    String[] split(RegExp separator, int limit);

    String[] split(String separator, int limit);

    String[] split(RegExp separator);

    String[] split(String separator);

    /**
     * Returns the substring at the specified location within a String object.
     *
     * @param start The zero-based index number indicating the beginning of the substring.
     * @param end   Zero-based index number indicating the end of the substring. The substring includes the characters up to, but not including, the character indicated by end.
     *              If end is omitted, the characters from start through the end of the original string are returned.
     */
    String substring(int start, int end);

    String substring(int start);

    /**
     * Converts all the alphabetic characters in a string to lowercase.
     */
    String toLowerCase();

    /**
     * Converts all alphabetic characters to lowercase, taking into account the host environment's current locale.
     */
    String toLocaleLowerCase(String locales);

    String toLocaleLowerCase(@JSByRef String[] locales);

    String toLocaleLowerCase();

    /**
     * Converts all the alphabetic characters in a string to uppercase.
     */
    String toUpperCase();

    /**
     * Returns a string where all alphabetic characters have been converted to uppercase, taking into account the host environment's current locale.
     */
    String toLocaleUpperCase(String locales);

    String toLocaleUpperCase(@JSByRef String[] locales);

    String toLocaleUpperCase();

    /**
     * Removes the leading and trailing white space and line terminator characters from a string.
     */
    String trim();

    /**
     * Returns the length of a String object.
     */
    int getLength();

    /**
     * Returns a nonnegative integer Number less than 1114112 (0x110000) that is the code point
     * value of the UTF-16 encoded code point starting at the string element at position pos in
     * the String resulting from converting this object to a String.
     * If there is no element at that position, the result is undefined.
     * If a valid UTF-16 surrogate pair does not begin at pos, the result is the code unit at pos.
     */
    int codePointAt(int pos);

    /**
     * Returns true if searchString appears as a substring of the result of converting this
     * object to a String, at one or more positions that are
     * greater than or equal to position; otherwise, returns false.
     *
     * @param searchString search string
     * @param position     If position is undefined, 0 is assumed, so as to search all of the String.
     */
    boolean includes(String searchString, int position);

    boolean includes(String searchString);

    /**
     * Returns true if the sequence of elements of searchString converted to a String is the
     * same as the corresponding elements of this object (converted to a String) starting at
     * endPosition – length(this). Otherwise returns false.
     */
    boolean endsWith(String searchString, int endPosition);

    boolean endsWith(String searchString);

    /**
     * Returns the String value result of normalizing the string into the normalization form
     * named by form as specified in Unicode Standard Annex #15, Unicode Normalization Forms.
     *
     * @param form Applicable values: "NFC", "NFD", "NFKC", or "NFKD", If not specified default
     *             is "NFC"
     */
    String normalize(Form form);

    /**
     * Returns the String value result of normalizing the string into the normalization form
     * named by form as specified in Unicode Standard Annex #15, Unicode Normalization Forms.
     */
    String normalize();

    /**
     * Returns a String value that is made from count copies appended together. If count is 0,
     * the empty string is returned.
     *
     * @param count number of copies to append
     */
    String repeat(int count);

    /**
     * Returns true if the sequence of elements of searchString converted to a String is the
     * same as the corresponding elements of this object (converted to a String) starting at
     * position. Otherwise returns false.
     */
    boolean startsWith(String searchString, int position);

    /**
     * Returns an <a> HTML anchor element and sets the name attribute to the text value
     *
     * @param name
     */
    String anchor(String name);

    /**
     * Returns a <big> HTML element
     */
    String big();

    /**
     * Returns a <blink> HTML element
     */
    String blink();

    /**
     * Returns a <b> HTML element
     */
    String bold();

    /**
     * Returns a <tt> HTML element
     */
    String fixed();

    /**
     * Returns a <font> HTML element and sets the color attribute value
     */
    String fontcolor(String color);

    /**
     * Returns a <font> HTML element and sets the size attribute value
     */
    String fontsize(int size);

    /**
     * Returns a <font> HTML element and sets the size attribute value
     */
    String fontsize(String size);

    /**
     * Returns an <i> HTML element
     */
    String italics();

    /**
     * Returns an <a> HTML element and sets the href attribute value
     */
    String link(String url);

    /**
     * Returns a <small> HTML element
     */
    String small();

    /**
     * Returns a <strike> HTML element
     */
    String strike();

    /**
     * Returns a <sub> HTML element
     */
    String sub();

    /**
     * Returns a <sup> HTML element
     */
    String sup();

    @JSFunctor
    @FunctionalInterface
    interface Replacer extends JSObject {
        String replace(String substring, Any... args);
    }

    abstract class Form extends JsEnum {
        public static final Form NFC = JsEnum.of("NFC");

        public static final Form NFD = JsEnum.of("NFD");

        public static final Form NFKC = JsEnum.of("NFKC");

        public static final Form NFKD = JsEnum.of("NFKD");

    }

}
