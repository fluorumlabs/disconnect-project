package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.OverlayRenderer;
import js.lang.Unknown;
import js.util.Record;
import js.web.dom.Element;
import js.web.dom.Event;
import js.web.dom.HTMLElement;
import js.web.dom.ParentNode;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSProperty;

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
 * 		<tr><td><code>closing</code></td><td>Applied just before the overlay is detached from the DOM. You can apply a
 * 		CSS
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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "OverlayElement",
		module = "@vaadin/vaadin-overlay/vaadin-overlay.js"
)
public interface OverlayElement extends HTMLElement, ThemableMixin {
	@JSProperty
	boolean isOpened();

	@JSProperty
	void setOpened(boolean opened);

	/**
	 * Owner element passed with renderer function
	 */
	@Nullable
	@JSProperty
	Element getOwner();

	/**
	 * Owner element passed with renderer function
	 */
	@JSProperty
	void setOwner(Element owner);

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
	@JSProperty
	OverlayRenderer getRenderer();

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
	@JSProperty
	void setRenderer(OverlayRenderer renderer);

	/**
	 * The template of the overlay content.
	 */
	@Nullable
	@JSProperty
	HTMLTemplateElement getTemplate();

	/**
	 * The template of the overlay content.
	 */
	@JSProperty
	void setTemplate(HTMLTemplateElement template);

	/**
	 * Optional argument for <code>Polymer.Templatize.templatize</code>.
	 */
	@Nullable
	@JSProperty
	Record<Unknown> getInstanceProps();

	/**
	 * Optional argument for <code>Polymer.Templatize.templatize</code>.
	 */
	@JSProperty
	void setInstanceProps(Record<Unknown> instanceProps);

	/**
	 * References the content container after the template is stamped.
	 */
	@Nullable
	@JSProperty
	ParentNode getContent();

	@JSProperty
	boolean isWithBackdrop();

	@JSProperty
	void setWithBackdrop(boolean withBackdrop);

	/**
	 * Object with properties that is passed to <code>renderer</code> function
	 */
	@Nullable
	@JSProperty
	Record<Unknown> getModel();

	/**
	 * Object with properties that is passed to <code>renderer</code> function
	 */
	@JSProperty
	void setModel(Record<Unknown> model);

	/**
	 * When true the overlay won't disable the main content, showing
	 * it doesn’t change the functionality of the user interface.
	 */
	@JSProperty
	boolean isModeless();

	/**
	 * When true the overlay won't disable the main content, showing
	 * it doesn’t change the functionality of the user interface.
	 */
	@JSProperty
	void setModeless(boolean modeless);

	/**
	 * When true move focus to the first focusable element in the overlay,
	 * or to the overlay if there are no focusable elements.
	 */
	@JSProperty
	boolean isFocusTrap();

	/**
	 * When true move focus to the first focusable element in the overlay,
	 * or to the overlay if there are no focusable elements.
	 */
	@JSProperty
	void setFocusTrap(boolean focusTrap);

	/**
	 * Set to true to enable restoring of focus when overlay is closed.
	 */
	@JSProperty
	boolean isRestoreFocusOnClose();

	/**
	 * Set to true to enable restoring of focus when overlay is closed.
	 */
	@JSProperty
	void setRestoreFocusOnClose(boolean restoreFocusOnClose);

	/**
	 *
	 */
	void close(Event sourceEvent);

	/**
	 * Manually invoke existing renderer.
	 */
	void render();

	/**
	 * Brings the overlay as visually the frontmost one
	 */
	void bringToFront();
}
