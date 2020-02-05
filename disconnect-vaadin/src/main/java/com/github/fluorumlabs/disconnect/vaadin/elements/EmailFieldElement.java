package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;

/**
 * `<vaadin-email-field>` is a Web Component for email field control in forms.
 * <p>
 * ```html
 * <vaadin-email-field label="Email">
 * </vaadin-email-field>
 * ```
 * <p>
 * ### Styling
 * <p>
 * See vaadin-text-field.html for the styling documentation
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "EmailFieldElement",
		module = "@vaadin/vaadin-text-field/src/vaadin-email-field.js"
)
public interface EmailFieldElement extends TextFieldElement {
}
