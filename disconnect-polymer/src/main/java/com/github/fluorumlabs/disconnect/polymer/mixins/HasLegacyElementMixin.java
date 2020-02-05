package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.constants.PolymerType;
import com.github.fluorumlabs.disconnect.polymer.constants.ScrollDirection;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.LegacyElementMixin;
import com.github.fluorumlabs.disconnect.polymer.types.Debouncer;
import com.github.fluorumlabs.disconnect.polymer.types.LegacyEventInit;
import com.github.fluorumlabs.disconnect.polymer.utils.*;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import js.util.function.JsRunnable;
import js.web.dom.*;
import js.web.webcomponents.HTMLTemplateElement;

import javax.annotation.Nullable;

/**
 * Element class mixin that provides Polymer's "legacy" API intended to be
 * backward-compatible to the greatest extent possible with the API
 * found on the Polymer 1.x `Polymer.Base` prototype applied to all elements
 * defined using the `Polymer({...})` function.
 */
@Deprecated
public interface HasLegacyElementMixin<E extends LegacyElementMixin, T extends Component<E>> extends HasElementMixin<E, T>, HasGestureEventListeners<E, T> {
    default boolean isAttached() {
        return getNode().isIsAttached();
    }

    default T isAttached(boolean isAttached) {
        getNode().setIsAttached(isAttached);
        return (T) this;
    }

    /**
     * Return the element whose local dom within which this element
     * is contained. This is a shorthand for
     * `this.getRootNode().host`.
     */
    default Node domHost() {
        return getNode().getDomHost();
    }

    /**
     * Converts a typed JavaScript value to a string.
     * <p>
     * Note this method is provided as backward-compatible legacy API
     * only.  It is not directly called by any Polymer features. To customize
     * how properties are serialized to attributes for attribute bindings and
     * `reflectToAttribute: true` properties as well as this method, override
     * the `_serializeValue` method provided by `Polymer.PropertyAccessors`.
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
     * Note this method is provided as backward-compatible legacy API
     * only.  It is not directly called by any Polymer features.  To customize
     * how attributes are deserialized to properties for in
     * `attributeChangedCallback`, override `_deserializeValue` method
     * provided by `Polymer.PropertyAccessors`.
     *
     * @param value String to deserialize
     * @param type  Type to deserialize the string to
     *
     * @return Returns the deserialized value in the `type` given.
     */
    default Unknown deserialize(String value, PolymerType type) {
        return getNode().deserialize(value, type);
    }

    /**
     * Serializes a property to its associated attribute.
     * <p>
     * Note this method is provided as backward-compatible legacy API
     * only.  It is not directly called by any Polymer features.
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
     * Note this method is provided as backward-compatible legacy API
     * only.  It is not directly called by any Polymer features.
     *
     * @param value     Value to serialize.
     * @param attribute Attribute name to serialize to.
     * @param node      Element to set attribute to.
     */
    default void serializeValueToAttribute(Any value, String attribute, Element node) {
        getNode().serializeValueToAttribute(value, attribute, node);
    }

    /**
     * Calls `importNode` on the `content` of the `template` specified and
     * returns a document fragment containing the imported content.
     *
     * @param template HTML template element to instance.
     *
     * @return Document fragment containing the imported
     *         template content.
     */
    default DocumentFragment instanceTemplate(HTMLTemplateElement template) {
        return getNode().instanceTemplate(template);
    }

    /**
     * Dispatches a custom event with an optional detail value.
     *
     * @param type    Name of event type.
     * @param detail  Detail value containing event-specific
     *                payload.
     * @param options Object specifying options.  These may include:
     *                `bubbles` (boolean, defaults to `true`),
     *                `cancelable` (boolean, defaults to false), and
     *                `node` on which to fire the event (HTMLElement, defaults to `this`).
     *
     * @return The new event that was fired.
     */
    default <DETAIL extends Any> CustomEvent<DETAIL> fire(String type, DETAIL detail, LegacyEventInit options) {
        return getNode().fire(type, detail, options);
    }

    /**
     * Convenience method to add an event listener on a given element,
     * late bound to a named method on this element.
     *
     * @param node       Element to add event listener to.
     * @param eventName  Name of event to listen for.
     * @param methodName Name of handler method on `this` to call.
     */
    default void listen(EventTarget node, String eventName, String methodName) {
        getNode().listen(node, eventName, methodName);
    }

    /**
     * Convenience method to remove an event listener from a given element,
     * late bound to a named method on this element.
     *
     * @param node       Element to remove event listener from.
     * @param eventName  Name of event to stop listening to.
     * @param methodName Name of handler method on `this` to not call
     *                   anymore.
     */
    default void unlisten(EventTarget node, String eventName, String methodName) {
        getNode().unlisten(node, eventName, methodName);
    }

