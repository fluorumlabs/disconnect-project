package js.lang.external.vaadin.vaadin_custom_field;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-custom-field",
    version = "^1.2.0-alpha3"
)
@Import(
    symbols = {"CustomFieldMixinConstructor as CustomFieldMixinConstructor_CustomFieldMixinConstructor"},
    module = "@vaadin/vaadin-custom-field/src/vaadin-custom-field-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-custom-field/src/vaadin-custom-field-mixin.js"
)
public interface CustomFieldMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return CustomFieldMixinConstructor_CustomFieldMixinConstructor.apply(null, args)"
  )
  static CustomFieldMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
