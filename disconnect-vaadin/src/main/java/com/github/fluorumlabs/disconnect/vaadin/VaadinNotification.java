package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.constants.NotificationPosition;
import com.github.fluorumlabs.disconnect.vaadin.elements.NotificationElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemePropertyMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.NotificationRenderer;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Element;

import javax.annotation.Nullable;

/**
 * `<vaadin-notification>` is a Web Component providing accessible and customizable notifications (toasts).
 * The content of the notification can be populated in two ways: imperatively by using renderer callback function
 * and declaratively by using Polymer's Templates.
 * <p>
 * ### Rendering
 * <p>
 * By default, the notification uses the content provided by using the renderer callback function.
 * <p>
 * The renderer function provides `root`, `notification` arguments.
 * Generate DOM content, append it to the `root` element and control the state
 * of the host element by accessing `notification`. Before generating new content,
 * users are able to check if there is already content in `root` for reusing it.
 * <p>
 * ```html
 * <vaadin-notification id="notification"></vaadin-notification>
 * ```
 * ```js
 * const notification = document.querySelector('#notification');
 * notification.renderer = function(root) {
 * root.textContent = "Your work has been saved";
 * };
 * ```
 * <p>
 * Renderer is called on the opening of the notification.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the `root` argument.
 * On first call it will be empty.
 * <p>
 * ### Polymer Templates
 * <p>
 * Alternatively, the content can be provided with Polymer's Template.
 * Notification finds the first child template and uses that in case renderer callback function
 * is not provided. You can also set a custom template using the `template` property.
 * <p>
 * ```
 * <vaadin-notification>
 * <template>
 * Your work has been saved
 * </template>
 * </vaadin-notification>
 * ```
 * <p>
 * ### Styling
 * <p>
 * `<vaadin-notification>` uses `<vaadin-notification-card>` internal
 * themable component as the actual visible notification cards. See
 * the stylable parts the
 * [`<vaadin-notification-card>` API](https://vaadin.com/components/vaadin-notification/html-api/elements/Vaadin
 * .NotificationCard).
 * <p>
 * Note: the `theme` attribute value set on `<vaadin-notification>` is
 * propagated to the internal `<vaadin-notification-card>`.
 */
