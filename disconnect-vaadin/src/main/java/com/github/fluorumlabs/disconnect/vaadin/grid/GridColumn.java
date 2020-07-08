package com.github.fluorumlabs.disconnect.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponentWithItem;
import com.github.fluorumlabs.disconnect.core.containers.ParentNodeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.vaadin.ComponentRenderer;
import com.github.fluorumlabs.disconnect.vaadin.ComponentRendererWithContext;
import js.lang.external.vaadin.grid.GridColumnElement;

import javax.annotation.Nullable;

/**
 * A <code>&lt;vaadin-grid-column&gt;</code> is used to configure how a column in <code>&lt;vaadin-grid&gt;</code> should look like.
 *
 * See <code>&lt;vaadin-grid&gt;</code> documentation and demos for instructions and examples on how to configure the <code>&lt;vaadin-grid-column&gt;</code>.
 *
 * <strong>Mixins:</strong> ColumnBaseMixin, DirMixin, ElementMixin
 */
@CustomElement(tagName = "vaadin-grid-column", external = true)
public class GridColumn<T> extends HtmlComponentWithItem<T, GridColumnElement<Mirrored<T>>> {

    public GridColumn() {
    }

    public GridColumn(String textContent) {
        super(textContent);
    }

    public GridColumn(Component<?>... components) {
        super(components);
    }

    public GridColumn(Class<T> tClass) {
        super(tClass);
    }

    public GridColumn(Class<T> tClass, String textContent) {
        super(tClass, textContent);
    }

    public GridColumn(Class<T> tClass, Component<?>... components) {
        super(tClass, components);
    }

    // !wca! get autoWidth: boolean
    /**
     * Automatically sets the width of the column based on the column contents when this is set to <code>true</code>.
     *
     * For performance reasons the column width is calculated automatically only once when the grid items
     * are rendered for the first time and the calculation only considers the rows which are currently
     * rendered in DOM (a bit more than what is currently visible). If the grid is scrolled, or the cell
     * content changes, the column width might not match the contents anymore.
     *
     * Hidden columns are ignored in the calculation and their widths are not automatically updated when
     * you show a column that was initially hidden.
     *
     * You can manually trigger the auto sizing behavior again by calling <code>grid.recalculateColumnWidths()</code>.
     *
     * The column width may still grow larger when <code>flexGrow</code> is not 0.
     */
    public boolean isAutoWidth() {
        return getElement().isAutoWidth();
    }

    // !wca! set autoWidth: boolean
    /**
     * Automatically sets the width of the column based on the column contents when this is set to <code>true</code>.
     *
     * For performance reasons the column width is calculated automatically only once when the grid items
     * are rendered for the first time and the calculation only considers the rows which are currently
     * rendered in DOM (a bit more than what is currently visible). If the grid is scrolled, or the cell
     * content changes, the column width might not match the contents anymore.
     *
     * Hidden columns are ignored in the calculation and their widths are not automatically updated when
     * you show a column that was initially hidden.
     *
     * You can manually trigger the auto sizing behavior again by calling <code>grid.recalculateColumnWidths()</code>.
     *
     * The column width may still grow larger when <code>flexGrow</code> is not 0.
     */
    public void setAutoWidth(boolean value) {
        getElement().setAutoWidth(value);
    }

    // !wca! observe autoWidth: boolean

    // !wca! get flexGrow: number
    /**
     * Flex grow ratio for the cell widths. When set to 0, cell width is fixed.
     */
    public double getFlexGrow() {
        return getElement().getFlexGrow();
    }

    // !wca! set flexGrow: number
    /**
     * Flex grow ratio for the cell widths. When set to 0, cell width is fixed.
     */
    public void setFlexGrow(double value) {
        getElement().setFlexGrow(value);
    }

    // !wca! observe flexGrow: number

    // !wca! get footerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! set footerRenderer: GridHeaderFooterRenderer | null | undefined
    /**
     * Custom function for rendering the footer content.
     * Receives two arguments:
     *
     * - <code>root</code> The footer cell content DOM element. Append your content to it.
     * - <code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.
     * @param value
     */
    public void setFooterRenderer(@Nullable ComponentRenderer value) {
        if (value == null) {
            getElement().setFooterRenderer(null);
            return;
        }
        getElement().setFooterRenderer(((root, element) -> value.renderTo(new ParentNodeBackedComponentList<>(root))));
    }

    // !wca! observe footerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! get frozen: boolean
    /**
     * When true, the column is frozen. When a column inside of a column group is frozen,
     * all of the sibling columns inside the group will get frozen also.
     */
    public boolean isFrozen() {
        return getElement().isFrozen();
    }

