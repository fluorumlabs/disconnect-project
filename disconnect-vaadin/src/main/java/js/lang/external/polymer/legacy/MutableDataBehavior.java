package js.lang.external.polymer.legacy;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * Legacy element behavior to skip strict dirty-checking for objects and arrays,
 * (always consider them to be &quot;dirty&quot;) for use on legacy API Polymer elements.
 *
 * By default, <code>Polymer.PropertyEffects</code> performs strict dirty checking on
 * objects, which means that any deep modifications to an object or array will
 * not be propagated unless &quot;immutable&quot; data patterns are used (i.e. all object
 * references from the root to the mutation were changed).
 *
 * Polymer also provides a proprietary data mutation and path notification API
 * (e.g. <code>notifyPath</code>, <code>set</code>, and array mutation API's) that allow efficient
 * mutation and notification of deep changes in an object graph to all elements
 * bound to the same object graph.
 *
 * In cases where neither immutable patterns nor the data mutation API can be
 * used, applying this mixin will cause Polymer to skip dirty checking for
 * objects and arrays (always consider them to be &quot;dirty&quot;).  This allows a
 * user to make a deep modification to a bound object graph, and then either
 * simply re-set the object (e.g. <code>this.items = this.items</code>) or call <code>notifyPath</code>
 * (e.g. <code>this.notifyPath('items')</code>) to update the tree.  Note that all
 * elements that wish to be updated based on deep mutations must apply this
 * mixin or otherwise skip strict dirty checking for objects/arrays.
 * Specifically, any elements in the binding tree between the source of a
 * mutation and the consumption of it must apply this behavior or enable the
 * <code>Polymer.OptionalMutableDataBehavior</code>.
 *
 * In order to make the dirty check strategy configurable, see
 * <code>Polymer.OptionalMutableDataBehavior</code>.
 *
 * Note, the performance characteristics of propagating large object graphs
 * will be worse as opposed to using strict dirty checking with immutable
 * patterns or Polymer's path notification API.
 *
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"OptionalMutableDataBehavior as MutableDataBehavior_OptionalMutableDataBehavior", "MutableDataBehavior as MutableDataBehavior_MutableDataBehavior"},
    module = "@polymer/polymer/lib/legacy/mutable-data-behavior.js"
)
@Import(
    module = "@polymer/polymer/lib/legacy/mutable-data-behavior.js"
)
public interface MutableDataBehavior extends Any {
  @JSBody(
      script = "return MutableDataBehavior_MutableDataBehavior"
  )
  static Any MutableDataBehavior() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSBody(
      script = "return MutableDataBehavior_OptionalMutableDataBehavior"
  )
  static Any OptionalMutableDataBehavior() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
