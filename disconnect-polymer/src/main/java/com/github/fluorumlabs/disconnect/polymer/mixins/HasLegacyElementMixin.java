package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.constants.PolymerType;
import com.github.fluorumlabs.disconnect.polymer.constants.ScrollDirection;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.LegacyElementMixin;
import com.github.fluorumlabs.disconnect.polymer.types.Debouncer;
import com.github.fluorumlabs.disconnect.polymer.types.LegacyEventInit;
import com.github.fluorumlabs.disconnect.polymer.utils.TimeOut;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import js.util.function.JsRunnable;
import js.web.dom.*;
import js.web.webcomponents.HTMLTemplateElement;

import javax.annotation.Nullable;

/**
 * Element class mixin that provides Polymer's &quot;legacy&quot; API intended to be backward-compatible to the greatest
 * extent possible with the API found on the Polymer 1.x <code>Polymer.Base</code> prototype applied to all elements
 * defined using the <code>Polymer({...})</code> function.
 *
 * @param <E> the type parameter
 * @param <T> the type parameter
 */
@Deprecated
public interface HasLegacyElementMixin<E extends LegacyElementMixin, T extends Component<E>>
		extends HasElementMixin<E, T>, HasGestureEventListeners<E, T> {
	/**
	 * Is attached boolean.
	 *
	 * @return the boolean
	 */
	default boolean isAttached() {
		return getNode().isIsAttached();
	}

	/**
	 * Is attached t.
	 *
	 * @param isAttached the is attached
	 *
	 * @return the t
	 */
	default T isAttached(boolean isAttached) {
		getNode().setIsAttached(isAttached);
		return (T) this;
	}

	/**
	 * Return the element whose local dom within which this element is contained. This is a shorthand for
	 * <code>this.getRootNode().host</code>.
	 *
	 * @return the node
	 */
	default Node domHost() {
		return getNode().getDomHost();
	}

	/**
	 * Converts a typed JavaScript value to a string.
	 * <p>
	 * Note this method is provided as backward-compatible legacy API only.  It is not directly called by any Polymer
	 * features. To customize how properties are serialized to attributes for attribute bindings and
	 * <code>reflectToAttribute: true</code> properties as well as this method, override
	 * the <code>_serializeValue</code> method provided by <code>Polymer.PropertyAccessors</code>.
	 *
	 * @param value Value to deserialize
	 *
	 * @return Serialized value
	 */
	@Nullable
	default String serialize(Any value) {
		return getNode().serialize(value);
	}

	/**
	 * Converts a string to a typed JavaScript value.
	 * <p>
	 * Note this method is provided as backward-compatible legacy API only.  It is not directly called by any Polymer
	 * features.  To customize how attributes are deserialized to properties for in
	 * <code>attributeChangedCallback</code>, override <code>_deserializeValue</code> method
	 * provided by <code>Polymer.PropertyAccessors</code>.
	 *
	 * @param value String to deserialize
	 * @param type  Type to deserialize the string to
	 *
	 * @return Returns the deserialized value in the <code>type</code> given.
	 */
	default Unknown deserialize(String value, PolymerType type) {
		return getNode().deserialize(value, type);
	}

	/**
	 * Serializes a property to its associated attribute.
	 * <p>
	 * Note this method is provided as backward-compatible legacy API only.  It is not directly called by any Polymer
	 * features.
	 *
	 * @param property  Property name to reflect.
	 * @param attribute Attribute name to reflect.
	 * @param value     Property value to reflect.
	 */
	default void reflectPropertyToAttribute(String property, String attribute, Any value) {
		getNode().reflectPropertyToAttribute(property, attribute, value);
	}

	/**
	 * Sets a typed value to an HTML attribute on a node.
	 * <p>
	 * Note this method is provided as backward-compatible legacy API only.  It is not directly called by any Polymer
	 * features.
	 *
	 * @param value     Value to serialize.
	 * @param attribute Attribute name to serialize to.
	 * @param node      Element to set attribute to.
	 */
	default void serializeValueToAttribute(Any value, String attribute, Element node) {
		getNode().serializeValueToAttribute(value, attribute, node);
	}

	/**
	 * Copies own properties (including accessor descriptors) from a source object to a target object.
	 *
	 * @param prototype Target object to copy properties to.
	 * @param api       Source object to copy properties from.
	 *
	 * @return prototype object that was passed as first argument.
	 */
	default Unknown extend(Unknown prototype, Unknown api) {
		return getNode().extend(prototype, api);
	}

	/**
	 * FIXME return !Object
	 * <p>
	 * FIXME param target: !Object FIXME param source: !ObjectCopies props from a source object to a target object.
	 * <p>
	 * Note, this method uses a simple <code>for...in</code> strategy for enumerating properties.  To ensure only
	 * <code>ownProperties</code> are copied from source to target and that accessor implementations are copied, use
	 * <code>extend</code>.
	 *
	 * @param target Target object to copy properties to.
	 * @param source Source object to copy properties from.
	 *
	 * @return Target object that was passed as first argument.
	 */
	default Unknown mixin(Unknown target, Unknown source) {
		return getNode().mixin(target, source);
	}

	/**
	 * FIXME return Object
	 * <p>
	 * FIXME param object: Object FIXME param prototype: ObjectSets the prototype of an object.
	 * <p>
	 * Note this method is provided as backward-compatible legacy API only.  It is not directly called by any Polymer
	 * features.
	 *
	 * @param object    The object on which to set the prototype.
	 * @param prototype The prototype that will be set on the given                  <code>object</code>.
	 *
	 * @return Returns the given <code>object</code> with its prototype set 		to the given
	 * 		<code>prototype</code> object.
	 */
	default Unknown chainObject(Unknown object, Unknown prototype) {
		return getNode().chainObject(object, prototype);
	}

	/**
	 * Calls <code>importNode</code> on the <code>content</code> of the <code>template</code> specified and returns a
	 * document fragment containing the imported content.
	 *
	 * @param template HTML template element to instance.
	 *
	 * @return Document fragment containing the imported 		template content.
	 */
	default DocumentFragment instanceTemplate(HTMLTemplateElement template) {
		return getNode().instanceTemplate(template);
	}

	/**
	 * Dispatches a custom event with an optional detail value.
	 *
	 * @param <DETAIL> the type parameter
	 * @param type     Name of event type.
	 * @param detail   Detail value containing event-specific                payload.
	 * @param options  Object specifying options.  These may include:                <code>bubbles</code> (boolean,
	 *                 defaults to <code>true</code>),                <code>cancelable</code> (boolean, defaults to
	 *                 false), and                <code>node</code> on which to fire the event (HTMLElement,
	 *                 defaults to
	 *                 <code>this</code>).
	 *
	 * @return The new event that was fired.
	 */
	default <DETAIL extends Any> CustomEvent<DETAIL> fire(String type, DETAIL detail, LegacyEventInit options) {
		return getNode().fire(type, detail, options);
	}

	/**
	 * Convenience method to add an event listener on a given element, late bound to a named method on this element.
	 *
	 * @param node       Element to add event listener to.
	 * @param eventName  Name of event to listen for.
	 * @param methodName Name of handler method on <code>this</code> to call.
	 */
	default void listen(EventTarget node, String eventName, String methodName) {
		getNode().listen(node, eventName, methodName);
	}

	/**
	 * Convenience method to remove an event listener from a given element, late bound to a named method on this
	 * element.
	 *
	 * @param node       Element to remove event listener from.
	 * @param eventName  Name of event to stop listening to.
	 * @param methodName Name of handler method on <code>this</code> to not call                   anymore.
	 */
	default void unlisten(EventTarget node, String eventName, String methodName) {
		getNode().unlisten(node, eventName, methodName);
	}

	/**
	 * Override scrolling behavior to all direction, one direction, or none.
	 * <p>
	 * Valid scroll directions:
	 *
	 * <ul>
	 * <li>'all': scroll in any direction</li>
	 * <li>'x': scroll only in the 'x' direction</li>
	 * <li>'y': scroll only in the 'y' direction</li>
	 * <li>'none': disable scrolling for this node</li>
	 * </ul>
	 *
	 * @param direction Direction to allow scrolling                  Defaults to <code>all</code>.
	 * @param node      Element to apply scroll direction setting.                  Defaults to <code>this</code>.
	 */
	default void setScrollDirection(ScrollDirection direction, Element node) {
		getNode().setScrollDirection(direction, node);
	}

	/**
	 * Convenience method to run <code>querySelector</code> on this local DOM scope.
	 * <p>
	 * This function calls <code>Polymer.dom(this.root).querySelector(slctr)</code>.
	 *
	 * @param slctr Selector to run on this local DOM scope
	 *
	 * @return Element found by the selector, or null if not found.
	 */
	default Element $$(String slctr) {
		return getNode().$$(slctr);
	}

	/**
	 * Force this element to distribute its children to its local dom. This should not be necessary as of Polymer 2.0.2
	 * and is provided only for backwards compatibility.
	 */
	default void distributeContent() {
		getNode().distributeContent();
	}

	/**
	 * Returns a list of nodes that are the effective childNodes. The effective childNodes list is the same as the
	 * element's childNodes except that any <code>&lt;content&gt;</code> elements are replaced with the list of nodes
	 * distributed to the <code>&lt;content&gt;</code>, the result of its <code>getDistributedNodes</code> method.
	 *
	 * @return List of effective child nodes.
	 */
	default Array<Node> getEffectiveChildNodes() {
		return getNode().getEffectiveChildNodes();
	}

	/**
	 * Returns a list of nodes distributed within this element that match
	 * <code>selector</code>. These can be dom children or elements distributed to
	 * children that are insertion points.
	 *
	 * @param selector Selector to run.
	 *
	 * @return List of distributed elements that match selector.
	 */
	default Array<Node> queryDistributedElements(String selector) {
		return getNode().queryDistributedElements(selector);
	}

	/**
	 * Returns a list of elements that are the effective children. The effective children list is the same as the
	 * element's children except that any <code>&lt;content&gt;</code> elements are replaced with the list of elements
	 * distributed to the <code>&lt;content&gt;</code>.
	 *
	 * @return List of effective children.
	 */
	default Array<Node> getEffectiveChildren() {
		return getNode().getEffectiveChildren();
	}

	/**
	 * Returns a string of text content that is the concatenation of the text content's of the element's effective
	 * childNodes (the elements returned by &lt;a href=&quot;#getEffectiveChildNodes&gt;getEffectiveChildNodes&lt;
	 * /a&gt;.
	 *
	 * @return List of effective children.
	 */
	default String getEffectiveTextContent() {
		return getNode().getEffectiveTextContent();
	}

	/**
	 * Returns the first effective childNode within this element that match <code>selector</code>. These can be dom
	 * child nodes or elements distributed to children that are insertion points.
	 *
	 * @param selector Selector to run.
	 *
	 * @return First effective child node that matches selector.
	 */
	default Node queryEffectiveChildren(String selector) {
		return getNode().queryEffectiveChildren(selector);
	}

	/**
	 * Returns a list of effective childNodes within this element that match <code>selector</code>. These can be dom
	 * child nodes or elements distributed to children that are insertion points.
	 *
	 * @param selector Selector to run.
	 *
	 * @return List of effective child nodes that match 		selector.
	 */
	default Array<Node> queryAllEffectiveChildren(String selector) {
		return getNode().queryAllEffectiveChildren(selector);
	}

	/**
	 * Returns a list of nodes distributed to this element's <code>&lt;slot&gt;</code>.
	 * <p>
	 * If this element contains more than one <code>&lt;slot&gt;</code> in its local DOM, an optional selector may be
	 * passed to choose the desired content.
	 *
	 * @param slctr CSS selector to choose the desired              <code>&lt;slot&gt;</code>.  Defaults to
	 *              <code>content</code>.
	 *
	 * @return List of distributed nodes for the <code>&lt;slot&gt;</code>.
	 */
	default Array<Node> getContentChildNodes(String slctr) {
		return getNode().getContentChildNodes(slctr);
	}

	/**
	 * Returns a list of element children distributed to this element's
	 * <code>&lt;slot&gt;</code>.
	 * <p>
	 * If this element contains more than one <code>&lt;slot&gt;</code> in its local DOM, an optional selector may be
	 * passed to choose the desired content.  This method differs from <code>getContentChildNodes</code> in that only
	 * elements are returned.
	 *
	 * @param slctr CSS selector to choose the desired              <code>&lt;content&gt;</code>.  Defaults to
	 *              <code>content</code>.
	 *
	 * @return List of distributed nodes for the 		<code>&lt;slot&gt;</code>.
	 */
	default Array<HTMLElement> getContentChildren(String slctr) {
		return getNode().getContentChildren(slctr);
	}

	/**
	 * Checks whether an element is in this element's light DOM tree.
	 *
	 * @param node The element to be checked.
	 *
	 * @return true if node is in this element's light DOM tree.
	 */
	default boolean isLightDescendant(Node node) {
		return getNode().isLightDescendant(node);
	}

	/**
	 * Checks whether an element is in this element's local DOM tree.
	 *
	 * @param node The element to be checked.
	 *
	 * @return true if node is in this element's local DOM tree.
	 */
	default boolean isLocalDescendant(Element node) {
		return getNode().isLocalDescendant(node);
	}

	/**
	 * No-op for backwards compatibility. This should now be handled by ShadyCss library.
	 *
	 * @param container     Container element to scope
	 * @param shouldObserve if true, start a mutation observer for added nodes to the container
	 *
	 * @return Returns a new MutationObserver on <code>container</code> if <code>shouldObserve</code> is true.
	 */
	default MutationObserver scopeSubtree(Element container, boolean shouldObserve) {
		return getNode().scopeSubtree(container, shouldObserve);
	}

	/**
	 * Returns the computed style value for the given property.
	 *
	 * @param property The css property name.
	 *
	 * @return Returns the computed css property value for the given 		<code>property</code>.
	 */
	default String getComputedStyleValue(String property) {
		return getNode().getComputedStyleValue(property);
	}

	/**
	 * Call <code>debounce</code> to collapse multiple requests for a named task into one invocation which is made
	 * after
	 * the wait time has elapsed with no new request.  If no wait time is given, the callback will be called at
	 * microtask timing (guaranteed before paint).
	 *
	 * <pre><code>debouncedClickAction(e) {
	 *   // will not call `processClick` more than once per 100ms
	 *   this.debounce('click', function() {
	 *    this.processClick();
	 *   } 100);
	 * }
	 * </code></pre>
	 *
	 * @param jobName  String to identify the debounce job.
	 * @param callback Function that is called (with <code>this</code>                 context) when the wait time
	 *                 elapses.
	 * @param wait     Optional wait time in milliseconds (ms) after the                 last signal that must elapse
	 *                 before invoking <code>callback</code>
	 *
	 * @return Returns a debouncer object on which exists the 		following methods: <code>isActive()</code> returns
	 * true
	 * 		if the debouncer is 		active; <code>cancel()</code> cancels the debouncer if it is active;
	 * 		<code>flush()</code> immediately invokes the debounced callback if the debouncer 		is active.
	 */
	default Debouncer debounce(String jobName, JsRunnable callback, double wait) {
		return getNode().debounce(jobName, callback, wait);
	}

	/**
	 * Returns whether a named debouncer is active.
	 *
	 * @param jobName The name of the debouncer started with <code>debounce</code>
	 *
	 * @return Whether the debouncer is active (has not yet fired).
	 */
	default boolean isDebouncerActive(String jobName) {
		return getNode().isDebouncerActive(jobName);
	}

	/**
	 * Immediately calls the debouncer <code>callback</code> and inactivates it.
	 *
	 * @param jobName The name of the debouncer started with <code>debounce</code>
	 */
	default void flushDebouncer(String jobName) {
		getNode().flushDebouncer(jobName);
	}

	/**
	 * Cancels an active debouncer.  The <code>callback</code> will not be called.
	 *
	 * @param jobName The name of the debouncer started with <code>debounce</code>
	 */
	default void cancelDebouncer(String jobName) {
		getNode().cancelDebouncer(jobName);
	}

	/**
	 * Runs a callback function asynchronously.
	 * <p>
	 * By default (if no waitTime is specified), async callbacks are run at microtask timing, which will occur before
	 * paint.
	 *
	 * @param callback The callback function to run, bound to                 <code>this</code>.
	 * @param waitTime Time to wait before calling the                 <code>callback</code>.  If unspecified or 0, the
	 *                 callback will be run at microtask                 timing (before paint).
	 *
	 * @return Handle that may be used to cancel the async job.
	 */
	default TimeOut.Handle async(JsRunnable callback, double waitTime) {
		return getNode().async(callback, waitTime);
	}

	/**
	 * Cancels an async operation started with <code>async</code>.
	 *
	 * @param handle Handle returned from original <code>async</code> call to               cancel.
	 */
	default void cancelAsync(TimeOut.Handle handle) {
		getNode().cancelAsync(handle);
	}

	/**
	 * Convenience method for creating an element and configuring it.
	 *
	 * @param tag   HTML element tag to create.
	 * @param props Object of properties to configure on the              instance.
	 *
	 * @return Newly created and configured element.
	 */
	default Element create(String tag, Any props) {
		return getNode().create(tag, props);
	}

	/**
	 * Create element.
	 *
	 * @param tag the tag
	 *
	 * @return the element
	 */
	default Element create(String tag) {
		return getNode().create(tag);
	}

	/**
	 * Polyfill for Element.prototype.matches, which is sometimes still prefixed.
	 *
	 * @param selector Selector to test.
	 * @param node     Element to test the selector against.
	 *
	 * @return Whether the element matches the selector.
	 */
	default boolean elementMatches(String selector, Element node) {
		return getNode().elementMatches(selector, node);
	}

	/**
	 * Toggles an HTML attribute on or off.
	 *
	 * @param name HTML attribute name
	 * @param bool Boolean to force the attribute on or off.             When unspecified, the state of the attribute
	 *             will be reversed.
	 *
	 * @return true if the attribute now exists
	 */
	default boolean toggleAttribute(String name, boolean bool) {
		return getNode().toggleAttribute(name, bool);
	}

	/**
	 * Toggles a CSS class on or off.
	 *
	 * @param name CSS class name
	 * @param bool Boolean to force the class on or off.             When unspecified, the state of the class will be
	 *             reversed.
	 * @param node Node to target.  Defaults to <code>this</code>.
	 */
	default void toggleClass(String name, boolean bool, Element node) {
		getNode().toggleClass(name, bool, node);
	}

	/**
	 * Cross-platform helper for setting an element's CSS <code>transform</code> property.
	 *
	 * @param transformText Transform setting.
	 * @param node          Element to apply the transform to.                      Defaults to <code>this</code>
	 */
	default void transform(String transformText, Element node) {
		getNode().transform(transformText, node);
	}

	/**
	 * Cross-platform helper for setting an element's CSS <code>translate3d</code> property.
	 *
	 * @param x    X offset.
	 * @param y    Y offset.
	 * @param z    Z offset.
	 * @param node Element to apply the transform to.             Defaults to <code>this</code>.
	 */
	default void translate3d(double x, double y, double z, Element node) {
		getNode().translate3d(x, y, z, node);
	}

	/**
	 * Translate 3 d.
	 *
	 * @param x    the x
	 * @param y    the y
	 * @param z    the z
	 * @param node the node
	 */
	default void translate3d(String x, String y, String z, Element node) {
		getNode().translate3d(x, y, z, node);
	}

	/**
	 * Removes an item from an array, if it exists.
	 * <p>
	 * If the array is specified by path, a change notification is generated, so that observers, data bindings and
	 * computed properties watching that path can update.
	 * <p>
	 * If the array is passed directly, <strong>no change notification is generated</strong>.
	 *
	 * @param <ITEM>      the type parameter
	 * @param arrayOrPath Path to array from                    which to remove the item                    (or the
	 *                    array itself).
	 * @param item        Item to remove.
	 *
	 * @return Array containing item removed.
	 */
	default <ITEM extends Any> Array<ITEM> arrayDelete(String arrayOrPath, ITEM item) {
		return getNode().arrayDelete(arrayOrPath, item);
	}

	/**
	 * Array delete array.
	 *
	 * @param <ITEM>      the type parameter
	 * @param arrayOrPath the array or path
	 * @param item        the item
	 *
	 * @return the array
	 */
	default <ITEM extends Any> Array<ITEM> arrayDelete(String[] arrayOrPath, ITEM item) {
		return getNode().arrayDelete(arrayOrPath, item);
	}

	/**
	 * Array delete array.
	 *
	 * @param <ITEM>      the type parameter
	 * @param arrayOrPath the array or path
	 * @param item        the item
	 *
	 * @return the array
	 */
	default <ITEM extends Any> Array<ITEM> arrayDelete(Unknown[] arrayOrPath, ITEM item) {
		return getNode().arrayDelete(arrayOrPath, item);
	}

	/**
	 * Array delete array.
	 *
	 * @param <ITEM>      the type parameter
	 * @param arrayOrPath the array or path
	 * @param item        the item
	 *
	 * @return the array
	 */
	default <ITEM extends Any> Array<ITEM> arrayDelete(Array<Unknown> arrayOrPath, ITEM item) {
		return getNode().arrayDelete(arrayOrPath, item);
	}
}
