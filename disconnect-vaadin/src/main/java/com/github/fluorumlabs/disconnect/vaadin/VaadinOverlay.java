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
public class VaadinOverlay extends AbstractComponent<OverlayElement>
        implements HasThemableMixin<OverlayElement, VaadinOverlay>,
        HasComponents<OverlayElement, VaadinOverlay, Component<?>> {
    public VaadinOverlay() {
        super("vaadin-overlay");
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
     * <p>
     * - `root` The root container DOM element. Append your content to it.
     * - `owner` The host element of the renderer function.
     * - `model` The object with the properties related with rendering.
     */
    @Nullable
    public OverlayRenderer renderer() {
        return getNode().getRenderer();
    }

    /**
     * Custom function for rendering the content of the overlay.
     * Receives three arguments:
     * <p>
     * - `root` The root container DOM element. Append your content to it.
     * - `owner` The host element of the renderer function.
     * - `model` The object with the properties related with rendering.
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
     * Optional argument for `Polymer.Templatize.templatize`.
     */
    @Nullable
    public Record<Unknown> instanceProps() {
        return getNode().getInstanceProps();
    }

    /**
     * Optional argument for `Polymer.Templatize.templatize`.
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
     * Object with properties that is passed to `renderer` function
     */
    @Nullable
    public Record<Unknown> model() {
        return getNode().getModel();
    }

    /**
     * Object with properties that is passed to `renderer` function
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
     * @param sourceEvent
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
     * fired before the `vaadin-overlay` will be closed. If canceled the closing of the overlay is canceled as well.
     */
    public ObservableEvent<WrappedSourceEvent<Event>> vaadinOverlayCloseEvent() {
        return createEvent("vaadin-overlay-close");
    }

    /**
     * vaadin-overlay-escape-press
     * fired before the `vaadin-overlay` will be closed on ESC button press. If canceled the closing of the overlay
     * is canceled as well.
     */
    public ObservableEvent<WrappedSourceEvent<KeyboardEvent>> vaadinOverlayEscapePressEvent() {
        return createEvent("vaadin-overlay-escape-press");
    }

    /**
     * vaadin-overlay-open
     * fired after the `vaadin-overlay` is opened.
     */
    public ObservableEvent<Event> vaadinOverlayOpenEvent() {
        return createEvent("vaadin-overlay-open");
    }

    /**
     * We need to listen on 'click' / 'tap' event and capture it and close the overlay before
     * propagating the event to the listener in the button. Otherwise, if the clicked button would call
     * open(), this would happen: https://www.youtube.com/watch?v=Z86V_ICUCD4
     */
    public ObservableEvent<WrappedSourceEvent<Event>> vaadinOverlayOutsideClickEvent() {
        return createEvent("vaadin-overlay-outside-click");
    }

    /**
     * Fired when the `opened` property changes.
     */
    public ObservableEvent<BooleanPropertyChangeEvent> openedChangedEvent() {
        return createEvent("opened-changed");
    }

    /**
     * Fired when the `template` property changes.
     */
    public ObservableEvent<PropertyChangeEvent<HTMLTemplateElement>> templateChangedEvent() {
        return createEvent("template-changed");
    }

    /**
     * Fired when the `content` property changes.
     */
    public ObservableEvent<PropertyChangeEvent<ParentNode>> contentChangedEvent() {
        return createEvent("content-changed");
    }
}
