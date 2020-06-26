package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import org.teavm.jso.JSProperty;

/**
 * This Element is used internally by vaadin-grid.
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-scroller.js"
)
public interface GridScrollerElement extends PolymerIronList {
  @JSProperty("size")
  double getSize();

  @JSProperty("size")
  void setSize(double value);

  void scrollToIndex(double index);
}
