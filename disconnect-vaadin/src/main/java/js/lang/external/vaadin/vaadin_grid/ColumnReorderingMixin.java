package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-column-reordering-mixin.js"
)
public interface ColumnReorderingMixin extends Any {
  /**
   * Set to true to allow column reordering.
   *
   */
  @JSProperty("columnReorderingAllowed")
  boolean getColumnReorderingAllowed();

  /**
   * Set to true to allow column reordering.
   *
   */
  @JSProperty("columnReorderingAllowed")
  void setColumnReorderingAllowed(boolean value);

  void ready();
}
