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
    symbols = {"ComboBoxDataProviderMixinConstructor as ComboBoxDataProviderMixinConstructor_ComboBoxDataProviderMixinConstructor"},
    module = "@vaadin/vaadin-combo-box/src/vaadin-combo-box-data-provider-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-combo-box/src/vaadin-combo-box-data-provider-mixin.js"
)
public interface ComboBoxDataProviderMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ComboBoxDataProviderMixinConstructor_ComboBoxDataProviderMixinConstructor.apply(null, args)"
  )
  static ComboBoxDataProviderMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