    /**
     * Override scrolling behavior to all direction, one direction, or none.
     * <p>
     * Valid scroll directions:
     * - 'all': scroll in any direction
     * - 'x': scroll only in the 'x' direction
     * - 'y': scroll only in the 'y' direction
     * - 'none': disable scrolling for this node
     *
     * @param direction Direction to allow scrolling
     *                  Defaults to `all`.
     * @param node      Element to apply scroll direction setting.
     *                  Defaults to `this`.
     */
    default void setScrollDirection(ScrollDirection direction, Element node) {
        getNode().setScrollDirection(direction, node);
    }

    /**
     * Convenience method to run `querySelector` on this local DOM scope.
     * <p>
     * This function calls `Polymer.dom(this.root).querySelector(slctr)`.
     *
     * @param slctr Selector to run on this local DOM scope
     *
     * @return Element found by the selector, or null if not found.
     */
    default Element $$(String slctr) {
        return getNode().$$(slctr);
    }

    /**
     * Force this element to distribute its children to its local dom.
     * This should not be necessary as of Polymer 2.0.2 and is provided only
     * for backwards compatibility.
     */
    default void distributeContent() {
        getNode().distributeContent();
    }

    /**
     * Returns a list of nodes that are the effective childNodes. The effective
     * childNodes list is the same as the element's childNodes except that
     * any `<content>` elements are replaced with the list of nodes distributed
     * to the `<content>`, the result of its `getDistributedNodes` method.
     *
     * @return List of effective child nodes.
     */
    default Array<Node> getEffectiveChildNodes() {
        return getNode().getEffectiveChildNodes();
    }

    /**
     * Returns a list of nodes distributed within this element that match
     * `selector`. These can be dom children or elements distributed to
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
     * Returns a list of elements that are the effective children. The effective
     * children list is the same as the element's children except that
     * any `<content>` elements are replaced with the list of elements
     * distributed to the `<content>`.
     *
     * @return List of effective children.
     */
    default Array<Node> getEffectiveChildren() {
        return getNode().getEffectiveChildren();
    }

    /**
     * Returns a string of text content that is the concatenation of the
     * text content's of the element's effective childNodes (the elements
     * returned by <a href="#getEffectiveChildNodes>getEffectiveChildNodes</a>.
     *
     * @return List of effective children.
     */
    default String getEffectiveTextContent() {
        return getNode().getEffectiveTextContent();
    }

    /**
     * Returns the first effective childNode within this element that
     * match `selector`. These can be dom child nodes or elements distributed
     * to children that are insertion points.
     *
     * @param selector Selector to run.
     *
     * @return First effective child node that matches selector.
     */
    default Node queryEffectiveChildren(String selector) {
        return getNode().queryEffectiveChildren(selector);
    }

    /**
     * Returns a list of effective childNodes within this element that
     * match `selector`. These can be dom child nodes or elements distributed
     * to children that are insertion points.
     *
     * @param selector Selector to run.
     *
     * @return List of effective child nodes that match
     *         selector.
     */
    default Array<Node> queryAllEffectiveChildren(String selector) {
        return getNode().queryAllEffectiveChildren(selector);
    }

    /**
     * Returns a list of nodes distributed to this element's `<slot>`.
     * <p>
     * If this element contains more than one `<slot>` in its local DOM,
     * an optional selector may be passed to choose the desired content.
     *
     * @param slctr CSS selector to choose the desired
     *              `<slot>`.  Defaults to `content`.
     *
     * @return List of distributed nodes for the `<slot>`.
     */
    default Array<Node> getContentChildNodes(String slctr) {
        return getNode().getContentChildNodes(slctr);
    }

    /**
     * Returns a list of element children distributed to this element's
     * `<slot>`.
     * <p>
     * If this element contains more than one `<slot>` in its
     * local DOM, an optional selector may be passed to choose the desired
     * content.  This method differs from `getContentChildNodes` in that only
     * elements are returned.
     *
     * @param slctr CSS selector to choose the desired
     *              `<content>`.  Defaults to `content`.
     *
     * @return List of distributed nodes for the
     *         `<slot>`.
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
     * No-op for backwards compatibility. This should now be handled by
     * ShadyCss library.
     *
     * @param container     Container element to scope
     * @param shouldObserve if true, start a mutation observer for added nodes to the container
     *
     * @return Returns a new MutationObserver on `container` if `shouldObserve` is true.
     */
    default MutationObserver scopeSubtree(Element container, boolean shouldObserve) {
        return getNode().scopeSubtree(container, shouldObserve);
    }

    /**
     * Returns the computed style value for the given property.
     *
     * @param property The css property name.
     *
     * @return Returns the computed css property value for the given
     *         `property`.
     */
    default String getComputedStyleValue(String property) {
        return getNode().getComputedStyleValue(property);
    }

