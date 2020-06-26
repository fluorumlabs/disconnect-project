package js.lang.external.polymer.legacy;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.external.polymer.mixins.*;
import js.web.dom.*;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"LegacyElementMixin as LegacyElementMixin_LegacyElementMixin"},
    module = "@polymer/polymer/lib/legacy/legacy-element-mixin.js"
)
@Import(
    module = "@polymer/polymer/lib/legacy/legacy-element-mixin.js"
)
public interface LegacyElementMixin extends GestureEventListeners, DirMixin, TemplateStamp, PropertiesMixin, PropertyEffects, ElementMixin, PropertyAccessors, PropertiesChanged {
  /**
   * Element class mixin that provides Polymer's &quot;legacy&quot; API intended to be
   * backward-compatible to the greatest extent possible with the API
   * found on the Polymer 1.x <code>Polymer.Base</code> prototype applied to all elements
   * defined using the <code>Polymer({...})</code> function.
   *
   */
  @JSBody(
      params = {"base"},
      script = "return LegacyElementMixin_LegacyElementMixin(base)"
  )
  static <T extends JsFunction> Any LegacyElementMixin(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSProperty("isAttached")
  boolean getIsAttached();

  @JSProperty("isAttached")
  void setIsAttached(boolean value);

  /**
   * Return the element whose local dom within which this element
   * is contained. This is a shorthand for
   * <code>this.getRootNode().host</code>.
   *
   */
  @JSProperty("domHost")
  @Nullable
  Node getDomHost();

  @JSProperty("is")
  String getIs();

  @JSProperty("is")
  void setIs(String value);

  /**
   * Overrides the default <code>Polymer.PropertyEffects</code> implementation to
   * add support for installing <code>hostAttributes</code> and <code>listeners</code>.
   *
   */
  void ready();

  /**
   * Legacy callback called during the <code>constructor</code>, for overriding
   * by the user.
   *
   */
  void created();

  /**
   * Sets the value of an attribute.
   * @param name The name of the attribute to change.
   * @param value The new attribute value.
   *
   */
  void setAttribute(String name, String value);

  /**
   * Removes an attribute.
   *
   * @param name The name of the attribute to remove.
   *
   */
  void removeAttribute(String name);

  /**
   * Legacy callback called during <code>connectedCallback</code>, for overriding
   * by the user.
   *
   */
  void attached();

  /**
   * Legacy callback called during <code>disconnectedCallback</code>, for overriding
   * by the user.
   *
   */
  void detached();

  /**
   * Legacy callback called during <code>attributeChangedChallback</code>, for overriding
   * by the user.
   *
   * @param name Name of attribute.
   * @param old Old value of attribute.
   * @param value Current value of attribute.
   *
   */
  void attributeChanged(String name, @Nullable String old, @Nullable String value);

  /**
   * Legacy callback called during <code>attributeChangedChallback</code>, for overriding
   * by the user.
   *
   * @param name Name of attribute.
   * @param old Old value of attribute.
   */
  void attributeChanged(String name, @Nullable String old);

  /**
   * Legacy callback called during <code>attributeChangedChallback</code>, for overriding
   * by the user.
   *
   * @param name Name of attribute.
   */
  void attributeChanged(String name);

  /**
   * Converts a typed JavaScript value to a string.
   *
   * Note this method is provided as backward-compatible legacy API
   * only.  It is not directly called by any Polymer features. To customize
   * how properties are serialized to attributes for attribute bindings and
   * <code>reflectToAttribute: true</code> properties as well as this method, override
   * the <code>_serializeValue</code> method provided by <code>Polymer.PropertyAccessors</code>.
   *
   * @param value Value to deserialize
   * @return Serialized value
   *
   */
  @Nullable
  String serialize(Any value);

  /**
   * Converts a string to a typed JavaScript value.
   *
   * Note this method is provided as backward-compatible legacy API
   * only.  It is not directly called by any Polymer features.  To customize
   * how attributes are deserialized to properties for in
   * <code>attributeChangedCallback</code>, override <code>_deserializeValue</code> method
   * provided by <code>Polymer.PropertyAccessors</code>.
   *
   * @param value String to deserialize
   * @param type Type to deserialize the string to
   * @return Returns the deserialized value in the <code>type</code> given.
   *
   */
  Any deserialize(String value, Any type);

  /**
   * Serializes a property to its associated attribute.
   *
   * Note this method is provided as backward-compatible legacy API
   * only.  It is not directly called by any Polymer features.
   *
   * @param property Property name to reflect.
   * @param attribute Attribute name to reflect.
   * @param value Property value to reflect.
   *
   */
  void reflectPropertyToAttribute(String property, @Nullable String attribute, @Nullable Any value);

  /**
   * Serializes a property to its associated attribute.
   *
   * Note this method is provided as backward-compatible legacy API
   * only.  It is not directly called by any Polymer features.
   *
   * @param property Property name to reflect.
   * @param attribute Attribute name to reflect.
   */
  void reflectPropertyToAttribute(String property, @Nullable String attribute);

  /**
   * Serializes a property to its associated attribute.
   *
   * Note this method is provided as backward-compatible legacy API
   * only.  It is not directly called by any Polymer features.
   *
   * @param property Property name to reflect.
   */
  void reflectPropertyToAttribute(String property);

  /**
   * Sets a typed value to an HTML attribute on a node.
   *
   * Note this method is provided as backward-compatible legacy API
   * only.  It is not directly called by any Polymer features.
   *
   * @param value Value to serialize.
   * @param attribute Attribute name to serialize to.
   * @param node Element to set attribute to.
   *
   */
  void serializeValueToAttribute(Any value, String attribute, @Nullable Element node);

  /**
   * Sets a typed value to an HTML attribute on a node.
   *
   * Note this method is provided as backward-compatible legacy API
   * only.  It is not directly called by any Polymer features.
   *
   * @param value Value to serialize.
   * @param attribute Attribute name to serialize to.
   */
  void serializeValueToAttribute(Any value, String attribute);

  /**
   * Copies own properties (including accessor descriptors) from a source
   * object to a target object.
   *
   * @param prototype Target object to copy properties to.
   * @param api Source object to copy properties from.
   * @return prototype object that was passed as first argument.
   *
   */
  @Nullable
  Any extend(@Nullable Any prototype, @Nullable Any api);

  /**
   * Copies own properties (including accessor descriptors) from a source
   * object to a target object.
   *
   * @param prototype Target object to copy properties to.
   * @return prototype object that was passed as first argument.
   *
   */
  @Nullable
  Any extend(@Nullable Any prototype);

  /**
   * Copies own properties (including accessor descriptors) from a source
   * object to a target object.
   *
   * @return prototype object that was passed as first argument.
   *
   */
  @Nullable
  Any extend();

  /**
   * Copies props from a source object to a target object.
   *
   * Note, this method uses a simple <code>for...in</code> strategy for enumerating
   * properties.  To ensure only <code>ownProperties</code> are copied from source
   * to target and that accessor implementations are copied, use <code>extend</code>.
   *
   * @param target Target object to copy properties to.
   * @param source Source object to copy properties from.
   * @return Target object that was passed as first argument.
   *
   */
  Any mixin(Any target, Any source);

  /**
   * Sets the prototype of an object.
   *
   * Note this method is provided as backward-compatible legacy API
   * only.  It is not directly called by any Polymer features.
   *
   * @param object The object on which to set the prototype.
   * @param prototype The prototype that will be set on the given
   * <code>object</code>.
   * @return Returns the given <code>object</code> with its prototype set
   * to the given <code>prototype</code> object.
   *
   */
  @Nullable
  Any chainObject(@Nullable Any object, @Nullable Any prototype);

  /**
   * Sets the prototype of an object.
   *
   * Note this method is provided as backward-compatible legacy API
   * only.  It is not directly called by any Polymer features.
   *
   * @param object The object on which to set the prototype.
   * @return Returns the given <code>object</code> with its prototype set
   * to the given <code>prototype</code> object.
   *
   */
  @Nullable
  Any chainObject(@Nullable Any object);

  /**
   * Sets the prototype of an object.
   *
   * Note this method is provided as backward-compatible legacy API
   * only.  It is not directly called by any Polymer features.
   *
   * @return Returns the given <code>object</code> with its prototype set
   * to the given <code>prototype</code> object.
   *
   */
  @Nullable
  Any chainObject();

  /**
   * Calls <code>importNode</code> on the <code>content</code> of the <code>template</code> specified and
   * returns a document fragment containing the imported content.
   *
   * @param template HTML template element to instance.
   * @return Document fragment containing the imported
   * template content.
   *
   */
  DocumentFragment instanceTemplate(@Nullable HTMLTemplateElement template);

  /**
   * Calls <code>importNode</code> on the <code>content</code> of the <code>template</code> specified and
   * returns a document fragment containing the imported content.
   *
   * @return Document fragment containing the imported
   * template content.
   *
   */
  DocumentFragment instanceTemplate();

  /**
   * Dispatches a custom event with an optional detail value.
   *
   * @param type Name of event type.
   * @param detail Detail value containing event-specific
   * payload.
   * @param options Object specifying options.  These may include:
   * <code>bubbles</code> (boolean, defaults to <code>true</code>),
   * <code>cancelable</code> (boolean, defaults to false), and
   * <code>node</code> on which to fire the event (HTMLElement, defaults to <code>this</code>).
   * @return The new event that was fired.
   *
   */
  Event fire(String type, @Nullable Any detail, @Nullable FireOptions options);

  /**
   * Dispatches a custom event with an optional detail value.
   *
   * @param type Name of event type.
   * @param detail Detail value containing event-specific
   * payload.
   * @return The new event that was fired.
   *
   */
  Event fire(String type, @Nullable Any detail);

  /**
   * Dispatches a custom event with an optional detail value.
   *
   * @param type Name of event type.
   * @return The new event that was fired.
   *
   */
  Event fire(String type);

  /**
   * Convenience method to add an event listener on a given element,
   * late bound to a named method on this element.
   *
   * @param node Element to add event listener to.
   * @param eventName Name of event to listen for.
   * @param methodName Name of handler method on <code>this</code> to call.
   *
   */
  void listen(@Nullable EventTarget node, String eventName, String methodName);

  /**
   * Convenience method to remove an event listener from a given element,
   * late bound to a named method on this element.
   *
   * @param node Element to remove event listener from.
   * @param eventName Name of event to stop listening to.
   * @param methodName Name of handler method on <code>this</code> to not call
   * anymore.
   *
   */
  void unlisten(@Nullable EventTarget node, String eventName, String methodName);

  /**
   * Override scrolling behavior to all direction, one direction, or none.
   *
   * Valid scroll directions:
   *
   * <ul>
   * <li>'all': scroll in any direction</li>
   * <li>'x': scroll only in the 'x' direction</li>
   * <li>'y': scroll only in the 'y' direction</li>
   * <li>'none': disable scrolling for this node</li>
   * </ul>
   * @param direction Direction to allow scrolling
   * Defaults to <code>all</code>.
   * @param node Element to apply scroll direction setting.
   * Defaults to <code>this</code>.
   *
   */
  void setScrollDirection(@Nullable String direction, @Nullable Element node);

  /**
   * Override scrolling behavior to all direction, one direction, or none.
   *
   * Valid scroll directions:
   *
   * <ul>
   * <li>'all': scroll in any direction</li>
   * <li>'x': scroll only in the 'x' direction</li>
   * <li>'y': scroll only in the 'y' direction</li>
   * <li>'none': disable scrolling for this node</li>
   * </ul>
   * @param direction Direction to allow scrolling
   * Defaults to <code>all</code>.
   */
  void setScrollDirection(@Nullable String direction);

  /**
   * Override scrolling behavior to all direction, one direction, or none.
   *
   * Valid scroll directions:
   *
   * <ul>
   * <li>'all': scroll in any direction</li>
   * <li>'x': scroll only in the 'x' direction</li>
   * <li>'y': scroll only in the 'y' direction</li>
   * <li>'none': disable scrolling for this node</li>
   * </ul>
   */
  void setScrollDirection();

  /**
   * Convenience method to run <code>querySelector</code> on this local DOM scope.
   *
   * This function calls <code>Polymer.dom(this.root).querySelector(slctr)</code>.
   *
   * @param slctr Selector to run on this local DOM scope
   * @return Element found by the selector, or null if not found.
   *
   */
  @Nullable
  Element $$(String slctr);

  /**
   * Force this element to distribute its children to its local dom.
   * This should not be necessary as of Polymer 2.0.2 and is provided only
   * for backwards compatibility.
   *
   */
  void distributeContent();

  /**
   * Returns a list of nodes that are the effective childNodes. The effective
   * childNodes list is the same as the element's childNodes except that
   * any <code>&lt;content&gt;</code> elements are replaced with the list of nodes distributed
   * to the <code>&lt;content&gt;</code>, the result of its <code>getDistributedNodes</code> method.
   *
   * @return List of effective child nodes.
   *
   */
  Node[] getEffectiveChildNodes();

  /**
   * Returns a list of nodes distributed within this element that match
   * <code>selector</code>. These can be dom children or elements distributed to
   * children that are insertion points.
   *
   * @param selector Selector to run.
   * @return List of distributed elements that match selector.
   *
   */
  Node[] queryDistributedElements(String selector);

  /**
   * Returns a list of elements that are the effective children. The effective
   * children list is the same as the element's children except that
   * any <code>&lt;content&gt;</code> elements are replaced with the list of elements
   * distributed to the <code>&lt;content&gt;</code>.
   *
   * @return List of effective children.
   *
   */
  Node[] getEffectiveChildren();

  /**
   * Returns a string of text content that is the concatenation of the
   * text content's of the element's effective childNodes (the elements
   * returned by &lt;a href=&quot;#getEffectiveChildNodes&gt;getEffectiveChildNodes</a>.
   *
   * @return List of effective children.
   *
   */
  String getEffectiveTextContent();

  /**
   * Returns the first effective childNode within this element that
   * match <code>selector</code>. These can be dom child nodes or elements distributed
   * to children that are insertion points.
   *
   * @param selector Selector to run.
   * @return First effective child node that matches selector.
   *
   */
  @Nullable
  Node queryEffectiveChildren(String selector);

  /**
   * Returns a list of effective childNodes within this element that
   * match <code>selector</code>. These can be dom child nodes or elements distributed
   * to children that are insertion points.
   *
   * @param selector Selector to run.
   * @return List of effective child nodes that match
   * selector.
   *
   */
  Node[] queryAllEffectiveChildren(String selector);

  /**
   * Returns a list of nodes distributed to this element's <code>&lt;slot&gt;</code>.
   *
   * If this element contains more than one <code>&lt;slot&gt;</code> in its local DOM,
   * an optional selector may be passed to choose the desired content.
   *
   * @param slctr CSS selector to choose the desired
   * <code>&lt;slot&gt;</code>.  Defaults to <code>content</code>.
   * @return List of distributed nodes for the <code>&lt;slot&gt;</code>.
   *
   */
  Node[] getContentChildNodes(@Nullable String slctr);

  /**
   * Returns a list of nodes distributed to this element's <code>&lt;slot&gt;</code>.
   *
   * If this element contains more than one <code>&lt;slot&gt;</code> in its local DOM,
   * an optional selector may be passed to choose the desired content.
   *
   * @return List of distributed nodes for the <code>&lt;slot&gt;</code>.
   *
   */
  Node[] getContentChildNodes();

  /**
   * Returns a list of element children distributed to this element's
   * <code>&lt;slot&gt;</code>.
   *
   * If this element contains more than one <code>&lt;slot&gt;</code> in its
   * local DOM, an optional selector may be passed to choose the desired
   * content.  This method differs from <code>getContentChildNodes</code> in that only
   * elements are returned.
   *
   * @param slctr CSS selector to choose the desired
   * <code>&lt;content&gt;</code>.  Defaults to <code>content</code>.
   * @return List of distributed nodes for the
   * <code>&lt;slot&gt;</code>.
   *
   */
  HTMLElement[] getContentChildren(@Nullable String slctr);

  /**
   * Returns a list of element children distributed to this element's
   * <code>&lt;slot&gt;</code>.
   *
   * If this element contains more than one <code>&lt;slot&gt;</code> in its
   * local DOM, an optional selector may be passed to choose the desired
   * content.  This method differs from <code>getContentChildNodes</code> in that only
   * elements are returned.
   *
   * @return List of distributed nodes for the
   * <code>&lt;slot&gt;</code>.
   *
   */
  HTMLElement[] getContentChildren();

  /**
   * Checks whether an element is in this element's light DOM tree.
   *
   * @param node The element to be checked.
   * @return true if node is in this element's light DOM tree.
   *
   */
  boolean isLightDescendant(@Nullable Node node);

  /**
   * Checks whether an element is in this element's light DOM tree.
   *
   * @return true if node is in this element's light DOM tree.
   *
   */
  boolean isLightDescendant();

  /**
   * Checks whether an element is in this element's local DOM tree.
   *
   * @param node The element to be checked.
   * @return true if node is in this element's local DOM tree.
   *
   */
  boolean isLocalDescendant(Element node);

  /**
   * No-op for backwards compatibility. This should now be handled by
   * ShadyCss library.
   *
   * @param container Container element to scope
   * @param shouldObserve if true, start a mutation observer for added nodes to the container
   * @return Returns a new MutationObserver on <code>container</code> if <code>shouldObserve</code> is true.
   *
   */
  @Nullable
  MutationObserver scopeSubtree(Element container, boolean shouldObserve);

  /**
   * No-op for backwards compatibility. This should now be handled by
   * ShadyCss library.
   *
   * @param container Container element to scope
   * @return Returns a new MutationObserver on <code>container</code> if <code>shouldObserve</code> is true.
   *
   */
  @Nullable
  MutationObserver scopeSubtree(Element container);

  /**
   * Returns the computed style value for the given property.
   *
   * @param property The css property name.
   * @return Returns the computed css property value for the given
   * <code>property</code>.
   *
   */
  String getComputedStyleValue(String property);

  /**
   * Call <code>debounce</code> to collapse multiple requests for a named task into
   * one invocation which is made after the wait time has elapsed with
   * no new request.  If no wait time is given, the callback will be called
   * at microtask timing (guaranteed before paint).
   *
   * <pre><code> debouncedClickAction(e) {
   *    // will not call `processClick` more than once per 100ms
   *    this.debounce('click', function() {
   *     this.processClick();
   *    } 100);
   *  }
   * </code></pre>
   * @param jobName String to identify the debounce job.
   * @param callback Function that is called (with <code>this</code>
   * context) when the wait time elapses.
   * @param wait Optional wait time in milliseconds (ms) after the
   * last signal that must elapse before invoking <code>callback</code>
   * @return Returns a debouncer object on which exists the
   * following methods: <code>isActive()</code> returns true if the debouncer is
   * active; <code>cancel()</code> cancels the debouncer if it is active;
   * <code>flush()</code> immediately invokes the debounced callback if the debouncer
   * is active.
   *
   */
  Any debounce(String jobName, DebounceCallbackFunction callback, double wait);

  /**
   * Call <code>debounce</code> to collapse multiple requests for a named task into
   * one invocation which is made after the wait time has elapsed with
   * no new request.  If no wait time is given, the callback will be called
   * at microtask timing (guaranteed before paint).
   *
   * <pre><code> debouncedClickAction(e) {
   *    // will not call `processClick` more than once per 100ms
   *    this.debounce('click', function() {
   *     this.processClick();
   *    } 100);
   *  }
   * </code></pre>
   * @param jobName String to identify the debounce job.
   * @param callback Function that is called (with <code>this</code>
   * context) when the wait time elapses.
   * @return Returns a debouncer object on which exists the
   * following methods: <code>isActive()</code> returns true if the debouncer is
   * active; <code>cancel()</code> cancels the debouncer if it is active;
   * <code>flush()</code> immediately invokes the debounced callback if the debouncer
   * is active.
   *
   */
  Any debounce(String jobName, DebounceCallbackFunction callback);

  /**
   * Returns whether a named debouncer is active.
   *
   * @param jobName The name of the debouncer started with <code>debounce</code>
   * @return Whether the debouncer is active (has not yet fired).
   *
   */
  boolean isDebouncerActive(String jobName);

  /**
   * Immediately calls the debouncer <code>callback</code> and inactivates it.
   *
   * @param jobName The name of the debouncer started with <code>debounce</code>
   *
   */
  void flushDebouncer(String jobName);

  /**
   * Cancels an active debouncer.  The <code>callback</code> will not be called.
   *
   * @param jobName The name of the debouncer started with <code>debounce</code>
   *
   */
  void cancelDebouncer(String jobName);

  /**
   * Runs a callback function asynchronously.
   *
   * By default (if no waitTime is specified), async callbacks are run at
   * microtask timing, which will occur before paint.
   *
   * @param callback The callback function to run, bound to
   * <code>this</code>.
   * @param waitTime Time to wait before calling the
   * <code>callback</code>.  If unspecified or 0, the callback will be run at microtask
   * timing (before paint).
   * @return Handle that may be used to cancel the async job.
   *
   */
  double async(JsFunction callback, double waitTime);

  /**
   * Runs a callback function asynchronously.
   *
   * By default (if no waitTime is specified), async callbacks are run at
   * microtask timing, which will occur before paint.
   *
   * @param callback The callback function to run, bound to
   * <code>this</code>.
   * @return Handle that may be used to cancel the async job.
   *
   */
  double async(JsFunction callback);

  /**
   * Cancels an async operation started with <code>async</code>.
   *
   * @param handle Handle returned from original <code>async</code> call to
   * cancel.
   *
   */
  void cancelAsync(double handle);

  /**
   * Convenience method for creating an element and configuring it.
   *
   * @param tag HTML element tag to create.
   * @param props Object of properties to configure on the
   * instance.
   * @return Newly created and configured element.
   *
   */
  Element create(String tag, @Nullable Any props);

  /**
   * Convenience method for creating an element and configuring it.
   *
   * @param tag HTML element tag to create.
   * @return Newly created and configured element.
   *
   */
  Element create(String tag);

  /**
   * Polyfill for Element.prototype.matches, which is sometimes still
   * prefixed.
   *
   * @param selector Selector to test.
   * @param node Element to test the selector against.
   * @return Whether the element matches the selector.
   *
   */
  boolean elementMatches(String selector, @Nullable Element node);

  /**
   * Polyfill for Element.prototype.matches, which is sometimes still
   * prefixed.
   *
   * @param selector Selector to test.
   * @return Whether the element matches the selector.
   *
   */
  boolean elementMatches(String selector);

  /**
   * Toggles an HTML attribute on or off.
   *
   * @param name HTML attribute name
   * @param bool Boolean to force the attribute on or off.
   * When unspecified, the state of the attribute will be reversed.
   * @return true if the attribute now exists
   *
   */
  boolean toggleAttribute(String name, boolean bool);

  /**
   * Toggles an HTML attribute on or off.
   *
   * @param name HTML attribute name
   * @return true if the attribute now exists
   *
   */
  boolean toggleAttribute(String name);

  /**
   * Toggles a CSS class on or off.
   *
   * @param name CSS class name
   * @param bool Boolean to force the class on or off.
   * When unspecified, the state of the class will be reversed.
   * @param node Node to target.  Defaults to <code>this</code>.
   *
   */
  void toggleClass(String name, boolean bool, @Nullable Element node);

  /**
   * Toggles a CSS class on or off.
   *
   * @param name CSS class name
   * @param bool Boolean to force the class on or off.
   * When unspecified, the state of the class will be reversed.
   */
  void toggleClass(String name, boolean bool);

  /**
   * Toggles a CSS class on or off.
   *
   * @param name CSS class name
   */
  void toggleClass(String name);

  /**
   * Cross-platform helper for setting an element's CSS <code>transform</code> property.
   *
   * @param transformText Transform setting.
   * @param node Element to apply the transform to.
   * Defaults to <code>this</code>
   *
   */
  void transform(String transformText, @Nullable Element node);

  /**
   * Cross-platform helper for setting an element's CSS <code>transform</code> property.
   *
   * @param transformText Transform setting.
   */
  void transform(String transformText);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   * @param node Element to apply the transform to.
   * Defaults to <code>this</code>.
   *
   */
  void translate3d(String x, String y, String z, @Nullable Element node);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   * @param node Element to apply the transform to.
   * Defaults to <code>this</code>.
   *
   */
  void translate3d(String x, String y, double z, @Nullable Element node);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   * @param node Element to apply the transform to.
   * Defaults to <code>this</code>.
   *
   */
  void translate3d(String x, double y, String z, @Nullable Element node);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   * @param node Element to apply the transform to.
   * Defaults to <code>this</code>.
   *
   */
  void translate3d(String x, double y, double z, @Nullable Element node);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   * @param node Element to apply the transform to.
   * Defaults to <code>this</code>.
   *
   */
  void translate3d(double x, String y, String z, @Nullable Element node);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   * @param node Element to apply the transform to.
   * Defaults to <code>this</code>.
   *
   */
  void translate3d(double x, String y, double z, @Nullable Element node);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   * @param node Element to apply the transform to.
   * Defaults to <code>this</code>.
   *
   */
  void translate3d(double x, double y, String z, @Nullable Element node);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   * @param node Element to apply the transform to.
   * Defaults to <code>this</code>.
   *
   */
  void translate3d(double x, double y, double z, @Nullable Element node);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   */
  void translate3d(String x, String y, String z);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   */
  void translate3d(String x, String y, double z);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   */
  void translate3d(String x, double y, String z);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   */
  void translate3d(String x, double y, double z);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   */
  void translate3d(double x, String y, String z);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   */
  void translate3d(double x, String y, double z);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   */
  void translate3d(double x, double y, String z);

  /**
   * Cross-platform helper for setting an element's CSS <code>translate3d</code>
   * property.
   *
   * @param x X offset.
   * @param y Y offset.
   * @param z Z offset.
   */
  void translate3d(double x, double y, double z);

  /**
   * Removes an item from an array, if it exists.
   *
   * If the array is specified by path, a change notification is
   * generated, so that observers, data bindings and computed
   * properties watching that path can update.
   *
   * If the array is passed directly, <strong>no change
   * notification is generated</strong>.
   *
   * @param arrayOrPath Path to array from
   * which to remove the item
   * (or the array itself).
   * @param item Item to remove.
   * @return Array containing item removed.
   *
   */
  @Nullable
  Any[] arrayDelete(String[] arrayOrPath, Any item);

  /**
   * Removes an item from an array, if it exists.
   *
   * If the array is specified by path, a change notification is
   * generated, so that observers, data bindings and computed
   * properties watching that path can update.
   *
   * If the array is passed directly, <strong>no change
   * notification is generated</strong>.
   *
   * @param arrayOrPath Path to array from
   * which to remove the item
   * (or the array itself).
   * @param item Item to remove.
   * @return Array containing item removed.
   *
   */
  @Nullable
  Any[] arrayDelete(double[] arrayOrPath, Any item);

  /**
   * Removes an item from an array, if it exists.
   *
   * If the array is specified by path, a change notification is
   * generated, so that observers, data bindings and computed
   * properties watching that path can update.
   *
   * If the array is passed directly, <strong>no change
   * notification is generated</strong>.
   *
   * @param arrayOrPath Path to array from
   * which to remove the item
   * (or the array itself).
   * @param item Item to remove.
   * @return Array containing item removed.
   *
   */
  @Nullable
  Any[] arrayDelete(String arrayOrPath, Any item);

  interface FireOptions extends Any {
    @JSProperty("bubbles")
    boolean getBubbles();

    @JSProperty("bubbles")
    void setBubbles(boolean value);

    @JSProperty("cancelable")
    boolean getCancelable();

    @JSProperty("cancelable")
    void setCancelable(boolean value);

    @JSProperty("composed")
    boolean getComposed();

    @JSProperty("composed")
    void setComposed(boolean value);

    class Builder {
      private final FireOptions object = Any.empty();

      public FireOptions build() {
        return object;
      }

      public FireOptions.Builder bubbles(boolean value) {
        object.setBubbles(value);
        return this;
      }

      public FireOptions.Builder cancelable(boolean value) {
        object.setCancelable(value);
        return this;
      }

      public FireOptions.Builder composed(boolean value) {
        object.setComposed(value);
        return this;
      }
    }
  }

  @FunctionalInterface
  @JSFunctor
  interface DebounceCallbackFunction extends Any {
    void apply();
  }
}
