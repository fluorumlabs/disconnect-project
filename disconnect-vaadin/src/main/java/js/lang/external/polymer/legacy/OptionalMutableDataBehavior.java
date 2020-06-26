package js.lang.external.polymer.legacy;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Legacy element behavior to add the optional ability to skip strict
 * dirty-checking for objects and arrays (always consider them to be
 * &quot;dirty&quot;) by setting a <code>mutable-data</code> attribute on an element instance.
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
 * used, applying this mixin will allow Polymer to skip dirty checking for
 * objects and arrays (always consider them to be &quot;dirty&quot;).  This allows a
 * user to make a deep modification to a bound object graph, and then either
 * simply re-set the object (e.g. <code>this.items = this.items</code>) or call <code>notifyPath</code>
 * (e.g. <code>this.notifyPath('items')</code>) to update the tree.  Note that all
 * elements that wish to be updated based on deep mutations must apply this
 * mixin or otherwise skip strict dirty checking for objects/arrays.
 * Specifically, any elements in the binding tree between the source of a
 * mutation and the consumption of it must enable this behavior or apply the
 * <code>Polymer.OptionalMutableDataBehavior</code>.
 *
 * While this behavior adds the ability to forgo Object/Array dirty checking,
 * the <code>mutableData</code> flag defaults to false and must be set on the instance.
 *
 * Note, the performance characteristics of propagating large object graphs
 * will be worse by relying on <code>mutableData: true</code> as opposed to using
 * strict dirty checking with immutable patterns or Polymer's path notification
 * API.
 *
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/legacy/mutable-data-behavior.js"
)
public interface OptionalMutableDataBehavior extends Any {
  /**
   * Instance-level flag for configuring the dirty-checking strategy
   * for this element.  When true, Objects and Arrays will skip dirty
   * checking, otherwise strict equality checking will be used.
   *
   */
  @JSProperty("mutableData")
  boolean getMutableData();

  /**
   * Instance-level flag for configuring the dirty-checking strategy
   * for this element.  When true, Objects and Arrays will skip dirty
   * checking, otherwise strict equality checking will be used.
   *
   */
  @JSProperty("mutableData")
  void setMutableData(boolean value);
}
