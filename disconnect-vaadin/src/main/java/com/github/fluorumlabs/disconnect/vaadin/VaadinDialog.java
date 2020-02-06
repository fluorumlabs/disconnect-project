package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.DialogElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemePropertyMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.DialogRenderer;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;

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
public class VaadinDialog extends AbstractComponent<DialogElement>
		implements HasElementMixin<DialogElement, VaadinDialog>,
		HasThemePropertyMixin<DialogElement, VaadinDialog>,
		HasComponents<DialogElement, VaadinDialog, Component<?>> {
	public VaadinDialog() {
		super(DialogElement.TAGNAME());
	}

	/**
	 * True if the overlay is currently displayed.
	 */
	public boolean opened() {
		return getNode().isOpened();
	}

	/**
	 * True if the overlay is currently displayed.
	 */
	public VaadinDialog opened(boolean opened) {
		getNode().setOpened(opened);
		return this;
	}

	/**
	 * Set to true to disable closing dialog on outside click
	 */
	public boolean noCloseOnOutsideClick() {
		return getNode().isNoCloseOnOutsideClick();
	}

	/**
	 * Set to true to disable closing dialog on outside click
	 */
	public VaadinDialog noCloseOnOutsideClick(boolean noCloseOnOutsideClick) {
		getNode().setNoCloseOnOutsideClick(noCloseOnOutsideClick);
		return this;
	}

	/**
	 * Set to true to disable closing dialog on Escape press
	 */
	public boolean noCloseOnEsc() {
		return getNode().isNoCloseOnEsc();
	}

	/**
	 * Set to true to disable closing dialog on Escape press
	 */
	public VaadinDialog noCloseOnEsc(boolean noCloseOnEsc) {
		getNode().setNoCloseOnEsc(noCloseOnEsc);
		return this;
	}

	/**
	 * Set the <code>aria-label</code> attribute for assistive technologies like
	 * screen readers. An <code>undefined</code> value for this property (the
	 * default) means that the <code>aria-label</code> attribute is not present at
	 * all.
	 */
	@Nullable
	public String ariaLabel() {
		return getNode().getAriaLabel();
	}

	/**
	 * Set the <code>aria-label</code> attribute for assistive technologies like
	 * screen readers. An <code>undefined</code> value for this property (the
	 * default) means that the <code>aria-label</code> attribute is not present at
	 * all.
	 */
	public VaadinDialog ariaLabel(String ariaLabel) {
		getNode().setAriaLabel(ariaLabel);
		return this;
	}

	/**
	 * Theme to apply to the overlay element
	 */
	@Nullable
	public String theme() {
		return getNode().getTheme();
	}

	/**
	 * Theme to apply to the overlay element
	 */
	public VaadinDialog theme(String theme) {
		getNode().setTheme(theme);
		return this;
	}

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
	public DialogRenderer renderer() {
		return getNode().getRenderer();
	}

	/**
	 * Custom function for rendering the content of the dialog.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The root container DOM element. Append your content to it.</li>
	 * <li><code>dialog</code> The reference to the <code>&lt;vaadin-dialog&gt;</code> element.</li>
	 * </ul>
	 */
	public VaadinDialog renderer(DialogRenderer renderer) {
		getNode().setRenderer(renderer);
		return this;
	}

	/**
	 * Manually invoke existing renderer.
	 */
	public void render() {
		getNode().render();
	}

	/**
	 * Fired when the <code>opened</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> openedChangedEvent() {
		return createEvent("opened-changed");
	}
}
