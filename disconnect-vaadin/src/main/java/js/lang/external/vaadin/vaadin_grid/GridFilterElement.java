package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-grid-filter&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code> that provides out-of-the-box UI controls,
 * and handlers for filtering the grid data.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid-column&gt;
 *   &lt;template class=&quot;header&quot;&gt;
 *     &lt;vaadin-grid-filter path=&quot;name.first&quot;&gt;&lt;/vaadin-grid-filter&gt;
 *   &lt;/template&gt;
 *   &lt;template&gt;[[item.name.first]]&lt;/template&gt;
 * &lt;/vaadin-grid-column&gt;
 * </code></pre>
 */
@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-filter.js"
)
public interface GridFilterElement extends PolymerElement {
  /**
   * JS Path of the property in the item used for filtering the data.
   *
   */
  @JSProperty("path")
  @Nullable
  String getPath();

  /**
   * JS Path of the property in the item used for filtering the data.
   *
   */
  @JSProperty("path")
  void setPath(@Nullable String value);

  /**
   * Current filter value.
   *
   */
  @JSProperty("value")
  @Nullable
  String getValue();

  /**
   * Current filter value.
   *
   */
  @JSProperty("value")
  void setValue(@Nullable String value);

  void ready();

  void focus();
}
