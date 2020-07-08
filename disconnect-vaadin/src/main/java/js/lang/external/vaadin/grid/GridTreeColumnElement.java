package js.lang.external.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-grid-tree-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code> that provides default template and functionality for toggling tree/hierarchical items.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items="[[items]]"&gt;
 *   &lt;vaadin-grid-tree-column path="name.first"&gt;&lt;/vaadin-grid-tree-column&gt;
 *
 *   &lt;vaadin-grid-column&gt;
 *     ...
 * </code></pre>
 * <strong>Mixins:</strong> ColumnBaseMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-grid", version = "^5.7.0-alpha4")
@Import(module = "@vaadin/vaadin-grid/vaadin-grid-tree-column.js")
public interface GridTreeColumnElement<T extends Any> extends GridColumnElement<T> {

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

    // !wca! get itemHasChildrenPath: string
    /**
     * JS Path of the property in the item that indicates whether the item has child items.
     */
    @JSProperty("itemHasChildrenPath")
    String getItemHasChildrenPath();

    // !wca! set itemHasChildrenPath: string
    /**
     * JS Path of the property in the item that indicates whether the item has child items.
     */
    @JSProperty("itemHasChildrenPath")
    void setItemHasChildrenPath(String value);

    // !wca! get path: ?

    // !wca! set path: ?

    // !wca! get renderer: GridBodyRenderer | null | undefined

    // !wca! set renderer: GridBodyRenderer | null | undefined

    // !wca! get resizable: boolean | null | undefined

    // !wca! set resizable: boolean | null | undefined

    // !wca! get textAlign: "start" | "center" | "end" | null | undefined

    // !wca! set textAlign: "start" | "center" | "end" | null | undefined

    // !wca! get width: string | null | undefined

    // !wca! set width: string | null | undefined
}
