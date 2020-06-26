package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-grid-tree-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code>
 * that provides default template and functionality for toggling tree/hierarchical items.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items=&quot;[[items]]&quot;&gt;
 *  &lt;vaadin-grid-tree-column path=&quot;name.first&quot;&gt;&lt;/vaadin-grid-tree-column&gt;
 *
 *  &lt;vaadin-grid-column&gt;
 *    ...
 * </code></pre>
 */
@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/vaadin-grid-tree-column.js"
)
public interface GridTreeColumnElement extends GridColumnElement {
  /**
   * JS Path of the property in the item used as text content for the tree toggle.
   *
   */
  @JSProperty("path")
  @Nullable
  String getPath();

  /**
   * JS Path of the property in the item used as text content for the tree toggle.
   *
   */
  @JSProperty("path")
  void setPath(@Nullable String value);

  /**
   * JS Path of the property in the item that indicates whether the item has child items.
   *
   */
  @JSProperty("itemHasChildrenPath")
  @Nullable
  String getItemHasChildrenPath();

  /**
   * JS Path of the property in the item that indicates whether the item has child items.
   *
   */
  @JSProperty("itemHasChildrenPath")
  void setItemHasChildrenPath(@Nullable String value);

  class Builder {
    private final GridTreeColumnElement object = Any.empty();

    public GridTreeColumnElement build() {
      return object;
    }

    /**
     * JS Path of the property in the item used as text content for the tree toggle.
     *
     */
    public Builder path(@Nullable String value) {
      object.setPath(value);
      return this;
    }

    /**
     * JS Path of the property in the item that indicates whether the item has child items.
     *
     */
    public Builder itemHasChildrenPath(@Nullable String value) {
      object.setItemHasChildrenPath(value);
      return this;
    }
  }
}
