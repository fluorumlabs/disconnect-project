package com.github.fluorumlabs.disconnect.vaadin.gridpro;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponentWithItem;
import com.github.fluorumlabs.disconnect.core.containers.ParentNodeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.vaadin.ComponentRenderer;
import com.github.fluorumlabs.disconnect.vaadin.ComponentRendererWithContext;
import com.github.fluorumlabs.disconnect.vaadin.grid.ItemModel;
import com.github.fluorumlabs.disconnect.vaadin.grid.TextAlign;
import js.lang.external.vaadin.gridpro.GridProEditColumnElement;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-grid-pro-edit-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid-pro&gt;</code> that provides default inline editing for the items.
 *
 * <strong>Note that the <code>path</code> property must be explicitly specified for edit column.</strong>
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid-pro items="[[items]]"&gt;
 *   &lt;vaadin-grid-pro-edit-column path="name.first"&gt;&lt;/vaadin-grid-pro-edit-column&gt;
 *
 *   &lt;vaadin-grid-column&gt;
 *     ...
 * </code></pre>
 * <strong>Mixins:</strong> ColumnBaseMixin, ElementMixin
 */
@CustomElement(tagName = "vaadin-grid-pro-edit-column", external = true)
public class GridProEditColumn<T> extends HtmlComponentWithItem<T, GridProEditColumnElement<Mirrored<T>>> {

    public GridProEditColumn() {
    }

    public GridProEditColumn(String textContent) {
        super(textContent);
    }

    public GridProEditColumn(Component<?>... components) {
        super(components);
    }

    public GridProEditColumn(Class<T> tClass) {
        super(tClass);
    }

    public GridProEditColumn(Class<T> tClass, String textContent) {
        super(tClass, textContent);
    }

    public GridProEditColumn(Class<T> tClass, Component<?>... components) {
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

    // !wca! get editModeRenderer: !GridBodyRenderer | null | undefined

    // !wca! set editModeRenderer: !GridBodyRenderer | null | undefined
    /**
     * Custom function for rendering the cell content in edit mode.
     * Receives three arguments:
     *
     * - <code>root</code> The cell content DOM element. Append your editor component to it.
     * - <code>column</code> The <code>&lt;vaadin-grid-pro-edit-column&gt;</code> element.
     * - <code>rowData</code> The object with the properties related with
     *  the rendered item, contains:
     *  - <code>rowData.index</code> The index of the item.
     *  - <code>rowData.item</code> The item.
     *  - <code>rowData.expanded</code> Sublevel toggle state.
     *  - <code>rowData.level</code> Level of the tree represented with a horizontal offset of the toggle button.
     *  - <code>rowData.selected</code> Selected state.
     * @param value
     */
    public void setEditModeRenderer(@Nullable ComponentRendererWithContext<ItemModel<T>> value) {
        if (value == null) {
            getElement().setEditModeRenderer(null);
            return;
        }
        getElement().setEditModeRenderer(((root, element, context) -> value.renderTo(new ParentNodeBackedComponentList<>(root), new ItemModel<>(context, getItemClass()))));
    }

    // !wca! observe editModeRenderer: !GridBodyRenderer | null | undefined

    // !wca! get editorOptions: !Array<string>
    /**
     * The list of options which should be passed to cell editor component.
     * Used with the <code>select</code> editor type, to provide a list of items.
     */
    public String[] getEditorOptions() {
        return getElement().getEditorOptions();
    }

    // !wca! set editorOptions: !Array<string>
    /**
     * The list of options which should be passed to cell editor component.
     * Used with the <code>select</code> editor type, to provide a list of items.
     */
    public void setEditorOptions(String[] value) {
        getElement().setEditorOptions(value);
    }

    // !wca! observe editorOptions: !Array<string>

    // !wca! get editorType: !GridProEditorType
    /**
     * Type of the cell editor component to be rendered. Allowed values:
     * - <code>text</code> (default) - renders a text field
     * - <code>checkbox</code> - renders a checkbox
     * - <code>select</code> - renders a select with a list of items passed as <code>editorOptions</code>
     *
     * Editor type is set to <code>custom</code> when either <code>editModeRenderer</code> is set,
     * or editor template provided for the column.
     */
    public EditorType getEditorType() {
        return LowerCase.parse(EditorType.class, getElement().getEditorType());
    }

    // !wca! set editorType: !GridProEditorType
    /**
     * Type of the cell editor component to be rendered. Allowed values:
     * - <code>text</code> (default) - renders a text field
     * - <code>checkbox</code> - renders a checkbox
     * - <code>select</code> - renders a select with a list of items passed as <code>editorOptions</code>
     *
     * Editor type is set to <code>custom</code> when either <code>editModeRenderer</code> is set,
     * or editor template provided for the column.
     */
    public void setEditorType(EditorType value) {
        getElement().setEditorType(LowerCase.of(value));
    }

    // !wca! observe editorType: !GridProEditorType

    // !wca! get editorValuePath: string
    /**
     * Path of the property used for the value of the editor component.
     */
    public String getEditorValuePath() {
        return getElement().getEditorValuePath();
    }

    // !wca! set editorValuePath: string
    /**
     * Path of the property used for the value of the editor component.
     */
    public void setEditorValuePath(String value) {
        getElement().setEditorValuePath(value);
    }

    // !wca! observe editorValuePath: string

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

    // !wca! get header: string | null | undefined
    /**
     * Text content to display in the header cell of the column.
     */
    public @Nullable String getHeader() {
        return getElement().getHeader();
    }

    // !wca! set header: string | null | undefined
    /**
     * Text content to display in the header cell of the column.
     */
    public void setHeader(@Nullable String value) {
        getElement().setHeader(value);
    }

    // !wca! observe header: string | null | undefined

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

    // !wca! get path: string
    /**
     * JS Path of the property in the item used for the editable content.
     */
    public String getPath() {
        return getElement().getPath();
    }

    // !wca! set path: string
    /**
     * JS Path of the property in the item used for the editable content.
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
    public @Nullable
    TextAlign getTextAlign() {
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
    public @Nullable String getWidth() {
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

    public enum EditorType {
        TEXT, SELECT, CHECKBOX
    }
}
