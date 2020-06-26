package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-styling-mixin.js"
)
public interface StylingMixin extends Any {
  /**
   * A function that allows generating CSS class names for grid cells
   * based on their row and column. The return value should be the generated
   * class name as a string, or multiple class names separated by whitespace
   * characters.
   *
   * Receives two arguments:
   *
   * <ul>
   * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element (<code>undefined</code> for details-cell).</li>
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
  @JSProperty("cellClassNameGenerator")
  @Nullable
  GridCellClassNameGenerator getCellClassNameGenerator();

  /**
   * A function that allows generating CSS class names for grid cells
   * based on their row and column. The return value should be the generated
   * class name as a string, or multiple class names separated by whitespace
   * characters.
   *
   * Receives two arguments:
   *
   * <ul>
   * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element (<code>undefined</code> for details-cell).</li>
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
  @JSProperty("cellClassNameGenerator")
  void setCellClassNameGenerator(@Nullable GridCellClassNameGenerator value);

  /**
   * Runs the <code>cellClassNameGenerator</code> for the visible cells.
   * If the generator depends on varying conditions, you need to
   * call this function manually in order to update the styles when
   * the conditions change.
   *
   */
  void generateCellClassNames();
}