public class VaadinNotification extends AbstractComponent<NotificationElement>
        implements HasThemePropertyMixin<NotificationElement, VaadinNotification>,
        HasSlottedComponents<NotificationElement, VaadinNotification, Component<? extends Element>> {
    public VaadinNotification() {
        super("vaadin-notification");
    }

    /**
     * The duration in milliseconds to show the notification.
     * Set to `0` or a negative number to disable the notification auto-closing.
     */
    public double duration() {
        return getNode().getDuration();
    }

    /**
     * The duration in milliseconds to show the notification.
     * Set to `0` or a negative number to disable the notification auto-closing.
     */
    public VaadinNotification duration(double duration) {
        getNode().setDuration(duration);
        return this;
    }

    /**
     * True if the notification is currently displayed.
     */
    public boolean opened() {
        return getNode().isOpened();
    }

    /**
     * True if the notification is currently displayed.
     */
    public VaadinNotification opened(boolean opened) {
        getNode().setOpened(opened);
        return this;
    }

    /**
     * Alignment of the notification in the viewport
     * Valid values are `top-stretch|top-start|top-center|top-end|middle|bottom-start|bottom-center|bottom-end|bottom
     * -stretch`
     */
    @Nullable
    public NotificationPosition position() {
        return getNode().getPosition();
    }

    /**
     * Alignment of the notification in the viewport
     * Valid values are `top-stretch|top-start|top-center|top-end|middle|bottom-start|bottom-center|bottom-end|bottom
     * -stretch`
     */
    public VaadinNotification position(NotificationPosition position) {
        getNode().setPosition(position);
        return this;
    }

    /**
     * Custom function for rendering the content of the notification.
     * Receives two arguments:
     * <p>
     * - `root` The `<vaadin-notification-card>` DOM element. Append
     * your content to it.
     * - `notification` The reference to the `<vaadin-notification>` element.
     */
    @Nullable
    public NotificationRenderer renderer() {
        return getNode().getRenderer();
    }

    /**
     * Custom function for rendering the content of the notification.
     * Receives two arguments:
     * <p>
     * - `root` The `<vaadin-notification-card>` DOM element. Append
     * your content to it.
     * - `notification` The reference to the `<vaadin-notification>` element.
     */
    public VaadinNotification renderer(NotificationRenderer renderer) {
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
     * Opens the notification.
     */
    public void open() {
        getNode().open();
    }

    /**
     * Closes the notification.
     */
    public void close() {
        getNode().close();
    }

    /**
     * Fired when the `opened` property changes.
     */
    public ObservableEvent<BooleanPropertyChangeEvent> openedChangedEvent() {
        return createEvent("opened-changed");
    }

    public VaadinNotification setTopStretch(Component<? extends Element> component) {
        return replaceSlotted("top-stretch", component);
    }

    public VaadinNotification setTopStretch(Component<? extends Element>... components) {
        return replaceSlotted("top-stretch", components);
    }

    public VaadinNotification addToTopStretch(Component<? extends Element> component) {
        return addSlotted("top-stretch", component);
    }

    public VaadinNotification addToTopStretch(Component<? extends Element>... components) {
        return addSlotted("top-stretch", components);
    }

    public VaadinNotification insertToTopStretch(Component<? extends Element> component) {
        return insertSlotted("top-stretch", component);
    }

    public VaadinNotification insertToTopStretch(Component<? extends Element>... components) {
        return insertSlotted("top-stretch", components);
    }

    public VaadinNotification clearTopStretch() {
        return removeAllSlotted("top-stretch");
    }

    public VaadinNotification setTopStart(Component<? extends Element> component) {
        return replaceSlotted("top-start", component);
    }

    public VaadinNotification setTopStart(Component<? extends Element>... components) {
        return replaceSlotted("top-start", components);
    }

    public VaadinNotification addToTopStart(Component<? extends Element> component) {
        return addSlotted("top-start", component);
    }

    public VaadinNotification addToTopStart(Component<? extends Element>... components) {
        return addSlotted("top-start", components);
    }

    public VaadinNotification insertToTopStart(Component<? extends Element> component) {
        return insertSlotted("top-start", component);
    }

    public VaadinNotification insertToTopStart(Component<? extends Element>... components) {
        return insertSlotted("top-start", components);
    }

    public VaadinNotification clearTopStart() {
        return removeAllSlotted("top-start");
    }

    public VaadinNotification setTopCenter(Component<? extends Element> component) {
        return replaceSlotted("top-center", component);
    }

    public VaadinNotification setTopCenter(Component<? extends Element>... components) {
        return replaceSlotted("top-center", components);
    }

    public VaadinNotification addToTopCenter(Component<? extends Element> component) {
        return addSlotted("top-center", component);
    }

    public VaadinNotification addToTopCenter(Component<? extends Element>... components) {
        return addSlotted("top-center", components);
    }

    public VaadinNotification insertToTopCenter(Component<? extends Element> component) {
        return insertSlotted("top-center", component);
    }

    public VaadinNotification insertToTopCenter(Component<? extends Element>... components) {
        return insertSlotted("top-center", components);
    }

    public VaadinNotification clearTopCenter() {
        return removeAllSlotted("top-center");
    }

    public VaadinNotification setTopEnd(Component<? extends Element> component) {
        return replaceSlotted("top-end", component);
    }

    public VaadinNotification setTopEnd(Component<? extends Element>... components) {
        return replaceSlotted("top-end", components);
    }

    public VaadinNotification addToTopEnd(Component<? extends Element> component) {
        return addSlotted("top-end", component);
    }

    public VaadinNotification addToTopEnd(Component<? extends Element>... components) {
        return addSlotted("top-end", components);
    }

    public VaadinNotification insertToTopEnd(Component<? extends Element> component) {
        return insertSlotted("top-end", component);
    }

    public VaadinNotification insertToTopEnd(Component<? extends Element>... components) {
        return insertSlotted("top-end", components);
    }

    public VaadinNotification clearTopEnd() {
        return removeAllSlotted("top-end");
    }

    public VaadinNotification setMiddle(Component<? extends Element> component) {
        return replaceSlotted("middle", component);
    }

    public VaadinNotification setMiddle(Component<? extends Element>... components) {
        return replaceSlotted("middle", components);
    }

    public VaadinNotification addToMiddle(Component<? extends Element> component) {
        return addSlotted("middle", component);
    }

    public VaadinNotification addToMiddle(Component<? extends Element>... components) {
        return addSlotted("middle", components);
    }

    public VaadinNotification insertToMiddle(Component<? extends Element> component) {
        return insertSlotted("middle", component);
    }

    public VaadinNotification insertToMiddle(Component<? extends Element>... components) {
        return insertSlotted("middle", components);
    }

    public VaadinNotification clearMiddle() {
        return removeAllSlotted("middle");
    }

    public VaadinNotification setBottomStart(Component<? extends Element> component) {
        return replaceSlotted("bottom-start", component);
    }

    public VaadinNotification setBottomStart(Component<? extends Element>... components) {
        return replaceSlotted("bottom-start", components);
    }

    public VaadinNotification addToBottomStart(Component<? extends Element> component) {
        return addSlotted("bottom-start", component);
    }

    public VaadinNotification addToBottomStart(Component<? extends Element>... components) {
        return addSlotted("bottom-start", components);
    }

    public VaadinNotification insertToBottomStart(Component<? extends Element> component) {
        return insertSlotted("bottom-start", component);
    }

    public VaadinNotification insertToBottomStart(Component<? extends Element>... components) {
        return insertSlotted("bottom-start", components);
    }

    public VaadinNotification clearBottomStart() {
        return removeAllSlotted("bottom-start");
    }

    public VaadinNotification setBottomCenter(Component<? extends Element> component) {
        return replaceSlotted("bottom-center", component);
    }

    public VaadinNotification setBottomCenter(Component<? extends Element>... components) {
        return replaceSlotted("bottom-center", components);
    }

    public VaadinNotification addToBottomCenter(Component<? extends Element> component) {
        return addSlotted("bottom-center", component);
    }

    public VaadinNotification addToBottomCenter(Component<? extends Element>... components) {
        return addSlotted("bottom-center", components);
    }

    public VaadinNotification insertToBottomCenter(Component<? extends Element> component) {
        return insertSlotted("bottom-center", component);
    }

    public VaadinNotification insertToBottomCenter(Component<? extends Element>... components) {
        return insertSlotted("bottom-center", components);
    }

    public VaadinNotification clearBottomCenter() {
        return removeAllSlotted("bottom-center");
    }

    public VaadinNotification setBottomEnd(Component<? extends Element> component) {
        return replaceSlotted("bottom-end", component);
    }

    public VaadinNotification setBottomEnd(Component<? extends Element>... components) {
        return replaceSlotted("bottom-end", components);
    }

    public VaadinNotification addToBottomEnd(Component<? extends Element> component) {
        return addSlotted("bottom-end", component);
    }

    public VaadinNotification addToBottomEnd(Component<? extends Element>... components) {
        return addSlotted("bottom-end", components);
    }

    public VaadinNotification insertToBottomEnd(Component<? extends Element> component) {
        return insertSlotted("bottom-end", component);
    }

    public VaadinNotification insertToBottomEnd(Component<? extends Element>... components) {
        return insertSlotted("bottom-end", components);
    }

    public VaadinNotification clearBottomEnd() {
        return removeAllSlotted("bottom-end");
    }

    public VaadinNotification setBottomStretch(Component<? extends Element> component) {
        return replaceSlotted("bottom-stretch", component);
    }

    public VaadinNotification setBottomStretch(Component<? extends Element>... components) {
        return replaceSlotted("bottom-stretch", components);
    }

    public VaadinNotification addToBottomStretch(Component<? extends Element> component) {
        return addSlotted("bottom-stretch", component);
    }

    public VaadinNotification addToBottomStretch(Component<? extends Element>... components) {
        return addSlotted("bottom-stretch", components);
    }

    public VaadinNotification insertToBottomStretch(Component<? extends Element> component) {
        return insertSlotted("bottom-stretch", component);
    }

    public VaadinNotification insertToBottomStretch(Component<? extends Element>... components) {
        return insertSlotted("bottom-stretch", components);
    }

    public VaadinNotification clearBottomStretch() {
        return removeAllSlotted("bottom-stretch");
    }
}
