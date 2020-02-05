package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.mixins.HasGestureEventListeners;
import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.CheckboxElement;
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
 * `<vaadin-checkbox>` is a Web Component for customized checkboxes.
 * <p>
 * ```html
 * <vaadin-checkbox>
 * Make my profile visible
 * </vaadin-checkbox>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name         | Description
 * ------------------|----------------
 * `checkbox`        | The wrapper element for the native <input type="checkbox">
 * `label`           | The wrapper element in which the component's children, namely the label, is slotted
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|--------------
 * `active`     | Set when the checkbox is pressed down, either with mouse, touch or the keyboard. | `:host`
 * `disabled`   | Set when the checkbox is disabled. | `:host`
 * `focus-ring` | Set when the checkbox is focused using the keyboard. | `:host`
 * `focused`    | Set when the checkbox is focused. | `:host`
 * `indeterminate` | Set when the checkbox is in indeterminate mode. | `:host`
 * `checked` | Set when the checkbox is checked. | `:host`
 * `empty` | Set when there is no label provided. | `label`
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinCheckbox extends AbstractComponent<CheckboxElement>
		implements HasElementMixin<CheckboxElement, VaadinCheckbox>,
		HasControlStateMixin<CheckboxElement, VaadinCheckbox>,
		HasThemableMixin<CheckboxElement, VaadinCheckbox>,
		HasGestureEventListeners<CheckboxElement, VaadinCheckbox>,
		HasComponents<CheckboxElement, VaadinCheckbox, Component<?>> {
	public VaadinCheckbox() {
		super("vaadin-checkbox");
	}

	/**
	 * Name of the element.
	 */
	public String name() {
		return getNode().getName();
	}

	/**
	 * Name of the element.
	 */
	public VaadinCheckbox name(String name) {
		getNode().setName(name);
		return this;
	}

	/**
	 * True if the checkbox is checked.
	 */
	public boolean checked() {
		return getNode().isChecked();
	}

	/**
	 * True if the checkbox is checked.
	 */
	public VaadinCheckbox checked(boolean checked) {
		getNode().setChecked(checked);
		return this;
	}

	/**
	 * Indeterminate state of the checkbox when it's neither checked nor unchecked, but undetermined.
	 * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes
	 */
	public boolean indeterminate() {
		return getNode().isIndeterminate();
	}

	/**
	 * Indeterminate state of the checkbox when it's neither checked nor unchecked, but undetermined.
	 * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes
	 */
	public VaadinCheckbox indeterminate(boolean indeterminate) {
		getNode().setIndeterminate(indeterminate);
		return this;
	}

	/**
	 * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
	 */
	@Nullable
	public String value() {
		return getNode().getValue();
	}

	/**
	 * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
	 */
	public VaadinCheckbox value(String value) {
		getNode().setValue(value);
		return this;
	}

	/**
	 * Fired when the user commits a value change.
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

	/**
	 * Fired when the `indeterminate` property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> indeterminateChangedEvent() {
		return createEvent("indeterminate-changed");
	}
}
