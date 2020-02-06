package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridColumnElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasColumnBaseMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.CellRenderer;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.lang.Any;

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
public class VaadinGridColumn<ITEM extends Any> extends AbstractComponent<GridColumnElement<ITEM>> implements
		HasColumnBaseMixin<ITEM, GridColumnElement<ITEM>, VaadinGridColumn<ITEM>>,
		HasComponents<GridColumnElement<ITEM>, VaadinGridColumn<ITEM>, Component<?>> {
	public VaadinGridColumn() {
		super(GridColumnElement.TAGNAME());
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
	public VaadinGridColumn<ITEM> width(String width) {
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
	public VaadinGridColumn<ITEM> flexGrow(double flexGrow) {
		getNode().setFlexGrow(flexGrow);
		return this;
	}

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
	public CellRenderer<ITEM> renderer() {
		return getNode().getRenderer();
	}

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
	public VaadinGridColumn<ITEM> renderer(CellRenderer<ITEM> renderer) {
		getNode().setRenderer(renderer);
		return this;
	}

	/**
	 * Path to an item sub-property whose value gets displayed in the column body cells.
	 * The property name is also shown in the column header if an explicit header or renderer isn't defined.
	 */
	@Nullable
	public String path() {
		return getNode().getPath();
	}

	/**
	 * Path to an item sub-property whose value gets displayed in the column body cells.
	 * The property name is also shown in the column header if an explicit header or renderer isn't defined.
	 */
	public VaadinGridColumn<ITEM> path(String path) {
		getNode().setPath(path);
		return this;
	}

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
	public boolean autoWidth() {
		return getNode().isAutoWidth();
	}

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
	public VaadinGridColumn<ITEM> autoWidth(boolean autoWidth) {
		getNode().setAutoWidth(autoWidth);
		return this;
	}
}
