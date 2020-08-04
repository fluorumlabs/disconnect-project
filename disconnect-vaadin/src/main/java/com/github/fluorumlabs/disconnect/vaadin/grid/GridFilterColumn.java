package com.github.fluorumlabs.disconnect.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponentWithItem;
import com.github.fluorumlabs.disconnect.core.containers.ParentNodeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.vaadin.ComponentRenderer;
import com.github.fluorumlabs.disconnect.vaadin.ComponentRendererWithContext;
import js.lang.external.vaadin.grid.GridFilterColumnElement;

import javax.annotation.Nullable;
import java.io.Serializable;

/**
 * <code>&lt;vaadin-grid-filter-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code> that provides default header template and functionality for filtering.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items="[[items]]"&gt;
 *   &lt;vaadin-grid-filter-column path="name.first"&gt;&lt;/vaadin-grid-filter-column&gt;
 *
 *   &lt;vaadin-grid-column&gt;
 *     ...
 * </code></pre>
 * <strong>Mixins:</strong> ColumnBaseMixin, ElementMixin
 */
@CustomElement(tagName = "vaadin-grid-filter-column", external = true)
public class GridFilterColumn<T extends Serializable> extends HtmlComponentWithItem<T, GridFilterColumnElement<Mirrored<T>>> {

    public GridFilterColumn() {
    }

    public GridFilterColumn(String textContent) {
        super(textContent);
    }

    public GridFilterColumn(Component<?>... components) {
        super(components);
    }

    public GridFilterColumn(Class<T> tClass) {
        super(tClass);
    }

    public GridFilterColumn(Class<T> tClass, String textContent) {
        super(tClass, textContent);
    }

    public GridFilterColumn(Class<T> tClass, Component<?>... components) {
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

    // !wca! get header: ?
    /**
     * Text to display as the label of the column filter text-field.
     */
    public String getHeader() {
        return getElement().getHeader();
    }

    // !wca! set header: ?
    /**
     * Text to display as the label of the column filter text-field.
     */
    public void setHeader(String value) {
        getElement().setHeader(value);
    }

    // !wca! observe header: ?

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

    // !wca! get hidden: boolean | null | undefined
    /**
     * When set to true, the cells for this column are hidden.
     */
    public boolean isHidden() {
        return getElement().isHidden();
    }

    // !wca! set hidden: boolean | null | undefined
    /**
     * When set to true, the cells for this column are hidden.
     */
    public void setHidden(boolean value) {
        getElement().setHidden(value);
    }

    // !wca! observe hidden: boolean | null | undefined

    // !wca! get path: ?
    /**
     * JS Path of the property in the item used for filtering the data.
     */
    public String getPath() {
        return getElement().getPath();
    }

    // !wca! set path: ?
    /**
     * JS Path of the property in the item used for filtering the data.
     */
    public void setPath(String value) {
        getElement().setPath(value);
    }

    // !wca! observe path: ?

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

    // !wca! get resizable: boolean | null | undefined
    /**
     * When set to true, the column is user-resizable.
     */
    public boolean isResizable() {
        return getElement().isResizable();
    }

    // !wca! set resizable: boolean | null | undefined
    /**
     * When set to true, the column is user-resizable.
     */
    public void setResizable(boolean value) {
        getElement().setResizable(value);
    }

    // !wca! observe resizable: boolean | null | undefined

    // !wca! get textAlign: "start" | "center" | "end" | null | undefined
    /**
     * Aligns the columns cell content horizontally.
     * Supported values: "start", "center" and "end".
     */
    @Nullable
    public TextAlign getTextAlign() {
        return LowerCase.parse(TextAlign.class, getElement().getTextAlign());
    }

    // !wca! set textAlign: "start" | "center" | "end" | null | undefined
    /**
     * Aligns the columns cell content horizontally.
     * Supported values: "start", "center" and "end".
     */
    public void setTextAlign(@Nullable TextAlign value) {
        getElement().setTextAlign(LowerCase.of(value));
    }

    // !wca! observe textAlign: "start" | "center" | "end" | null | undefined

    // !wca! get width: string | null | undefined
    /**
     * Width of the cells for this column.
     */
    @Nullable
    public String getWidth() {
        return getElement().getWidth();
    }

    // !wca! set width: string | null | undefined
    /**
     * Width of the cells for this column.
     */
    public void setWidth(@Nullable String value) {
        getElement().setWidth(value);
    }

    // !wca! observe width: string | null | undefined
}
