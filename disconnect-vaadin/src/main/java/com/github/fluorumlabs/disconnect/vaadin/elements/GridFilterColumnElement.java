package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.lang.Any;

/**
 * `<vaadin-grid-filter-column>` is a helper element for the `<vaadin-grid>`
 * that provides default header template and functionality for filtering.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid items="[[items]]">
 * <vaadin-grid-filter-column path="name.first"></vaadin-grid-filter-column>
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
		symbols = "GridFilterColumnElement",
		module = "@vaadin/vaadin-grid/src/vaadin-grid-filter-column.js"
)
public interface GridFilterColumnElement<ITEM extends Any> extends GridColumnElement<ITEM> {
}
