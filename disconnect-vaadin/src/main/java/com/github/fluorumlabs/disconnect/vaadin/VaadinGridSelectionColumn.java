package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridSelectionColumnElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;

import javax.annotation.Nullable;

/**
 * `<vaadin-grid-selection-column>` is a helper element for the `<vaadin-grid>`
 * that provides default templates and functionality for item selection.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid items="[[items]]">
 * <vaadin-grid-selection-column frozen auto-select></vaadin-grid-selection-column>
 * <p>
 * <vaadin-grid-column>
 * ...
 * ```
 * <p>
 * By default the selection column displays `<vaadin-checkbox>` elements in the
 * column cells. The checkboxes in the body rows toggle selection of the corresponding row items.
 * <p>
 * When the grid data is provided as an array of [`items`](#/elements/vaadin-grid#property-items),
 * the column header gets an additional checkbox that can be used for toggling
 * selection for all the items at once.
 * <p>
 * __The default content can also be overridden__
 */
public class VaadinGridSelectionColumn<ITEM extends Any> extends AbstractComponent<GridSelectionColumnElement<ITEM>>
		implements HasComponents<GridSelectionColumnElement<ITEM>, VaadinGridSelectionColumn<ITEM>, Component<?>> {
	public VaadinGridSelectionColumn() {
		super("vaadin-grid-selection-column");
	}

	/**
	 * Width of the cells for this column.
	 */
	@Nullable
	public String width() {
		return getNode().getWidth();
	}

	/**
	 * Width of the cells for this column.
	 */
	public VaadinGridSelectionColumn<ITEM> width(String width) {
		getNode().setWidth(width);
		return this;
	}

	/**
	 * Flex grow ratio for the cell widths. When set to 0, cell width is fixed.
	 */
	public double flexGrow() {
		return getNode().getFlexGrow();
	}

	/**
	 * Flex grow ratio for the cell widths. When set to 0, cell width is fixed.
	 */
	public VaadinGridSelectionColumn<ITEM> flexGrow(double flexGrow) {
		getNode().setFlexGrow(flexGrow);
		return this;
	}

	/**
	 * When true, all the items are selected.
	 */
	public boolean selectAll() {
		return getNode().isSelectAll();
	}

	/**
	 * When true, all the items are selected.
	 */
	public VaadinGridSelectionColumn<ITEM> selectAll(boolean selectAll) {
		getNode().setSelectAll(selectAll);
		return this;
	}

	/**
	 * When true, the active gets automatically selected.
	 */
	public boolean autoSelect() {
		return getNode().isAutoSelect();
	}

	/**
	 * When true, the active gets automatically selected.
	 */
	public VaadinGridSelectionColumn<ITEM> autoSelect(boolean autoSelect) {
		getNode().setAutoSelect(autoSelect);
		return this;
	}

	/**
	 * Fired when the `selectAll` property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> selectAllChangedEvent() {
		return createEvent("select-all-changed");
	}
}
