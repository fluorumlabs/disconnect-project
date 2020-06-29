package js.lang.external.vaadin.vaadin_crud;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.vaadin.vaadin_grid.GridElement;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-crud-grid&gt;</code> is a <code>&lt;vaadin-grid&gt;</code> which automatically configures all its columns based
 * on the JSON structure of the first item received.
 *
 * You cannot manually configure columns but you can still style the grid as it's described in
 * <code>&lt;vaadin-grid&gt;</code> <a href="https://vaadin.com/components/vaadin-grid/html-api/elements/Vaadin.GridElement">Documentation</a>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-crud",
    version = "^1.3.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-crud/src/vaadin-crud-grid.js"
)
public interface CrudGridElement extends GridElement, IncludedMixin {
  /**
   * Disable filtering in the generated columns.
   *
   */
  @JSProperty("noFilter")
  boolean getNoFilter();

  /**
   * Disable filtering in the generated columns.
   *
   */
  @JSProperty("noFilter")
  void setNoFilter(boolean value);

  /**
   * Disable sorting in the generated columns.
   *
   */
  @JSProperty("noSort")
  boolean getNoSort();

  /**
   * Disable sorting in the generated columns.
   *
   */
  @JSProperty("noSort")
  void setNoSort(boolean value);

  /**
   * Do not add headers to columns.
   *
   */
  @JSProperty("noHead")
  boolean getNoHead();

  /**
   * Do not add headers to columns.
   *
   */
  @JSProperty("noHead")
  void setNoHead(boolean value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final CrudGridElement object = Any.empty();

    private Builder() {
    }

    public CrudGridElement build() {
      return object;
    }

    /**
     * Disable filtering in the generated columns.
     *
     */
    public Builder noFilter(boolean value) {
      object.setNoFilter(value);
      return this;
    }

    /**
     * Disable sorting in the generated columns.
     *
     */
    public Builder noSort(boolean value) {
      object.setNoSort(value);
      return this;
    }

    /**
     * Do not add headers to columns.
     *
     */
    public Builder noHead(boolean value) {
      object.setNoHead(value);
      return this;
    }
  }
}
