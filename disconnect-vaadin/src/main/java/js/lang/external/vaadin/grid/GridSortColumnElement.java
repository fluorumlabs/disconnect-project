package js.lang.external.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-grid-sort-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code> that provides default header template and functionality for sorting.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items="[[items]]"&gt;
 *   &lt;vaadin-grid-sort-column path="name.first" direction="asc"&gt;&lt;/vaadin-grid-sort-column&gt;
 *
 *   &lt;vaadin-grid-column&gt;
 *     ...
 * </code></pre>
 * <strong>Mixins:</strong> ColumnBaseMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-grid", version = "^5.7.0-alpha4")
@Import(module = "@vaadin/vaadin-grid/vaadin-grid-sort-column.js")
public interface GridSortColumnElement<T extends Any> extends GridColumnElement<T> {

    // !wca! get autoWidth: boolean

    // !wca! set autoWidth: boolean

    // !wca! get direction: GridSorterDirection | undefined
    /**
     * How to sort the data.
     * Possible values are <code>asc</code> to use an ascending algorithm, <code>desc</code> to sort the data in
     * descending direction, or <code>null</code> for not sorting the data.
     */
    @JSProperty("direction")
    @Nullable
    String getDirection();

    // !wca! set direction: GridSorterDirection | undefined
    /**
     * How to sort the data.
     * Possible values are <code>asc</code> to use an ascending algorithm, <code>desc</code> to sort the data in
     * descending direction, or <code>null</code> for not sorting the data.
     */
    @JSProperty("direction")
    void setDirection(@Nullable String value);

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
