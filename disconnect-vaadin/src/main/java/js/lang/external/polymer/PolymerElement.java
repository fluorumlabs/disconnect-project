package js.lang.external.polymer;

import js.lang.Any;
import js.util.Record;
import js.util.collections.Array;
import js.web.dom.Element;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

public interface PolymerElement extends HTMLElement {

    /**
     * Convenience method for reading a value from a path.
     *
     * Note, if any part in the path is undefined, this method returns
     * <code>undefined</code> (this method does not throw when dereferencing undefined
     * paths).
     *
     * <strong>path</strong>: Path to the value
     * to read. The path may be specified as a string (e.g. <code>foo.bar.baz</code>)
     * or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>). Note that
     * bracketed expressions are not supported; string-based path parts
     * <em>must</em> be separated by dots. Note that when dereferencing array
     * indices, the index may be used as a dotted part directly
     * (e.g. <code>users.12.name</code> or <code>['users', 12, 'name']</code>).
     * <strong>root</strong>: Root object from which the path is evaluated.
     */
    @JSMethod("get")
    <T extends Any> T get(PropertyPath path, @Nullable Any root);

    /**
     * Notify that a path has changed.
     *
     * Example:
     *
     *  this.item.user.name = 'Bob';
     *  this.notifyPath('item.user.name');
     *
     * <strong>path</strong>: Path that should be notified.
     * <strong>value</strong>: Value at the path (optional).
     */
    @JSMethod("notifyPath")
    void notifyPath(String path, @Nullable Any value);

    // !wca! notifySplices: (path: string, splices: any[] | null): void
    /**
     * Notify that an array has changed.
     *
     * Example:
     *
     *  this.items = [ {name: 'Jim'}, {name: 'Todd'}, {name: 'Bill'} ];
     *  ...
     *  this.items.splice(1, 1, {name: 'Sam'});
     *  this.items.push({name: 'Bob'});
     *  this.notifySplices('items', [
     *  { index: 1, removed: [{name: 'Todd'}], addedCount: 1,
     *  object: this.items, type: 'splice' },
     *  { index: 3, removed: [], addedCount: 1,
     *  object: this.items, type: 'splice'}
     *  ]);
     *
     * <strong>path</strong>: Path that should be notified.
     * <strong>splices</strong>: Array of splice records indicating ordered
     * changes that occurred to the array. Each record should have the
     * following fields:
     *  index: index at which the change occurred
     *  removed: array of items that were removed from this index
     *  addedCount: number of new items added at this index
     *  object: a reference to the array in question
     *  type: the string literal 'splice'
     *
     * Note that splice records <em>must</em> be normalized such that they are
     * reported in index order (raw results from <code>Object.observe</code> are not
     * ordered and must be normalized/merged before notifying).
     */
    @JSMethod("notifySplices")
    <T extends Any> void notifySplices(String path, @Nullable Array<PolymerSplice<T>> splices);

    /**
     * Removes an item from the end of array at the path specified.
     *
     * The arguments after <code>path</code> and return value match that of
     * <code>Array.prototype.pop</code>.
     *
     * This method notifies other paths to the same array that a
     * splice occurred to the array.
     *
     * <strong>path</strong>: Path to array.
     */
    @JSMethod("pop")
    <T extends Any> T pop(PropertyPath path);

    /**
     * Adds items onto the end of the array at the path specified.
     *
     * The arguments after <code>path</code> and return value match that of
     * <code>Array.prototype.push</code>.
     *
     * This method notifies other paths to the same array that a
     * splice occurred to the array.
     *
     * <strong>path</strong>: Path to array.
     * <strong>items</strong>: Items to push onto array
     */
    @JSBody(params = {"path", "items"}, script = "return this.push.apply(this, [path].concat(items))")
    <T extends Any> int push(PropertyPath path, Array<T> items);

    /**
     * Convenience method for setting a value to a path and notifying any
     * elements bound to the same path.
     *
     * Note, if any part in the path except for the last is undefined,
     * this method does nothing (this method does not throw when
     * dereferencing undefined paths).
     *
     * <strong>path</strong>: Path to the value
     * to write. The path may be specified as a string (e.g. <code>'foo.bar.baz'</code>)
     * or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>). Note that
     * bracketed expressions are not supported; string-based path parts
     * <em>must</em> be separated by dots. Note that when dereferencing array
     * indices, the index may be used as a dotted part directly
     * (e.g. <code>'users.12.name'</code> or <code>['users', 12, 'name']</code>).
     * <strong>value</strong>: Value to set at the specified path.
     * <strong>root</strong>: Root object from which the path is evaluated.
     * When specified, no notification will occur.
     */
    @JSMethod("set")
    void set(PropertyPath path, Any value, @Nullable Any root);

    /**
     * Removes an item from the beginning of array at the path specified.
     *
     * The arguments after <code>path</code> and return value match that of
     * <code>Array.prototype.pop</code>.
     *
     * This method notifies other paths to the same array that a
     * splice occurred to the array.
     *
     * <strong>path</strong>: Path to array.
     */
    @JSMethod("shift")
    <T extends Any> T shift(PropertyPath path);

    /**
     * Starting from the start index specified, removes 0 or more items
     * from the array and inserts 0 or more new items in their place.
     *
     * The arguments after <code>path</code> and return value match that of
     * <code>Array.prototype.splice</code>.
     *
     * This method notifies other paths to the same array that a
     * splice occurred to the array.
     *
     * <strong>path</strong>: Path to array.
     * <strong>start</strong>: Index from which to start removing/inserting.
     * <strong>deleteCount</strong>: Number of items to remove.
     * <strong>items</strong>: Items to insert into array.
     */
    @JSBody(params = {"path", "start", "deleteCount", "items"}, script = "return this.splice.apply(this, [path, start, deleteCount].concat(items))")
    <T extends Any> Array<T> splice(PropertyPath path, int start, int deleteCount, T items);

    /**
     * Adds items onto the beginning of the array at the path specified.
     *
     * The arguments after <code>path</code> and return value match that of
     * <code>Array.prototype.push</code>.
     *
     * This method notifies other paths to the same array that a
     * splice occurred to the array.
     *
     * <strong>path</strong>: Path to array.
     * <strong>items</strong>: Items to insert info array
     */
    @JSBody(params = {"path", "items"}, script = "return this.unshift.apply(this, [path].concat(items))")
    <T extends Any> int unshift(PropertyPath path, Array<T> items);

    /**
     */
    @JSProperty("$")
    Record<Element> $();
}
