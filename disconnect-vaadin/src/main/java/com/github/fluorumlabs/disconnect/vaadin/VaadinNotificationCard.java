package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.NotificationCard;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import js.web.dom.Element;

/**
 * The container element for the notification
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ----------------|----------------
 * `overlay` | The notification container
 * `content` | The content of the notification
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinNotificationCard extends AbstractComponent<NotificationCard>
        implements HasThemableMixin<NotificationCard, VaadinNotificationCard>,
        HasSlottedComponents<NotificationCard, VaadinNotificationCard, Component<? extends Element>> {
    public VaadinNotificationCard() {
        super("vaadin-notification-card");
    }

    public VaadinNotificationCard setTopStretch(Component<? extends Element> component) {
        return replaceSlotted("top-stretch", component);
    }

    public VaadinNotificationCard setTopStretch(Component<? extends Element>... components) {
        return replaceSlotted("top-stretch", components);
    }

    public VaadinNotificationCard addToTopStretch(Component<? extends Element> component) {
        return addSlotted("top-stretch", component);
    }

    public VaadinNotificationCard addToTopStretch(Component<? extends Element>... components) {
        return addSlotted("top-stretch", components);
    }

    public VaadinNotificationCard insertToTopStretch(Component<? extends Element> component) {
        return insertSlotted("top-stretch", component);
    }

    public VaadinNotificationCard insertToTopStretch(Component<? extends Element>... components) {
        return insertSlotted("top-stretch", components);
    }

    public VaadinNotificationCard clearTopStretch() {
        return removeAllSlotted("top-stretch");
    }

    public VaadinNotificationCard setTopStart(Component<? extends Element> component) {
        return replaceSlotted("top-start", component);
    }

    public VaadinNotificationCard setTopStart(Component<? extends Element>... components) {
        return replaceSlotted("top-start", components);
    }

    public VaadinNotificationCard addToTopStart(Component<? extends Element> component) {
        return addSlotted("top-start", component);
    }

    public VaadinNotificationCard addToTopStart(Component<? extends Element>... components) {
        return addSlotted("top-start", components);
    }

    public VaadinNotificationCard insertToTopStart(Component<? extends Element> component) {
        return insertSlotted("top-start", component);
    }

    public VaadinNotificationCard insertToTopStart(Component<? extends Element>... components) {
        return insertSlotted("top-start", components);
    }

    public VaadinNotificationCard clearTopStart() {
        return removeAllSlotted("top-start");
    }

    public VaadinNotificationCard setTopCenter(Component<? extends Element> component) {
        return replaceSlotted("top-center", component);
    }

    public VaadinNotificationCard setTopCenter(Component<? extends Element>... components) {
        return replaceSlotted("top-center", components);
    }

    public VaadinNotificationCard addToTopCenter(Component<? extends Element> component) {
        return addSlotted("top-center", component);
    }

    public VaadinNotificationCard addToTopCenter(Component<? extends Element>... components) {
        return addSlotted("top-center", components);
    }

    public VaadinNotificationCard insertToTopCenter(Component<? extends Element> component) {
        return insertSlotted("top-center", component);
    }

    public VaadinNotificationCard insertToTopCenter(Component<? extends Element>... components) {
        return insertSlotted("top-center", components);
    }

    public VaadinNotificationCard clearTopCenter() {
        return removeAllSlotted("top-center");
    }

    public VaadinNotificationCard setTopEnd(Component<? extends Element> component) {
        return replaceSlotted("top-end", component);
    }

    public VaadinNotificationCard setTopEnd(Component<? extends Element>... components) {
        return replaceSlotted("top-end", components);
    }

    public VaadinNotificationCard addToTopEnd(Component<? extends Element> component) {
        return addSlotted("top-end", component);
    }

    public VaadinNotificationCard addToTopEnd(Component<? extends Element>... components) {
        return addSlotted("top-end", components);
    }

    public VaadinNotificationCard insertToTopEnd(Component<? extends Element> component) {
        return insertSlotted("top-end", component);
    }

    public VaadinNotificationCard insertToTopEnd(Component<? extends Element>... components) {
        return insertSlotted("top-end", components);
    }

    public VaadinNotificationCard clearTopEnd() {
        return removeAllSlotted("top-end");
    }

    public VaadinNotificationCard setMiddle(Component<? extends Element> component) {
        return replaceSlotted("middle", component);
    }

    public VaadinNotificationCard setMiddle(Component<? extends Element>... components) {
        return replaceSlotted("middle", components);
    }

    public VaadinNotificationCard addToMiddle(Component<? extends Element> component) {
        return addSlotted("middle", component);
    }

    public VaadinNotificationCard addToMiddle(Component<? extends Element>... components) {
        return addSlotted("middle", components);
    }

    public VaadinNotificationCard insertToMiddle(Component<? extends Element> component) {
        return insertSlotted("middle", component);
    }

    public VaadinNotificationCard insertToMiddle(Component<? extends Element>... components) {
        return insertSlotted("middle", components);
    }

    public VaadinNotificationCard clearMiddle() {
        return removeAllSlotted("middle");
    }

    public VaadinNotificationCard setBottomStart(Component<? extends Element> component) {
        return replaceSlotted("bottom-start", component);
    }

    public VaadinNotificationCard setBottomStart(Component<? extends Element>... components) {
        return replaceSlotted("bottom-start", components);
    }

    public VaadinNotificationCard addToBottomStart(Component<? extends Element> component) {
        return addSlotted("bottom-start", component);
    }

    public VaadinNotificationCard addToBottomStart(Component<? extends Element>... components) {
        return addSlotted("bottom-start", components);
    }

    public VaadinNotificationCard insertToBottomStart(Component<? extends Element> component) {
        return insertSlotted("bottom-start", component);
    }

    public VaadinNotificationCard insertToBottomStart(Component<? extends Element>... components) {
        return insertSlotted("bottom-start", components);
    }

    public VaadinNotificationCard clearBottomStart() {
        return removeAllSlotted("bottom-start");
    }

    public VaadinNotificationCard setBottomCenter(Component<? extends Element> component) {
        return replaceSlotted("bottom-center", component);
    }

    public VaadinNotificationCard setBottomCenter(Component<? extends Element>... components) {
        return replaceSlotted("bottom-center", components);
    }

    public VaadinNotificationCard addToBottomCenter(Component<? extends Element> component) {
        return addSlotted("bottom-center", component);
    }

    public VaadinNotificationCard addToBottomCenter(Component<? extends Element>... components) {
        return addSlotted("bottom-center", components);
    }

    public VaadinNotificationCard insertToBottomCenter(Component<? extends Element> component) {
        return insertSlotted("bottom-center", component);
    }

    public VaadinNotificationCard insertToBottomCenter(Component<? extends Element>... components) {
        return insertSlotted("bottom-center", components);
    }

    public VaadinNotificationCard clearBottomCenter() {
        return removeAllSlotted("bottom-center");
    }

    public VaadinNotificationCard setBottomEnd(Component<? extends Element> component) {
        return replaceSlotted("bottom-end", component);
    }

    public VaadinNotificationCard setBottomEnd(Component<? extends Element>... components) {
        return replaceSlotted("bottom-end", components);
    }

    public VaadinNotificationCard addToBottomEnd(Component<? extends Element> component) {
        return addSlotted("bottom-end", component);
    }

    public VaadinNotificationCard addToBottomEnd(Component<? extends Element>... components) {
        return addSlotted("bottom-end", components);
    }

    public VaadinNotificationCard insertToBottomEnd(Component<? extends Element> component) {
        return insertSlotted("bottom-end", component);
    }

    public VaadinNotificationCard insertToBottomEnd(Component<? extends Element>... components) {
        return insertSlotted("bottom-end", components);
    }

    public VaadinNotificationCard clearBottomEnd() {
        return removeAllSlotted("bottom-end");
    }

    public VaadinNotificationCard setBottomStretch(Component<? extends Element> component) {
        return replaceSlotted("bottom-stretch", component);
    }

    public VaadinNotificationCard setBottomStretch(Component<? extends Element>... components) {
        return replaceSlotted("bottom-stretch", components);
    }

    public VaadinNotificationCard addToBottomStretch(Component<? extends Element> component) {
        return addSlotted("bottom-stretch", component);
    }

    public VaadinNotificationCard addToBottomStretch(Component<? extends Element>... components) {
        return addSlotted("bottom-stretch", components);
    }

    public VaadinNotificationCard insertToBottomStretch(Component<? extends Element> component) {
        return insertSlotted("bottom-stretch", component);
    }

    public VaadinNotificationCard insertToBottomStretch(Component<? extends Element>... components) {
        return insertSlotted("bottom-stretch", components);
    }

    public VaadinNotificationCard clearBottomStretch() {
        return removeAllSlotted("bottom-stretch");
    }
}
