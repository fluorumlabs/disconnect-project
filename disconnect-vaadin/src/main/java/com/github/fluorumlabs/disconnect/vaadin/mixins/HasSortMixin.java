package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.SortMixin;
import com.github.fluorumlabs.disconnect.core.components.HasElement;

public interface HasSortMixin<E extends SortMixin, T extends HasElement<E>> extends HasElement<E> {
	/**
	 * When <code>true</code>, all <code>&lt;vaadin-grid-sorter&gt;</code> are applied for sorting.
	 */
	default boolean multiSort() {
		return getNode().isMultiSort();
	}

	/**
	 * When <code>true</code>, all <code>&lt;vaadin-grid-sorter&gt;</code> are applied for sorting.
	 */
	default T multiSort(boolean multiSort) {
		getNode().setMultiSort(multiSort);
		return (T) this;
	}
}
