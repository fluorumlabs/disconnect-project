package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.StylingMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.CellClassNameGenerator;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.lang.Any;

import javax.annotation.Nullable;

public interface HasStylingMixin<ITEM extends Any, E extends StylingMixin<ITEM>, T extends Component<E>>
		extends Component<E> {
	/**
	 * A function that allows generating CSS class names for grid cells
	 * based on their row and column. The return value should be the generated
	 * class name as a string, or multiple class names separated by whitespace
	 * characters.
	 * <p>
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element (<code>undefined</code> for
	 * details-cell).</li>
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
	default CellClassNameGenerator<ITEM> cellClassNameGenerator() {
		return getNode().getCellClassNameGenerator();
	}

	/**
	 * A function that allows generating CSS class names for grid cells
	 * based on their row and column. The return value should be the generated
	 * class name as a string, or multiple class names separated by whitespace
	 * characters.
	 * <p>
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element (<code>undefined</code> for
	 * details-cell).</li>
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
	default T cellClassNameGenerator(CellClassNameGenerator<ITEM> cellClassNameGenerator) {
		getNode().setCellClassNameGenerator(cellClassNameGenerator);
		return (T) this;
	}

	/**
	 * Runs the <code>cellClassNameGenerator</code> for the visible cells.
	 * If the generator depends on varying conditions, you need to
	 * call this function manually in order to update the styles when
	 * the conditions change.
	 */
	default void generateCellClassNames() {
		getNode().generateCellClassNames();
	}
}
