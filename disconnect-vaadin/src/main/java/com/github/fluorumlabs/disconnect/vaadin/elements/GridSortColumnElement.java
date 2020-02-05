package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.SortDirection;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `<vaadin-grid-sort-column>` is a helper element for the `<vaadin-grid>`
 * that provides default header template and functionality for sorting.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid items="[[items]]">
 * <vaadin-grid-sort-column path="name.first" direction="asc"></vaadin-grid-sort-column>
 * <p>
 * <vaadin-grid-column>
 * ...
 * ```
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "GridSortColumnElement",
		module = "@vaadin/vaadin-grid/src/vaadin-grid-sort-column.js"
)
public interface GridSortColumnElement<ITEM extends Any> extends GridColumnElement<ITEM> {
	/**
	 * How to sort the data.
	 * Possible values are `asc` to use an ascending algorithm, `desc` to sort the data in
	 * descending direction, or `null` for not sorting the data.
	 */
	@Nullable
	@JSProperty
	SortDirection getDirection();

	/**
	 * How to sort the data.
	 * Possible values are `asc` to use an ascending algorithm, `desc` to sort the data in
	 * descending direction, or `null` for not sorting the data.
	 */
	@JSProperty
	void setDirection(SortDirection direction);
}