    // !wca! set frozen: boolean
    /**
     * When true, the column is frozen. When a column inside of a column group is frozen,
     * all of the sibling columns inside the group will get frozen also.
     */
    public void setFrozen(boolean value) {
        getElement().setFrozen(value);
    }

    // !wca! observe frozen: boolean

    // !wca! get header: string
    /**
     * Text content to display in the header cell of the column.
     */
    public String getHeader() {
        return getElement().getHeader();
    }

    // !wca! set header: string
    /**
     * Text content to display in the header cell of the column.
     */
    public void setHeader(String value) {
        getElement().setHeader(value);
    }

    // !wca! observe header: string

    // !wca! get headerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! set headerRenderer: GridHeaderFooterRenderer | null | undefined
    /**
     * Custom function for rendering the header content.
     * Receives two arguments:
     *
     * - <code>root</code> The header cell content DOM element. Append your content to it.
     * - <code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.
     * @param value
     */
    public void setHeaderRenderer(@Nullable ComponentRenderer value) {
        if (value == null) {
            getElement().setHeaderRenderer(null);
            return;
        }
        getElement().setHeaderRenderer(((root, element) -> value.renderTo(new ParentNodeBackedComponentList<>(root))));
    }

    // !wca! observe headerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! get hidden: boolean
    /**
     * When set to true, the cells for this column are hidden.
     */
    public boolean isHidden() {
        return getElement().isHidden();
    }

    // !wca! set hidden: boolean
    /**
     * When set to true, the cells for this column are hidden.
     */
    public void setHidden(boolean value) {
        getElement().setHidden(value);
    }

    // !wca! observe hidden: boolean

    // !wca! get path: string
    /**
     * Path to an item sub-property whose value gets displayed in the column body cells.
     * The property name is also shown in the column header if an explicit header or renderer isn't defined.
     */
    public String getPath() {
        return getElement().getPath();
    }

    // !wca! set path: string
    /**
     * Path to an item sub-property whose value gets displayed in the column body cells.
     * The property name is also shown in the column header if an explicit header or renderer isn't defined.
     */
    public void setPath(String value) {
        getElement().setPath(value);
    }

    // !wca! observe path: string

    // !wca! get renderer: GridBodyRenderer | null | undefined

    // !wca! set renderer: GridBodyRenderer | null | undefined
    /**
     * Custom function for rendering the cell content.
     * Receives three arguments:
     *
     * - <code>root</code> The cell content DOM element. Append your content to it.
     * - <code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.
     * - <code>model</code> The object with the properties related with
     *  the rendered item, contains:
     *  - <code>model.index</code> The index of the item.
     *  - <code>model.item</code> The item.
     *  - <code>model.expanded</code> Sublevel toggle state.
     *  - <code>model.level</code> Level of the tree represented with a horizontal offset of the toggle button.
     *  - <code>model.selected</code> Selected state.
     * @param value
     */
    public void setRenderer(@Nullable ComponentRendererWithContext<ItemModel<T>> value) {
        if (value == null) {
            getElement().setRenderer(null);
            return;
        }
        getElement().setRenderer(((root, element, context) -> value.renderTo(new ParentNodeBackedComponentList<>(root), new ItemModel<>(context, getItemClass()))));
    }

    // !wca! observe renderer: GridBodyRenderer | null | undefined

    // !wca! get resizable: boolean
    /**
     * When set to true, the column is user-resizable.
     */
    public boolean isResizable() {
        return getElement().isResizable();
    }

    // !wca! set resizable: boolean
    /**
     * When set to true, the column is user-resizable.
     */
    public void setResizable(boolean value) {
        getElement().setResizable(value);
    }

    // !wca! observe resizable: boolean

    // !wca! get textAlign: GridColumnTextAlign | null | undefined
    /**
     * Aligns the columns cell content horizontally.
     * Supported values: "start", "center" and "end".
     */
    public @Nullable TextAlign getTextAlign() {
        return LowerCase.parse(TextAlign.class, getElement().getTextAlign());
    }

    // !wca! set textAlign: GridColumnTextAlign | null | undefined
    /**
     * Aligns the columns cell content horizontally.
     * Supported values: "start", "center" and "end".
     */
    public void setTextAlign(@Nullable TextAlign value) {
        getElement().setTextAlign(LowerCase.of(value));
    }

    // !wca! observe textAlign: GridColumnTextAlign | null | undefined

    // !wca! get width: string
    /**
     * Width of the cells for this column.
     */
    public String getWidth() {
        return getElement().getWidth();
    }

    // !wca! set width: string
    /**
     * Width of the cells for this column.
     */
    public void setWidth(String value) {
        getElement().setWidth(value);
    }

    // !wca! observe width: string
}
