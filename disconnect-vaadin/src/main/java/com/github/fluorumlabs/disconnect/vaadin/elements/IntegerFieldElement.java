package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;

/**
 * `<vaadin-integer-field>` is a Web Component for integer field control in forms.
 * <p>
 * ```html
 * <vaadin-integer-field label="Number">
 * </vaadin-integer-field>
 * ```
 */
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "IntegerFieldElement",
        module = "@vaadin/vaadin-text-field/src/vaadin-integer-field.js"
)
public interface IntegerFieldElement extends NumberFieldElement {
}
