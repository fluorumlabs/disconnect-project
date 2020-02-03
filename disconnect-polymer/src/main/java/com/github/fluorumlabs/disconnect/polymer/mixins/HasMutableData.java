package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.MutableData;
import com.github.fluorumlabs.disconnect.zero.component.Component;

/**
 * Element class mixin to skip strict dirty-checking for objects and arrays
 * (always consider them to be "dirty"), for use on elements utilizing
 * `PropertyEffects`
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
 * used, applying this mixin will cause Polymer to skip dirty checking for
 * objects and arrays (always consider them to be "dirty").  This allows a
 * user to make a deep modification to a bound object graph, and then either
 * simply re-set the object (e.g. `this.items = this.items`) or call `notifyPath`
 * (e.g. `this.notifyPath('items')`) to update the tree.  Note that all
 * elements that wish to be updated based on deep mutations must apply this
 * mixin or otherwise skip strict dirty checking for objects/arrays.
 * Specifically, any elements in the binding tree between the source of a
 * mutation and the consumption of it must apply this mixin or enable the
 * `OptionalMutableData` mixin.
 * <p>
 * In order to make the dirty check strategy configurable, see
 * `OptionalMutableData`.
 * <p>
 * Note, the performance characteristics of propagating large object graphs
 * will be worse as opposed to using strict dirty checking with immutable
 * patterns or Polymer's path notification API.
 */
public interface HasMutableData<E extends MutableData, T extends Component<E>> extends Component<E> {
}
