package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.OptionalMutableData;
import com.github.fluorumlabs.disconnect.zero.component.Component;

/**
 * Element class mixin to add the optional ability to skip strict dirty-checking for objects and arrays (always consider
 * them to be &quot;dirty&quot;) by setting a <code>mutable-data</code> attribute on an element instance.
 * <p>
 * By default, <code>PropertyEffects</code> performs strict dirty checking on objects, which means that any deep
 * modifications to an object or array will not be propagated unless &quot;immutable&quot; data patterns are used (i.e.
 * all object references from the root to the mutation were changed).
 * <p>
 * Polymer also provides a proprietary data mutation and path notification API (e.g. <code>notifyPath</code>,
 * <code>set</code>, and array mutation API's) that allow efficient mutation and notification of deep changes in an
 * object graph to all elements bound to the same object graph.
 * <p>
 * In cases where neither immutable patterns nor the data mutation API can be used, applying this mixin will allow
 * Polymer to skip dirty checking for objects and arrays (always consider them to be &quot;dirty&quot;).  This allows a
 * user to make a deep modification to a bound object graph, and then either simply re-set the object (e.g.
 * <code>this.items = this.items</code>) or call <code>notifyPath</code> (e.g. <code>this.notifyPath('items')</code>) to
 * update the tree.  Note that all elements that wish to be updated based on deep mutations must apply this mixin or
 * otherwise skip strict dirty checking for objects/arrays. Specifically, any elements in the binding tree between the
 * source of a mutation and the consumption of it must enable this mixin or apply the
 * <code>MutableData</code> mixin.
 * <p>
 * While this mixin adds the ability to forgo Object/Array dirty checking, the <code>mutableData</code> flag defaults to
 * false and must be set on the instance.
 * <p>
 * Note, the performance characteristics of propagating large object graphs will be worse by relying on
 * <code>mutableData: true</code> as opposed to using strict dirty checking with immutable patterns or Polymer's path
 * notification API.
 *
 * @param <E> the type parameter
 * @param <T> the type parameter
 */
public interface HasOptionalMutableData<E extends OptionalMutableData, T extends Component<E>> extends Component<E> {
	/**
	 * Instance-level flag for configuring the dirty-checking strategy for this element.  When true, Objects and Arrays
	 * will skip dirty checking, otherwise strict equality checking will be used.
	 *
	 * @return the boolean
	 */
	default boolean mutableData() {
		return getNode().isMutableData();
	}

	/**
	 * Instance-level flag for configuring the dirty-checking strategy for this element.  When true, Objects and Arrays
	 * will skip dirty checking, otherwise strict equality checking will be used.
	 *
	 * @param mutableData the mutable data
	 *
	 * @return the t
	 */
	default T mutableData(boolean mutableData) {
		getNode().setMutableData(mutableData);
		return (T) this;
	}
}
