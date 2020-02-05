package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.mixins.HasGestureEventListeners;
import com.github.fluorumlabs.disconnect.vaadin.elements.ButtonElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import js.web.dom.Element;

/**
 * `<vaadin-button>` is a Web Component providing an accessible and customizable button.
 * <p>
 * ```html
 * <vaadin-button>
 * </vaadin-button>
 * ```
 * <p>
 * ```js
 * document.querySelector('vaadin-button').addEventListener('click', () => alert('Hello World!'));
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are exposed for styling:
 * <p>
 * Part name | Description
 * ----------------|----------------
 * `label` | The label (text) inside the button
 * `prefix` | A slot for e.g. an icon before the label
 * `suffix` | A slot for e.g. an icon after the label
 * <p>
 * <p>
 * The following attributes are exposed for styling:
 * <p>
 * Attribute | Description
 * --------- | -----------
 * `active` | Set when the button is pressed down, either with mouse, touch or the keyboard.
 * `disabled` | Set when the button is disabled.
 * `focus-ring` | Set when the button is focused using the keyboard.
 * `focused` | Set when the button is focused.
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinButton extends AbstractComponent<ButtonElement>
		implements HasElementMixin<ButtonElement, VaadinButton>,
		HasControlStateMixin<ButtonElement, VaadinButton>,
		HasThemableMixin<ButtonElement, VaadinButton>,
		HasGestureEventListeners<ButtonElement, VaadinButton>,
		HasSlottedComponents<ButtonElement, VaadinButton, Component<? extends Element>> {
	public VaadinButton() {
		super("vaadin-button");
	}

	public VaadinButton setPrefix(Component<? extends Element> component) {
		return replaceSlotted("prefix", component);
	}

	public VaadinButton setPrefix(Component<? extends Element>... components) {
		return replaceSlotted("prefix", components);
	}

	public VaadinButton addToPrefix(Component<? extends Element> component) {
		return addSlotted("prefix", component);
	}

	public VaadinButton addToPrefix(Component<? extends Element>... components) {
		return addSlotted("prefix", components);
	}

	public VaadinButton insertToPrefix(Component<? extends Element> component) {
		return insertSlotted("prefix", component);
	}

	public VaadinButton insertToPrefix(Component<? extends Element>... components) {
		return insertSlotted("prefix", components);
	}

	public VaadinButton clearPrefix() {
		return removeAllSlotted("prefix");
	}

	public VaadinButton setSuffix(Component<? extends Element> component) {
		return replaceSlotted("suffix", component);
	}

	public VaadinButton setSuffix(Component<? extends Element>... components) {
		return replaceSlotted("suffix", components);
	}

	public VaadinButton addToSuffix(Component<? extends Element> component) {
		return addSlotted("suffix", component);
	}

	public VaadinButton addToSuffix(Component<? extends Element>... components) {
		return addSlotted("suffix", components);
	}

	public VaadinButton insertToSuffix(Component<? extends Element> component) {
		return insertSlotted("suffix", component);
	}

	public VaadinButton insertToSuffix(Component<? extends Element>... components) {
		return insertSlotted("suffix", components);
	}

	public VaadinButton clearSuffix() {
		return removeAllSlotted("suffix");
	}
}
