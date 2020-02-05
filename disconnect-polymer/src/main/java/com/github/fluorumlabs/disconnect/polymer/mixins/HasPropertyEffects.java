package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.PropertyEffects;
import com.github.fluorumlabs.disconnect.polymer.types.SpliceRecord;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.lang.Any;
import js.lang.Unknown;
import js.util.Record;
import js.util.StringRecord;
import js.util.collections.Array;

/**
 * Element class mixin that provides meta-programming for Polymer's template
 * binding and data observation (collectively, "property effects") system.
 * <p>
 * This mixin uses provides the following key static methods for adding
 * property effects to an element class:
 * - `addPropertyEffect`
 * - `createPropertyObserver`
 * - `createMethodObserver`
 * - `createNotifyingProperty`
 * - `createReadOnlyProperty`
 * - `createReflectedProperty`
 * - `createComputedProperty`
 * - `bindTemplate`
 * <p>
 * Each method creates one or more property accessors, along with metadata
 * used by this mixin's implementation of `_propertiesChanged` to perform
 * the property effects.
 * <p>
 * Underscored versions of the above methods also exist on the element
 * prototype for adding property effects on instances at runtime.
 * <p>
 * Note that this mixin overrides several `PropertyAccessors` methods, in
 * many cases to maintain guarantees provided by the Polymer 1.x features;
 * notably it changes property accessors to be synchronous by default
 * whereas the default when using `PropertyAccessors` standalone is to be
 * async by default.
 */
public interface HasPropertyEffects<E extends PropertyEffects, T extends Component<E>> extends HasTemplateStamp<E, T>, HasPropertyAccessors<E, T> {
    /**
     *
     */
    default StringRecord PROPERTY_EFFECT_TYPES() {
        return getNode().PROPERTY_EFFECT_TYPES();
    }

    /**
     * Sets a bag of property changes to this instance, and
     * synchronously processes all effects of the properties as a batch.
     * <p>
     * Property names must be simple properties, not paths.  Batched
     * path propagation is not supported.
     *
     * @param props       Bag of one or more key-value pairs whose key is
     *                    a property and value is the new value to set for that property.
     * @param setReadOnly When true, any private values set in
     *                    `props` will be set. By default, `setProperties` will not set
     *                    `readOnly: true` root properties.
     */
    default void setProperties(Record<Any> props, boolean setReadOnly) {
        getNode().setProperties(props, setReadOnly);
    }

    /**
     * Aliases one data path as another, such that path notifications from one
     * are routed to the other.
     *
     * @param to   Target path to link.
     * @param from Source path to link.
     */
    default void linkPaths(String to, String from) {
        getNode().linkPaths(to, from);
    }

    default void linkPaths(String[] to, String[] from) {
        getNode().linkPaths(to, from);
    }

    default void linkPaths(Unknown[] to, Unknown[] from) {
        getNode().linkPaths(to, from);
    }

    default void linkPaths(Array<Unknown> to, Array<Unknown> from) {
        getNode().linkPaths(to, from);
    }

    /**
     * Removes a data path alias previously established with `_linkPaths`.
     * <p>
     * Note, the path to unlink should be the target (`to`) used when
     * linking the paths.
     *
     * @param path Target path to unlink.
     */
    default void unlinkPaths(String path) {
        getNode().unlinkPaths(path);
    }

    default void unlinkPaths(String... path) {
        getNode().unlinkPaths(path);
    }

    default void unlinkPaths(Unknown... path) {
        getNode().unlinkPaths(path);
    }

    default void unlinkPaths(Array<Unknown> path) {
        getNode().unlinkPaths(path);
    }

    /**
     * Notify that an array has changed.
     * <p>
     * Example:
     * <p>
     * this.items = [ {name: 'Jim'}, {name: 'Todd'}, {name: 'Bill'} ];
     * ...
     * this.items.splice(1, 1, {name: 'Sam'});
     * this.items.push({name: 'Bob'});
     * this.notifySplices('items', [
     * { index: 1, removed: [{name: 'Todd'}], addedCount: 1,
     * object: this.items, type: 'splice' },
     * { index: 3, removed: [], addedCount: 1,
     * object: this.items, type: 'splice'}
     * ]);
     *
     * @param path    Path that should be notified.
     * @param splices Array of splice records indicating ordered
     *                changes that occurred to the array. Each record should have the
     *                following fields:
     *                * index: index at which the change occurred
     *                * removed: array of items that were removed from this index
     *                * addedCount: number of new items added at this index
     *                * object: a reference to the array in question
     *                * type: the string literal 'splice'
     *                <p>
     *                Note that splice records _must_ be normalized such that they are
     *                reported in index order (raw results from `Object.observe` are not
     *                ordered and must be normalized/merged before notifying).
     */
    default <ITEM extends Any> void notifySplices(String path, SpliceRecord<ITEM>... splices) {
        getNode().notifySplices(path, splices);
    }

