package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.SelectionMixin;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import js.lang.Any;
import js.util.collections.Array;

import javax.annotation.Nullable;

public interface HasSelectionMixin<ITEM extends Any, E extends SelectionMixin<ITEM>, T extends HasElement<E>>
		extends HasElement<E> {
	/**
	 * An array that contains the selected items.
	 */
	@Nullable
	default Array<ITEM> selectedItems() {
		return getNode().getSelectedItems();
	}

	/**
	 * An array that contains the selected items.
	 */
	default T selectedItems(ITEM... selectedItems) {
		getNode().setSelectedItems(selectedItems);
		return (T) this;
	}

	default T selectedItems(Array<ITEM> selectedItems) {
		getNode().setSelectedItems(selectedItems);
		return (T) this;
	}

	/**
	 * Selects the given item.
	 *
	 * @param item The item object
	 */
	default void selectItem(ITEM item) {
		getNode().selectItem(item);
	}

	/**
	 * Deselects the given item if it is already selected.
	 *
	 * @param item The item object
	 */
	default void deselectItem(ITEM item) {
		getNode().deselectItem(item);
	}
}
