package js.lang;

import js.extras.JsEnum;
import js.intl.CollatorOptions;
import js.util.RegExp;
import js.util.RegExpMatchArray;
import js.util.collections.Array;
import js.util.iterable.StringIterable;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

import javax.annotation.Nullable;


/**
 * The interface Js string.
 */
public interface JsString extends StringIterable, Any {

	/**
	 * Of js string.
	 *
	 * @param value the value
	 *
	 * @return the js string
	 */
	@JSBody(params = "value", script = "return value")
    static JsString of(String value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create js string.
	 *
	 * @param value the value
	 *
	 * @return the js string
	 */
	@JSBody(params = "value", script = "return String(value)")
    static JsString create(Any value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create js string.
	 *
	 * @return the js string
	 */
	@JSBody(script = "return String()")
    static JsString create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Prototype js string.
	 *
	 * @return the js string
	 */
	@JSBody(script = "return String.prototype")
    static JsString prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * From char code js string.
	 *
	 * @param codes the codes
	 *
	 * @return the js string
	 */
	@JSBody(params = "codes", script = "return String.fromCharCode.apply(String, codes)")
    static JsString fromCharCode(int... codes) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Return the String value whose elements are, in order, the elements in the List elements.
	 * If length is 0, the empty string is returned.
	 *
	 * @param codes the codes
	 *
	 * @return the js string
	 */
	@JSBody(params = "codes", script = "return String.fromCodePoint.apply(String, codes)")
    static JsString fromCodePoint(int... codes) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * String.raw is intended for use as a tag function of a Tagged Template String. When called
	 * as such the first argument will be a well formed template call site object and the rest
	 * parameter will contain the substitution values.
	 *
	 * @param template      A well-formed template string call site representation.
	 * @param substitutions A set of substitution values.
	 *
	 * @return the js string
	 */
	@JSBody(params = {"template", "substitutions"}, script = "return String.raw.apply(String, [template].concat(substitutions))")
    static JsString raw(TemplateStringsArray template, Any... substitutions) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns a string representation of a string.
     */
    String toString();

	/**
	 * Char at js string.
	 *
	 * @param pos the pos
	 *
	 * @return the js string
	 */
	@JSBody(params = "pos", script = "return this.charAt(pos)")
    JsString charAt(int pos);

	/**
	 * Returns the Unicode value of the character at the specified location.
	 *
	 * @param index The zero-based index of the desired character. If there is no character at the specified index,
	 *                 NaN is returned.
	 *
	 * @return the int
	 */
	int charCodeAt(int index);

	/**
	 * Returns a string that contains the concatenation of two or more strings.
	 *
	 * @param strings The strings to append to the end of the string.
	 *
	 * @return the js string
	 */
	@JSBody(params = "strings", script = "return this.concat.apply(this, strings)")
    JsString concat(String... strings);

	/**
	 * Returns the position of the first occurrence of a substring.
	 *
	 * @param searchString The substring to search for in the string
	 * @param position     The index at which to begin searching the String object. If omitted, search starts at the
	 *                        beginning of the string.
	 *
	 * @return the int
	 */
	int indexOf(String searchString, int position);

	/**
	 * Index of int.
	 *
	 * @param searchString the search string
	 *
	 * @return the int
	 */
	int indexOf(String searchString);

	/**
	 * Returns the last occurrence of a substring in the string.
	 *
	 * @param searchString The substring to search for.
	 * @param position     The index at which to begin searching. If omitted, the search begins at the end of the
	 *                        string.
	 *
	 * @return the int
	 */
	int lastIndexOf(String searchString, int position);

	/**
	 * Last index of int.
	 *
	 * @param searchString the search string
	 *
	 * @return the int
	 */
	int lastIndexOf(String searchString);

	/**
	 * Determines whether two strings are equivalent in the current locale.
	 *
	 * @param that String to compare to target string
	 *
	 * @return the int
	 */
	int localeCompare(String that);

	/**
	 * Determines whether two strings are equivalent in the current or specified locale.
	 *
	 * @param that    String to compare to target string
	 * @param locales A locale string or array of locale strings that contain one or more language or locale tags. If
	 *                   you include more than one locale string, list them in descending order of priority so that
	 *                   the first entry is the preferred locale. If you omit this parameter, the default locale of
	 *                   the JavaScript runtime is used. This parameter must conform to BCP 47 standards; see the Intl
	 *                   .Collator object for details.
	 * @param options An object that contains one or more properties that specify comparison options. see the Intl
	 *                   .Collator object for details.
	 *
	 * @return the int
	 */
	int localeCompare(String that, String locales, CollatorOptions options);

	/**
	 * Locale compare int.
	 *
	 * @param that    the that
	 * @param locales the locales
	 * @param options the options
	 *
	 * @return the int
	 */
	int localeCompare(String that, String[] locales, CollatorOptions options);

	/**
	 * Locale compare int.
	 *
	 * @param that    the that
	 * @param locales the locales
	 *
	 * @return the int
	 */
	int localeCompare(String that, String locales);

	/**
	 * Locale compare int.
	 *
	 * @param that    the that
	 * @param locales the locales
	 *
	 * @return the int
	 */
	int localeCompare(String that, String[] locales);

	/**
	 * Matches a string with a regular expression, and returns an array containing the results of that search.
	 *
	 * @param regexp A variable name or string literal containing the regular expression pattern and flags.
	 *
	 * @return the reg exp match array
	 */
	@Nullable
    RegExpMatchArray match(String regexp);

	/**
	 * Match reg exp match array.
	 *
	 * @param regexp the regexp
	 *
	 * @return the reg exp match array
	 */
	@Nullable
    RegExpMatchArray match(RegExp regexp);

	/**
	 * Replaces text in a string, using a regular expression or search string.
	 *
	 * @param searchValue  A string to search for.
	 * @param replaceValue A string containing the text to replace for every successful match of searchValue in this
	 *                        string.
	 *
	 * @return the js string
	 */
	JsString replace(String searchValue, String replaceValue);

	/**
	 * Replace js string.
	 *
	 * @param searchValue  the search value
	 * @param replaceValue the replace value
	 *
	 * @return the js string
	 */
	JsString replace(RegExp searchValue, String replaceValue);

	/**
	 * Replaces text in a string, using a regular expression or search string.
	 *
	 * @param searchValue A string to search for.
	 * @param replacer    A function that returns the replacement text.
	 *
	 * @return the js string
	 */
	JsString replace(String searchValue, Replacer replacer);

	/**
	 * Replace js string.
	 *
	 * @param searchValue the search value
	 * @param replacer    the replacer
	 *
	 * @return the js string
	 */
	JsString replace(RegExp searchValue, Replacer replacer);

	/**
	 * Finds the first substring match in a regular expression search.
	 *
	 * @param regexp The regular expression pattern and applicable flags.
	 *
	 * @return the int
	 */
	int search(String regexp);

	/**
	 * Search int.
	 *
	 * @param regexp the regexp
	 *
	 * @return the int
	 */
	int search(RegExp regexp);

	/**
	 * Returns a section of a string.
	 *
	 * @param start The index to the beginning of the specified portion of stringObj.
	 * @param end   The index to the end of the specified portion of stringObj. The substring includes the characters
	 *                 up to, but not including, the character indicated by end.              If this value is not
	 *                 specified, the substring continues to the end of stringObj.
	 *
	 * @return the js string
	 */
	JsString slice(int start, int end);

	/**
	 * Slice js string.
	 *
	 * @param start the start
	 *
	 * @return the js string
	 */
	JsString slice(int start);

	/**
	 * Slice js string.
	 *
	 * @return the js string
	 */
	JsString slice();

	/**
	 * Split a string into substrings using the specified separator and return them as an array.
	 *
	 * @param separator A string that identifies character or characters to use in separating the string. If omitted,
	 *                     a single-element array containing the entire string is returned.
	 * @param limit     A value used to limit the number of elements returned in the array.
	 *
	 * @return the array
	 */
	Array<JsString> split(RegExp separator, int limit);

	/**
	 * Split array.
	 *
	 * @param separator the separator
	 * @param limit     the limit
	 *
	 * @return the array
	 */
	Array<JsString> split(String separator, int limit);

	/**
	 * Split array.
	 *
	 * @param separator the separator
	 *
	 * @return the array
	 */
	Array<JsString> split(RegExp separator);

	/**
	 * Split array.
	 *
	 * @param separator the separator
	 *
	 * @return the array
	 */
	Array<JsString> split(String separator);

	/**
	 * Returns the substring at the specified location within a String object.
	 *
	 * @param start The zero-based index number indicating the beginning of the substring.
	 * @param end   Zero-based index number indicating the end of the substring. The substring includes the characters
	 *                up to, but not including, the character indicated by end.              If end is omitted, the
	 *                characters from start through the end of the original string are returned.
	 *
	 * @return the js string
	 */
	JsString substring(int start, int end);

	/**
	 * Substring js string.
	 *
	 * @param start the start
	 *
	 * @return the js string
	 */
	JsString substring(int start);

	/**
	 * Converts all the alphabetic characters in a string to lowercase.
	 *
	 * @return the js string
	 */
	JsString toLowerCase();

	/**
	 * Converts all alphabetic characters to lowercase, taking into account the host environment's current locale.
	 *
	 * @param locales the locales
	 *
	 * @return the js string
	 */
	JsString toLocaleLowerCase(String locales);

	/**
	 * To locale lower case js string.
	 *
	 * @param locales the locales
	 *
	 * @return the js string
	 */
	JsString toLocaleLowerCase(String[] locales);

	/**
	 * To locale lower case js string.
	 *
	 * @return the js string
	 */
	JsString toLocaleLowerCase();

	/**
	 * Converts all the alphabetic characters in a string to uppercase.
	 *
	 * @return the js string
	 */
	JsString toUpperCase();

	/**
	 * Returns a string where all alphabetic characters have been converted to uppercase, taking into account the host
	 * environment's current locale.
	 *
	 * @param locales the locales
	 *
	 * @return the js string
	 */
	JsString toLocaleUpperCase(String locales);

	/**
	 * To locale upper case js string.
	 *
	 * @param locales the locales
	 *
	 * @return the js string
	 */
	JsString toLocaleUpperCase(String[] locales);

	/**
	 * To locale upper case js string.
	 *
	 * @return the js string
	 */
	JsString toLocaleUpperCase();

	/**
	 * Removes the leading and trailing white space and line terminator characters from a string.
	 *
	 * @return the js string
	 */
	JsString trim();

	/**
	 * Returns the length of a String object.
	 *
	 * @return the length
	 */
	int getLength();

	/**
	 * Returns a nonnegative integer Number less than 1114112 (0x110000) that is the code point
	 * value of the UTF-16 encoded code point starting at the string element at position pos in
	 * the String resulting from converting this object to a String.
	 * If there is no element at that position, the result is undefined.
	 * If a valid UTF-16 surrogate pair does not begin at pos, the result is the code unit at pos.
	 *
	 * @param pos the pos
	 *
	 * @return the int
	 */
	int codePointAt(int pos);

	/**
	 * Returns true if searchString appears as a substring of the result of converting this
	 * object to a String, at one or more positions that are
	 * greater than or equal to position; otherwise, returns false.
	 *
	 * @param searchString search string
	 * @param position     If position is undefined, 0 is assumed, so as to search all of the String.
	 *
	 * @return the boolean
	 */
	boolean includes(String searchString, int position);

	/**
	 * Includes boolean.
	 *
	 * @param searchString the search string
	 *
	 * @return the boolean
	 */
	boolean includes(String searchString);

	/**
	 * Returns true if the sequence of elements of searchString converted to a String is the
	 * same as the corresponding elements of this object (converted to a String) starting at
	 * endPosition – length(this). Otherwise returns false.
	 *
	 * @param searchString the search string
	 * @param endPosition  the end position
	 *
	 * @return the boolean
	 */
	boolean endsWith(String searchString, int endPosition);

	/**
	 * Ends with boolean.
	 *
	 * @param searchString the search string
	 *
	 * @return the boolean
	 */
	boolean endsWith(String searchString);

	/**
	 * Returns the String value result of normalizing the string into the normalization form
	 * named by form as specified in Unicode Standard Annex #15, Unicode Normalization Forms.
	 *
	 * @param form Applicable values: "NFC", "NFD", "NFKC", or "NFKD", If not specified default             is "NFC"
	 *
	 * @return the js string
	 */
	JsString normalize(Form form);

	/**
	 * Returns the String value result of normalizing the string into the normalization form
	 * named by form as specified in Unicode Standard Annex #15, Unicode Normalization Forms.
	 *
	 * @return the js string
	 */
	JsString normalize();

	/**
	 * Returns a String value that is made from count copies appended together. If count is 0,
	 * the empty string is returned.
	 *
	 * @param count number of copies to append
	 *
	 * @return the js string
	 */
	JsString repeat(int count);

	/**
	 * Returns true if the sequence of elements of searchString converted to a String is the
	 * same as the corresponding elements of this object (converted to a String) starting at
	 * position. Otherwise returns false.
	 *
	 * @param searchString the search string
	 * @param position     the position
	 *
	 * @return the boolean
	 */
	boolean startsWith(String searchString, int position);

	/**
	 * Returns an &lt;a&gt; HTML anchor element and sets the name attribute to the text value
	 *
	 * @param name the name
	 *
	 * @return the js string
	 */
	JsString anchor(String name);

	/**
	 * Returns a &lt;big&gt; HTML element
	 *
	 * @return the js string
	 */
	JsString big();

	/**
	 * Returns a &lt;blink&gt; HTML element
	 *
	 * @return the js string
	 */
	JsString blink();

	/**
	 * Returns a &lt;b&gt; HTML element
	 *
	 * @return the js string
	 */
	JsString bold();

	/**
	 * Returns a &lt;tt&gt; HTML element
	 *
	 * @return the js string
	 */
	JsString fixed();

	/**
	 * Returns a &lt;font&gt; HTML element and sets the color attribute value
	 *
	 * @param color the color
	 *
	 * @return the js string
	 */
	JsString fontcolor(String color);

	/**
	 * Returns a &lt;font&gt; HTML element and sets the size attribute value
	 *
	 * @param size the size
	 *
	 * @return the js string
	 */
	JsString fontsize(int size);

	/**
	 * Returns a &lt;font&gt; HTML element and sets the size attribute value
	 *
	 * @param size the size
	 *
	 * @return the js string
	 */
	JsString fontsize(String size);

	/**
	 * Returns an &lt;i&gt; HTML element
	 *
	 * @return the js string
	 */
	JsString italics();

	/**
	 * Returns an &lt;a&gt; HTML element and sets the href attribute value
	 *
	 * @param url the url
	 *
	 * @return the js string
	 */
	JsString link(String url);

	/**
	 * Returns a &lt;small&gt; HTML element
	 *
	 * @return the js string
	 */
	JsString small();

	/**
	 * Returns a &lt;strike&gt; HTML element
	 *
	 * @return the js string
	 */
	JsString strike();

	/**
	 * Returns a &lt;sub&gt; HTML element
	 *
	 * @return the js string
	 */
	JsString sub();

	/**
	 * Returns a &lt;sup&gt; HTML element
	 *
	 * @return the js string
	 */
	JsString sup();

	/**
	 * The interface Replacer.
	 */
	@JSFunctor
    @FunctionalInterface
    interface Replacer extends JSObject {
		/**
		 * Replace string.
		 *
		 * @param substring the substring
		 * @param args      the args
		 *
		 * @return the string
		 */
		String replace(String substring, Any... args);
    }

	/**
	 * The type Form.
	 */
	abstract class Form extends JsEnum {
		/**
		 * The constant NFC.
		 */
		public static final Form NFC = JsEnum.of("NFC");

		/**
		 * The constant NFD.
		 */
		public static final Form NFD = JsEnum.of("NFD");

		/**
		 * The constant NFKC.
		 */
		public static final Form NFKC = JsEnum.of("NFKC");

		/**
		 * The constant NFKD.
		 */
		public static final Form NFKD = JsEnum.of("NFKD");

    }

}
