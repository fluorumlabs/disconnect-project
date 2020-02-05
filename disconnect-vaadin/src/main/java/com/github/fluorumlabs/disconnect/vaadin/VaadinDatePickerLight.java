package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.DatePickerLightElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasDatePickerMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

import javax.annotation.Nullable;

/**
 * `<vaadin-date-picker-light>` is a customizable version of the `<vaadin-date-picker>` providing
 * only the scrollable month calendar view and leaving the input field definition to the user.
 * <p>
 * To create a custom input field, you need to add a child element which has a two-way
 * data-bindable property representing the input value. The property name is expected
 * to be `bindValue` by default. See the example below for a simplest possible example
 * using an `<input>` element extended with `iron-input`.
 * <p>
 * ```html
 * <vaadin-date-picker-light>
 * <iron-input>
 * <input/>
 * </iron-input>
 * </vaadin-date-picker-light>
 * ```
 * <p>
 * If you are using other custom input fields like `<paper-input>`, you
 * need to define the name of value property using the `attrForValue` property.
 * <p>
 * ```html
 * <vaadin-date-picker-light attr-for-value="value">
 * <paper-input label="Birthday">
 * </paper-input>
 * </vaadin-date-picker-light>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description | Theme for Element
 * ----------------|----------------|----------------
 * `overlay-content` | The overlay element | vaadin-date-picker-light
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 * <p>
 * In addition to `<vaadin-date-picker-light>` itself, the following
 * internal components are themable:
 * <p>
 * - `<vaadin-date-picker-overlay>`
 * - `<vaadin-date-picker-overlay-content>`
 * - `<vaadin-month-calendar>`
 * <p>
 * Note: the `theme` attribute value set on `<vaadin-date-picker-light>`
 * is propagated to the internal themable components listed above.
 */
public class VaadinDatePickerLight extends AbstractComponent<DatePickerLightElement>
        implements HasThemableMixin<DatePickerLightElement, VaadinDatePickerLight>,
        HasDatePickerMixin<DatePickerLightElement, VaadinDatePickerLight>,
        HasComponents<DatePickerLightElement, VaadinDatePickerLight, Component<?>> {
    public VaadinDatePickerLight() {
        super("vaadin-date-picker-light");
    }

    /**
     * Name of the two-way data-bindable property representing the
     * value of the custom input field.
     */
    @Nullable
    public String attrForValue() {
        return getNode().getAttrForValue();
    }

    /**
     * Name of the two-way data-bindable property representing the
     * value of the custom input field.
     */
    public VaadinDatePickerLight attrForValue(String attrForValue) {
        getNode().setAttrForValue(attrForValue);
        return this;
    }
}
