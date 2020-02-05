package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.constants.DropLocation;
import com.github.fluorumlabs.disconnect.vaadin.constants.DropMode;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.DragAndDropMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.DragAndDropRowData;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;
import js.util.collections.Array;
import js.util.function.JsPredicate;
import js.web.dom.CustomEvent;
import js.web.dom.Event;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

public interface HasDragAndDropMixin<ITEM extends Any, E extends DragAndDropMixin<ITEM>, T extends Component<E>>
		extends Component<E> {
	/**
	 * Defines the locations within the Grid row where an element can be dropped.
	 * <p>
	 * Possible values are:
	 * - `between`: The drop event can happen between Grid rows.
	 * - `on-top`: The drop event can happen on top of Grid rows.
	 * - `on-top-or-between`: The drop event can happen either on top of or between Grid rows.
	 * - `on-grid`: The drop event will not happen on any specific row, it will show the drop target outline around
	 * the whole grid.
	 */
	@Nullable
	default DropMode dropMode() {
		return getNode().getDropMode();
	}

	/**
	 * Defines the locations within the Grid row where an element can be dropped.
	 * <p>
	 * Possible values are:
	 * - `between`: The drop event can happen between Grid rows.
	 * - `on-top`: The drop event can happen on top of Grid rows.
	 * - `on-top-or-between`: The drop event can happen either on top of or between Grid rows.
	 * - `on-grid`: The drop event will not happen on any specific row, it will show the drop target outline around
	 * the whole grid.
	 */
	default T dropMode(DropMode dropMode) {
		getNode().setDropMode(dropMode);
		return (T) this;
	}

	/**
	 * Marks the grid's rows to be available for dragging.
	 */
	default boolean rowsDraggable() {
		return getNode().isRowsDraggable();
	}

	/**
	 * Marks the grid's rows to be available for dragging.
	 */
	default T rowsDraggable(boolean rowsDraggable) {
		getNode().setRowsDraggable(rowsDraggable);
		return (T) this;
	}

	/**
	 * A function that filters dragging of specific grid rows. The return value should be false
	 * if dragging of the row should be disabled.
	 * <p>
	 * Receives one argument:
	 * - `rowData` The object with the properties related with
	 * the rendered item, contains:
	 * - `rowData.index` The index of the item.
	 * - `rowData.item` The item.
	 * - `rowData.expanded` Sublevel toggle state.
	 * - `rowData.level` Level of the tree represented with a horizontal offset of the toggle button.
	 * - `rowData.selected` Selected state.
	 */
	@Nullable
	default JsPredicate<DragAndDropRowData<ITEM>> dragFilter() {
		return getNode().getDragFilter();
	}

	/**
	 * A function that filters dragging of specific grid rows. The return value should be false
	 * if dragging of the row should be disabled.
	 * <p>
	 * Receives one argument:
	 * - `rowData` The object with the properties related with
	 * the rendered item, contains:
	 * - `rowData.index` The index of the item.
	 * - `rowData.item` The item.
	 * - `rowData.expanded` Sublevel toggle state.
	 * - `rowData.level` Level of the tree represented with a horizontal offset of the toggle button.
	 * - `rowData.selected` Selected state.
	 */
	default T dragFilter(JsPredicate<DragAndDropRowData<ITEM>> dragFilter) {
		getNode().setDragFilter(dragFilter);
		return (T) this;
	}

	/**
	 * A function that filters dropping on specific grid rows. The return value should be false
	 * if dropping on the row should be disabled.
	 * <p>
	 * Receives one argument:
	 * - `rowData` The object with the properties related with
	 * the rendered item, contains:
	 * - `rowData.index` The index of the item.
	 * - `rowData.item` The item.
	 * - `rowData.expanded` Sublevel toggle state.
	 * - `rowData.level` Level of the tree represented with a horizontal offset of the toggle button.
	 * - `rowData.selected` Selected state.
	 */
	@Nullable
	default JsPredicate<DragAndDropRowData<ITEM>> dropFilter() {
		return getNode().getDropFilter();
	}

	/**
	 * A function that filters dropping on specific grid rows. The return value should be false
	 * if dropping on the row should be disabled.
	 * <p>
	 * Receives one argument:
	 * - `rowData` The object with the properties related with
	 * the rendered item, contains:
	 * - `rowData.index` The index of the item.
	 * - `rowData.item` The item.
	 * - `rowData.expanded` Sublevel toggle state.
	 * - `rowData.level` Level of the tree represented with a horizontal offset of the toggle button.
	 * - `rowData.selected` Selected state.
	 */
	default T dropFilter(JsPredicate<DragAndDropRowData<ITEM>> dropFilter) {
		getNode().setDropFilter(dropFilter);
		return (T) this;
	}

	/**
	 * Runs the `dragFilter` and `dropFilter` hooks for the visible cells.
	 * If the filter depends on varying conditions, you may need to
	 * call this function manually in order to update the draggability when
	 * the conditions change.
	 */
	default void filterDragAndDrop() {
		getNode().filterDragAndDrop();
	}

	/**
	 * Fired when the dragging of the rows ends.
	 */
	default ObservableEvent<Event> gridDragendEvent() {
		return createEvent("grid-dragend");
	}

	/**
	 * Fired when starting to drag grid rows.
	 */
	default ObservableEvent<CustomEvent<DragstartDetails<ITEM>>> gridDragstartEvent() {
		return createEvent("grid-dragstart");
	}

	/**
	 * Fired when a drop occurs on top of the grid.
	 */
	default ObservableEvent<CustomEvent<DropDetails<ITEM>>> gridDropEvent() {
		return createEvent("grid-drop");
	}

	interface DragstartDetails<ITEM extends Any> extends Any {
		@JSProperty
		Array<ITEM> getDraggedItems();

		void setDragData(String type, String data);

		void setDraggedItemsCount(int count);
	}

	interface DropDetails<ITEM extends Any> extends Any {
		@Nullable
		@JSProperty
		ITEM getDragOverItem();

		@JSProperty
		DropLocation getDropLocation();

		@JSProperty
		Array<DragData> getDragData();
	}

	interface DragData extends Any {
		@JSProperty
		String getType();

		@JSProperty
		String getData();
	}
}
