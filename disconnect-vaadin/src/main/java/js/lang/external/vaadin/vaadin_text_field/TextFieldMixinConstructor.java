package js.lang.external.vaadin.vaadin_text_field;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-text-field",
    version = "^2.7.0-alpha5"
)
@Import(
    symbols = {"TextFieldMixinConstructor as TextFieldMixinConstructor_TextFieldMixinConstructor"},
    module = "@vaadin/vaadin-text-field/src/vaadin-text-field-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-text-field/src/vaadin-text-field-mixin.js"
)
public interface TextFieldMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return TextFieldMixinConstructor_TextFieldMixinConstructor.apply(null, args)"
  )
  static TextFieldMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
