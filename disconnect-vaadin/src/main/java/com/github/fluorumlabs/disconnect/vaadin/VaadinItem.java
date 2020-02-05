package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.ItemElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasItemMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * `<vaadin-item>` is a Web Component providing layout for items in tabs and menus.
 * <p>
 * ```
 * <vaadin-item>
 * Item content
 * </vaadin-item>
 * ```
 * <p>
 * ### Selectable
 * <p>
 * `<vaadin-item>` has the `selected` property and the corresponding state attribute.
 * Currently, the component sets the `selected` to false, when `disabled` property is set to true.
 * But other than that, the `<vaadin-item>` does not switch selection by itself.
 * In general, it is the wrapper component, like `<vaadin-list-box>`, which should update
 * the `selected` property on the items, e. g. on mousedown or when Enter / Spacebar is pressed.
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ---|---
 * `content` | The element that wraps the slot
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute  | Description | Part name
 * -----------|-------------|------------
 * `disabled` | Set to a disabled item | :host
 * `focused` | Set when the element is focused | :host
 * `focus-ring` | Set when the element is keyboard focused | :host
 * `selected` | Set when the item is selected | :host
 * `active` | Set when mousedown or enter/spacebar pressed | :host
 */
public class VaadinItem extends AbstractComponent<ItemElement> implements HasItemMixin<ItemElement, VaadinItem>,
		HasThemableMixin<ItemElement, VaadinItem>,
		HasComponents<ItemElement, VaadinItem, Component<?>> {
	public VaadinItem() {
		super("vaadin-item");
	}

	/**
	 * Submittable string value. The default value is the trimmed text content of the element.
	 */
	public String value() {
		return getNode().getValue();
	}

	/**
	 * Submittable string value. The default value is the trimmed text content of the element.
	 */
	public VaadinItem value(String value) {
		getNode().setValue(value);
		return this;
	}
}
