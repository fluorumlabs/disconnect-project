package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-grid-tree-toggle&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code>
 * that provides toggle and level display functionality for the item tree.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid-column&gt;
 *   &lt;template class=&quot;header&quot;&gt;Package name&lt;/template&gt;
 *   &lt;template&gt;
 *     &lt;vaadin-grid-tree-toggle
 *         leaf=&quot;[[!item.hasChildren]]&quot;
 *         expanded=&quot;{{expanded}}&quot;
 *         level=&quot;[[level]]&quot;&gt;
 *       [[item.name]]
 *     &lt;/vaadin-grid-tree-toggle&gt;
 *   &lt;/template&gt;
 * &lt;/vaadin-grid-column&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>toggle</code></td><td>The tree toggle icon</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>expanded</code></td><td>When present, the toggle is expanded</td><td>:host</td></tr>
 * <tr><td><code>leaf</code></td><td>When present, the toggle is not expandable, i. e., the current item is a leaf</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * The following custom CSS properties are available on
 * the <code>&lt;vaadin-grid-tree-toggle&gt;</code> element:
 *
 * <table>
 * <thead>
 * <tr><th>Custom CSS property</th><th>Description</th><th>Default</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>--vaadin-grid-tree-toggle-level-offset</code></td><td>Visual offset step for each tree sublevel</td><td><code>1em</code></td></tr>
 * </tbody>
 * </table>
 */
@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-tree-toggle.js"
)
public interface GridTreeToggleElement extends PolymerElement, ThemableMixin {
  /**
   * Current level of the tree represented with a horizontal offset
   * of the toggle button.
   *
   */
  @JSProperty("level")
  double getLevel();

  /**
   * Current level of the tree represented with a horizontal offset
   * of the toggle button.
   *
   */
  @JSProperty("level")
  void setLevel(double value);

  /**
   * Hides the toggle icon and disables toggling a tree sublevel.
   *
   */
  @JSProperty("leaf")
  boolean getLeaf();

  /**
   * Hides the toggle icon and disables toggling a tree sublevel.
   *
   */
  @JSProperty("leaf")
  void setLeaf(boolean value);

  /**
   * Sublevel toggle state.
   *
   */
  @JSProperty("expanded")
  boolean getExpanded();

  /**
   * Sublevel toggle state.
   *
   */
  @JSProperty("expanded")
  void setExpanded(boolean value);

  void ready();
}
