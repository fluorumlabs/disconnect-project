package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridColumnElement;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ColumnReorderingMixin;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.CustomEvent;
import org.teavm.jso.JSProperty;

public interface HasColumnReorderingMixin<ITEM extends Any, E extends ColumnReorderingMixin, T extends HasElement<E>>
		extends HasElement<E> {
	/**
	 * Set to true to allow column reordering.
	 */
	default boolean columnReorderingAllowed() {
		return getNode().isColumnReorderingAllowed();
	}

	/**
	 * Set to true to allow column reordering.
	 */
	default T columnReorderingAllowed(boolean columnReorderingAllowed) {
		getNode().setColumnReorderingAllowed(columnReorderingAllowed);
		return (T) this;
	}

	/**
	 * Fired when the columns in the grid are reordered.
	 */
	default ObservableEvent<CustomEvent<ColumnReorderDetails<ITEM>>> columnReorderEvent() {
		return createEvent("column-reorder");
	}

	interface ColumnReorderDetails<ITEM extends Any> extends Any {
		@JSProperty
		Array<GridColumnElement<ITEM>> getColumns();
	}
}
