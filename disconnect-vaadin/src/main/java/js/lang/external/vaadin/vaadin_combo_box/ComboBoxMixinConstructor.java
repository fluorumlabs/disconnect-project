package js.lang.external.vaadin.vaadin_combo_box;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-combo-box",
    version = "^5.3.0-alpha4"
)
@Import(
    symbols = {"ComboBoxMixinConstructor as ComboBoxMixinConstructor_ComboBoxMixinConstructor"},
    module = "@vaadin/vaadin-combo-box/src/vaadin-combo-box-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-combo-box/src/vaadin-combo-box-mixin.js"
)
public interface ComboBoxMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ComboBoxMixinConstructor_ComboBoxMixinConstructor.apply(null, args)"
  )
  static ComboBoxMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
