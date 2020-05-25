package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ArrayDataProviderMixin;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import js.lang.Any;
import js.util.collections.Array;

import javax.annotation.Nullable;

public interface HasArrayDataProviderMixin<ITEM extends Any, E extends ArrayDataProviderMixin<ITEM>,
		T extends HasElement<E>>
		extends HasElement<E> {
	/**
	 * An array containing the items which will be stamped to the column template
	 * instances.
	 */
	@Nullable
	default Array<ITEM> items() {
		return getNode().getItems();
	}

	/**
	 * An array containing the items which will be stamped to the column template
	 * instances.
	 */
	default T items(ITEM... items) {
		getNode().setItems(items);
		return (T) this;
	}

	/**
	 * An array containing the items which will be stamped to the column template
	 * instances.
	 */
	default T items(Array<ITEM> items) {
		getNode().setItems(items);
		return (T) this;
	}
}
