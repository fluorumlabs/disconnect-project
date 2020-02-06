package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ColumnBaseMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.CellRenderer;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A <code>&lt;vaadin-grid-column&gt;</code> is used to configure how a column in <code>&lt;vaadin-grid&gt;</code>
 * should look like.
 * <p>
 * See <code>&lt;vaadin-grid&gt;</code> documentation and demos for instructions and examples on how
 * to configure the <code>&lt;vaadin-grid-column&gt;</code>.
 *
 * <pre><code></code></pre>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "GridColumnElement",
		module = "@vaadin/vaadin-grid/vaadin-grid-column.js"
)
public interface GridColumnElement<ITEM extends Any> extends HTMLElement, ColumnBaseMixin<ITEM> {
	/**
	 * Width of the cells for this column.
	 */
	@Nullable
	@JSProperty
	String getWidth();

	/**
	 * Width of the cells for this column.
	 */
	@JSProperty
	void setWidth(String width);

	/**
	 * Flex grow ratio for the cell widths. When set to 0, cell width is fixed.
	 */
	@JSProperty
	double getFlexGrow();

	/**
	 * Flex grow ratio for the cell widths. When set to 0, cell width is fixed.
	 */
	@JSProperty
	void setFlexGrow(double flexGrow);

	/**
	 * Custom function for rendering the cell content.
	 * Receives three arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The cell content DOM element. Append your content to it.</li>
	 * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
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
	CellRenderer<ITEM> getRenderer();

	/**
	 * Custom function for rendering the cell content.
	 * Receives three arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The cell content DOM element. Append your content to it.</li>
	 * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
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
	void setRenderer(CellRenderer<ITEM> renderer);

	/**
	 * Path to an item sub-property whose value gets displayed in the column body cells.
	 * The property name is also shown in the column header if an explicit header or renderer isn't defined.
	 */
	@Nullable
	@JSProperty
	String getPath();

	/**
	 * Path to an item sub-property whose value gets displayed in the column body cells.
	 * The property name is also shown in the column header if an explicit header or renderer isn't defined.
	 */
	@JSProperty
	void setPath(String path);

	/**
	 * Automatically sets the width of the column based on the column contents when this is set to <code>true</code>.
	 * <p>
	 * For performance reasons the column width is calculated automatically only once when the grid items
	 * are rendered for the first time and the calculation only considers the rows which are currently
	 * rendered in DOM (a bit more than what is currently visible). If the grid is scrolled, or the cell
	 * content changes, the column width might not match the contents anymore.
	 * <p>
	 * Hidden columns are ignored in the calculation and their widths are not automatically updated when
	 * you show a column that was initially hidden.
	 * <p>
	 * You can manually trigger the auto sizing behavior again by calling <code>grid.recalculateColumnWidths()</code>.
	 * <p>
	 * The column width may still grow larger when <code>flexGrow</code> is not 0.
	 */
	@JSProperty
	boolean isAutoWidth();

	/**
	 * Automatically sets the width of the column based on the column contents when this is set to <code>true</code>.
	 * <p>
	 * For performance reasons the column width is calculated automatically only once when the grid items
	 * are rendered for the first time and the calculation only considers the rows which are currently
	 * rendered in DOM (a bit more than what is currently visible). If the grid is scrolled, or the cell
	 * content changes, the column width might not match the contents anymore.
	 * <p>
	 * Hidden columns are ignored in the calculation and their widths are not automatically updated when
	 * you show a column that was initially hidden.
	 * <p>
	 * You can manually trigger the auto sizing behavior again by calling <code>grid.recalculateColumnWidths()</code>.
	 * <p>
	 * The column width may still grow larger when <code>flexGrow</code> is not 0.
	 */
	@JSProperty
	void setAutoWidth(boolean autoWidth);
}
