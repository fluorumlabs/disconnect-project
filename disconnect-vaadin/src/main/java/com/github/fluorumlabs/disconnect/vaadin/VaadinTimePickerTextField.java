package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.TimePickerTextFieldElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * The text-field element.
 * <p>
 * ### Styling
 * <p>
 * See [`<vaadin-text-field>` documentation](https://github
 * .com/vaadin/vaadin-text-field/blob/master/src/vaadin-text-field.html)
 * for `<vaadin-time-picker-text-field>` parts and available slots (prefix, suffix etc.)
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinTimePickerTextField extends AbstractComponent<TimePickerTextFieldElement>
		implements HasComponents<TimePickerTextFieldElement, VaadinTimePickerTextField, Component<?>> {
	public VaadinTimePickerTextField() {
		super("vaadin-time-picker-text-field");
	}
}
