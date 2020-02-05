package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.DropMode;
import com.github.fluorumlabs.disconnect.vaadin.types.DragAndDropRowData;
import js.lang.Any;
import js.util.function.JsPredicate;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "DragAndDropMixin",
		module = "@vaadin/vaadin-grid/src/vaadin-grid-drag-and-drop-mixin.js"
)
public interface DragAndDropMixin<ITEM extends Any> extends Element {
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
	@JSProperty
	DropMode getDropMode();

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
	@JSProperty
	void setDropMode(DropMode dropMode);

	/**
	 * Marks the grid's rows to be available for dragging.
	 */
	@JSProperty
	boolean isRowsDraggable();

	/**
	 * Marks the grid's rows to be available for dragging.
	 */
	@JSProperty
	void setRowsDraggable(boolean rowsDraggable);

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
	@JSProperty
	JsPredicate<DragAndDropRowData<ITEM>> getDragFilter();

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
	@JSProperty
	void setDragFilter(JsPredicate<DragAndDropRowData<ITEM>> dragFilter);

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
	@JSProperty
	JsPredicate<DragAndDropRowData<ITEM>> getDropFilter();

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
	@JSProperty
	void setDropFilter(JsPredicate<DragAndDropRowData<ITEM>> dropFilter);

	/**
	 * Runs the `dragFilter` and `dropFilter` hooks for the visible cells.
	 * If the filter depends on varying conditions, you may need to
	 * call this function manually in order to update the draggability when
	 * the conditions change.
	 */
	void filterDragAndDrop();
}
