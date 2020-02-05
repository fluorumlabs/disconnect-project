package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.NotificationContainer;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasSlots;

/**
 * The container element for all notifications.
 */
public class VaadinNotificationContainer extends AbstractComponent<NotificationContainer>
		implements HasSlots<NotificationContainer>,
		HasComponents<NotificationContainer, VaadinNotificationContainer, Component<?>> {
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

	public HasSlots.Container topStretchSlot() {
		return slotted("top-stretch");
	}

	public HasSlots.Container topStartSlot() {
		return slotted("top-start");
	}

	public HasSlots.Container topCenterSlot() {
		return slotted("top-center");
	}

	public HasSlots.Container topEndSlot() {
		return slotted("top-end");
	}

	public HasSlots.Container middleSlot() {
		return slotted("middle");
	}

	public HasSlots.Container bottomStartSlot() {
		return slotted("bottom-start");
	}

	public HasSlots.Container bottomCenterSlot() {
		return slotted("bottom-center");
	}

	public HasSlots.Container bottomEndSlot() {
		return slotted("bottom-end");
	}

	public HasSlots.Container bottomStretchSlot() {
		return slotted("bottom-stretch");
	}
}
