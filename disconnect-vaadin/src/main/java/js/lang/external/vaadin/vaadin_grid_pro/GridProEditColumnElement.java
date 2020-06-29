package js.lang.external.vaadin.vaadin_grid_pro;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.vaadin.vaadin_grid.GridBodyRenderer;
import js.lang.external.vaadin.vaadin_grid.GridColumnElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-grid-pro-edit-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid-pro&gt;</code>
 * that provides default inline editing for the items.
 *
 * <strong>Note that the <code>path</code> property must be explicitly specified for edit column.</strong>
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid-pro items=&quot;[[items]]&quot;&gt;
 *  &lt;vaadin-grid-pro-edit-column path=&quot;name.first&quot;&gt;&lt;/vaadin-grid-pro-edit-column&gt;
 *
 *  &lt;vaadin-grid-column&gt;
 *    ...
 * </code></pre>
 */
@NpmPackage(
    name = "@vaadin/vaadin-grid-pro",
    version = "^2.2.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-grid-pro/src/vaadin-grid-pro-edit-column.js"
)
public interface GridProEditColumnElement extends GridColumnElement {
  /**
   * JS Path of the property in the item used for the editable content.
   *
   */
  @JSProperty("path")
  @Nullable
  String getPath();

  /**
   * JS Path of the property in the item used for the editable content.
   *
   */
  @JSProperty("path")
  void setPath(@Nullable String value);

  /**
   * Custom function for rendering the cell content in edit mode.
   * Receives three arguments:
   *
   * <ul>
   * <li><code>root</code> The cell content DOM element. Append your editor component to it.</li>
   * <li><code>column</code> The <code>&lt;vaadin-grid-pro-edit-column&gt;</code> element.</li>
   * <li><code>rowData</code> The object with the properties related with
   * the rendered item, contains:
   * <ul>
   * <li><code>rowData.index</code> The index of the item.</li>
   * <li><code>rowData.item</code> The item.</li>
   * <li><code>rowData.expanded</code> Sublevel toggle state.</li>
   * <li><code>rowData.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
   * <li><code>rowData.selected</code> Selected state.</li>
   * </ul>
   * </li>
   * </ul>
   */
  @JSProperty("editModeRenderer")
  @Nullable
  GridBodyRenderer getEditModeRenderer();

  /**
   * Custom function for rendering the cell content in edit mode.
   * Receives three arguments:
   *
   * <ul>
   * <li><code>root</code> The cell content DOM element. Append your editor component to it.</li>
   * <li><code>column</code> The <code>&lt;vaadin-grid-pro-edit-column&gt;</code> element.</li>
   * <li><code>rowData</code> The object with the properties related with
   * the rendered item, contains:
   * <ul>
   * <li><code>rowData.index</code> The index of the item.</li>
   * <li><code>rowData.item</code> The item.</li>
   * <li><code>rowData.expanded</code> Sublevel toggle state.</li>
   * <li><code>rowData.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
   * <li><code>rowData.selected</code> Selected state.</li>
   * </ul>
   * </li>
   * </ul>
   */
  @JSProperty("editModeRenderer")
  void setEditModeRenderer(@Nullable GridBodyRenderer value);

  /**
   * The list of options which should be passed to cell editor component.
   * Used with the <code>select</code> editor type, to provide a list of items.
   *
   */
  @JSProperty("editorOptions")
  String[] getEditorOptions();

  /**
   * The list of options which should be passed to cell editor component.
   * Used with the <code>select</code> editor type, to provide a list of items.
   *
   */
  @JSProperty("editorOptions")
  void setEditorOptions(String... value);

  /**
   * Type of the cell editor component to be rendered. Allowed values:
   *
   * <ul>
   * <li><code>text</code> (default) - renders a text field</li>
   * <li><code>checkbox</code> - renders a checkbox</li>
   * <li><code>select</code> - renders a select with a list of items passed as <code>editorOptions</code></li>
   * </ul>
   * Editor type is set to <code>custom</code> when either <code>editModeRenderer</code> is set,
   * or editor template provided for the column.
   *
   */
  @JSProperty("editorType")
  GridProEditorType getEditorType();

  /**
   * Type of the cell editor component to be rendered. Allowed values:
   *
   * <ul>
   * <li><code>text</code> (default) - renders a text field</li>
   * <li><code>checkbox</code> - renders a checkbox</li>
   * <li><code>select</code> - renders a select with a list of items passed as <code>editorOptions</code></li>
   * </ul>
   * Editor type is set to <code>custom</code> when either <code>editModeRenderer</code> is set,
   * or editor template provided for the column.
   *
   */
  @JSProperty("editorType")
  void setEditorType(GridProEditorType value);

  /**
   * Path of the property used for the value of the editor component.
   *
   */
  @JSProperty("editorValuePath")
  String getEditorValuePath();

  /**
   * Path of the property used for the value of the editor component.
   *
   */
  @JSProperty("editorValuePath")
  void setEditorValuePath(String value);

  void ready();
}
