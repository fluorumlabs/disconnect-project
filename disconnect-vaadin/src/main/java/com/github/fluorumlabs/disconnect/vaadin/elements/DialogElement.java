package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemePropertyMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.DialogRenderer;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-dialog&gt;</code> is a Web Component for creating customized modal dialogs. The content of the
 * dialog can be populated in two ways: imperatively by using renderer callback function and
 * declaratively by using Polymer's Templates.
 *
 * <h3>Rendering</h3>
 * By default, the dialog uses the content provided by using the renderer callback function.
 * <p>
 * The renderer function provides <code>root</code>, <code>dialog</code> arguments.
 * Generate DOM content, append it to the <code>root</code> element and control the state
 * of the host element by accessing <code>dialog</code>. Before generating new content,
 * users are able to check if there is already content in <code>root</code> for reusing it.
 *
 * <pre><code class="language-html">&lt;vaadin-dialog id=&quot;dialog&quot;&gt;&lt;/vaadin-dialog&gt;
 * </code></pre>
 * <pre><code class="language-js">const dialog = document.querySelector('#dialog');
 * dialog.renderer = function(root, dialog) {
 *   root.textContent = &quot;Sample dialog&quot;;
 * };
 * </code></pre>
 * Renderer is called on the opening of the dialog.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the <code>root</code> argument.
 * On first call it will be empty.
 *
 * <h3>Polymer Templates</h3>
 * Alternatively, the content can be provided with Polymer's Template.
 * Dialog finds the first child template and uses that in case renderer callback function
 * is not provided. You can also set a custom template using the <code>template</code> property.
 *
 * <pre><code class="language-html">&lt;vaadin-dialog opened&gt;
 *   &lt;template&gt;
 *     Sample dialog
 *   &lt;/template&gt;
 * &lt;/vaadin-dialog&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * See
 * <a href="https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html"><code>&lt;vaadin-overlay&gt;</code> documentation</a>
 * for <code>&lt;vaadin-dialog-overlay&gt;</code> parts.
 * <p>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-dialog&gt;</code> is
 * propagated to the internal <code>&lt;vaadin-dialog-overlay&gt;</code> component.
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "DialogElement",
		module = "@vaadin/vaadin-dialog/vaadin-dialog.js"
)
public interface DialogElement extends HTMLElement, ElementMixin, ThemePropertyMixin {
	/**
	 * True if the overlay is currently displayed.
	 */
	@JSProperty
	boolean isOpened();

	/**
	 * True if the overlay is currently displayed.
	 */
	@JSProperty
	void setOpened(boolean opened);

	/**
	 * Set to true to disable closing dialog on outside click
	 */
	@JSProperty
	boolean isNoCloseOnOutsideClick();

	/**
	 * Set to true to disable closing dialog on outside click
	 */
	@JSProperty
	void setNoCloseOnOutsideClick(boolean noCloseOnOutsideClick);

	/**
	 * Set to true to disable closing dialog on Escape press
	 */
	@JSProperty
	boolean isNoCloseOnEsc();

	/**
	 * Set to true to disable closing dialog on Escape press
	 */
	@JSProperty
	void setNoCloseOnEsc(boolean noCloseOnEsc);

	/**
	 * Set the <code>aria-label</code> attribute for assistive technologies like
	 * screen readers. An <code>undefined</code> value for this property (the
	 * default) means that the <code>aria-label</code> attribute is not present at
	 * all.
	 */
	@Nullable
	@JSProperty
	String getAriaLabel();

	/**
	 * Set the <code>aria-label</code> attribute for assistive technologies like
	 * screen readers. An <code>undefined</code> value for this property (the
	 * default) means that the <code>aria-label</code> attribute is not present at
	 * all.
	 */
	@JSProperty
	void setAriaLabel(String ariaLabel);

	/**
	 * Theme to apply to the overlay element
	 */
	@Nullable
	@JSProperty
	String getTheme();

	/**
	 * Theme to apply to the overlay element
	 */
	@JSProperty
	void setTheme(String theme);

	/**
	 * Custom function for rendering the content of the dialog.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The root container DOM element. Append your content to it.</li>
	 * <li><code>dialog</code> The reference to the <code>&lt;vaadin-dialog&gt;</code> element.</li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	DialogRenderer getRenderer();

	/**
	 * Custom function for rendering the content of the dialog.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The root container DOM element. Append your content to it.</li>
	 * <li><code>dialog</code> The reference to the <code>&lt;vaadin-dialog&gt;</code> element.</li>
	 * </ul>
	 */
	@JSProperty
	void setRenderer(DialogRenderer renderer);

	/**
	 * Manually invoke existing renderer.
	 */
	void render();
}
