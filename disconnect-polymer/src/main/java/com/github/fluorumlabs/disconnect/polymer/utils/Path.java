package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;

import javax.annotation.Nullable;

@Import(
        symbols = {"isAncestor", "split", "set", "isDescendant", "root", "normalize", "get", "isPath", "matches", "translate"},
        module = "@polymer/polymer/lib/utils/path.js"
)
public interface Path extends Polymer {
    /**
     * Returns true if the given string is a structured data path (has dots).
     * <p>
     * Example:
     * <p>
     * ```
     * isPath('foo.bar.baz') // true
     * isPath('foo')         // false
     * ```
     *
     * @param path Path string
     *
     * @return True if the string contained one or more dots
     */
    @JSBody(params = "path", script = "return isPath(path)")
    static boolean isPath(String path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the root property name for the given path.
     * <p>
     * Example:
     * <p>
     * ```
     * root('foo.bar.baz') // 'foo'
     * root('foo')         // 'foo'
     * ```
     *
     * @param path Path string
     *
     * @return Root property name
     */
    @JSBody(params = "path", script = "return root(path)")
    static String root(String path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Given `base` is `foo.bar`, `foo` is an ancestor, `foo.bar` is not
     * Returns true if the given path is an ancestor of the base path.
     * <p>
     * Example:
     * <p>
     * ```
     * isAncestor('foo.bar', 'foo')         // true
     * isAncestor('foo.bar', 'foo.bar')     // false
     * isAncestor('foo.bar', 'foo.bar.baz') // false
     * ```
     *
     * @param base Path string to test against.
     * @param path Path string to test.
     *
     * @return True if `path` is an ancestor of `base`.
     */
    @JSBody(
            params = {"base", "path"},
            script = "return isAncestor(base, path)"
    )
    static boolean isAncestor(String base, String path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Given `base` is `foo.bar`, `foo.bar.baz` is an descendant
     * <p>
     * Example:
     * <p>
     * ```
     * isDescendant('foo.bar', 'foo.bar.baz') // true
     * isDescendant('foo.bar', 'foo.bar')     // false
     * isDescendant('foo.bar', 'foo')         // false
     * ```
     *
     * @param base Path string to test against.
     * @param path Path string to test.
     *
     * @return True if `path` is a descendant of `base`.
     */
    @JSBody(
            params = {"base", "path"},
            script = "return isDescendant(base, path)"
    )
    static boolean isDescendant(String base, String path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Replaces a previous base path with a new base path, preserving the
     * remainder of the path.
     * <p>
     * User must ensure `path` has a prefix of `base`.
     * <p>
     * Example:
     * <p>
     * ```
     * translate('foo.bar', 'zot', 'foo.bar.baz') // 'zot.baz'
     * ```
     *
     * @param base    Current base string to remove
     * @param newBase New base string to replace with
     * @param path    Path to translate
     *
     * @return Translated string
     */
    @JSBody(
            params = {"base", "newBase", "path"},
            script = "return translate(base, newBase, path)"
    )
    static String translate(String base, String newBase, String path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * @param base Path string to test against
     * @param path Path string to test
     *
     * @return True if `path` is equal to `base`
     */
    @JSBody(
            params = {"base", "path"},
            script = "return matches(base, path)"
    )
    static boolean matches(String base, String path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Converts array-based paths to flattened path.  String-based paths
     * are returned as-is.
     * <p>
     * Example:
     * <p>
     * ```
     * normalize(['foo.bar', 0, 'baz'])  // 'foo.bar.0.baz'
     * normalize('foo.bar.0.baz')        // 'foo.bar.0.baz'
     * ```
     *
     * @param path Input path
     *
     * @return Flattened path
     */
    @JSBody(params = "path", script = "return normalize(path)")
    static String normalize(String path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "path", script = "return normalize(path)")
    static String normalize(@JSByRef String... path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "path", script = "return normalize(path)")
    static String normalize(@JSByRef Unknown... path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "path", script = "return normalize(path)")
    static String normalize(Array<Unknown> path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Splits a path into an array of property names. Accepts either arrays
     * of path parts or strings.
     * <p>
     * Example:
     * <p>
     * ```
     * split(['foo.bar', 0, 'baz'])  // ['foo', 'bar', '0', 'baz']
     * split('foo.bar.0.baz')        // ['foo', 'bar', '0', 'baz']
     * ```
     *
     * @param path Input path
     *
     * @return Array of path parts
     */
    @JSBody(params = "path", script = "return split(path)")
    static String[] split(String path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "path", script = "return split(path)")
    static String[] split(@JSByRef String... path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "path", script = "return split(path)")
    static String[] split(@JSByRef Unknown... path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "path", script = "return split(path)")
    static String[] split(Array<Unknown> path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Reads a value from a path.  If any sub-property in the path is `undefined`,
     * this method returns `undefined` (will never throw.
     *
     * @param root Object from which to dereference path from
     * @param path Path to read
     * @param info If an object is provided to `info`, the normalized
     *             (flattened) path will be set to `info.path`.
     *
     * @return Value at path, or `undefined` if the path could not be
     *         fully dereferenced.
     */
    @JSBody(
            params = {"root", "path", "info"},
            script = "return get(root, path, info)"
    )
    static Unknown get(Any root, String path, Any info) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(
            params = {"root", "path", "info"},
            script = "return get(root, path, info)"
    )
    static Unknown get(Any root, @JSByRef String[] path, Any info) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(
            params = {"root", "path", "info"},
            script = "return get(root, path, info)"
    )
    static Unknown get(Any root, @JSByRef Unknown[] path, Any info) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(
            params = {"root", "path", "info"},
            script = "return get(root, path, info)"
    )
    static Unknown get(Any root, Array<Unknown> path, Any info) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(
            params = {"root", "path"},
            script = "return get(root, path)"
    )
    static Unknown get(Any root, String path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(
            params = {"root", "path"},
            script = "return get(root, path)"
    )
    static Unknown get(Any root, @JSByRef String[] path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(
            params = {"root", "path"},
            script = "return get(root, path)"
    )
    static Unknown get(Any root, @JSByRef Unknown[] path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(
            params = {"root", "path"},
            script = "return get(root, path)"
    )
    static Unknown get(Any root, Array<Unknown> path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets a value to a path.  If any sub-property in the path is `undefined`,
     * this method will no-op.
     * FIXME return (string | undefined)
     * <p>
     * FIXME param root: Object
     *
     * @param root  Object from which to dereference path from
     *              FIXME param path: (string | !Array.<(string | number)>)
     * @param path  Path to set
     * @param value Value to set to path
     *
     * @return The normalized version of the input path
     */
    @Nullable
    @JSBody(
            params = {"root", "path", "value"},
            script = "return set(root, path, value)"
    )
    static String set(Any root, String path, Any value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Nullable
    @JSBody(
            params = {"root", "path", "value"},
            script = "return set(root, path, value)"
    )
    static String set(Any root, @JSByRef String[] path, Any value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Nullable
    @JSBody(
            params = {"root", "path", "value"},
            script = "return set(root, path, value)"
    )
    static String set(Any root, @JSByRef Unknown[] path, Any value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Nullable
    @JSBody(
            params = {"root", "path", "value"},
            script = "return set(root, path, value)"
    )
    static String set(Any root, Array<Unknown> path, Any value) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
