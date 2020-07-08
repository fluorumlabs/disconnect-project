package js.lang.external.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-grid-selection-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code> that provides default templates and functionality for item selection.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items="[[items]]"&gt;
 *   &lt;vaadin-grid-selection-column frozen auto-select&gt;&lt;/vaadin-grid-selection-column&gt;
 *
 *   &lt;vaadin-grid-column&gt;
 *     ...
 * </code></pre>
 * By default the selection column displays <code>&lt;vaadin-checkbox&gt;</code> elements in the column cells. The checkboxes in the body rows toggle selection of the corresponding row items.
 *
 * When the grid data is provided as an array of <a href="#/elements/vaadin-grid#property-items"><code>items</code></a>, the column header gets an additional checkbox that can be used for toggling selection for all the items at once.
 *
 * <strong>The default content can also be overridden</strong>
 *
 * <strong>Mixins:</strong> ColumnBaseMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-grid", version = "^5.7.0-alpha4")
@Import(module = "@vaadin/vaadin-grid/vaadin-grid-selection-column.js")
public interface GridSelectionColumnElement<T extends Any> extends GridColumnElement<T> {

    // !wca! get autoSelect: boolean
    /**
     * When true, the active gets automatically selected.
     */
    @JSProperty("autoSelect")
    boolean isAutoSelect();

    // !wca! set autoSelect: boolean
    /**
     * When true, the active gets automatically selected.
     */
    @JSProperty("autoSelect")
    void setAutoSelect(boolean value);

    // !wca! get autoWidth: boolean

    // !wca! set autoWidth: boolean

    // !wca! get flexGrow: number

    // !wca! set flexGrow: number

    // !wca! get footerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! set footerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! get frozen: boolean

    // !wca! set frozen: boolean

    // !wca! get header: string | null | undefined

    // !wca! set header: string | null | undefined

    // !wca! get headerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! set headerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! get hidden: boolean | null | undefined

    // !wca! set hidden: boolean | null | undefined

    // !wca! get path: string | null | undefined

    // !wca! set path: string | null | undefined

    // !wca! get renderer: GridBodyRenderer | null | undefined

    // !wca! set renderer: GridBodyRenderer | null | undefined

    // !wca! get resizable: boolean | null | undefined

    // !wca! set resizable: boolean | null | undefined

    // !wca! get selectAll: boolean
    /**
     * When true, all the items are selected.
     */
    @JSProperty("selectAll")
    boolean isSelectAll();

    // !wca! set selectAll: boolean
    /**
     * When true, all the items are selected.
     */
    @JSProperty("selectAll")
    void setSelectAll(boolean value);

    // !wca! get textAlign: "start" | "center" | "end" | null | undefined

    // !wca! set textAlign: "start" | "center" | "end" | null | undefined

    // !wca! get width: string

    // !wca! set width: string
}
