package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.lang.Any;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "GridSelectionColumnElement",
		module = "@vaadin/vaadin-grid/src/vaadin-grid-selection-column.js"
)
public interface GridSelectionColumnElement<ITEM extends Any> extends GridColumnElement<ITEM> {
	/**
	 * When true, all the items are selected.
	 */
	@JSProperty
	boolean isSelectAll();

	/**
	 * When true, all the items are selected.
	 */
	@JSProperty
	void setSelectAll(boolean selectAll);

	/**
	 * When true, the active gets automatically selected.
	 */
	@JSProperty
	boolean isAutoSelect();

	/**
	 * When true, the active gets automatically selected.
	 */
	@JSProperty
	void setAutoSelect(boolean autoSelect);
}
