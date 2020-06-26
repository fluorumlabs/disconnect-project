package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-grid-selection-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code>
 * that provides default templates and functionality for item selection.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items=&quot;[[items]]&quot;&gt;
 *  &lt;vaadin-grid-selection-column frozen auto-select&gt;&lt;/vaadin-grid-selection-column&gt;
 *
 *  &lt;vaadin-grid-column&gt;
 *    ...
 * </code></pre>
 * By default the selection column displays <code>&lt;vaadin-checkbox&gt;</code> elements in the
 * column cells. The checkboxes in the body rows toggle selection of the corresponding row items.
 *
 * When the grid data is provided as an array of <a href="#/elements/vaadin-grid#property-items"><code>items</code></a>,
 * the column header gets an additional checkbox that can be used for toggling
 * selection for all the items at once.
 *
 * <strong>The default content can also be overridden</strong>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/vaadin-grid-selection-column.js"
)
public interface GridSelectionColumnElement extends GridColumnElement {
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
   * When true, all the items are selected.
   *
   */
  @JSProperty("selectAll")
  boolean getSelectAll();

  /**
   * When true, all the items are selected.
   *
   */
  @JSProperty("selectAll")
  void setSelectAll(boolean value);

  /**
   * When true, the active gets automatically selected.
   *
   */
  @JSProperty("autoSelect")
  boolean getAutoSelect();

  /**
   * When true, the active gets automatically selected.
   *
   */
  @JSProperty("autoSelect")
  void setAutoSelect(boolean value);
}
