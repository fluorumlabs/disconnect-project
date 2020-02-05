package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.NotificationContainer;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import js.web.dom.Element;

/**
 * The container element for all notifications.
 */
public class VaadinNotificationContainer extends AbstractComponent<NotificationContainer>
		implements HasSlottedComponents<NotificationContainer, VaadinNotificationContainer,
		Component<? extends Element>> {
	public VaadinNotificationContainer() {
		super("vaadin-notification-container");
	}

	/**
	 * True when the container is opened
	 */
	public boolean opened() {
		return getNode().isOpened();
	}

	/**
	 * True when the container is opened
	 */
	public VaadinNotificationContainer opened(boolean opened) {
		getNode().setOpened(opened);
		return this;
	}

	public VaadinNotificationContainer setTopStretch(Component<? extends Element> component) {
		return replaceSlotted("top-stretch", component);
	}

	public VaadinNotificationContainer setTopStretch(Component<? extends Element>... components) {
		return replaceSlotted("top-stretch", components);
	}

	public VaadinNotificationContainer addToTopStretch(Component<? extends Element> component) {
		return addSlotted("top-stretch", component);
	}

	public VaadinNotificationContainer addToTopStretch(Component<? extends Element>... components) {
		return addSlotted("top-stretch", components);
	}

	public VaadinNotificationContainer insertToTopStretch(Component<? extends Element> component) {
		return insertSlotted("top-stretch", component);
	}

	public VaadinNotificationContainer insertToTopStretch(Component<? extends Element>... components) {
		return insertSlotted("top-stretch", components);
	}

	public VaadinNotificationContainer clearTopStretch() {
		return removeAllSlotted("top-stretch");
	}

	public VaadinNotificationContainer setTopStart(Component<? extends Element> component) {
		return replaceSlotted("top-start", component);
	}

	public VaadinNotificationContainer setTopStart(Component<? extends Element>... components) {
		return replaceSlotted("top-start", components);
	}

	public VaadinNotificationContainer addToTopStart(Component<? extends Element> component) {
		return addSlotted("top-start", component);
	}

	public VaadinNotificationContainer addToTopStart(Component<? extends Element>... components) {
		return addSlotted("top-start", components);
	}

	public VaadinNotificationContainer insertToTopStart(Component<? extends Element> component) {
		return insertSlotted("top-start", component);
	}

	public VaadinNotificationContainer insertToTopStart(Component<? extends Element>... components) {
		return insertSlotted("top-start", components);
	}

	public VaadinNotificationContainer clearTopStart() {
		return removeAllSlotted("top-start");
	}

	public VaadinNotificationContainer setTopCenter(Component<? extends Element> component) {
		return replaceSlotted("top-center", component);
	}

	public VaadinNotificationContainer setTopCenter(Component<? extends Element>... components) {
		return replaceSlotted("top-center", components);
	}

	public VaadinNotificationContainer addToTopCenter(Component<? extends Element> component) {
		return addSlotted("top-center", component);
	}

	public VaadinNotificationContainer addToTopCenter(Component<? extends Element>... components) {
		return addSlotted("top-center", components);
	}

	public VaadinNotificationContainer insertToTopCenter(Component<? extends Element> component) {
		return insertSlotted("top-center", component);
	}

	public VaadinNotificationContainer insertToTopCenter(Component<? extends Element>... components) {
		return insertSlotted("top-center", components);
	}

	public VaadinNotificationContainer clearTopCenter() {
		return removeAllSlotted("top-center");
	}

	public VaadinNotificationContainer setTopEnd(Component<? extends Element> component) {
		return replaceSlotted("top-end", component);
	}

	public VaadinNotificationContainer setTopEnd(Component<? extends Element>... components) {
		return replaceSlotted("top-end", components);
	}

	public VaadinNotificationContainer addToTopEnd(Component<? extends Element> component) {
		return addSlotted("top-end", component);
	}

	public VaadinNotificationContainer addToTopEnd(Component<? extends Element>... components) {
		return addSlotted("top-end", components);
	}

	public VaadinNotificationContainer insertToTopEnd(Component<? extends Element> component) {
		return insertSlotted("top-end", component);
	}

	public VaadinNotificationContainer insertToTopEnd(Component<? extends Element>... components) {
		return insertSlotted("top-end", components);
	}

	public VaadinNotificationContainer clearTopEnd() {
		return removeAllSlotted("top-end");
	}

	public VaadinNotificationContainer setMiddle(Component<? extends Element> component) {
		return replaceSlotted("middle", component);
	}

	public VaadinNotificationContainer setMiddle(Component<? extends Element>... components) {
		return replaceSlotted("middle", components);
	}

	public VaadinNotificationContainer addToMiddle(Component<? extends Element> component) {
		return addSlotted("middle", component);
	}

	public VaadinNotificationContainer addToMiddle(Component<? extends Element>... components) {
		return addSlotted("middle", components);
	}

	public VaadinNotificationContainer insertToMiddle(Component<? extends Element> component) {
		return insertSlotted("middle", component);
	}

	public VaadinNotificationContainer insertToMiddle(Component<? extends Element>... components) {
		return insertSlotted("middle", components);
	}

	public VaadinNotificationContainer clearMiddle() {
		return removeAllSlotted("middle");
	}

	public VaadinNotificationContainer setBottomStart(Component<? extends Element> component) {
		return replaceSlotted("bottom-start", component);
	}

	public VaadinNotificationContainer setBottomStart(Component<? extends Element>... components) {
		return replaceSlotted("bottom-start", components);
	}

	public VaadinNotificationContainer addToBottomStart(Component<? extends Element> component) {
		return addSlotted("bottom-start", component);
	}

	public VaadinNotificationContainer addToBottomStart(Component<? extends Element>... components) {
		return addSlotted("bottom-start", components);
	}

	public VaadinNotificationContainer insertToBottomStart(Component<? extends Element> component) {
		return insertSlotted("bottom-start", component);
	}

	public VaadinNotificationContainer insertToBottomStart(Component<? extends Element>... components) {
		return insertSlotted("bottom-start", components);
	}

	public VaadinNotificationContainer clearBottomStart() {
		return removeAllSlotted("bottom-start");
	}

	public VaadinNotificationContainer setBottomCenter(Component<? extends Element> component) {
		return replaceSlotted("bottom-center", component);
	}

	public VaadinNotificationContainer setBottomCenter(Component<? extends Element>... components) {
		return replaceSlotted("bottom-center", components);
	}

	public VaadinNotificationContainer addToBottomCenter(Component<? extends Element> component) {
		return addSlotted("bottom-center", component);
	}

	public VaadinNotificationContainer addToBottomCenter(Component<? extends Element>... components) {
		return addSlotted("bottom-center", components);
	}

	public VaadinNotificationContainer insertToBottomCenter(Component<? extends Element> component) {
		return insertSlotted("bottom-center", component);
	}

	public VaadinNotificationContainer insertToBottomCenter(Component<? extends Element>... components) {
		return insertSlotted("bottom-center", components);
	}

	public VaadinNotificationContainer clearBottomCenter() {
		return removeAllSlotted("bottom-center");
	}

	public VaadinNotificationContainer setBottomEnd(Component<? extends Element> component) {
		return replaceSlotted("bottom-end", component);
	}

	public VaadinNotificationContainer setBottomEnd(Component<? extends Element>... components) {
		return replaceSlotted("bottom-end", components);
	}

	public VaadinNotificationContainer addToBottomEnd(Component<? extends Element> component) {
		return addSlotted("bottom-end", component);
	}

	public VaadinNotificationContainer addToBottomEnd(Component<? extends Element>... components) {
		return addSlotted("bottom-end", components);
	}

	public VaadinNotificationContainer insertToBottomEnd(Component<? extends Element> component) {
		return insertSlotted("bottom-end", component);
	}

	public VaadinNotificationContainer insertToBottomEnd(Component<? extends Element>... components) {
		return insertSlotted("bottom-end", components);
	}

	public VaadinNotificationContainer clearBottomEnd() {
		return removeAllSlotted("bottom-end");
	}

	public VaadinNotificationContainer setBottomStretch(Component<? extends Element> component) {
		return replaceSlotted("bottom-stretch", component);
	}

	public VaadinNotificationContainer setBottomStretch(Component<? extends Element>... components) {
		return replaceSlotted("bottom-stretch", components);
	}

	public VaadinNotificationContainer addToBottomStretch(Component<? extends Element> component) {
		return addSlotted("bottom-stretch", component);
	}

	public VaadinNotificationContainer addToBottomStretch(Component<? extends Element>... components) {
		return addSlotted("bottom-stretch", components);
	}

	public VaadinNotificationContainer insertToBottomStretch(Component<? extends Element> component) {
		return insertSlotted("bottom-stretch", component);
	}

	public VaadinNotificationContainer insertToBottomStretch(Component<? extends Element>... components) {
		return insertSlotted("bottom-stretch", components);
	}

	public VaadinNotificationContainer clearBottomStretch() {
		return removeAllSlotted("bottom-stretch");
	}
}