    /**
     * Call `debounce` to collapse multiple requests for a named task into
     * one invocation which is made after the wait time has elapsed with
     * no new request.  If no wait time is given, the callback will be called
     * at microtask timing (guaranteed before paint).
     * <p>
     * debouncedClickAction(e) {
     * // will not call `processClick` more than once per 100ms
     * this.debounce('click', function() {
     * this.processClick();
     * } 100);
     * }
     *
     * @param jobName  String to identify the debounce job.
     * @param callback Function that is called (with `this`
     *                 context) when the wait time elapses.
     * @param wait     Optional wait time in milliseconds (ms) after the
     *                 last signal that must elapse before invoking `callback`
     *
     * @return Returns a debouncer object on which exists the
     *         following methods: `isActive()` returns true if the debouncer is
     *         active; `cancel()` cancels the debouncer if it is active;
     *         `flush()` immediately invokes the debounced callback if the debouncer
     *         is active.
     */
    default Debouncer debounce(String jobName, JsRunnable callback, double wait) {
        return getNode().debounce(jobName, callback, wait);
    }

    /**
     * Returns whether a named debouncer is active.
     *
     * @param jobName The name of the debouncer started with `debounce`
     *
     * @return Whether the debouncer is active (has not yet fired).
     */
    default boolean isDebouncerActive(String jobName) {
        return getNode().isDebouncerActive(jobName);
    }

    /**
     * Immediately calls the debouncer `callback` and inactivates it.
     *
     * @param jobName The name of the debouncer started with `debounce`
     */
    default void flushDebouncer(String jobName) {
        getNode().flushDebouncer(jobName);
    }

    /**
     * Cancels an active debouncer.  The `callback` will not be called.
     *
     * @param jobName The name of the debouncer started with `debounce`
     */
    default void cancelDebouncer(String jobName) {
        getNode().cancelDebouncer(jobName);
    }

    /**
     * Runs a callback function asynchronously.
     * <p>
     * By default (if no waitTime is specified), async callbacks are run at
     * microtask timing, which will occur before paint.
     *
     * @param callback The callback function to run, bound to
     *                 `this`.
     * @param waitTime Time to wait before calling the
     *                 `callback`.  If unspecified or 0, the callback will be run at microtask
     *                 timing (before paint).
     *
     * @return Handle that may be used to cancel the async job.
     */
    default TimeOut.Handle async(JsRunnable callback, double waitTime) {
        return getNode().async(callback, waitTime);
    }

    /**
     * Cancels an async operation started with `async`.
     *
     * @param handle Handle returned from original `async` call to
     *               cancel.
     */
    default void cancelAsync(TimeOut.Handle handle) {
        getNode().cancelAsync(handle);
    }

    /**
     * Convenience method for creating an element and configuring it.
     *
     * @param tag   HTML element tag to create.
     * @param props Object of properties to configure on the
     *              instance.
     *
     * @return Newly created and configured element.
     */
    default Element create(String tag, Any props) {
        return getNode().create(tag, props);
    }

    default Element create(String tag) {
        return getNode().create(tag);
    }

    /**
     * Polyfill for Element.prototype.matches, which is sometimes still
     * prefixed.
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
     * @param bool Boolean to force the attribute on or off.
     *             When unspecified, the state of the attribute will be reversed.
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
     * @param bool Boolean to force the class on or off.
     *             When unspecified, the state of the class will be reversed.
     * @param node Node to target.  Defaults to `this`.
     */
    default void toggleClass(String name, boolean bool, Element node) {
        getNode().toggleClass(name, bool, node);
    }

    /**
     * Cross-platform helper for setting an element's CSS `transform` property.
     *
     * @param transformText Transform setting.
     * @param node          Element to apply the transform to.
     *                      Defaults to `this`
     */
    default void transform(String transformText, Element node) {
        getNode().transform(transformText, node);
    }

    /**
     * Cross-platform helper for setting an element's CSS `translate3d`
     * property.
     *
     * @param x    X offset.
     * @param y    Y offset.
     * @param z    Z offset.
     * @param node Element to apply the transform to.
     *             Defaults to `this`.
     */
    default void translate3d(double x, double y, double z, Element node) {
        getNode().translate3d(x, y, z, node);
    }

    default void translate3d(String x, String y, String z, Element node) {
        getNode().translate3d(x, y, z, node);
    }

    /**
     * Removes an item from an array, if it exists.
     * <p>
     * If the array is specified by path, a change notification is
     * generated, so that observers, data bindings and computed
     * properties watching that path can update.
     * <p>
     * If the array is passed directly, **no change
     * notification is generated**.
     *
     * @param arrayOrPath Path to array from
     *                    which to remove the item
     *                    (or the array itself).
     * @param item        Item to remove.
     *
     * @return Array containing item removed.
     */
    default <ITEM extends Any> Array<ITEM> arrayDelete(String arrayOrPath, ITEM item) {
        return getNode().arrayDelete(arrayOrPath, item);
    }

    default <ITEM extends Any> Array<ITEM> arrayDelete(String[] arrayOrPath, ITEM item) {
        return getNode().arrayDelete(arrayOrPath, item);
    }

    default <ITEM extends Any> Array<ITEM> arrayDelete(Unknown[] arrayOrPath, ITEM item) {
        return getNode().arrayDelete(arrayOrPath, item);
    }

    default <ITEM extends Any> Array<ITEM> arrayDelete(Array<Unknown> arrayOrPath, ITEM item) {
        return getNode().arrayDelete(arrayOrPath, item);
    }
}
