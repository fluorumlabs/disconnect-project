package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.utils.SpliceRecord;
import js.lang.Any;
import js.lang.Unknown;
import js.util.Record;
import js.util.StringRecord;
import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

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
@Import(
        symbols = "PropertyEffects",
        module = "@polymer/polymer/lib/mixins/property-effects.js"
)
public interface PropertyEffects extends TemplateStamp, PropertyAccessors {
    /**
     *
     */
    @JSProperty("PROPERTY_EFFECT_TYPES")
    StringRecord PROPERTY_EFFECT_TYPES();

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
    void setProperties(Record<Any> props, boolean setReadOnly);

    /**
     * Aliases one data path as another, such that path notifications from one
     * are routed to the other.
     *
     * @param to   Target path to link.
     * @param from Source path to link.
     */
    void linkPaths(String to, String from);

    void linkPaths(@JSByRef String[] to, @JSByRef String[] from);

    void linkPaths(@JSByRef Unknown[] to, @JSByRef Unknown[] from);

    void linkPaths(Array<Unknown> to, Array<Unknown> from);

    /**
     * Removes a data path alias previously established with `_linkPaths`.
     * <p>
     * Note, the path to unlink should be the target (`to`) used when
     * linking the paths.
     *
     * @param path Target path to unlink.
     */
    void unlinkPaths(String path);

    void unlinkPaths(@JSByRef String... path);

    void unlinkPaths(@JSByRef Unknown... path);

    void unlinkPaths(Array<Unknown> path);

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
    <T extends Any> void notifySplices(String path, @JSByRef SpliceRecord<T>... splices);

    <T extends Any> void notifySplices(String path, Array<SpliceRecord<T>> splices);

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
    @Nullable
    <T extends Any> T get(String path, Any root);

    @Nullable
    <T extends Any> T get(@JSByRef String[] path, Any root);

    @Nullable
    <T extends Any> T get(@JSByRef Unknown[] path, Any root);

    @Nullable
    <T extends Any> T get(Array<Unknown> path, Any root);

    @Nullable
    <T extends Any> T get(String path);

    @Nullable
    <T extends Any> T get(@JSByRef String[] path);

    @Nullable
    <T extends Any> T get(@JSByRef Unknown[] path);

    @Nullable
    <T extends Any> T get(Array<Unknown> path);

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
    void set(String path, Any value, Any root);

    void set(@JSByRef String[] path, Any value, Any root);

    void set(@JSByRef Unknown[] path, Any value, Any root);

    void set(Array<Unknown> path, Any value, Any root);

    void set(String path, Any value);

    void set(@JSByRef String[] path, Any value);

    void set(@JSByRef Unknown[] path, Any value);

    void set(Array<Unknown> path, Any value);

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
    @JSBody(params = {"path", "items"}, script = "return this.push.apply(this, [path].concat(items))")
    <T extends Any> int push(String path, @JSByRef T... items);

    @JSBody(params = {"path", "items"}, script = "return this.push.apply(this, [path].concat(items))")
    <T extends Any> int push(@JSByRef String[] path, @JSByRef T... items);

    @JSBody(params = {"path", "items"}, script = "return this.push.apply(this, [path].concat(items))")
    <T extends Any> int push(@JSByRef Unknown[] path, @JSByRef T... items);

    @JSBody(params = {"path", "items"}, script = "return this.push.apply(this, [path].concat(items))")
    <T extends Any> int push(Array<Unknown> path, @JSByRef T... items);

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
    <T extends Any> T pop(String path);

    <T extends Any> T pop(@JSByRef String... path);

    <T extends Any> T pop(@JSByRef Unknown... path);

    <T extends Any> T pop(Array<Unknown> path);

    /**
     * Starting from the start index specified, removes 0 or more items
     * from the array and inserts 0 or more new items in their place.
     * <p>
     * The arguments after `path` and return value match that of
     * `Array.prototype.splice`.
     * <p>
     * This method notifies other paths to the same array that a
     * splice occurred to the array.
     * FIXME param path: (string | !Array.<(string | number)>)
     *
     * @param path        Path to array.
     * @param start       Index from which to start removing/inserting.
     * @param deleteCount Number of items to remove.
     *                    FIXME param items: ...*
     * @param items       Items to insert into array.
     *
     * @return Array of removed items.
     */
    @JSBody(params = {"path", "start", "deleteCount", "items"}, script = "return this.splice.apply(this, [path, start, deleteCount].concat(items))")
    <T extends Any> Array<T> splice(String path, int start, int deleteCount, @JSByRef T... items);

    @JSBody(params = {"path", "start", "deleteCount", "items"}, script = "return this.splice.apply(this, [path, start, deleteCount].concat(items))")
    <T extends Any> Array<T> splice(@JSByRef String[] path, int start, int deleteCount, @JSByRef T... items);

    @JSBody(params = {"path", "start", "deleteCount", "items"}, script = "return this.splice.apply(this, [path, start, deleteCount].concat(items))")
    <T extends Any> Array<T> splice(@JSByRef Unknown[] path, int start, int deleteCount, @JSByRef T... items);

    @JSBody(params = {"path", "start", "deleteCount", "items"}, script = "return this.splice.apply(this, [path, start, deleteCount].concat(items))")
    <T extends Any> Array<T> splice(Array<Unknown> path, int start, int deleteCount, @JSByRef T... items);

    /**
     * Removes an item from the beginning of array at the path specified.
     * <p>
     * The arguments after `path` and return value match that of
     * `Array.prototype.pop`.
     * <p>
     * This method notifies other paths to the same array that a
     * splice occurred to the array.
     * FIXME param path: (string | !Array.<(string | number)>)
     *
     * @param path Path to array.
     *
     * @return Item that was removed.
     */
    @Nullable
    <T extends Any> T shift(String path);

    @Nullable
    <T extends Any> T shift(@JSByRef String... path);

    @Nullable
    <T extends Any> T shift(@JSByRef Unknown... path);

    @Nullable
    <T extends Any> T shift(Array<Unknown> path);

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
    @JSBody(params = {"path", "items"}, script = "return this.unshift.apply(this, [path].concat(items))")
    <T extends Any> int unshift(String path, @JSByRef T... items);

    @JSBody(params = {"path", "items"}, script = "return this.unshift.apply(this, [path].concat(items))")
    <T extends Any> int unshift(@JSByRef String[] path, @JSByRef T... items);

    @JSBody(params = {"path", "items"}, script = "return this.unshift.apply(this, [path].concat(items))")
    <T extends Any> int unshift(@JSByRef Unknown[] path, @JSByRef T... items);

    @JSBody(params = {"path", "items"}, script = "return this.unshift.apply(this, [path].concat(items))")
    <T extends Any> int unshift(Array<Unknown> path, @JSByRef T... items);

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
    void notifyPath(String path, Any value);

    void notifyPath(@JSByRef String[] path, Any value);

    void notifyPath(@JSByRef Unknown[] path, Any value);

    void notifyPath(Array<Unknown> path, Any value);

    void notifyPath(String path);

    void notifyPath(@JSByRef String... path);

    void notifyPath(@JSByRef Unknown... path);

    void notifyPath(Array<Unknown> path);
}