    default <ITEM extends Any> void notifySplices(String path, Array<SpliceRecord<ITEM>> splices) {
        getNode().notifySplices(path, splices);
    }

    /**
     * Convenience method for reading a value from a path.
     * <p>
     * Note, if any part in the path is undefined, this method returns
     * `undefined` (this method does not throw when dereferencing undefined
     * paths).
     *
     * @param path Path to the value
     *             to read.  The path may be specified as a string (e.g. `foo.bar.baz`)
     *             or an array of path parts (e.g. `['foo.bar', 'baz']`).  Note that
     *             bracketed expressions are not supported; string-based path parts
     *             *must* be separated by dots.  Note that when dereferencing array
     *             indices, the index may be used as a dotted part directly
     *             (e.g. `users.12.name` or `['users', 12, 'name']`).
     * @param root Root object from which the path is evaluated.
     *
     * @return Value at the path, or `undefined` if any part of the path
     *         is undefined.
     */
    default <ITEM extends Any> ITEM get(String path, Any root) {
        return getNode().get(path, root);
    }

    default <ITEM extends Any> ITEM get(String[] path, Any root) {
        return getNode().get(path, root);
    }

    default <ITEM extends Any> ITEM get(Unknown[] path, Any root) {
        return getNode().get(path, root);
    }

    default <ITEM extends Any> ITEM get(Array<Unknown> path, Any root) {
        return getNode().get(path, root);
    }

    default <ITEM extends Any> ITEM get(String path) {
        return getNode().get(path);
    }

    default <ITEM extends Any> ITEM get(String[] path) {
        return getNode().get(path);
    }

    default <ITEM extends Any> ITEM get(Unknown[] path) {
        return getNode().get(path);
    }

    default <ITEM extends Any> ITEM get(Array<Unknown> path) {
        return getNode().get(path);
    }

    /**
     * Convenience method for setting a value to a path and notifying any
     * elements bound to the same path.
     * <p>
     * Note, if any part in the path except for the last is undefined,
     * this method does nothing (this method does not throw when
     * dereferencing undefined paths).
     *
     * @param path  Path to the value
     *              to write.  The path may be specified as a string (e.g. `'foo.bar.baz'`)
     *              or an array of path parts (e.g. `['foo.bar', 'baz']`).  Note that
     *              bracketed expressions are not supported; string-based path parts
     *              *must* be separated by dots.  Note that when dereferencing array
     *              indices, the index may be used as a dotted part directly
     *              (e.g. `'users.12.name'` or `['users', 12, 'name']`).
     * @param value Value to set at the specified path.
     * @param root  Root object from which the path is evaluated.
     *              When specified, no notification will occur.
     */
    default void set(String path, Any value, Any root) {
        getNode().set(path, value, root);
    }

    default void set(String[] path, Any value, Any root) {
        getNode().set(path, value, root);
    }

    default void set(Unknown[] path, Any value, Any root) {
        getNode().set(path, value, root);
    }

    default void set(Array<Unknown> path, Any value, Any root) {
        getNode().set(path, value, root);
    }

    default void set(String path, Any value) {
        getNode().set(path, value);
    }

    default void set(String[] path, Any value) {
        getNode().set(path, value);
    }

    default void set(Unknown[] path, Any value) {
        getNode().set(path, value);
    }

    default void set(Array<Unknown> path, Any value) {
        getNode().set(path, value);
    }

    /**
     * Adds items onto the end of the array at the path specified.
     * <p>
     * The arguments after `path` and return value match that of
     * `Array.prototype.push`.
     * <p>
     * This method notifies other paths to the same array that a
     * splice occurred to the array.
     *
     * @param path  Path to array.
     * @param items Items to push onto array
     *
     * @return New length of the array.
     */
    default <ITEM extends Any> int push(String path, ITEM... items) {
        return getNode().push(path, items);
    }

