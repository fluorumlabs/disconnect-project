package js.lang.external.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.vaadin.Renderer;
import js.lang.external.vaadin.RendererWithContext;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A <code>&lt;vaadin-grid-column&gt;</code> is used to configure how a column in <code>&lt;vaadin-grid&gt;</code> should look like.
 *
 * See <code>&lt;vaadin-grid&gt;</code> documentation and demos for instructions and examples on how to configure the <code>&lt;vaadin-grid-column&gt;</code>.
 *
 * <strong>Mixins:</strong> ColumnBaseMixin, DirMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-grid", version = "^5.7.0-alpha4")
@Import(module = "@vaadin/vaadin-grid/vaadin-grid-column.js")
public interface GridColumnElement<T extends Any> extends HTMLElement {

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
    @JSProperty("autoWidth")
    boolean isAutoWidth();

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
    @JSProperty("autoWidth")
    void setAutoWidth(boolean value);

    // !wca! get flexGrow: number
    /**
     * Flex grow ratio for the cell widths. When set to 0, cell width is fixed.
     */
    @JSProperty("flexGrow")
    double getFlexGrow();

    // !wca! set flexGrow: number
    /**
     * Flex grow ratio for the cell widths. When set to 0, cell width is fixed.
     */
    @JSProperty("flexGrow")
    void setFlexGrow(double value);

    // !wca! get footerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! set footerRenderer: GridHeaderFooterRenderer | null | undefined
    /**
     * Custom function for rendering the footer content.
     * Receives two arguments:
     *
     * - <code>root</code> The footer cell content DOM element. Append your content to it.
     * - <code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.
     */
    @JSProperty("footerRenderer")
    void setFooterRenderer(@Nullable Renderer<GridColumnElement<T>> value);

    // !wca! get frozen: boolean
    /**
     * When true, the column is frozen. When a column inside of a column group is frozen,
     * all of the sibling columns inside the group will get frozen also.
     */
    @JSProperty("frozen")
    boolean isFrozen();

    // !wca! set frozen: boolean
    /**
     * When true, the column is frozen. When a column inside of a column group is frozen,
     * all of the sibling columns inside the group will get frozen also.
     */
    @JSProperty("frozen")
    void setFrozen(boolean value);

    // !wca! get header: string
    /**
     * Text content to display in the header cell of the column.
     */
    @JSProperty("header")
    String getHeader();

    // !wca! set header: string
    /**
     * Text content to display in the header cell of the column.
     */
    @JSProperty("header")
    void setHeader(String value);

    // !wca! get headerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! set headerRenderer: GridHeaderFooterRenderer | null | undefined
    /**
     * Custom function for rendering the header content.
     * Receives two arguments:
     *
     * - <code>root</code> The header cell content DOM element. Append your content to it.
     * - <code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.
     */
    @JSProperty("headerRenderer")
    void setHeaderRenderer(@Nullable Renderer<GridColumnElement<T>> value);

    // !wca! get hidden: boolean
    /**
     * When set to true, the cells for this column are hidden.
     */
    @JSProperty("hidden")
    boolean isHidden();

    // !wca! set hidden: boolean
    /**
     * When set to true, the cells for this column are hidden.
     */
    @JSProperty("hidden")
    void setHidden(boolean value);

    // !wca! get path: string
    /**
     * Path to an item sub-property whose value gets displayed in the column body cells.
     * The property name is also shown in the column header if an explicit header or renderer isn't defined.
     */
    @JSProperty("path")
    String getPath();

    // !wca! set path: string
    /**
     * Path to an item sub-property whose value gets displayed in the column body cells.
     * The property name is also shown in the column header if an explicit header or renderer isn't defined.
     */
    @JSProperty("path")
    void setPath(String value);

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
     */
    @JSProperty("renderer")
    void setRenderer(@Nullable RendererWithContext<GridColumnElement<T>, GridItemModel<T>> value);

    // !wca! get resizable: boolean
    /**
     * When set to true, the column is user-resizable.
     */
    @JSProperty("resizable")
    boolean isResizable();

    // !wca! set resizable: boolean
    /**
     * When set to true, the column is user-resizable.
     */
    @JSProperty("resizable")
    void setResizable(boolean value);

    // !wca! get textAlign: GridColumnTextAlign | null | undefined
    /**
     * Aligns the columns cell content horizontally.
     * Supported values: "start", "center" and "end".
     */
    @JSProperty("textAlign")
    @Nullable String getTextAlign();

    // !wca! set textAlign: GridColumnTextAlign | null | undefined
    /**
     * Aligns the columns cell content horizontally.
     * Supported values: "start", "center" and "end".
     */
    @JSProperty("textAlign")
    void setTextAlign(@Nullable String value);

    // !wca! get width: string
    /**
     * Width of the cells for this column.
     */
    @JSProperty("width")
    String getWidth();

    // !wca! set width: string
    /**
     * Width of the cells for this column.
     */
    @JSProperty("width")
    void setWidth(String value);
}
