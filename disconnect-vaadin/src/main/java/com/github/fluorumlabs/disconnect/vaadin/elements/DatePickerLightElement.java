package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.DatePickerMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "DatePickerLightElement",
        module = "@vaadin/vaadin-date-picker/src/vaadin-date-picker-light.js"
)
public interface DatePickerLightElement extends HTMLElement, ThemableMixin, DatePickerMixin {
    /**
     * Name of the two-way data-bindable property representing the
     * value of the custom input field.
     */
    @Nullable
    @JSProperty
    String getAttrForValue();

    /**
     * Name of the two-way data-bindable property representing the
     * value of the custom input field.
     */
    @JSProperty
    void setAttrForValue(String attrForValue);
}
