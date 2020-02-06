package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A mixin for <code>nav</code> elements, facilitating multiple selection of childNodes.
 */

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
