package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-grid-filter-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code>
 * that provides default header template and functionality for filtering.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items=&quot;[[items]]&quot;&gt;
 *  &lt;vaadin-grid-filter-column path=&quot;name.first&quot;&gt;&lt;/vaadin-grid-filter-column&gt;
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
    module = "@vaadin/vaadin-grid/src/vaadin-grid-filter-column.js"
)
public interface GridFilterColumnElement extends GridColumnElement {
  /**
   * Text to display as the label of the column filter text-field.
   *
   */
  @JSProperty("header")
  @Nullable
  String getHeader();

  /**
   * Text to display as the label of the column filter text-field.
   *
   */
  @JSProperty("header")
  void setHeader(@Nullable String value);

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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final GridFilterColumnElement object = Any.empty();

    private Builder() {
    }

    public GridFilterColumnElement build() {
      return object;
    }

    /**
     * Text to display as the label of the column filter text-field.
     *
     */
    public Builder header(@Nullable String value) {
      object.setHeader(value);
      return this;
    }

    /**
     * JS Path of the property in the item used for filtering the data.
     *
     */
    public Builder path(@Nullable String value) {
      object.setPath(value);
      return this;
    }
  }
}
