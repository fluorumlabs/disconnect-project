package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

/**
 * Element class mixin to add the optional ability to skip strict
 * dirty-checking for objects and arrays (always consider them to be
 * "dirty") by setting a `mutable-data` attribute on an element instance.
 * <p>
 * By default, `PropertyEffects` performs strict dirty checking on
 * objects, which means that any deep modifications to an object or array will
 * not be propagated unless "immutable" data patterns are used (i.e. all object
 * references from the root to the mutation were changed).
 * <p>
 * Polymer also provides a proprietary data mutation and path notification API
 * (e.g. `notifyPath`, `set`, and array mutation API's) that allow efficient
 * mutation and notification of deep changes in an object graph to all elements
 * bound to the same object graph.
 * <p>
 * In cases where neither immutable patterns nor the data mutation API can be
 * used, applying this mixin will allow Polymer to skip dirty checking for
 * objects and arrays (always consider them to be "dirty").  This allows a
 * user to make a deep modification to a bound object graph, and then either
 * simply re-set the object (e.g. `this.items = this.items`) or call `notifyPath`
 * (e.g. `this.notifyPath('items')`) to update the tree.  Note that all
 * elements that wish to be updated based on deep mutations must apply this
 * mixin or otherwise skip strict dirty checking for objects/arrays.
 * Specifically, any elements in the binding tree between the source of a
 * mutation and the consumption of it must enable this mixin or apply the
 * `MutableData` mixin.
 * <p>
 * While this mixin adds the ability to forgo Object/Array dirty checking,
 * the `mutableData` flag defaults to false and must be set on the instance.
 * <p>
 * Note, the performance characteristics of propagating large object graphs
 * will be worse by relying on `mutableData: true` as opposed to using
 * strict dirty checking with immutable patterns or Polymer's path notification
 * API.
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "OptionalMutableData",
		module = "@polymer/polymer/lib/mixins/mutable-data.js"
)
public interface OptionalMutableData extends Element {
	/**
	 * Instance-level flag for configuring the dirty-checking strategy
	 * for this element.  When true, Objects and Arrays will skip dirty
	 * checking, otherwise strict equality checking will be used.
	 */
	@JSProperty
	boolean isMutableData();

	/**
	 * Instance-level flag for configuring the dirty-checking strategy
	 * for this element.  When true, Objects and Arrays will skip dirty
	 * checking, otherwise strict equality checking will be used.
	 */
	@JSProperty
	void setMutableData(boolean mutableData);
}
