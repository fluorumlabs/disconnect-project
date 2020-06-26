package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"calculateSplices as ArraySplice_calculateSplices"},
    module = "@polymer/polymer/lib/utils/array-splice.js"
)
@Import(
    module = "@polymer/polymer/lib/utils/array-splice.js"
)
public interface ArraySplice extends Any {
  /**
   * Returns an array of splice records indicating the minimum edits required
   * to transform the <code>previous</code> array into the <code>current</code> array.
   *
   * Splice records are ordered by index and contain the following fields:
   *
   * <ul>
   * <li><code>index</code>: index where edit started</li>
   * <li><code>removed</code>: array of removed items from this index</li>
   * <li><code>addedCount</code>: number of items added at this index</li>
   * </ul>
   * This function is based on the Levenshtein &quot;minimum edit distance&quot;
   * algorithm. Note that updates are treated as removal followed by addition.
   *
   * The worst-case time complexity of this algorithm is <code>O(l * p)</code>
   * l: The length of the current array
   * p: The length of the previous array
   *
   * However, the worst-case complexity is reduced by an <code>O(n)</code> optimization
   * to detect any shared prefix &amp; suffix between the two arrays and only
   * perform the more expensive minimum edit distance calculation over the
   * non-shared portions of the arrays.
   *
   * @return Returns an array of splice record objects. Each of these
   * contains: <code>index</code> the location where the splice occurred; <code>removed</code>
   * the array of removed items from this location; <code>addedCount</code> the number
   * of items added at this location.
   *
   */
  @JSBody(
      params = {"current", "previous"},
      script = "return ArraySplice_calculateSplices(current, previous)"
  )
  static Any[] calculateSplices(Any[] current, Any[] previous) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
