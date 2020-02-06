package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.vaadin.constants.DropMode;
import com.github.fluorumlabs.disconnect.vaadin.types.DragAndDropRowData;
import js.lang.Any;
import js.util.function.JsPredicate;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface DragAndDropMixin<ITEM extends Any> extends Element {
	/**
	 * Defines the locations within the Grid row where an element can be dropped.
	 * <p>
	 * Possible values are:
	 *
	 * <ul>
	 * <li><code>between</code>: The drop event can happen between Grid rows.</li>
	 * <li><code>on-top</code>: The drop event can happen on top of Grid rows.</li>
	 * <li><code>on-top-or-between</code>: The drop event can happen either on top of or between Grid rows.</li>
	 * <li><code>on-grid</code>: The drop event will not happen on any specific row, it will show the drop target
	 * outline around the whole grid.</li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	DropMode getDropMode();

	/**
	 * Defines the locations within the Grid row where an element can be dropped.
	 * <p>
	 * Possible values are:
	 *
	 * <ul>
	 * <li><code>between</code>: The drop event can happen between Grid rows.</li>
	 * <li><code>on-top</code>: The drop event can happen on top of Grid rows.</li>
	 * <li><code>on-top-or-between</code>: The drop event can happen either on top of or between Grid rows.</li>
	 * <li><code>on-grid</code>: The drop event will not happen on any specific row, it will show the drop target
	 * outline around the whole grid.</li>
	 * </ul>
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
	 *
	 * <ul>
	 * <li><code>rowData</code> The object with the properties related with
	 * the rendered item, contains:
	 * <ul>
	 * <li><code>rowData.index</code> The index of the item.</li>
	 * <li><code>rowData.item</code> The item.</li>
	 * <li><code>rowData.expanded</code> Sublevel toggle state.</li>
	 * <li><code>rowData.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
	 * <li><code>rowData.selected</code> Selected state.</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	JsPredicate<DragAndDropRowData<ITEM>> getDragFilter();

	/**
	 * A function that filters dragging of specific grid rows. The return value should be false
	 * if dragging of the row should be disabled.
	 * <p>
	 * Receives one argument:
	 *
	 * <ul>
	 * <li><code>rowData</code> The object with the properties related with
	 * the rendered item, contains:
	 * <ul>
	 * <li><code>rowData.index</code> The index of the item.</li>
	 * <li><code>rowData.item</code> The item.</li>
	 * <li><code>rowData.expanded</code> Sublevel toggle state.</li>
	 * <li><code>rowData.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
	 * <li><code>rowData.selected</code> Selected state.</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	@JSProperty
	void setDragFilter(JsPredicate<DragAndDropRowData<ITEM>> dragFilter);

	/**
	 * A function that filters dropping on specific grid rows. The return value should be false
	 * if dropping on the row should be disabled.
	 * <p>
	 * Receives one argument:
	 *
	 * <ul>
	 * <li><code>rowData</code> The object with the properties related with
	 * the rendered item, contains:
	 * <ul>
	 * <li><code>rowData.index</code> The index of the item.</li>
	 * <li><code>rowData.item</code> The item.</li>
	 * <li><code>rowData.expanded</code> Sublevel toggle state.</li>
	 * <li><code>rowData.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
	 * <li><code>rowData.selected</code> Selected state.</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	JsPredicate<DragAndDropRowData<ITEM>> getDropFilter();

	/**
	 * A function that filters dropping on specific grid rows. The return value should be false
	 * if dropping on the row should be disabled.
	 * <p>
	 * Receives one argument:
	 *
	 * <ul>
	 * <li><code>rowData</code> The object with the properties related with
	 * the rendered item, contains:
	 * <ul>
	 * <li><code>rowData.index</code> The index of the item.</li>
	 * <li><code>rowData.item</code> The item.</li>
	 * <li><code>rowData.expanded</code> Sublevel toggle state.</li>
	 * <li><code>rowData.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
	 * <li><code>rowData.selected</code> Selected state.</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	@JSProperty
	void setDropFilter(JsPredicate<DragAndDropRowData<ITEM>> dropFilter);

	/**
	 * Runs the <code>dragFilter</code> and <code>dropFilter</code> hooks for the visible cells.
	 * If the filter depends on varying conditions, you may need to
	 * call this function manually in order to update the draggability when
	 * the conditions change.
	 */
	void filterDragAndDrop();
}
