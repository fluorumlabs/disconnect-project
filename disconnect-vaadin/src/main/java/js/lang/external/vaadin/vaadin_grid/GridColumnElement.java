package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.polymer.PolymerElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A <code>&lt;vaadin-grid-column&gt;</code> is used to configure how a column in <code>&lt;vaadin-grid&gt;</code>
 * should look like.
 *
 * See <code>&lt;vaadin-grid&gt;</code> documentation and demos for instructions and examples on how
 * to configure the <code>&lt;vaadin-grid-column&gt;</code>.
 *
 * <pre><code></code></pre>
 */
@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/vaadin-grid-column.js"
)
public interface GridColumnElement extends PolymerElement, ColumnBaseMixin {
  /**
   * Width of the cells for this column.
   *
   */
  @JSProperty("width")
  @Nullable
  String getWidth();

  /**
   * Width of the cells for this column.
   *
   */
  @JSProperty("width")
  void setWidth(@Nullable String value);

  /**
   * Flex grow ratio for the cell widths. When set to 0, cell width is fixed.
   *
   */
  @JSProperty("flexGrow")
  double getFlexGrow();

  /**
   * Flex grow ratio for the cell widths. When set to 0, cell width is fixed.
   *
   */
  @JSProperty("flexGrow")
  void setFlexGrow(double value);

  /**
   * Custom function for rendering the cell content.
   * Receives three arguments:
   *
   * <ul>
   * <li><code>root</code> The cell content DOM element. Append your content to it.</li>
   * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
   * <li><code>model</code> The object with the properties related with
   * the rendered item, contains:
   * <ul>
   * <li><code>model.index</code> The index of the item.</li>
   * <li><code>model.item</code> The item.</li>
   * <li><code>model.expanded</code> Sublevel toggle state.</li>
   * <li><code>model.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
   * <li><code>model.selected</code> Selected state.</li>
   * </ul>
   * </li>
   * </ul>
   */
  @JSProperty("renderer")
  @Nullable
  GridBodyRenderer getRenderer();

  /**
   * Custom function for rendering the cell content.
   * Receives three arguments:
   *
   * <ul>
   * <li><code>root</code> The cell content DOM element. Append your content to it.</li>
   * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
   * <li><code>model</code> The object with the properties related with
   * the rendered item, contains:
   * <ul>
   * <li><code>model.index</code> The index of the item.</li>
   * <li><code>model.item</code> The item.</li>
   * <li><code>model.expanded</code> Sublevel toggle state.</li>
   * <li><code>model.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
   * <li><code>model.selected</code> Selected state.</li>
   * </ul>
   * </li>
   * </ul>
   */
  @JSProperty("renderer")
  void setRenderer(@Nullable GridBodyRenderer value);

  /**
   * Path to an item sub-property whose value gets displayed in the column body cells.
   * The property name is also shown in the column header if an explicit header or renderer isn't defined.
   *
   */
  @JSProperty("path")
  @Nullable
  String getPath();

  /**
   * Path to an item sub-property whose value gets displayed in the column body cells.
   * The property name is also shown in the column header if an explicit header or renderer isn't defined.
   *
   */
  @JSProperty("path")
  void setPath(@Nullable String value);

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
   *
   */
  @JSProperty("autoWidth")
  boolean getAutoWidth();

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
   *
   */
  @JSProperty("autoWidth")
  void setAutoWidth(boolean value);

  class Builder {
    private final GridColumnElement object = Any.empty();

    public GridColumnElement build() {
      return object;
    }

    /**
     * Width of the cells for this column.
     *
     */
    public Builder width(@Nullable String value) {
      object.setWidth(value);
      return this;
    }

    /**
     * Flex grow ratio for the cell widths. When set to 0, cell width is fixed.
     *
     */
    public Builder flexGrow(double value) {
      object.setFlexGrow(value);
      return this;
    }

    /**
     * Custom function for rendering the cell content.
     * Receives three arguments:
     *
     * <ul>
     * <li><code>root</code> The cell content DOM element. Append your content to it.</li>
     * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
     * <li><code>model</code> The object with the properties related with
     * the rendered item, contains:
     * <ul>
     * <li><code>model.index</code> The index of the item.</li>
     * <li><code>model.item</code> The item.</li>
     * <li><code>model.expanded</code> Sublevel toggle state.</li>
     * <li><code>model.level</code> Level of the tree represented with a horizontal offset of the toggle button.</li>
     * <li><code>model.selected</code> Selected state.</li>
     * </ul>
     * </li>
     * </ul>
     */
    public Builder renderer(@Nullable GridBodyRenderer value) {
      object.setRenderer(value);
      return this;
    }

    /**
     * Path to an item sub-property whose value gets displayed in the column body cells.
     * The property name is also shown in the column header if an explicit header or renderer isn't defined.
     *
     */
    public Builder path(@Nullable String value) {
      object.setPath(value);
      return this;
    }

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
     *
     */
    public Builder autoWidth(boolean value) {
      object.setAutoWidth(value);
      return this;
    }
  }
}
