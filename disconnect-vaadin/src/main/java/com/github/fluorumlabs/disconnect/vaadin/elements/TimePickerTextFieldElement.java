package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;

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
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "TimePickerTextFieldElement",
        module = "@vaadin/vaadin-time-picker/src/vaadin-time-picker-text-field.js"
)
public interface TimePickerTextFieldElement extends TextFieldElement {
}
