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
 * `<vaadin-overlay>` is a Web Component for creating overlays. The content of the overlay
 * can be populated in two ways: imperatively by using renderer callback function and
 * declaratively by using Polymer's Templates.
 * <p>
 * ### Rendering
 * <p>
 * By default, the overlay uses the content provided by using the renderer callback function.
 * <p>
 * The renderer function provides `root`, `owner`, `model` arguments when applicable.
 * Generate DOM content by using `model` object properties if needed, append it to the `root`
 * element and control the state of the host element by accessing `owner`. Before generating new
 * content, users are able to check if there is already content in `root` for reusing it.
 * <p>
 * ```html
 * <vaadin-overlay id="overlay"></vaadin-overlay>
 * ```
 * ```js
 * const overlay = document.querySelector('#overlay');
 * overlay.renderer = function(root) {
 * root.textContent = "Overlay content";
 * };
 * ```
 * <p>
 * Renderer is called on the opening of the overlay and each time the related model is updated.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the `root` argument.
 * On first call it will be empty.
 * <p>
 * **NOTE:** when the renderer property is defined, the `<template>` content is not used.
 * <p>
 * ### Templating
 * <p>
 * Alternatively, the content can be provided with Polymer Template.
 * Overlay finds the first child template and uses that in case renderer callback function
 * is not provided. You can also set a custom template using the `template` property.
 * <p>
 * After the content from the template is stamped, the `content` property
 * points to the content container.
 * <p>
 * The overlay provides `forwardHostProp` when calling
 * `Polymer.Templatize.templatize` for the template, so that the bindings
 * from the parent scope propagate to the content.  You can also pass
 * custom `instanceProps` object using the `instanceProps` property.
 * <p>
 * ```html
 * <vaadin-overlay>
 * <template>Overlay content</template>
 * </vaadin-overlay>
 * ```
 * <p>
 * **NOTE:** when using `instanceProps`: because of the Polymer limitation,
 * every template can only be templatized once, so it is important
 * to set `instanceProps` before the `template` is assigned to the overlay.
 * <p>
 * ### Styling
 * <p>
 * To style the overlay content, use styles in the parent scope:
 * <p>
 * - If the overlay is used in a component, then the component styles
 * apply the overlay content.
 * - If the overlay is used in the global DOM scope, then global styles
 * apply to the overlay content.
 * <p>
 * See examples for styling the overlay content in the live demos.
 * <p>
 * The following Shadow DOM parts are available for styling the overlay component itself:
 * <p>
 * Part name  | Description
 * -----------|---------------------------------------------------------|
 * `backdrop` | Backdrop of the overlay
 * `overlay`  | Container for position/sizing/alignment of the content
 * `content`  | Content of the overlay
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute | Description | Part
 * ---|---|---
 * `opening` | Applied just after the overlay is attached to the DOM. You can apply a CSS @keyframe animation for
 * this state. | `:host`
 * `closing` | Applied just before the overlay is detached from the DOM. You can apply a CSS @keyframe animation for
 * this state. | `:host`
 * <p>
 * The following custom CSS properties are available for styling:
 * <p>
 * Custom CSS property | Description | Default value
 * ---|---|---
 * `--vaadin-overlay-viewport-bottom` | Bottom offset of the visible viewport area | `0` or detected offset
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "OverlayElement",
		module = "@vaadin/vaadin-overlay/src/vaadin-overlay.js"
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
	 * <p>
	 * - `root` The root container DOM element. Append your content to it.
	 * - `owner` The host element of the renderer function.
	 * - `model` The object with the properties related with rendering.
	 */
	@Nullable
	@JSProperty
	OverlayRenderer getRenderer();

	/**
	 * Custom function for rendering the content of the overlay.
	 * Receives three arguments:
	 * <p>
	 * - `root` The root container DOM element. Append your content to it.
	 * - `owner` The host element of the renderer function.
	 * - `model` The object with the properties related with rendering.
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
	 * Optional argument for `Polymer.Templatize.templatize`.
	 */
	@Nullable
	@JSProperty
	Record<Unknown> getInstanceProps();

	/**
	 * Optional argument for `Polymer.Templatize.templatize`.
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
	 * Object with properties that is passed to `renderer` function
	 */
	@Nullable
	@JSProperty
	Record<Unknown> getModel();

	/**
	 * Object with properties that is passed to `renderer` function
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
