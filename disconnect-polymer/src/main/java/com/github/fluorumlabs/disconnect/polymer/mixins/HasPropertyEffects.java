package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.PropertyEffects;
import com.github.fluorumlabs.disconnect.polymer.types.SpliceRecord;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import js.lang.Any;
import js.lang.Unknown;
import js.util.Record;
import js.util.StringRecord;
import js.util.collections.Array;

/**
 * Element class mixin that provides meta-programming for Polymer's template binding and data observation (collectively,
 * &quot;property effects&quot;) system.
 * <p>
 * This mixin uses provides the following key static methods for adding property effects to an element class:
 *
 * <ul>
 * <li><code>addPropertyEffect</code></li>
 * <li><code>createPropertyObserver</code></li>
 * <li><code>createMethodObserver</code></li>
 * <li><code>createNotifyingProperty</code></li>
 * <li><code>createReadOnlyProperty</code></li>
 * <li><code>createReflectedProperty</code></li>
 * <li><code>createComputedProperty</code></li>
 * <li><code>bindTemplate</code></li>
 * </ul>
 * Each method creates one or more property accessors, along with metadata used by this mixin's implementation of
 * <code>_propertiesChanged</code> to perform the property effects.
 * <p>
 * Underscored versions of the above methods also exist on the element prototype for adding property effects on
 * instances at runtime.
 * <p>
 * Note that this mixin overrides several <code>PropertyAccessors</code> methods, in many cases to maintain guarantees
 * provided by the Polymer 1.x features; notably it changes property accessors to be synchronous by default whereas the
 * default when using <code>PropertyAccessors</code> standalone is to be async by default.
 *
 * @param <E> the type parameter
 * @param <T> the type parameter
 */
