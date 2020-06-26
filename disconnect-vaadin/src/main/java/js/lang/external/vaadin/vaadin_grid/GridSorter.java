package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/vaadin-grid.js"
)
public interface GridSorter extends Any {
  @JSProperty("path")
  String getPath();

  @JSProperty("path")
  void setPath(String value);

  @JSProperty("direction")
  GridSorterDirection getDirection();

  @JSProperty("direction")
  void setDirection(GridSorterDirection value);

  class Builder {
    private final GridSorter object = Any.empty();

    public GridSorter build() {
      return object;
    }

    public Builder path(String value) {
      object.setPath(value);
      return this;
    }

    public Builder direction(GridSorterDirection value) {
      object.setDirection(value);
      return this;
    }
  }
}
