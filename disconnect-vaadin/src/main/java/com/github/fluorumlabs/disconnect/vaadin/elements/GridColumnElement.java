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
 * A `<vaadin-grid-column>` is used to configure how a column in `<vaadin-grid>`
 * should look like.
 * <p>
 * See `<vaadin-grid>` documentation and demos for instructions and examples on how
 * to configure the `<vaadin-grid-column>`.
 * ```
 */
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "GridColumnElement",
        module = "@vaadin/vaadin-grid/src/vaadin-grid-column.js"
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
     * <p>
     * - `root` The cell content DOM element. Append your content to it.
     * - `column` The `<vaadin-grid-column>` element.
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
    CellRenderer<ITEM> getRenderer();

    /**
     * Custom function for rendering the cell content.
     * Receives three arguments:
     * <p>
     * - `root` The cell content DOM element. Append your content to it.
     * - `column` The `<vaadin-grid-column>` element.
     * - `rowData` The object with the properties related with
     * the rendered item, contains:
     * - `rowData.index` The index of the item.
     * - `rowData.item` The item.
     * - `rowData.expanded` Sublevel toggle state.
     * - `rowData.level` Level of the tree represented with a horizontal offset of the toggle button.
     * - `rowData.selected` Selected state.
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
     * Automatically sets the width of the column based on the column contents when this is set to `true`.
     * <p>
     * For performance reasons the column width is calculated automatically only once when the grid items
     * are rendered for the first time and the calculation only considers the rows which are currently
     * rendered in DOM (a bit more than what is currently visible). If the grid is scrolled, or the cell
     * content changes, the column width might not match the contents anymore.
     * <p>
     * Hidden columns are ignored in the calculation and their widths are not automatically updated when
     * you show a column that was initially hidden.
     * <p>
     * You can manually trigger the auto sizing behavior again by calling `grid.recalculateColumnWidths()`.
     * <p>
     * The column width may still grow larger when `flexGrow` is not 0.
     */
    @JSProperty
    boolean isAutoWidth();

    /**
     * Automatically sets the width of the column based on the column contents when this is set to `true`.
     * <p>
     * For performance reasons the column width is calculated automatically only once when the grid items
     * are rendered for the first time and the calculation only considers the rows which are currently
     * rendered in DOM (a bit more than what is currently visible). If the grid is scrolled, or the cell
     * content changes, the column width might not match the contents anymore.
     * <p>
     * Hidden columns are ignored in the calculation and their widths are not automatically updated when
     * you show a column that was initially hidden.
     * <p>
     * You can manually trigger the auto sizing behavior again by calling `grid.recalculateColumnWidths()`.
     * <p>
     * The column width may still grow larger when `flexGrow` is not 0.
     */
    @JSProperty
    void setAutoWidth(boolean autoWidth);
}
