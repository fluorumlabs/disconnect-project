package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import com.github.fluorumlabs.disconnect.polymer.types.ReadonlySpliceRecord;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSBody;

@NpmPackage(
        name = "@polymer/polymer",
        version = Polymer.VERSION
)
@Import(symbols = "calculateSplices", module = "@polymer/polymer/lib/utils/array-splice.js")
public interface ArraySplice extends Any {
    /**
     * Returns an array of splice records indicating the minimum edits required
     * to transform the `previous` array into the `current` array.
     * <p>
     * Splice records are ordered by index and contain the following fields:
     * - `index`: index where edit started
     * - `removed`: array of removed items from this index
     * - `addedCount`: number of items added at this index
     * <p>
     * This function is based on the Levenshtein "minimum edit distance"
     * algorithm. Note that updates are treated as removal followed by addition.
     * <p>
     * The worst-case time complexity of this algorithm is `O(l * p)`
     * l: The length of the current array
     * p: The length of the previous array
     * <p>
     * However, the worst-case complexity is reduced by an `O(n)` optimization
     * to detect any shared prefix & suffix between the two arrays and only
     * perform the more expensive minimum edit distance calculation over the
     * non-shared portions of the arrays.
     *
     * @param current  The "changed" array for which splices will be
     *                 calculated.
     * @param previous The "unchanged" original array to compare
     *                 `current` against to determine the splices.
     *
     * @return Returns an array of splice record objects. Each of these
     *         contains: `index` the location where the splice occurred; `removed`
     *         the array of removed items from this location; `addedCount` the number
     *         of items added at this location.
     */
    @JSBody(
            params = {"current", "previous"},
            script = "return calculateSplices(current, previous)"
    )
    static <T extends Any> Array<ReadonlySpliceRecord<T>> calculateSplices(Array<T> current, Array<T> previous) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
