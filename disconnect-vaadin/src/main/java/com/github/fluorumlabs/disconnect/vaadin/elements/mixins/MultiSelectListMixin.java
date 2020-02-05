package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A mixin for <code>nav</code> elements, facilitating multiple selection of childNodes.
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "MultiSelectListMixin",
		module = "@vaadin/vaadin-list-mixin/vaadin-multi-select-list-mixin.js"
)
public interface MultiSelectListMixin extends ListMixin {
	/**
	 * Specifies that multiple options can be selected at once.
	 */
	@JSProperty
	boolean isMultiple();

	/**
	 * Specifies that multiple options can be selected at once.
	 */
	@JSProperty
	void setMultiple(boolean multiple);

	/**
	 * Array of indexes of the items selected in the items array
	 * Note: Not updated when used in single selection mode.
	 */
	@Nullable
	@JSProperty
	int[] getSelectedValues();

	/**
	 * Array of indexes of the items selected in the items array
	 * Note: Not updated when used in single selection mode.
	 */
	@JSProperty
	void setSelectedValues(@JSByRef int... selectedValues);
}
