package js.lang.external.vaadin.vaadin_combo_box;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-combo-box",
    version = "^5.3.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-combo-box/vaadin-combo-box.js"
)
public interface ComboBoxDataProviderParams extends Any {
  @JSProperty("page")
  double getPage();

  @JSProperty("page")
  void setPage(double value);

  @JSProperty("pageSize")
  double getPageSize();

  @JSProperty("pageSize")
  void setPageSize(double value);

  @JSProperty("filter")
  String getFilter();

  @JSProperty("filter")
  void setFilter(String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ComboBoxDataProviderParams object = Any.empty();

    private Builder() {
    }

    public ComboBoxDataProviderParams build() {
      return object;
    }

    public Builder page(double value) {
      object.setPage(value);
      return this;
    }

    public Builder pageSize(double value) {
      object.setPageSize(value);
      return this;
    }

    public Builder filter(String value) {
      object.setFilter(value);
      return this;
    }
  }
}
