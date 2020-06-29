package js.lang.external.vaadin.vaadin_crud;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.vaadin.vaadin_grid.GridColumnElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-crud-edit-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code>
 * that provides a clickable and themable edit icon.
 *
 * Typical usage is in a custom <code>&lt;vaadin-grid&gt;</code> inside a <code>&lt;vaadin-crud&gt;</code>.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items=&quot;[[items]]&quot;&gt;
 *  &lt;vaadin-crud-edit-column&gt;&lt;/vaadin-crud-edit-column&gt;
 *
 *  &lt;vaadin-grid-column&gt;
 *    ...
 * </code></pre>
 */
@NpmPackage(
    name = "@vaadin/vaadin-crud",
    version = "^1.3.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-crud/src/vaadin-crud-edit-column.js"
)
public interface CrudEditColumnElement extends GridColumnElement {
  /**
   * The arial-label for the edit button
   *
   */
  @JSProperty("ariaLabel")
  @Nullable
  String getAriaLabel();

  /**
   * The arial-label for the edit button
   *
   */
  @JSProperty("ariaLabel")
  void setAriaLabel(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final CrudEditColumnElement object = Any.empty();

    private Builder() {
    }

    public CrudEditColumnElement build() {
      return object;
    }

    /**
     * The arial-label for the edit button
     *
     */
    public Builder ariaLabel(@Nullable String value) {
      object.setAriaLabel(value);
      return this;
    }
  }
}
