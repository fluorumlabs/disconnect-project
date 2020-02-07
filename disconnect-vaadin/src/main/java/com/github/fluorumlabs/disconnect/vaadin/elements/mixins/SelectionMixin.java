package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface SelectionMixin<ITEM extends Any> extends Element {
	/**
	 * An array that contains the selected items.
	 */
	@Nullable
	@JSProperty
	Array<ITEM> getSelectedItems();

	/**
	 * An array that contains the selected items.
	 */
	@JSProperty
	void setSelectedItems(ITEM... selectedItems);

	@JSProperty
	void setSelectedItems(Array<ITEM> selectedItems);

	/**
	 * Selects the given item.
	 *
	 * @param item The item object
	 */
	void selectItem(ITEM item);

	/**
	 * Deselects the given item if it is already selected.
	 *
	 * @param item The item object
	 */
	void deselectItem(ITEM item);
}
