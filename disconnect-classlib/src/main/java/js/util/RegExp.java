package js.util;

import js.lang.Any;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RegExp extends Any {
    /**
     * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
     * @param string The String object or string literal on which to perform the search.
     */
    @Nullable
    RegExpExecArray exec(String string);

    /**
     * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
     * @param string String on which to perform the search.
     */
    boolean test(String string);

    /** Returns a copy of the text of the regular expression pattern. Read-only. The regExp argument is a Regular expression object. It can be a variable name or a literal. */
    @JSProperty
    String getSource();

    /** Returns a Boolean value indicating the state of the global flag (g) used with a regular expression. Default is false. Read-only. */
    @JSProperty
    boolean isGlobal();

    /** Returns a Boolean value indicating the state of the ignoreCase flag (i) used with a regular expression. Default is false. Read-only. */
    @JSProperty
    boolean isIgnoreCase();

    /** Returns a Boolean value indicating the state of the multiline flag (m) used with a regular expression. Default is false. Read-only. */
    @JSProperty
    boolean isMultiline();

    @JSProperty
    int getLastIndex();

    @JSProperty
    void setLastIndex(int value);

    /**
     * Returns a string indicating the flags of the regular expression in question. This field is read-only.
     * The characters in this string are sequenced and concatenated in the following order:
     *
     *    - "g" for global
     *    - "i" for ignoreCase
     *    - "m" for multiline
     *    - "u" for unicode
     *    - "y" for sticky
     *
     * If no flags are set, the value is the empty string.
     */
    @JSProperty
    String getFlags();


    /**
     * Returns a Boolean value indicating the state of the sticky flag (y) used with a regular
     * expression. Default is false. Read-only.
     */
    @JSProperty
    boolean isSticky();


    /**
     * Returns a Boolean value indicating the state of the Unicode flag (u) used with a regular
     * expression. Default is false. Read-only.
     */
    @JSProperty
    boolean isUnicode();


    @JSBody(params = "pattern", script = "return RegExp(pattern)")
    static RegExp create(RegExp pattern) {throw new UnsupportedOperationException("Available only in JavaScript");}
    @JSBody(params = "pattern", script = "return RegExp(pattern)")
    static RegExp create(String pattern){throw new UnsupportedOperationException("Available only in JavaScript");}
    @JSBody(params = {"pattern", "flags"}, script = "return RegExp(pattern, flags)")
    static RegExp create(String pattern, String flags){throw new UnsupportedOperationException("Available only in JavaScript");}
    @JSBody(params = {"pattern", "flags"}, script = "return RegExp(pattern, flags)")
    static RegExp create(RegExp pattern, String flags){throw new UnsupportedOperationException("Available only in JavaScript");}

    @JSBody(script = "return RegExp.prototype")
    static RegExp prototype(){throw new UnsupportedOperationException("Available only in JavaScript");}
}
