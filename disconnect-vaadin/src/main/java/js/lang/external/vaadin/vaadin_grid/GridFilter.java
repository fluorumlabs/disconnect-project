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
    module = "@vaadin/vaadin-grid/vaadin-grid.js"
)
public interface GridFilter extends Any {
  @JSProperty("path")
  String getPath();

  @JSProperty("path")
  void setPath(String value);

  @JSProperty("value")
  String getValue();

  @JSProperty("value")
  void setValue(String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final GridFilter object = Any.empty();

    private Builder() {
    }

    public GridFilter build() {
      return object;
    }

    public Builder path(String value) {
      object.setPath(value);
      return this;
    }

    public Builder value(String value) {
      object.setValue(value);
      return this;
    }
  }
}
