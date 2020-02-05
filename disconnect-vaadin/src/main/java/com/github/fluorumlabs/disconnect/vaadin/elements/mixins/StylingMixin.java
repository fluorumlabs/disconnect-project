package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.CellClassNameGenerator;
import js.lang.Any;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "StylingMixin",
		module = "@vaadin/vaadin-grid/src/vaadin-grid-styling-mixin.js"
)
public interface StylingMixin<ITEM extends Any> extends Element {
	/**
	 * A function that allows generating CSS class names for grid cells
	 * based on their row and column. The return value should be the generated
	 * class name as a string, or multiple class names separated by whitespace
	 * characters.
	 * <p>
	 * Receives two arguments:
	 * - `column` The `<vaadin-grid-column>` element (`undefined` for details-cell).
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
	CellClassNameGenerator<ITEM> getCellClassNameGenerator();

	/**
	 * A function that allows generating CSS class names for grid cells
	 * based on their row and column. The return value should be the generated
	 * class name as a string, or multiple class names separated by whitespace
	 * characters.
	 * <p>
	 * Receives two arguments:
	 * - `column` The `<vaadin-grid-column>` element (`undefined` for details-cell).
	 * - `rowData` The object with the properties related with
	 * the rendered item, contains:
	 * - `rowData.index` The index of the item.
	 * - `rowData.item` The item.
	 * - `rowData.expanded` Sublevel toggle state.
	 * - `rowData.level` Level of the tree represented with a horizontal offset of the toggle button.
	 * - `rowData.selected` Selected state.
	 */
	@JSProperty
	void setCellClassNameGenerator(CellClassNameGenerator<ITEM> cellClassNameGenerator);

	/**
	 * Runs the `cellClassNameGenerator` for the visible cells.
	 * If the generator depends on varying conditions, you need to
	 * call this function manually in order to update the styles when
	 * the conditions change.
	 */
	void generateCellClassNames();
}
