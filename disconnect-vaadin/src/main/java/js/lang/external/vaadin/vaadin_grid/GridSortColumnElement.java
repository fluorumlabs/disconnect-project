package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-grid-sort-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code>
 * that provides default header template and functionality for sorting.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items=&quot;[[items]]&quot;&gt;
 *  &lt;vaadin-grid-sort-column path=&quot;name.first&quot; direction=&quot;asc&quot;&gt;&lt;/vaadin-grid-sort-column&gt;
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
    module = "@vaadin/vaadin-grid/vaadin-grid-sort-column.js"
)
public interface GridSortColumnElement extends GridColumnElement {
  /**
   * JS Path of the property in the item used for sorting the data.
   *
   */
  @JSProperty("path")
  @Nullable
  String getPath();

  /**
   * JS Path of the property in the item used for sorting the data.
   *
   */
  @JSProperty("path")
  void setPath(@Nullable String value);

  /**
   * How to sort the data.
   * Possible values are <code>asc</code> to use an ascending algorithm, <code>desc</code> to sort the data in
   * descending direction, or <code>null</code> for not sorting the data.
   *
   */
  @JSProperty("direction")
  @Nullable
  GridSorterDirection getDirection();

  /**
   * How to sort the data.
   * Possible values are <code>asc</code> to use an ascending algorithm, <code>desc</code> to sort the data in
   * descending direction, or <code>null</code> for not sorting the data.
   *
   */
  @JSProperty("direction")
  void setDirection(@Nullable GridSorterDirection value);

  class Builder {
    private final GridSortColumnElement object = Any.empty();

    public GridSortColumnElement build() {
      return object;
    }

    /**
     * JS Path of the property in the item used for sorting the data.
     *
     */
    public Builder path(@Nullable String value) {
      object.setPath(value);
      return this;
    }

    /**
     * How to sort the data.
     * Possible values are <code>asc</code> to use an ascending algorithm, <code>desc</code> to sort the data in
     * descending direction, or <code>null</code> for not sorting the data.
     *
     */
    public Builder direction(@Nullable GridSorterDirection value) {
      object.setDirection(value);
      return this;
    }
  }
}
