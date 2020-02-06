package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;

/**
 * The cell editor checkbox element.
 *
 * <h3>Styling</h3>
 * See
 * <a href="https://github.com/vaadin/vaadin-checkbox/blob/master/src/vaadin-checkbox.html"><code>&lt;vaadin-checkbox&gt;</code> documentation</a>
 * for <code>&lt;vaadin-checkbox&gt;</code> parts.
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-grid-pro/vaadin-grid-pro-edit-checkbox.js"
)
public interface GridProEditCheckboxElement extends CheckboxElement {
	static String TAGNAME() {
		return "vaadin-grid-pro-edit-checkbox";
	}
}
