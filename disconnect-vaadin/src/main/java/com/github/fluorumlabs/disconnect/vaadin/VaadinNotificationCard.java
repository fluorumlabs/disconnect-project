package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.NotificationCard;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasSlots;

/**
 * The container element for the notification
 *
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>overlay</code></td><td>The notification container</td></tr>
 * <tr><td><code>content</code></td><td>The content of the notification</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinNotificationCard extends AbstractComponent<NotificationCard>
		implements HasThemableMixin<NotificationCard, VaadinNotificationCard>,
		HasSlots<NotificationCard>,
		HasComponents<NotificationCard, VaadinNotificationCard, Component<?>> {
	public VaadinNotificationCard() {
		super(NotificationCard.TAGNAME());
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