    default <ITEM extends Any> int push(String[] path, ITEM... items) {
        return getNode().push(path, items);
    }

    default <ITEM extends Any> int push(Unknown[] path, ITEM... items) {
        return getNode().push(path, items);
    }

    default <ITEM extends Any> int push(Array<Unknown> path, ITEM... items) {
        return getNode().push(path, items);
    }

    /**
     * Removes an item from the end of array at the path specified.
     * <p>
     * The arguments after `path` and return value match that of
     * `Array.prototype.pop`.
     * <p>
     * This method notifies other paths to the same array that a
     * splice occurred to the array.
     *
     * @param path Path to array.
     *
     * @return Item that was removed.
     */
    default <ITEM extends Any> ITEM pop(String path) {
        return getNode().pop(path);
    }

    default <ITEM extends Any> ITEM pop(String[] path) {
        return getNode().pop(path);
    }

    default <ITEM extends Any> ITEM pop(Unknown[] path) {
        return getNode().pop(path);
    }

    default <ITEM extends Any> ITEM pop(Array<Unknown> path) {
        return getNode().pop(path);
    }

    /**
     * Starting from the start index specified, removes 0 or more items
     * from the array and inserts 0 or more new items in their place.
     * <p>
     * The arguments after `path` and return value match that of
     * `Array.prototype.splice`.
     * <p>
     * This method notifies other paths to the same array that a
     * splice occurred to the array.
     *
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

    default <ITEM extends Any> Array<ITEM> splice(String[] path, int start, int deleteCount, ITEM... items) {
        return getNode().splice(path, start, deleteCount, items);
    }

    default <ITEM extends Any> Array<ITEM> splice(Unknown[] path, int start, int deleteCount, ITEM... items) {
        return getNode().splice(path, start, deleteCount, items);
    }

    default <ITEM extends Any> Array<ITEM> splice(Array<Unknown> path, int start, int deleteCount, ITEM... items) {
        return getNode().splice(path, start, deleteCount, items);
    }

    /**
     * Removes an item from the beginning of array at the path specified.
     * <p>
     * The arguments after `path` and return value match that of
     * `Array.prototype.pop`.
     * <p>
     * This method notifies other paths to the same array that a
     * splice occurred to the array.
     *
     * @param path Path to array.
     *
     * @return Item that was removed.
     */
    default <ITEM extends Any> ITEM shift(String path) {
        return getNode().shift(path);
    }

    default <ITEM extends Any> ITEM shift(String[] path) {
        return getNode().shift(path);
    }

    default <ITEM extends Any> ITEM shift(Unknown[] path) {
        return getNode().shift(path);
    }

    default <ITEM extends Any> ITEM shift(Array<Unknown> path) {
        return getNode().shift(path);
    }

    /**
     * Adds items onto the beginning of the array at the path specified.
     * <p>
     * The arguments after `path` and return value match that of
     * `Array.prototype.push`.
     * <p>
     * This method notifies other paths to the same array that a
     * splice occurred to the array.
     *
     * @param path  Path to array.
     * @param items Items to insert info array
     *
     * @return New length of the array.
     */
    default <ITEM extends Any> int unshift(String path, ITEM... items) {
        return getNode().unshift(path, items);
    }

    default <ITEM extends Any> int unshift(String[] path, ITEM... items) {
        return getNode().unshift(path, items);
    }

    default <ITEM extends Any> int unshift(Unknown[] path, ITEM... items) {
        return getNode().unshift(path, items);
    }

    default <ITEM extends Any> int unshift(Array<Unknown> path, ITEM... items) {
        return getNode().unshift(path, items);
    }

    /**
     * Notify that a path has changed.
     * <p>
     * Example:
     * <p>
     * this.item.user.name = 'Bob';
     * this.notifyPath('item.user.name');
     *
     * @param path  Path that should be notified.
     * @param value Value at the path (optional).
     */
    default void notifyPath(String path, Any value) {
        getNode().notifyPath(path, value);
    }

    default void notifyPath(String[] path, Any value) {
        getNode().notifyPath(path, value);
    }

    default void notifyPath(Unknown[] path, Any value) {
        getNode().notifyPath(path, value);
    }

    default void notifyPath(Array<Unknown> path, Any value) {
        getNode().notifyPath(path, value);
    }
}
