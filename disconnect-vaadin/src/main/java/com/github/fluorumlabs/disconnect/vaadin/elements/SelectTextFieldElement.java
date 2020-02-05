package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

/**
 * The text-field element.
 * <p>
 * ### Styling
 * <p>
 * See [`<vaadin-text-field>` documentation](https://github
 * .com/vaadin/vaadin-text-field/blob/master/src/vaadin-text-field.html)
 * for `<vaadin-select-text-field>` parts and available slots (prefix, suffix etc.)
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "SelectTextFieldElement",
		module = "@vaadin/vaadin-select/src/vaadin-select-text-field.js"
)
public interface SelectTextFieldElement extends TextFieldElement {
	/**
	 * FIXME type ?
	 */
	@JSProperty
	Element getInputElement();
}
