package js.lang.external.vaadin.vaadin_custom_field;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-custom-field",
    version = "^1.2.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-custom-field/vaadin-custom-field.js"
)
public interface CustomFieldI18n extends Any {
  @JSProperty("parseValue")
  CustomFieldParseValueFn getParseValue();

  @JSProperty("parseValue")
  void setParseValue(CustomFieldParseValueFn value);

  @JSProperty("formatValue")
  CustomFieldFormatValueFn getFormatValue();

  @JSProperty("formatValue")
  void setFormatValue(CustomFieldFormatValueFn value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final CustomFieldI18n object = Any.empty();

    private Builder() {
    }

    public CustomFieldI18n build() {
      return object;
    }

    public Builder parseValue(CustomFieldParseValueFn value) {
      object.setParseValue(value);
      return this;
    }

    public Builder formatValue(CustomFieldFormatValueFn value) {
      object.setFormatValue(value);
      return this;
    }
  }
}
