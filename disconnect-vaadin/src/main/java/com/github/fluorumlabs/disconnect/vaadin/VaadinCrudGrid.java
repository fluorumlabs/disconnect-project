package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.CrudGridElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.*;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasSlots;
import js.lang.Any;

/**
 * <code>&lt;vaadin-crud-grid&gt;</code> is a <code>&lt;vaadin-grid&gt;</code> which automatically configures all its
 * columns based
 * on the JSON structure of the first item received.
 * <p>
 * You cannot manually configure columns but you can still style the grid as it's described in
 * <code>&lt;vaadin-grid&gt;</code>
 * <a href="https://vaadin.com/components/vaadin-grid/html-api/elements/Vaadin.GridElement">Documentation</a>
 */
public class VaadinCrudGrid<ITEM extends Any> extends AbstractComponent<CrudGridElement<ITEM>>
		implements HasIncludedMixin<CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasThemableMixin<VaadinGrid.Variant, CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasA11yMixin<CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasActiveItemMixin<ITEM, CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasArrayDataProviderMixin<ITEM, CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasColumnResizingMixin<ITEM, CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasDataProviderMixin<ITEM, CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasDynamicColumnsMixin<CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasFilterMixin<CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasRowDetailsMixin<ITEM, CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasScrollMixin<CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasSelectionMixin<ITEM, CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasSortMixin<CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasKeyboardNavigationMixin<CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasColumnReorderingMixin<ITEM, CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasEventContextMixin<ITEM, CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasStylingMixin<ITEM, CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasDragAndDropMixin<ITEM, CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>>,
		HasSlots<CrudGridElement<ITEM>>,
		HasComponents<CrudGridElement<ITEM>, VaadinCrudGrid<ITEM>, Component<?>> {
	public VaadinCrudGrid() {
		super(CrudGridElement.TAGNAME());
	}

	/**
	 * Disable filtering in the generated columns.
	 */
	public boolean noFilter() {
		return getNode().isNoFilter();
	}

	/**
	 * Disable filtering in the generated columns.
	 */
	public VaadinCrudGrid<ITEM> noFilter(boolean noFilter) {
		getNode().setNoFilter(noFilter);
		return this;
	}

	/**
	 * Disable sorting in the generated columns.
	 */
	public boolean noSort() {
		return getNode().isNoSort();
	}

	/**
	 * Disable sorting in the generated columns.
	 */
	public VaadinCrudGrid<ITEM> noSort(boolean noSort) {
		getNode().setNoSort(noSort);
		return this;
	}

	/**
	 * Do not add headers to columns.
	 */
	public boolean noHead() {
		return getNode().isNoHead();
	}

	/**
	 * Do not add headers to columns.
	 */
	public VaadinCrudGrid<ITEM> noHead(boolean noHead) {
		getNode().setNoHead(noHead);
		return this;
	}

	/**
	 * If true, the grid's height is defined by the number of its rows.
	 */
	public boolean heightByRows() {
		return getNode().isHeightByRows();
	}

	/**
	 * If true, the grid's height is defined by the number of its rows.
	 */
	public VaadinCrudGrid<ITEM> heightByRows(boolean heightByRows) {
		getNode().setHeightByRows(heightByRows);
		return this;
	}

	/**
	 * Updates the <code>width</code> of all columns which have <code>autoWidth</code> set to <code>true</code>.
	 */
	public void recalculateColumnWidths() {
		getNode().recalculateColumnWidths();
	}

	/**
	 * Manually invoke existing renderers for all the columns
	 * (header, footer and body cells) and opened row details.
	 */
	public void render() {
		getNode().render();
	}

	/**
	 * Updates the computed metrics and positioning of internal grid parts
	 * (row/details cell positioning etc). Needs to be invoked whenever the sizing of grid
	 * content changes asynchronously to ensure consistent appearance (e.g. when a
	 * contained image whose bounds aren't known beforehand finishes loading).
	 */
	public void notifyResize() {
		getNode().notifyResize();
	}

	public HasSlots.Container nodistributeSlot() {
		return slotted("nodistribute");
	}
}
