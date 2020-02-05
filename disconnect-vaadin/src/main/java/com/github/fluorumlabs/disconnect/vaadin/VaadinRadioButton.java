package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.mixins.HasGestureEventListeners;
import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.RadioButtonElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Event;

import javax.annotation.Nullable;

/**
 * `<vaadin-radio-button>` is a Web Component for radio buttons.
 * <p>
 * ```html
 * <vaadin-radio-button value="foo">Foo</vaadin-radio-button>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name         | Description
 * ------------------|----------------
 * `radio`           | The radio button element
 * `label`           | The label content element
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute  | Description | Part name
 * -----------|-------------|------------
 * `disabled`   | Set when the radio button is disabled. | :host
 * `focus-ring` | Set when the radio button is focused using the keyboard. | :host
 * `focused`    | Set when the radio button is focused. | :host
 * `checked`    | Set when the radio button is checked. | :host
 * `empty`      | Set when there is no label provided. | label
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinRadioButton extends AbstractComponent<RadioButtonElement>
		implements HasElementMixin<RadioButtonElement, VaadinRadioButton>,
		HasControlStateMixin<RadioButtonElement, VaadinRadioButton>,
		HasThemableMixin<RadioButtonElement, VaadinRadioButton>,
		HasGestureEventListeners<RadioButtonElement, VaadinRadioButton>,
		HasComponents<RadioButtonElement, VaadinRadioButton, Component<?>> {
	public VaadinRadioButton() {
		super("vaadin-radio-button");
	}

	/**
	 * Name of the element.
	 */
	@Nullable
	public String name() {
		return getNode().getName();
	}

	/**
	 * Name of the element.
	 */
	public VaadinRadioButton name(String name) {
		getNode().setName(name);
		return this;
	}

	/**
	 * True if the radio button is checked.
	 */
	public boolean checked() {
		return getNode().isChecked();
	}

	/**
	 * True if the radio button is checked.
	 */
	public VaadinRadioButton checked(boolean checked) {
		getNode().setChecked(checked);
		return this;
	}

	/**
	 * The value for this element.
	 */
	@Nullable
	public String value() {
		return getNode().getValue();
	}

	/**
	 * The value for this element.
	 */
	public VaadinRadioButton value(String value) {
		getNode().setValue(value);
		return this;
	}

	/**
	 * Fired when the user toggles the radio button.
	 */
	public ObservableEvent<Event> changeEvent() {
		return createEvent("change");
	}

	/**
	 * Fired when the `checked` property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> checkedChangedEvent() {
		return createEvent("checked-changed");
	}
}
