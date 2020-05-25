package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.CrudGridElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.*;
import com.github.fluorumlabs.disconnect.zero.component.*;
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
@WebComponent
public class CrudGrid<ITEM extends Any> extends AbstractComponent<CrudGridElement<ITEM>>
		implements HasIncludedMixin<CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasThemableMixin<Grid.Variant, CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasA11yMixin<CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasActiveItemMixin<ITEM, CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasArrayDataProviderMixin<ITEM, CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasColumnResizingMixin<ITEM, CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasDataProviderMixin<ITEM, CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasDynamicColumnsMixin<CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasFilterMixin<CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasRowDetailsMixin<ITEM, CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasScrollMixin<CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasSelectionMixin<ITEM, CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasSortMixin<CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasKeyboardNavigationMixin<CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasColumnReorderingMixin<ITEM, CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasEventContextMixin<ITEM, CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasStylingMixin<ITEM, CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasDragAndDropMixin<ITEM, CrudGridElement<ITEM>, CrudGrid<ITEM>>,
		HasSlots<CrudGridElement<ITEM>>,
		HasStyle<CrudGridElement<ITEM>, CrudGrid<ITEM>>, HasComponents<CrudGridElement<ITEM>, CrudGrid<ITEM>, HasElement<?>> {
	public CrudGrid() {
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
	public CrudGrid<ITEM> noFilter(boolean noFilter) {
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
	public CrudGrid<ITEM> noSort(boolean noSort) {
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
	public CrudGrid<ITEM> noHead(boolean noHead) {
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
	public CrudGrid<ITEM> heightByRows(boolean heightByRows) {
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
