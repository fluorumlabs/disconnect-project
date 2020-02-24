package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.zero.component.*;

/**
 * The container element for all notifications.
 */
@WebComponent
public class NotificationContainer
		extends AbstractComponent<com.github.fluorumlabs.disconnect.vaadin.elements.NotificationContainer>
		implements HasSlots<com.github.fluorumlabs.disconnect.vaadin.elements.NotificationContainer>,
		HasStyle<com.github.fluorumlabs.disconnect.vaadin.elements.NotificationContainer, NotificationContainer>,
		HasComponents<com.github.fluorumlabs.disconnect.vaadin.elements.NotificationContainer, NotificationContainer,
				Component<?>> {
	public NotificationContainer() {
		super(com.github.fluorumlabs.disconnect.vaadin.elements.NotificationContainer.TAGNAME());
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
	public NotificationContainer opened(boolean opened) {
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
