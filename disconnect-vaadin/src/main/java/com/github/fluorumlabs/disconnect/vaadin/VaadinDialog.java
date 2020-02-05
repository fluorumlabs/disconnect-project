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
 * `<vaadin-dialog>` is a Web Component for creating customized modal dialogs. The content of the
 * dialog can be populated in two ways: imperatively by using renderer callback function and
 * declaratively by using Polymer's Templates.
 * <p>
 * ### Rendering
 * <p>
 * By default, the dialog uses the content provided by using the renderer callback function.
 * <p>
 * The renderer function provides `root`, `dialog` arguments.
 * Generate DOM content, append it to the `root` element and control the state
 * of the host element by accessing `dialog`. Before generating new content,
 * users are able to check if there is already content in `root` for reusing it.
 * <p>
 * ```html
 * <vaadin-dialog id="dialog"></vaadin-dialog>
 * ```
 * ```js
 * const dialog = document.querySelector('#dialog');
 * dialog.renderer = function(root, dialog) {
 * root.textContent = "Sample dialog";
 * };
 * ```
 * <p>
 * Renderer is called on the opening of the dialog.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the `root` argument.
 * On first call it will be empty.
 * <p>
 * ### Polymer Templates
 * <p>
 * Alternatively, the content can be provided with Polymer's Template.
 * Dialog finds the first child template and uses that in case renderer callback function
 * is not provided. You can also set a custom template using the `template` property.
 * <p>
 * ```html
 * <vaadin-dialog opened>
 * <template>
 * Sample dialog
 * </template>
 * </vaadin-dialog>
 * ```
 * <p>
 * ### Styling
 * <p>
 * See [`<vaadin-overlay>` documentation](https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html)
 * for `<vaadin-dialog-overlay>` parts.
 * <p>
 * Note: the `theme` attribute value set on `<vaadin-dialog>` is
 * propagated to the internal `<vaadin-dialog-overlay>` component.
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinDialog extends AbstractComponent<DialogElement>
		implements HasElementMixin<DialogElement, VaadinDialog>,
		HasThemePropertyMixin<DialogElement, VaadinDialog>,
		HasComponents<DialogElement, VaadinDialog, Component<?>> {
	public VaadinDialog() {
		super("vaadin-dialog");
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
	 * Set the `aria-label` attribute for assistive technologies like
	 * screen readers. An `undefined` value for this property (the
	 * default) means that the `aria-label` attribute is not present at
	 * all.
	 */
	@Nullable
	public String ariaLabel() {
		return getNode().getAriaLabel();
	}

	/**
	 * Set the `aria-label` attribute for assistive technologies like
	 * screen readers. An `undefined` value for this property (the
	 * default) means that the `aria-label` attribute is not present at
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
	 * <p>
	 * - `root` The root container DOM element. Append your content to it.
	 * - `dialog` The reference to the `<vaadin-dialog>` element.
	 */
	@Nullable
	public DialogRenderer renderer() {
		return getNode().getRenderer();
	}

	/**
	 * Custom function for rendering the content of the dialog.
	 * Receives two arguments:
	 * <p>
	 * - `root` The root container DOM element. Append your content to it.
	 * - `dialog` The reference to the `<vaadin-dialog>` element.
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
	 * Fired when the `opened` property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> openedChangedEvent() {
		return createEvent("opened-changed");
	}
}
