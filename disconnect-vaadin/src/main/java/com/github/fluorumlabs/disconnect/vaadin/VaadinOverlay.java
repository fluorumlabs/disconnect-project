package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.OverlayElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.OverlayRenderer;
import com.github.fluorumlabs.disconnect.vaadin.types.WrappedSourceEvent;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Unknown;
import js.util.Record;
import js.web.dom.Element;
import js.web.dom.Event;
import js.web.dom.KeyboardEvent;
import js.web.dom.ParentNode;
import js.web.webcomponents.HTMLTemplateElement;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-overlay&gt;</code> is a Web Component for creating overlays. The content of the overlay
 * can be populated in two ways: imperatively by using renderer callback function and
 * declaratively by using Polymer's Templates.
 *
 * <h3>Rendering</h3>
 * By default, the overlay uses the content provided by using the renderer callback function.
 * <p>
 * The renderer function provides <code>root</code>, <code>owner</code>, <code>model</code> arguments when applicable.
 * Generate DOM content by using <code>model</code> object properties if needed, append it to the <code>root</code>
 * element and control the state of the host element by accessing <code>owner</code>. Before generating new
 * content, users are able to check if there is already content in <code>root</code> for reusing it.
 *
 * <pre><code class="language-html">&lt;vaadin-overlay id=&quot;overlay&quot;&gt;&lt;/vaadin-overlay&gt;
 * </code></pre>
 * <pre><code class="language-js">const overlay = document.querySelector('#overlay');
 * overlay.renderer = function(root) {
 *  root.textContent = &quot;Overlay content&quot;;
 * };
 * </code></pre>
 * Renderer is called on the opening of the overlay and each time the related model is updated.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the <code>root</code> argument.
 * On first call it will be empty.
 *
 * <strong>NOTE:</strong> when the renderer property is defined, the <code>&lt;template&gt;</code> content is not used.
 *
 * <h3>Templating</h3>
 * Alternatively, the content can be provided with Polymer Template.
 * Overlay finds the first child template and uses that in case renderer callback function
 * is not provided. You can also set a custom template using the <code>template</code> property.
 * <p>
 * After the content from the template is stamped, the <code>content</code> property
 * points to the content container.
 * <p>
 * The overlay provides <code>forwardHostProp</code> when calling
 * <code>Polymer.Templatize.templatize</code> for the template, so that the bindings
 * from the parent scope propagate to the content.  You can also pass
 * custom <code>instanceProps</code> object using the <code>instanceProps</code> property.
 *
 * <pre><code class="language-html">&lt;vaadin-overlay&gt;
 *   &lt;template&gt;Overlay content&lt;/template&gt;
 * &lt;/vaadin-overlay&gt;
 * </code></pre>
 * <strong>NOTE:</strong> when using <code>instanceProps</code>: because of the Polymer limitation,
 * every template can only be templatized once, so it is important
 * to set <code>instanceProps</code> before the <code>template</code> is assigned to the overlay.
 *
 * <h3>Styling</h3>
 * To style the overlay content, use styles in the parent scope:
 *
 * <ul>
 * <li>If the overlay is used in a component, then the component styles
 * apply the overlay content.</li>
 * <li>If the overlay is used in the global DOM scope, then global styles
 * apply to the overlay content.</li>
 * </ul>
 * See examples for styling the overlay content in the live demos.
 * <p>
 * The following Shadow DOM parts are available for styling the overlay component itself:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>backdrop</code></td><td>Backdrop of the overlay</td></tr>
 * <tr><td><code>overlay</code></td><td>Container for position/sizing/alignment of the content</td></tr>
 * <tr><td><code>content</code></td><td>Content of the overlay</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>opening</code></td><td>Applied just after the overlay is attached to the DOM. You can apply a CSS
 *
 * @keyframe animation for this state.</td><td><code>:host</code></td></tr>
 * 		<tr><td><code>closing</code></td><td>Applied just before the overlay is detached from the DOM. You can
 * 		apply a CSS
 * @keyframe animation for this state.</td><td><code>:host</code></td></tr>
 * 		</tbody>
 * 		</table>
 * 		The following custom CSS properties are available for styling:
 *
 * 		<table>
 * 		<thead>
 * 		<tr><th>Custom CSS property</th><th>Description</th><th>Default value</th></tr>
 * 		</thead>
 * 		<tbody>
 * 		<tr><td><code>--vaadin-overlay-viewport-bottom</code></td><td>Bottom offset of the visible viewport
 * 		area</td><td><code>0</code> or detected offset</td></tr>
 * 		</tbody>
 * 		</table>
 * 		See
 * 		<a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinOverlay extends AbstractComponent<OverlayElement>
		implements HasThemableMixin<OverlayElement, VaadinOverlay>,
		HasComponents<OverlayElement, VaadinOverlay, Component<?>> {
	public VaadinOverlay() {
		super(OverlayElement.TAGNAME);
	}

	public boolean opened() {
		return getNode().isOpened();
	}

	public VaadinOverlay opened(boolean opened) {
		getNode().setOpened(opened);
		return this;
	}

	/**
	 * Owner element passed with renderer function
	 */
	@Nullable
	public Element owner() {
		return getNode().getOwner();
	}

	/**
	 * Owner element passed with renderer function
	 */
	public VaadinOverlay owner(Element owner) {
		getNode().setOwner(owner);
		return this;
	}

	/**
	 * Custom function for rendering the content of the overlay.
	 * Receives three arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The root container DOM element. Append your content to it.</li>
	 * <li><code>owner</code> The host element of the renderer function.</li>
	 * <li><code>model</code> The object with the properties related with rendering.</li>
	 * </ul>
	 */
	@Nullable
	public OverlayRenderer renderer() {
		return getNode().getRenderer();
	}

	/**
	 * Custom function for rendering the content of the overlay.
	 * Receives three arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The root container DOM element. Append your content to it.</li>
	 * <li><code>owner</code> The host element of the renderer function.</li>
	 * <li><code>model</code> The object with the properties related with rendering.</li>
	 * </ul>
	 */
	public VaadinOverlay renderer(OverlayRenderer renderer) {
		getNode().setRenderer(renderer);
		return this;
	}

	/**
	 * The template of the overlay content.
	 */
	@Nullable
	public HTMLTemplateElement template() {
		return getNode().getTemplate();
	}

	/**
	 * The template of the overlay content.
	 */
	public VaadinOverlay template(HTMLTemplateElement template) {
		getNode().setTemplate(template);
		return this;
	}

	/**
	 * Optional argument for <code>Polymer.Templatize.templatize</code>.
	 */
	@Nullable
	public Record<Unknown> instanceProps() {
		return getNode().getInstanceProps();
	}

	/**
	 * Optional argument for <code>Polymer.Templatize.templatize</code>.
	 */
	public VaadinOverlay instanceProps(Record<Unknown> instanceProps) {
		getNode().setInstanceProps(instanceProps);
		return this;
	}

	/**
	 * References the content container after the template is stamped.
	 */
	@Nullable
	public ParentNode content() {
		return getNode().getContent();
	}

	public boolean withBackdrop() {
		return getNode().isWithBackdrop();
	}

	public VaadinOverlay withBackdrop(boolean withBackdrop) {
		getNode().setWithBackdrop(withBackdrop);
		return this;
	}

	/**
	 * Object with properties that is passed to <code>renderer</code> function
	 */
	@Nullable
	public Record<Unknown> model() {
		return getNode().getModel();
	}

	/**
	 * Object with properties that is passed to <code>renderer</code> function
	 */
	public VaadinOverlay model(Record<Unknown> model) {
		getNode().setModel(model);
		return this;
	}

	/**
	 * When true the overlay won't disable the main content, showing
	 * it doesn’t change the functionality of the user interface.
	 */
	public boolean modeless() {
		return getNode().isModeless();
	}

	/**
	 * When true the overlay won't disable the main content, showing
	 * it doesn’t change the functionality of the user interface.
	 */
	public VaadinOverlay modeless(boolean modeless) {
		getNode().setModeless(modeless);
		return this;
	}

	/**
	 * When set to true, the overlay is hidden. This also closes the overlay
	 * immediately in case there is a closing animation in progress.
	 */
	public boolean hidden() {
		return getNode().isHidden();
	}

	/**
	 * When set to true, the overlay is hidden. This also closes the overlay
	 * immediately in case there is a closing animation in progress.
	 */
	public VaadinOverlay hidden(boolean hidden) {
		getNode().setHidden(hidden);
		return this;
	}

	/**
	 * When true move focus to the first focusable element in the overlay,
	 * or to the overlay if there are no focusable elements.
	 */
	public boolean focusTrap() {
		return getNode().isFocusTrap();
	}

	/**
	 * When true move focus to the first focusable element in the overlay,
	 * or to the overlay if there are no focusable elements.
	 */
	public VaadinOverlay focusTrap(boolean focusTrap) {
		getNode().setFocusTrap(focusTrap);
		return this;
	}

	/**
	 * Set to true to enable restoring of focus when overlay is closed.
	 */
	public boolean restoreFocusOnClose() {
		return getNode().isRestoreFocusOnClose();
	}

	/**
	 * Set to true to enable restoring of focus when overlay is closed.
	 */
	public VaadinOverlay restoreFocusOnClose(boolean restoreFocusOnClose) {
		getNode().setRestoreFocusOnClose(restoreFocusOnClose);
		return this;
	}

	/**
	 *
	 */
	public void close(Event sourceEvent) {
		getNode().close(sourceEvent);
	}

	/**
	 * Manually invoke existing renderer.
	 */
	public void render() {
		getNode().render();
	}

	/**
	 * Brings the overlay as visually the frontmost one
	 */
	public void bringToFront() {
		getNode().bringToFront();
	}

	/**
	 * vaadin-overlay-close
	 * fired before the <code>vaadin-overlay</code> will be closed. If canceled the closing of the overlay is
	 * canceled as well.
	 */
	public ObservableEvent<WrappedSourceEvent<Event>> vaadinOverlayCloseEvent() {
		return createEvent("vaadin-overlay-close");
	}

	/**
	 * vaadin-overlay-escape-press
	 * fired before the <code>vaadin-overlay</code> will be closed on ESC button press. If canceled the closing of
	 * the overlay is canceled as well.
	 */
	public ObservableEvent<WrappedSourceEvent<KeyboardEvent>> vaadinOverlayEscapePressEvent() {
		return createEvent("vaadin-overlay-escape-press");
	}

	/**
	 * vaadin-overlay-open
	 * fired after the <code>vaadin-overlay</code> is opened.
	 */
	public ObservableEvent<Event> vaadinOverlayOpenEvent() {
		return createEvent("vaadin-overlay-open");
	}

	/**
	 * We need to listen on 'click' / 'tap' event and capture it and close the overlay before
	 * propagating the event to the listener in the button. Otherwise, if the clicked button would call
	 * open(), this would happen:
	 * <a href="https://www.youtube.com/watch?v=Z86V_ICUCD4">https://www.youtube.com/watch?v=Z86V_ICUCD4</a>
	 */
	public ObservableEvent<WrappedSourceEvent<Event>> vaadinOverlayOutsideClickEvent() {
		return createEvent("vaadin-overlay-outside-click");
	}

	/**
	 * Fired when the <code>opened</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> openedChangedEvent() {
		return createEvent("opened-changed");
	}

	/**
	 * Fired when the <code>template</code> property changes.
	 */
	public ObservableEvent<PropertyChangeEvent<HTMLTemplateElement>> templateChangedEvent() {
		return createEvent("template-changed");
	}

	/**
	 * Fired when the <code>content</code> property changes.
	 */
	public ObservableEvent<PropertyChangeEvent<ParentNode>> contentChangedEvent() {
		return createEvent("content-changed");
	}
}
