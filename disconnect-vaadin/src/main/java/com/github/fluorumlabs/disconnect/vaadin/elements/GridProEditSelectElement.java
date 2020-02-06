package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The cell editor select element.
 *
 * <h3>Styling</h3>
 * See
 * <a href="https://github.com/vaadin/vaadin-select/blob/master/src/vaadin-select.html"><code>&lt;vaadin-select&gt;</code> documentation</a>
 * for <code>&lt;vaadin-grid-pro-edit-select&gt;</code> parts.
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "GridProEditSelectElement",
		module = "@vaadin/vaadin-grid-pro/vaadin-grid-pro-edit-select.js"
)
public interface GridProEditSelectElement extends SelectElement {
	String TAGNAME = "vaadin-grid-pro-edit-select";

	@Nullable
	@JSProperty
	String[] getOptions();

	@JSProperty
	void setOptions(@JSByRef String... options);
}
