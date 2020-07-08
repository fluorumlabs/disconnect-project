package js.lang.external.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.vaadin.Renderer;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A <code>&lt;vaadin-grid-column-group&gt;</code> is used to make groups of columns in <code>&lt;vaadin-grid&gt;</code> and to configure additional headers and footers.
 *
 * Groups can be nested to create complex header and footer configurations.
 *
 * The <code>class</code> attribute is used to differentiate header and footer templates.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid-column-group resizable&gt;
 *   &lt;template class="header"&gt;Name&lt;/template&gt;
 *
 *   &lt;vaadin-grid-column&gt;
 *     &lt;template class="header"&gt;First&lt;/template&gt;
 *     &lt;template&gt;[[item.name.first]]&lt;/template&gt;
 *   &lt;/vaadin-grid-column&gt;
 *   &lt;vaadin-grid-column&gt;
 *     &lt;template class="header"&gt;Last&lt;/template&gt;
 *     &lt;template&gt;[[item.name.last]]&lt;/template&gt;
 *   &lt;/vaadin-grid-column&gt;
 * &lt;/vaadin-grid-column-group&gt;
 * </code></pre>
 * <strong>Mixins:</strong> ColumnBaseMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-grid", version = "^5.7.0-alpha4")
@Import(module = "@vaadin/vaadin-grid/vaadin-grid-column-group.js")
public interface GridColumnGroupElement<T extends Any> extends HTMLElement {

    // !wca! get flexGrow: number
    /**
     * Flex grow ratio for the column group as the sum of the ratios of its child columns.
     */
    @JSProperty("flexGrow")
    double getFlexGrow();

    // !wca! set flexGrow: number
    /**
     * Flex grow ratio for the column group as the sum of the ratios of its child columns.
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

    // !wca! get header: string | null | undefined
    /**
     * Text content to display in the header cell of the column.
     */
    @JSProperty("header")
    @Nullable
    String getHeader();

    // !wca! set header: string | null | undefined
    /**
     * Text content to display in the header cell of the column.
     */
    @JSProperty("header")
    void setHeader(@Nullable String value);

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

    // !wca! get hidden: boolean | null | undefined
    /**
     * When set to true, the cells for this column are hidden.
     */
    @JSProperty("hidden")
    boolean isHidden();

    // !wca! set hidden: boolean | null | undefined
    /**
     * When set to true, the cells for this column are hidden.
     */
    @JSProperty("hidden")
    void setHidden(boolean value);

    // !wca! get resizable: boolean | null | undefined
    /**
     * When set to true, the column is user-resizable.
     */
    @JSProperty("resizable")
    boolean isResizable();

    // !wca! set resizable: boolean | null | undefined
    /**
     * When set to true, the column is user-resizable.
     */
    @JSProperty("resizable")
    void setResizable(boolean value);

    // !wca! get textAlign: "start" | "center" | "end" | null | undefined
    /**
     * Aligns the columns cell content horizontally.
     * Supported values: "start", "center" and "end".
     */
    @JSProperty("textAlign")
    @Nullable
    String getTextAlign();

    // !wca! set textAlign: "start" | "center" | "end" | null | undefined
    /**
     * Aligns the columns cell content horizontally.
     * Supported values: "start", "center" and "end".
     */
    @JSProperty("textAlign")
    void setTextAlign(@Nullable String value);

    // !wca! get width: string
    /**
     * Width of the column group as the sum of the widths of its child columns.
     */
    @JSProperty("width")
    String getWidth();

    // !wca! set width: string
    /**
     * Width of the column group as the sum of the widths of its child columns.
     */
    @JSProperty("width")
    void setWidth(String value);
}
