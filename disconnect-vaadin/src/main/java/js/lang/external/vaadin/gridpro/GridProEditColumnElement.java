package js.lang.external.vaadin.gridpro;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.vaadin.RendererWithContext;
import js.lang.external.vaadin.grid.GridColumnElement;
import js.lang.external.vaadin.grid.GridItemModel;
import org.teavm.jso.JSProperty;

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
@NpmPackage(name = "@vaadin/vaadin-grid-pro", version = "^2.2.0-alpha3")
@Import(module = "@vaadin/vaadin-grid-pro/vaadin-grid-pro-edit-column.js")
public interface GridProEditColumnElement<T extends Any> extends GridColumnElement<T> {

    // !wca! get autoWidth: boolean

    // !wca! set autoWidth: boolean

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
     */
    @JSProperty("editModeRenderer")
    void setEditModeRenderer(@Nullable RendererWithContext<GridProEditColumnElement<T>, GridItemModel<T>> value);

    // !wca! get editorOptions: !Array<string>
    /**
     * The list of options which should be passed to cell editor component.
     * Used with the <code>select</code> editor type, to provide a list of items.
     */
    @JSProperty("editorOptions")
    String[] getEditorOptions();

    // !wca! set editorOptions: !Array<string>
    /**
     * The list of options which should be passed to cell editor component.
     * Used with the <code>select</code> editor type, to provide a list of items.
     */
    @JSProperty("editorOptions")
    void setEditorOptions(String[] value);

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
    @JSProperty("editorType")
    String getEditorType();

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
    @JSProperty("editorType")
    void setEditorType(String value);

    // !wca! get editorValuePath: string
    /**
     * Path of the property used for the value of the editor component.
     */
    @JSProperty("editorValuePath")
    String getEditorValuePath();

    // !wca! set editorValuePath: string
    /**
     * Path of the property used for the value of the editor component.
     */
    @JSProperty("editorValuePath")
    void setEditorValuePath(String value);

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

    // !wca! get path: string

    // !wca! set path: string

    // !wca! get renderer: GridBodyRenderer | null | undefined

    // !wca! set renderer: GridBodyRenderer | null | undefined

    // !wca! get resizable: boolean | null | undefined

    // !wca! set resizable: boolean | null | undefined

    // !wca! get textAlign: "start" | "center" | "end" | null | undefined

    // !wca! set textAlign: "start" | "center" | "end" | null | undefined

    // !wca! get width: string | null | undefined

    // !wca! set width: string | null | undefined
}
