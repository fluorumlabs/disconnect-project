package js.lang.external.polymer.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"PropertyEffects as PropertyEffects_PropertyEffects"},
    module = "@polymer/polymer/lib/mixins/property-effects.js"
)
public interface PropertyEffects extends TemplateStamp, PropertyAccessors, PropertiesChanged {
  /**
   * Element class mixin that provides meta-programming for Polymer's template
   * binding and data observation (collectively, &quot;property effects&quot;) system.
   *
   * This mixin uses provides the following key static methods for adding
   * property effects to an element class:
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
   * Each method creates one or more property accessors, along with metadata
   * used by this mixin's implementation of <code>_propertiesChanged</code> to perform
   * the property effects.
   *
   * Underscored versions of the above methods also exist on the element
   * prototype for adding property effects on instances at runtime.
   *
   * Note that this mixin overrides several <code>PropertyAccessors</code> methods, in
   * many cases to maintain guarantees provided by the Polymer 1.x features;
   * notably it changes property accessors to be synchronous by default
   * whereas the default when using <code>PropertyAccessors</code> standalone is to be
   * async by default.
   *
   */
  @JSBody(
      params = {"base"},
      script = "return PropertyEffects_PropertyEffects(base)"
  )
  static <T extends JsFunction> Any PropertyEffects(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSProperty("PROPERTY_EFFECT_TYPES")
  Any getPROPERTY_EFFECT_TYPES();

  /**
   * Overrides <code>PropertyAccessors</code> so that property accessor
   * side effects are not enabled until after client dom is fully ready.
   * Also calls <code>_flushClients</code> callback to ensure client dom is enabled
   * that was not enabled as a result of flushing properties.
   *
   */
  void ready();

  /**
   * Sets a bag of property changes to this instance, and
   * synchronously processes all effects of the properties as a batch.
   *
   * Property names must be simple properties, not paths.  Batched
   * path propagation is not supported.
   *
   * @param props Bag of one or more key-value pairs whose key is
   * a property and value is the new value to set for that property.
   * @param setReadOnly When true, any private values set in
   * <code>props</code> will be set. By default, <code>setProperties</code> will not set
   * <code>readOnly: true</code> root properties.
   *
   */
  void setProperties(@Nullable Any props, boolean setReadOnly);

  /**
   * Sets a bag of property changes to this instance, and
   * synchronously processes all effects of the properties as a batch.
   *
   * Property names must be simple properties, not paths.  Batched
   * path propagation is not supported.
   *
   * @param props Bag of one or more key-value pairs whose key is
   * a property and value is the new value to set for that property.
   */
  void setProperties(@Nullable Any props);

  /**
   * Sets a bag of property changes to this instance, and
   * synchronously processes all effects of the properties as a batch.
   *
   * Property names must be simple properties, not paths.  Batched
   * path propagation is not supported.
   *
   */
  void setProperties();

  /**
   * Aliases one data path as another, such that path notifications from one
   * are routed to the other.
   *
   * @param to Target path to link.
   * @param from Source path to link.
   *
   */
  void linkPaths(int[] to, int[] from);

  /**
   * Aliases one data path as another, such that path notifications from one
   * are routed to the other.
   *
   * @param to Target path to link.
   * @param from Source path to link.
   *
   */
  void linkPaths(int[] to, String[] from);

  /**
   * Aliases one data path as another, such that path notifications from one
   * are routed to the other.
   *
   * @param to Target path to link.
   * @param from Source path to link.
   *
   */
  void linkPaths(int[] to, String from);

  /**
   * Aliases one data path as another, such that path notifications from one
   * are routed to the other.
   *
   * @param to Target path to link.
   * @param from Source path to link.
   *
   */
  void linkPaths(String[] to, int[] from);

  /**
   * Aliases one data path as another, such that path notifications from one
   * are routed to the other.
   *
   * @param to Target path to link.
   * @param from Source path to link.
   *
   */
  void linkPaths(String[] to, String[] from);

  /**
   * Aliases one data path as another, such that path notifications from one
   * are routed to the other.
   *
   * @param to Target path to link.
   * @param from Source path to link.
   *
   */
  void linkPaths(String[] to, String from);

  /**
   * Aliases one data path as another, such that path notifications from one
   * are routed to the other.
   *
   * @param to Target path to link.
   * @param from Source path to link.
   *
   */
  void linkPaths(String to, int[] from);

  /**
   * Aliases one data path as another, such that path notifications from one
   * are routed to the other.
   *
   * @param to Target path to link.
   * @param from Source path to link.
   *
   */
  void linkPaths(String to, String[] from);

  /**
   * Aliases one data path as another, such that path notifications from one
   * are routed to the other.
   *
   * @param to Target path to link.
   * @param from Source path to link.
   *
   */
  void linkPaths(String to, String from);

  /**
   * Removes a data path alias previously established with <code>_linkPaths</code>.
   *
   * Note, the path to unlink should be the target (<code>to</code>) used when
   * linking the paths.
   *
   * @param path Target path to unlink.
   *
   */
  void unlinkPaths(int[] path);

  /**
   * Removes a data path alias previously established with <code>_linkPaths</code>.
   *
   * Note, the path to unlink should be the target (<code>to</code>) used when
   * linking the paths.
   *
   * @param path Target path to unlink.
   *
   */
  void unlinkPaths(String[] path);

  /**
   * Removes a data path alias previously established with <code>_linkPaths</code>.
   *
   * Note, the path to unlink should be the target (<code>to</code>) used when
   * linking the paths.
   *
   * @param path Target path to unlink.
   *
   */
  void unlinkPaths(String path);

  /**
   * Notify that an array has changed.
   *
   * Example:
   *
   * <pre><code> this.items = [ {name: 'Jim'}, {name: 'Todd'}, {name: 'Bill'} ];
   *  ...
   *  this.items.splice(1, 1, {name: 'Sam'});
   *  this.items.push({name: 'Bob'});
   *  this.notifySplices('items', [
   *    { index: 1, removed: [{name: 'Todd'}], addedCount: 1,
   *      object: this.items, type: 'splice' },
   *    { index: 3, removed: [], addedCount: 1,
   *      object: this.items, type: 'splice'}
   *  ]);
   * </code></pre>
   * @param path Path that should be notified.
   * @param splices Array of splice records indicating ordered
   * changes that occurred to the array. Each record should have the
   * following fields:
   * * index: index at which the change occurred
   * * removed: array of items that were removed from this index
   * * addedCount: number of new items added at this index
   * * object: a reference to the array in question
   * * type: the string literal 'splice'
   *
   * Note that splice records <em>must</em> be normalized such that they are
   * reported in index order (raw results from <code>Object.observe</code> are not
   * ordered and must be normalized/merged before notifying).
   *
   */
  void notifySplices(String path, Any[] splices);

  /**
   * Notify that an array has changed.
   *
   * Example:
   *
   * <pre><code> this.items = [ {name: 'Jim'}, {name: 'Todd'}, {name: 'Bill'} ];
   *  ...
   *  this.items.splice(1, 1, {name: 'Sam'});
   *  this.items.push({name: 'Bob'});
   *  this.notifySplices('items', [
   *    { index: 1, removed: [{name: 'Todd'}], addedCount: 1,
   *      object: this.items, type: 'splice' },
   *    { index: 3, removed: [], addedCount: 1,
   *      object: this.items, type: 'splice'}
   *  ]);
   * </code></pre>
   * @param path Path that should be notified.
   */
  void notifySplices(String path);

  /**
   * Convenience method for reading a value from a path.
   *
   * Note, if any part in the path is undefined, this method returns
   * <code>undefined</code> (this method does not throw when dereferencing undefined
   * paths).
   *
   * @param path Path to the value
   * to read.  The path may be specified as a string (e.g. <code>foo.bar.baz</code>)
   * or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>).  Note that
   * bracketed expressions are not supported; string-based path parts
   * <em>must</em> be separated by dots.  Note that when dereferencing array
   * indices, the index may be used as a dotted part directly
   * (e.g. <code>users.12.name</code> or <code>['users', 12, 'name']</code>).
   * @param root Root object from which the path is evaluated.
   * @return Value at the path, or <code>undefined</code> if any part of the path
   * is undefined.
   *
   */
  Any get(int[] path, @Nullable Any root);

  /**
   * Convenience method for reading a value from a path.
   *
   * Note, if any part in the path is undefined, this method returns
   * <code>undefined</code> (this method does not throw when dereferencing undefined
   * paths).
   *
   * @param path Path to the value
   * to read.  The path may be specified as a string (e.g. <code>foo.bar.baz</code>)
   * or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>).  Note that
   * bracketed expressions are not supported; string-based path parts
   * <em>must</em> be separated by dots.  Note that when dereferencing array
   * indices, the index may be used as a dotted part directly
   * (e.g. <code>users.12.name</code> or <code>['users', 12, 'name']</code>).
   * @param root Root object from which the path is evaluated.
   * @return Value at the path, or <code>undefined</code> if any part of the path
   * is undefined.
   *
   */
  Any get(String[] path, @Nullable Any root);

  /**
   * Convenience method for reading a value from a path.
   *
   * Note, if any part in the path is undefined, this method returns
   * <code>undefined</code> (this method does not throw when dereferencing undefined
   * paths).
   *
   * @param path Path to the value
   * to read.  The path may be specified as a string (e.g. <code>foo.bar.baz</code>)
   * or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>).  Note that
   * bracketed expressions are not supported; string-based path parts
   * <em>must</em> be separated by dots.  Note that when dereferencing array
   * indices, the index may be used as a dotted part directly
   * (e.g. <code>users.12.name</code> or <code>['users', 12, 'name']</code>).
   * @param root Root object from which the path is evaluated.
   * @return Value at the path, or <code>undefined</code> if any part of the path
   * is undefined.
   *
   */
  Any get(String path, @Nullable Any root);

  /**
   * Convenience method for reading a value from a path.
   *
   * Note, if any part in the path is undefined, this method returns
   * <code>undefined</code> (this method does not throw when dereferencing undefined
   * paths).
   *
   * @param path Path to the value
   * to read.  The path may be specified as a string (e.g. <code>foo.bar.baz</code>)
   * or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>).  Note that
   * bracketed expressions are not supported; string-based path parts
   * <em>must</em> be separated by dots.  Note that when dereferencing array
   * indices, the index may be used as a dotted part directly
   * (e.g. <code>users.12.name</code> or <code>['users', 12, 'name']</code>).
   * @return Value at the path, or <code>undefined</code> if any part of the path
   * is undefined.
   *
   */
  Any get(int[] path);

  /**
   * Convenience method for reading a value from a path.
   *
   * Note, if any part in the path is undefined, this method returns
   * <code>undefined</code> (this method does not throw when dereferencing undefined
   * paths).
   *
   * @param path Path to the value
   * to read.  The path may be specified as a string (e.g. <code>foo.bar.baz</code>)
   * or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>).  Note that
   * bracketed expressions are not supported; string-based path parts
   * <em>must</em> be separated by dots.  Note that when dereferencing array
   * indices, the index may be used as a dotted part directly
   * (e.g. <code>users.12.name</code> or <code>['users', 12, 'name']</code>).
   * @return Value at the path, or <code>undefined</code> if any part of the path
   * is undefined.
   *
   */
  Any get(String[] path);

  /**
   * Convenience method for reading a value from a path.
   *
   * Note, if any part in the path is undefined, this method returns
   * <code>undefined</code> (this method does not throw when dereferencing undefined
   * paths).
   *
   * @param path Path to the value
   * to read.  The path may be specified as a string (e.g. <code>foo.bar.baz</code>)
   * or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>).  Note that
   * bracketed expressions are not supported; string-based path parts
   * <em>must</em> be separated by dots.  Note that when dereferencing array
   * indices, the index may be used as a dotted part directly
   * (e.g. <code>users.12.name</code> or <code>['users', 12, 'name']</code>).
   * @return Value at the path, or <code>undefined</code> if any part of the path
   * is undefined.
   *
   */
  Any get(String path);

  /**
   * Convenience method for setting a value to a path and notifying any
   * elements bound to the same path.
   *
   * Note, if any part in the path except for the last is undefined,
   * this method does nothing (this method does not throw when
   * dereferencing undefined paths).
   *
   * @param path Path to the value
   * to write.  The path may be specified as a string (e.g. <code>'foo.bar.baz'</code>)
   * or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>).  Note that
   * bracketed expressions are not supported; string-based path parts
   * <em>must</em> be separated by dots.  Note that when dereferencing array
   * indices, the index may be used as a dotted part directly
   * (e.g. <code>'users.12.name'</code> or <code>['users', 12, 'name']</code>).
   * @param value Value to set at the specified path.
   * @param root Root object from which the path is evaluated.
   * When specified, no notification will occur.
   *
   */
  void set(int[] path, Any value, @Nullable Any root);

  /**
   * Convenience method for setting a value to a path and notifying any
   * elements bound to the same path.
   *
   * Note, if any part in the path except for the last is undefined,
   * this method does nothing (this method does not throw when
   * dereferencing undefined paths).
   *
   * @param path Path to the value
   * to write.  The path may be specified as a string (e.g. <code>'foo.bar.baz'</code>)
   * or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>).  Note that
   * bracketed expressions are not supported; string-based path parts
   * <em>must</em> be separated by dots.  Note that when dereferencing array
   * indices, the index may be used as a dotted part directly
   * (e.g. <code>'users.12.name'</code> or <code>['users', 12, 'name']</code>).
   * @param value Value to set at the specified path.
   * @param root Root object from which the path is evaluated.
   * When specified, no notification will occur.
   *
   */
  void set(String[] path, Any value, @Nullable Any root);

  /**
   * Convenience method for setting a value to a path and notifying any
   * elements bound to the same path.
   *
   * Note, if any part in the path except for the last is undefined,
   * this method does nothing (this method does not throw when
   * dereferencing undefined paths).
   *
   * @param path Path to the value
   * to write.  The path may be specified as a string (e.g. <code>'foo.bar.baz'</code>)
   * or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>).  Note that
   * bracketed expressions are not supported; string-based path parts
   * <em>must</em> be separated by dots.  Note that when dereferencing array
   * indices, the index may be used as a dotted part directly
   * (e.g. <code>'users.12.name'</code> or <code>['users', 12, 'name']</code>).
   * @param value Value to set at the specified path.
   * @param root Root object from which the path is evaluated.
   * When specified, no notification will occur.
   *
   */
  void set(String path, Any value, @Nullable Any root);

  /**
   * Convenience method for setting a value to a path and notifying any
   * elements bound to the same path.
   *
   * Note, if any part in the path except for the last is undefined,
   * this method does nothing (this method does not throw when
   * dereferencing undefined paths).
   *
   * @param path Path to the value
   * to write.  The path may be specified as a string (e.g. <code>'foo.bar.baz'</code>)
   * or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>).  Note that
   * bracketed expressions are not supported; string-based path parts
   * <em>must</em> be separated by dots.  Note that when dereferencing array
   * indices, the index may be used as a dotted part directly
   * (e.g. <code>'users.12.name'</code> or <code>['users', 12, 'name']</code>).
   * @param value Value to set at the specified path.
   */
  void set(int[] path, Any value);

  /**
   * Convenience method for setting a value to a path and notifying any
   * elements bound to the same path.
   *
   * Note, if any part in the path except for the last is undefined,
   * this method does nothing (this method does not throw when
   * dereferencing undefined paths).
   *
   * @param path Path to the value
   * to write.  The path may be specified as a string (e.g. <code>'foo.bar.baz'</code>)
   * or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>).  Note that
   * bracketed expressions are not supported; string-based path parts
   * <em>must</em> be separated by dots.  Note that when dereferencing array
   * indices, the index may be used as a dotted part directly
   * (e.g. <code>'users.12.name'</code> or <code>['users', 12, 'name']</code>).
   * @param value Value to set at the specified path.
   */
  void set(String[] path, Any value);

  /**
   * Convenience method for setting a value to a path and notifying any
   * elements bound to the same path.
   *
   * Note, if any part in the path except for the last is undefined,
   * this method does nothing (this method does not throw when
   * dereferencing undefined paths).
   *
   * @param path Path to the value
   * to write.  The path may be specified as a string (e.g. <code>'foo.bar.baz'</code>)
   * or an array of path parts (e.g. <code>['foo.bar', 'baz']</code>).  Note that
   * bracketed expressions are not supported; string-based path parts
   * <em>must</em> be separated by dots.  Note that when dereferencing array
   * indices, the index may be used as a dotted part directly
   * (e.g. <code>'users.12.name'</code> or <code>['users', 12, 'name']</code>).
   * @param value Value to set at the specified path.
   */
  void set(String path, Any value);

  /**
   * Adds items onto the end of the array at the path specified.
   *
   * The arguments after <code>path</code> and return value match that of
   * <code>Array.prototype.push</code>.
   *
   * This method notifies other paths to the same array that a
   * splice occurred to the array.
   *
   * @param path Path to array.
   * @param items Items to push onto array
   * @return New length of the array.
   *
   */
  @JSBody(
      params = {"path", "items"},
      script = "return this.push.apply(this, [path].concat(items))"
  )
  int push(int[] path, Any... items);

  /**
   * Adds items onto the end of the array at the path specified.
   *
   * The arguments after <code>path</code> and return value match that of
   * <code>Array.prototype.push</code>.
   *
   * This method notifies other paths to the same array that a
   * splice occurred to the array.
   *
   * @param path Path to array.
   * @param items Items to push onto array
   * @return New length of the array.
   *
   */
  @JSBody(
      params = {"path", "items"},
      script = "return this.push.apply(this, [path].concat(items))"
  )
  int push(String[] path, Any... items);

  /**
   * Adds items onto the end of the array at the path specified.
   *
   * The arguments after <code>path</code> and return value match that of
   * <code>Array.prototype.push</code>.
   *
   * This method notifies other paths to the same array that a
   * splice occurred to the array.
   *
   * @param path Path to array.
   * @param items Items to push onto array
   * @return New length of the array.
   *
   */
  @JSBody(
      params = {"path", "items"},
      script = "return this.push.apply(this, [path].concat(items))"
  )
  int push(String path, Any... items);

  /**
   * Removes an item from the end of array at the path specified.
   *
   * The arguments after <code>path</code> and return value match that of
   * <code>Array.prototype.pop</code>.
   *
   * This method notifies other paths to the same array that a
   * splice occurred to the array.
   *
   * @param path Path to array.
   * @return Item that was removed.
   *
   */
  Any pop(int[] path);

  /**
   * Removes an item from the end of array at the path specified.
   *
   * The arguments after <code>path</code> and return value match that of
   * <code>Array.prototype.pop</code>.
   *
   * This method notifies other paths to the same array that a
   * splice occurred to the array.
   *
   * @param path Path to array.
   * @return Item that was removed.
   *
   */
  Any pop(String[] path);

  /**
   * Removes an item from the end of array at the path specified.
   *
   * The arguments after <code>path</code> and return value match that of
   * <code>Array.prototype.pop</code>.
   *
   * This method notifies other paths to the same array that a
   * splice occurred to the array.
   *
   * @param path Path to array.
   * @return Item that was removed.
   *
   */
  Any pop(String path);

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
   * @param path Path to array.
   * @param start Index from which to start removing/inserting.
   * @param deleteCount Number of items to remove.
   * @param items Items to insert into array.
   * @return Array of removed items.
   *
   */
  @JSBody(
      params = {"path", "start", "deleteCount", "items"},
      script = "return this.splice.apply(this, [path, start, deleteCount].concat(items))"
  )
  Any[] splice(int[] path, int start, int deleteCount, Any... items);

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
   * @param path Path to array.
   * @param start Index from which to start removing/inserting.
   * @param deleteCount Number of items to remove.
   * @param items Items to insert into array.
   * @return Array of removed items.
   *
   */
  @JSBody(
      params = {"path", "start", "deleteCount", "items"},
      script = "return this.splice.apply(this, [path, start, deleteCount].concat(items))"
  )
  Any[] splice(String[] path, int start, int deleteCount, Any... items);

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
   * @param path Path to array.
   * @param start Index from which to start removing/inserting.
   * @param deleteCount Number of items to remove.
   * @param items Items to insert into array.
   * @return Array of removed items.
   *
   */
  @JSBody(
      params = {"path", "start", "deleteCount", "items"},
      script = "return this.splice.apply(this, [path, start, deleteCount].concat(items))"
  )
  Any[] splice(String path, int start, int deleteCount, Any... items);

  /**
   * Removes an item from the beginning of array at the path specified.
   *
   * The arguments after <code>path</code> and return value match that of
   * <code>Array.prototype.pop</code>.
   *
   * This method notifies other paths to the same array that a
   * splice occurred to the array.
   *
   * @param path Path to array.
   * @return Item that was removed.
   *
   */
  Any shift(int[] path);

  /**
   * Removes an item from the beginning of array at the path specified.
   *
   * The arguments after <code>path</code> and return value match that of
   * <code>Array.prototype.pop</code>.
   *
   * This method notifies other paths to the same array that a
   * splice occurred to the array.
   *
   * @param path Path to array.
   * @return Item that was removed.
   *
   */
  Any shift(String[] path);

  /**
   * Removes an item from the beginning of array at the path specified.
   *
   * The arguments after <code>path</code> and return value match that of
   * <code>Array.prototype.pop</code>.
   *
   * This method notifies other paths to the same array that a
   * splice occurred to the array.
   *
   * @param path Path to array.
   * @return Item that was removed.
   *
   */
  Any shift(String path);

  /**
   * Adds items onto the beginning of the array at the path specified.
   *
   * The arguments after <code>path</code> and return value match that of
   * <code>Array.prototype.push</code>.
   *
   * This method notifies other paths to the same array that a
   * splice occurred to the array.
   *
   * @param path Path to array.
   * @param items Items to insert info array
   * @return New length of the array.
   *
   */
  @JSBody(
      params = {"path", "items"},
      script = "return this.unshift.apply(this, [path].concat(items))"
  )
  int unshift(int[] path, Any... items);

  /**
   * Adds items onto the beginning of the array at the path specified.
   *
   * The arguments after <code>path</code> and return value match that of
   * <code>Array.prototype.push</code>.
   *
   * This method notifies other paths to the same array that a
   * splice occurred to the array.
   *
   * @param path Path to array.
   * @param items Items to insert info array
   * @return New length of the array.
   *
   */
  @JSBody(
      params = {"path", "items"},
      script = "return this.unshift.apply(this, [path].concat(items))"
  )
  int unshift(String[] path, Any... items);

  /**
   * Adds items onto the beginning of the array at the path specified.
   *
   * The arguments after <code>path</code> and return value match that of
   * <code>Array.prototype.push</code>.
   *
   * This method notifies other paths to the same array that a
   * splice occurred to the array.
   *
   * @param path Path to array.
   * @param items Items to insert info array
   * @return New length of the array.
   *
   */
  @JSBody(
      params = {"path", "items"},
      script = "return this.unshift.apply(this, [path].concat(items))"
  )
  int unshift(String path, Any... items);

  /**
   * Notify that a path has changed.
   *
   * Example:
   *
   * <pre><code> this.item.user.name = 'Bob';
   *  this.notifyPath('item.user.name');
   * </code></pre>
   * @param path Path that should be notified.
   * @param value Value at the path (optional).
   *
   */
  void notifyPath(String path, @Nullable Any value);

  /**
   * Notify that a path has changed.
   *
   * Example:
   *
   * <pre><code> this.item.user.name = 'Bob';
   *  this.notifyPath('item.user.name');
   * </code></pre>
   * @param path Path that should be notified.
   */
  void notifyPath(String path);
}
