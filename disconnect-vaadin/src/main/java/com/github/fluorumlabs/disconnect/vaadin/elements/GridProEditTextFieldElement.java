package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;

/**
 * The cell editor text-field element.
 *
 * <h3>Styling</h3>
 * See
 * <a href="https://github.com/vaadin/vaadin-text-field/blob/master/src/vaadin-text-field.html"><code>&lt;vaadin-text-field&gt;</code> documentation</a>
 * for <code>&lt;vaadin-text-field&gt;</code> parts.
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "GridProEditTextFieldElement",
		module = "@vaadin/vaadin-grid-pro/vaadin-grid-pro-edit-text-field.js"
)
public interface GridProEditTextFieldElement extends TextFieldElement {
	String TAGNAME = "vaadin-grid-pro-edit-text-field";
}