public interface HasPropertyEffects<E extends PropertyEffects, T extends HasElement<E>>
		extends HasTemplateStamp<E, T>, HasPropertyAccessors<E, T> {
	/**
	 * Property effect types string record.
	 *
	 * @return the string record
	 */
	default StringRecord PROPERTY_EFFECT_TYPES() {
		return getNode().PROPERTY_EFFECT_TYPES();
	}

	/**
	 * Sets a bag of property changes to this instance, and synchronously processes all effects of the properties as a
	 * batch.
	 * <p>
	 * Property names must be simple properties, not paths.  Batched path propagation is not supported.
	 *
	 * @param props       Bag of one or more key-value pairs whose key is                    a property and value is
	 *                      the
	 *                    new value to set for that property.
	 * @param setReadOnly When true, any private values set in                    <code>props</code> will be set. By
	 *                    default, <code>setProperties</code> will not set                    <code>readOnly:
	 *                    true</code> root properties.
	 */
	default void setProperties(Record<Any> props, boolean setReadOnly) {
		getNode().setProperties(props, setReadOnly);
	}

	/**
	 * Aliases one data path as another, such that path notifications from one are routed to the other.
	 *
	 * @param to   Target path to link.
	 * @param from Source path to link.
	 */
	default void linkPaths(String to, String from) {
		getNode().linkPaths(to, from);
	}

	/**
	 * Link paths.
	 *
	 * @param to   the to
	 * @param from the from
	 */
	default void linkPaths(String[] to, String[] from) {
		getNode().linkPaths(to, from);
	}

	/**
	 * Link paths.
	 *
	 * @param to   the to
	 * @param from the from
	 */
	default void linkPaths(Unknown[] to, Unknown[] from) {
		getNode().linkPaths(to, from);
	}

	/**
	 * Link paths.
	 *
	 * @param to   the to
	 * @param from the from
	 */
	default void linkPaths(Array<Unknown> to, Array<Unknown> from) {
		getNode().linkPaths(to, from);
	}

	/**
	 * Removes a data path alias previously established with
	 * <code>_linkPaths</code>.
	 * <p>
	 * Note, the path to unlink should be the target (<code>to</code>) used when linking the paths.
	 *
	 * @param path Target path to unlink.
	 */
	default void unlinkPaths(String path) {
		getNode().unlinkPaths(path);
	}

	/**
	 * Unlink paths.
	 *
	 * @param path the path
	 */
	default void unlinkPaths(String... path) {
		getNode().unlinkPaths(path);
	}

	/**
	 * Unlink paths.
	 *
	 * @param path the path
	 */
	default void unlinkPaths(Unknown... path) {
		getNode().unlinkPaths(path);
	}

	/**
	 * Unlink paths.
	 *
	 * @param path the path
	 */
	default void unlinkPaths(Array<Unknown> path) {
		getNode().unlinkPaths(path);
	}

	/**
	 * Notify that an array has changed.
	 * <p>
	 * Example:
	 *
	 * <pre><code>this.items = [ {name: 'Jim'}, {name: 'Todd'}, {name: 'Bill'} ];
	 * ...
	 * this.items.splice(1, 1, {name: 'Sam'});
	 * this.items.push({name: 'Bob'});
	 * this.notifySplices('items', [
	 *   { index: 1, removed: [{name: 'Todd'}], addedCount: 1,
	 *     object: this.items, type: 'splice' },
	 *   { index: 3, removed: [], addedCount: 1,
	 *     object: this.items, type: 'splice'}
	 * ]);
	 * </code></pre>
	 *
	 * @param <ITEM>  the type parameter
	 * @param path    Path that should be notified.
	 * @param splices Array of splice records indicating ordered                changes that occurred to the array.
	 *                   Each
	 *                record should have the                following fields:                <ul>
	 *                <li>index: index at which the change occurred</li>                <li>removed: array of
	 *                items that were removed from this index</li>                <li>addedCount: number of new items
	 *                added at this index</li>                <li>object: a reference to the array in question</li>
	 *                <li>type: the string literal 'splice'</li>
	 *                </ul>                Note that splice records <em>must</em> be normalized such that they are
	 *                reported in index order (raw results from <code>Object.observe</code> are not ordered and must be
	 *                normalized/merged before notifying).
	 */
	default <ITEM extends Any> void notifySplices(String path, SpliceRecord<ITEM>... splices) {
		getNode().notifySplices(path, splices);
	}

	/**
	 * Notify splices.
	 *
	 * @param <ITEM>  the type parameter
	 * @param path    the path
	 * @param splices the splices
	 */
	default <ITEM extends Any> void notifySplices(String path, Array<SpliceRecord<ITEM>> splices) {
		getNode().notifySplices(path, splices);
	}

	/**
	 * Convenience method for reading a value from a path.
	 * <p>
	 * Note, if any part in the path is undefined, this method returns
	 * <code>undefined</code> (this method does not throw when dereferencing undefined
	 * paths).
	 *
	 * @param <ITEM> the type parameter
	 * @param path   Path to the value             to read.  The path may be specified as a string (e.g. <code>foo.bar
	 *               .baz</code>)             or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>). Note
	 *               that             bracketed expressions are not supported; string-based path parts
	 *               <em>must</em> be separated by dots.  Note that when dereferencing array             indices,
	 *               the index may be used as a dotted part directly             (e.g. <code>users.12.name</code> or
	 *               <code>['users', 12, 'name']</code>).
	 * @param root   Root object from which the path is evaluated.
	 *
	 * @return Value at the path, or <code>undefined</code> if any part of the path 		is undefined.
	 */
	default <ITEM extends Any> ITEM get(String path, Any root) {
		return getNode().get(path, root);
	}

	/**
	 * Get item.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 * @param root   the root
	 *
	 * @return the item
	 */
	default <ITEM extends Any> ITEM get(String[] path, Any root) {
		return getNode().get(path, root);
	}

	/**
	 * Get item.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 * @param root   the root
	 *
	 * @return the item
	 */
	default <ITEM extends Any> ITEM get(Unknown[] path, Any root) {
		return getNode().get(path, root);
	}

	/**
	 * Get item.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 * @param root   the root
	 *
	 * @return the item
	 */
	default <ITEM extends Any> ITEM get(Array<Unknown> path, Any root) {
		return getNode().get(path, root);
	}

	/**
	 * Get item.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 *
	 * @return the item
	 */
	default <ITEM extends Any> ITEM get(String path) {
		return getNode().get(path);
	}

	/**
	 * Get item.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 *
	 * @return the item
	 */
	default <ITEM extends Any> ITEM get(String[] path) {
		return getNode().get(path);
	}

	/**
	 * Get item.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 *
	 * @return the item
	 */
	default <ITEM extends Any> ITEM get(Unknown[] path) {
		return getNode().get(path);
	}

	/**
	 * Get item.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 *
	 * @return the item
	 */
	default <ITEM extends Any> ITEM get(Array<Unknown> path) {
		return getNode().get(path);
	}

	/**
	 * Convenience method for setting a value to a path and notifying any elements bound to the same path.
	 * <p>
	 * Note, if any part in the path except for the last is undefined, this method does nothing (this method does not
	 * throw when dereferencing undefined paths).
	 *
	 * @param path  Path to the value              to write.  The path may be specified as a string (e.g. <code>'foo
	 *              .bar.baz'</code>)              or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>) .
	 *              Note that              bracketed expressions are not supported; string-based path parts
	 *              <em>must</em> be separated by dots.  Note that when dereferencing array              indices,
	 *              the index may be used as a dotted part directly              (e.g. <code>'users.12.name'</code> or
	 *              <code>['users', 12, 'name']</code>).
	 * @param value Value to set at the specified path.
	 * @param root  Root object from which the path is evaluated.              When specified, no notification will
	 *              occur.
	 */
	default void set(String path, Any value, Any root) {
		getNode().set(path, value, root);
	}

	/**
	 * Set.
	 *
	 * @param path  the path
	 * @param value the value
	 * @param root  the root
	 */
	default void set(String[] path, Any value, Any root) {
		getNode().set(path, value, root);
	}

	/**
	 * Set.
	 *
	 * @param path  the path
	 * @param value the value
	 * @param root  the root
	 */
	default void set(Unknown[] path, Any value, Any root) {
		getNode().set(path, value, root);
	}

	/**
	 * Set.
	 *
	 * @param path  the path
	 * @param value the value
	 * @param root  the root
	 */
	default void set(Array<Unknown> path, Any value, Any root) {
		getNode().set(path, value, root);
	}

	/**
	 * Set.
	 *
	 * @param path  the path
	 * @param value the value
	 */
	default void set(String path, Any value) {
		getNode().set(path, value);
	}

	/**
	 * Set.
	 *
	 * @param path  the path
	 * @param value the value
	 */
	default void set(String[] path, Any value) {
		getNode().set(path, value);
	}

	/**
	 * Set.
	 *
	 * @param path  the path
	 * @param value the value
	 */
	default void set(Unknown[] path, Any value) {
		getNode().set(path, value);
	}

	/**
	 * Set.
	 *
	 * @param path  the path
	 * @param value the value
	 */
	default void set(Array<Unknown> path, Any value) {
		getNode().set(path, value);
	}

	/**
	 * Adds items onto the end of the array at the path specified.
	 * <p>
	 * The arguments after <code>path</code> and return value match that of
	 * <code>Array.prototype.push</code>.
	 * <p>
	 * This method notifies other paths to the same array that a splice occurred to the array.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   Path to array.
	 * @param items  Items to push onto array
	 *
	 * @return New length of the array.
	 */
	default <ITEM extends Any> int push(String path, ITEM... items) {
		return getNode().push(path, items);
	}

	/**
	 * Push int.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 * @param items  the items
	 *
	 * @return the int
	 */
	default <ITEM extends Any> int push(String[] path, ITEM... items) {
		return getNode().push(path, items);
	}

	/**
	 * Push int.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 * @param items  the items
	 *
	 * @return the int
	 */
	default <ITEM extends Any> int push(Unknown[] path, ITEM... items) {
		return getNode().push(path, items);
	}

	/**
	 * Push int.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 * @param items  the items
	 *
	 * @return the int
	 */
	default <ITEM extends Any> int push(Array<Unknown> path, ITEM... items) {
		return getNode().push(path, items);
	}

	/**
	 * Removes an item from the end of array at the path specified.
	 * <p>
	 * The arguments after <code>path</code> and return value match that of
	 * <code>Array.prototype.pop</code>.
	 * <p>
	 * This method notifies other paths to the same array that a splice occurred to the array.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   Path to array.
	 *
	 * @return Item that was removed.
	 */
	default <ITEM extends Any> ITEM pop(String path) {
		return getNode().pop(path);
	}

	/**
	 * Pop item.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 *
	 * @return the item
	 */
	default <ITEM extends Any> ITEM pop(String[] path) {
		return getNode().pop(path);
	}

	/**
	 * Pop item.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 *
	 * @return the item
	 */
	default <ITEM extends Any> ITEM pop(Unknown[] path) {
		return getNode().pop(path);
	}

	/**
	 * Pop item.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 *
	 * @return the item
	 */
	default <ITEM extends Any> ITEM pop(Array<Unknown> path) {
		return getNode().pop(path);
	}

	/**
	 * Starting from the start index specified, removes 0 or more items from the array and inserts 0 or more new items
	 * in their place.
	 * <p>
	 * The arguments after <code>path</code> and return value match that of
	 * <code>Array.prototype.splice</code>.
	 * <p>
	 * This method notifies other paths to the same array that a splice occurred to the array.
	 *
	 * @param <ITEM>      the type parameter
	 * @param path        Path to array.
	 * @param start       Index from which to start removing/inserting.
	 * @param deleteCount Number of items to remove.
	 * @param items       Items to insert into array.
	 *
	 * @return Array of removed items.
	 */
	default <ITEM extends Any> Array<ITEM> splice(String path, int start, int deleteCount, ITEM... items) {
		return getNode().splice(path, start, deleteCount, items);
	}

	/**
	 * Splice array.
	 *
	 * @param <ITEM>      the type parameter
	 * @param path        the path
	 * @param start       the start
	 * @param deleteCount the delete count
	 * @param items       the items
	 *
	 * @return the array
	 */
	default <ITEM extends Any> Array<ITEM> splice(String[] path, int start, int deleteCount, ITEM... items) {
		return getNode().splice(path, start, deleteCount, items);
	}

	/**
	 * Splice array.
	 *
	 * @param <ITEM>      the type parameter
	 * @param path        the path
	 * @param start       the start
	 * @param deleteCount the delete count
	 * @param items       the items
	 *
	 * @return the array
	 */
	default <ITEM extends Any> Array<ITEM> splice(Unknown[] path, int start, int deleteCount, ITEM... items) {
		return getNode().splice(path, start, deleteCount, items);
	}

	/**
	 * Splice array.
	 *
	 * @param <ITEM>      the type parameter
	 * @param path        the path
	 * @param start       the start
	 * @param deleteCount the delete count
	 * @param items       the items
	 *
	 * @return the array
	 */
	default <ITEM extends Any> Array<ITEM> splice(Array<Unknown> path, int start, int deleteCount, ITEM... items) {
		return getNode().splice(path, start, deleteCount, items);
	}

	/**
	 * Removes an item from the beginning of array at the path specified.
	 * <p>
	 * The arguments after <code>path</code> and return value match that of
	 * <code>Array.prototype.pop</code>.
	 * <p>
	 * This method notifies other paths to the same array that a splice occurred to the array.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   Path to array.
	 *
	 * @return Item that was removed.
	 */
	default <ITEM extends Any> ITEM shift(String path) {
		return getNode().shift(path);
	}

	/**
	 * Shift item.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 *
	 * @return the item
	 */
	default <ITEM extends Any> ITEM shift(String[] path) {
		return getNode().shift(path);
	}

	/**
	 * Shift item.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 *
	 * @return the item
	 */
	default <ITEM extends Any> ITEM shift(Unknown[] path) {
		return getNode().shift(path);
	}

	/**
	 * Shift item.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 *
	 * @return the item
	 */
	default <ITEM extends Any> ITEM shift(Array<Unknown> path) {
		return getNode().shift(path);
	}

	/**
	 * Adds items onto the beginning of the array at the path specified.
	 * <p>
	 * The arguments after <code>path</code> and return value match that of
	 * <code>Array.prototype.push</code>.
	 * <p>
	 * This method notifies other paths to the same array that a splice occurred to the array.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   Path to array.
	 * @param items  Items to insert info array
	 *
	 * @return New length of the array.
	 */
	default <ITEM extends Any> int unshift(String path, ITEM... items) {
		return getNode().unshift(path, items);
	}

	/**
	 * Unshift int.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 * @param items  the items
	 *
	 * @return the int
	 */
	default <ITEM extends Any> int unshift(String[] path, ITEM... items) {
		return getNode().unshift(path, items);
	}

	/**
	 * Unshift int.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 * @param items  the items
	 *
	 * @return the int
	 */
	default <ITEM extends Any> int unshift(Unknown[] path, ITEM... items) {
		return getNode().unshift(path, items);
	}

	/**
	 * Unshift int.
	 *
	 * @param <ITEM> the type parameter
	 * @param path   the path
	 * @param items  the items
	 *
	 * @return the int
	 */
	default <ITEM extends Any> int unshift(Array<Unknown> path, ITEM... items) {
		return getNode().unshift(path, items);
	}

	/**
	 * Notify that a path has changed.
	 * <p>
	 * Example:
	 *
	 * <pre><code>this.item.user.name = 'Bob';
	 * this.notifyPath('item.user.name');
	 * </code></pre>
	 *
	 * @param path  Path that should be notified.
	 * @param value Value at the path (optional).
	 */
	default void notifyPath(String path, Any value) {
		getNode().notifyPath(path, value);
	}

	/**
	 * Notify path.
	 *
	 * @param path  the path
	 * @param value the value
	 */
	default void notifyPath(String[] path, Any value) {
		getNode().notifyPath(path, value);
	}

	/**
	 * Notify path.
	 *
	 * @param path  the path
	 * @param value the value
	 */
	default void notifyPath(Unknown[] path, Any value) {
		getNode().notifyPath(path, value);
	}

	/**
	 * Notify path.
	 *
	 * @param path  the path
	 * @param value the value
	 */
	default void notifyPath(Array<Unknown> path, Any value) {
		getNode().notifyPath(path, value);
	}
}
