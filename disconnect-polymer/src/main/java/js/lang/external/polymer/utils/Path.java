package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"isAncestor as Path_isAncestor", "split as Path_split", "set as Path_set", "isDescendant as Path_isDescendant", "root as Path_root", "normalize as Path_normalize", "get as Path_get", "isPath as Path_isPath", "matches as Path_matches", "translate as Path_translate"},
    module = "@polymer/polymer/lib/utils/path.js"
)
public interface Path extends Any {
  /**
   * Returns true if the given string is a structured data path (has dots).
   *
   * Example:
   *
   * <pre><code>isPath('foo.bar.baz')  * isPath('foo')          * ```
   *
   * @return True if the string contained one or more dots
   * </code></pre>
   */
  @JSBody(
      params = {"path"},
      script = "return Path_isPath(path)"
  )
  static boolean isPath(String path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns the root property name for the given path.
   *
   * Example:
   *
   * <pre><code>root('foo.bar.baz')  * root('foo')          * ```
   *
   * @return Root property name
   * </code></pre>
   */
  @JSBody(
      params = {"path"},
      script = "return Path_root(path)"
  )
  static String root(String path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Given <code>base</code> is <code>foo.bar</code>, <code>foo</code> is an ancestor, <code>foo.bar</code> is not
   * Returns true if the given path is an ancestor of the base path.
   *
   * Example:
   *
   * <pre><code>isAncestor('foo.bar', 'foo')          * isAncestor('foo.bar', 'foo.bar')      * isAncestor('foo.bar', 'foo.bar.baz')  * ```
   *
   * @return True if `path` is an ancestor of `base`.
   * </code></pre>
   */
  @JSBody(
      params = {"base", "path"},
      script = "return Path_isAncestor(base, path)"
  )
  static boolean isAncestor(String base, String path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Given <code>base</code> is <code>foo.bar</code>, <code>foo.bar.baz</code> is an descendant
   *
   * Example:
   *
   * <pre><code>isDescendant('foo.bar', 'foo.bar.baz')  * isDescendant('foo.bar', 'foo.bar')      * isDescendant('foo.bar', 'foo')          * ```
   *
   * @return True if `path` is a descendant of `base`.
   * </code></pre>
   */
  @JSBody(
      params = {"base", "path"},
      script = "return Path_isDescendant(base, path)"
  )
  static boolean isDescendant(String base, String path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Replaces a previous base path with a new base path, preserving the
   * remainder of the path.
   *
   * User must ensure <code>path</code> has a prefix of <code>base</code>.
   *
   * Example:
   *
   * <pre><code>translate('foo.bar', 'zot', 'foo.bar.baz')  * ```
   *
   * @return Translated string
   * </code></pre>
   */
  @JSBody(
      params = {"base", "newBase", "path"},
      script = "return Path_translate(base, newBase, path)"
  )
  static String translate(String base, String newBase, String path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * @return True if <code>path</code> is equal to <code>base</code>
   *
   */
  @JSBody(
      params = {"base", "path"},
      script = "return Path_matches(base, path)"
  )
  static boolean matches(String base, String path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Converts array-based paths to flattened path.  String-based paths
   * are returned as-is.
   *
   * Example:
   *
   * <pre><code>normalize(['foo.bar', 0, 'baz'])   * normalize('foo.bar.0.baz')         * ```
   *
   * @return Flattened path
   * </code></pre>
   */
  @JSBody(
      params = {"path"},
      script = "return Path_normalize(path)"
  )
  static String normalize(int[] path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Converts array-based paths to flattened path.  String-based paths
   * are returned as-is.
   *
   * Example:
   *
   * <pre><code>normalize(['foo.bar', 0, 'baz'])   * normalize('foo.bar.0.baz')         * ```
   *
   * @return Flattened path
   * </code></pre>
   */
  @JSBody(
      params = {"path"},
      script = "return Path_normalize(path)"
  )
  static String normalize(String[] path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Converts array-based paths to flattened path.  String-based paths
   * are returned as-is.
   *
   * Example:
   *
   * <pre><code>normalize(['foo.bar', 0, 'baz'])   * normalize('foo.bar.0.baz')         * ```
   *
   * @return Flattened path
   * </code></pre>
   */
  @JSBody(
      params = {"path"},
      script = "return Path_normalize(path)"
  )
  static String normalize(String path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Splits a path into an array of property names. Accepts either arrays
   * of path parts or strings.
   *
   * Example:
   *
   * <pre><code>split(['foo.bar', 0, 'baz'])   * split('foo.bar.0.baz')         * ```
   *
   * @return Array of path parts
   * </code></pre>
   */
  @JSBody(
      params = {"path"},
      script = "return Path_split(path)"
  )
  static String[] split(int[] path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Splits a path into an array of property names. Accepts either arrays
   * of path parts or strings.
   *
   * Example:
   *
   * <pre><code>split(['foo.bar', 0, 'baz'])   * split('foo.bar.0.baz')         * ```
   *
   * @return Array of path parts
   * </code></pre>
   */
  @JSBody(
      params = {"path"},
      script = "return Path_split(path)"
  )
  static String[] split(String[] path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Splits a path into an array of property names. Accepts either arrays
   * of path parts or strings.
   *
   * Example:
   *
   * <pre><code>split(['foo.bar', 0, 'baz'])   * split('foo.bar.0.baz')         * ```
   *
   * @return Array of path parts
   * </code></pre>
   */
  @JSBody(
      params = {"path"},
      script = "return Path_split(path)"
  )
  static String[] split(String path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Reads a value from a path.  If any sub-property in the path is <code>undefined</code>,
   * this method returns <code>undefined</code> (will never throw.
   *
   * @return Value at path, or <code>undefined</code> if the path could not be
   * fully dereferenced.
   *
   */
  @JSBody(
      params = {"root", "path", "info"},
      script = "return Path_get(root, path, info)"
  )
  static Any get(@Nullable Any root, int[] path, @Nullable Any info) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Reads a value from a path.  If any sub-property in the path is <code>undefined</code>,
   * this method returns <code>undefined</code> (will never throw.
   *
   * @return Value at path, or <code>undefined</code> if the path could not be
   * fully dereferenced.
   *
   */
  @JSBody(
      params = {"root", "path", "info"},
      script = "return Path_get(root, path, info)"
  )
  static Any get(@Nullable Any root, String[] path, @Nullable Any info) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Reads a value from a path.  If any sub-property in the path is <code>undefined</code>,
   * this method returns <code>undefined</code> (will never throw.
   *
   * @return Value at path, or <code>undefined</code> if the path could not be
   * fully dereferenced.
   *
   */
  @JSBody(
      params = {"root", "path", "info"},
      script = "return Path_get(root, path, info)"
  )
  static Any get(@Nullable Any root, String path, @Nullable Any info) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Reads a value from a path.  If any sub-property in the path is <code>undefined</code>,
   * this method returns <code>undefined</code> (will never throw.
   *
   * @return Value at path, or <code>undefined</code> if the path could not be
   * fully dereferenced.
   *
   */
  @JSBody(
      params = {"root", "path", "info"},
      script = "return Path_get(root, path, info)"
  )
  static Any get(@Nullable Any root, int[] path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Reads a value from a path.  If any sub-property in the path is <code>undefined</code>,
   * this method returns <code>undefined</code> (will never throw.
   *
   * @return Value at path, or <code>undefined</code> if the path could not be
   * fully dereferenced.
   *
   */
  @JSBody(
      params = {"root", "path", "info"},
      script = "return Path_get(root, path, info)"
  )
  static Any get(@Nullable Any root, String[] path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Reads a value from a path.  If any sub-property in the path is <code>undefined</code>,
   * this method returns <code>undefined</code> (will never throw.
   *
   * @return Value at path, or <code>undefined</code> if the path could not be
   * fully dereferenced.
   *
   */
  @JSBody(
      params = {"root", "path", "info"},
      script = "return Path_get(root, path, info)"
  )
  static Any get(@Nullable Any root, String path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets a value to a path.  If any sub-property in the path is <code>undefined</code>,
   * this method will no-op.
   *
   * @return The normalized version of the input path
   *
   */
  @JSBody(
      params = {"root", "path", "value"},
      script = "return Path_set(root, path, value)"
  )
  @Nullable
  static String set(@Nullable Any root, int[] path, Any value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets a value to a path.  If any sub-property in the path is <code>undefined</code>,
   * this method will no-op.
   *
   * @return The normalized version of the input path
   *
   */
  @JSBody(
      params = {"root", "path", "value"},
      script = "return Path_set(root, path, value)"
  )
  @Nullable
  static String set(@Nullable Any root, String[] path, Any value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets a value to a path.  If any sub-property in the path is <code>undefined</code>,
   * this method will no-op.
   *
   * @return The normalized version of the input path
   *
   */
  @JSBody(
      params = {"root", "path", "value"},
      script = "return Path_set(root, path, value)"
  )
  @Nullable
  static String set(@Nullable Any root, String path, Any value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
