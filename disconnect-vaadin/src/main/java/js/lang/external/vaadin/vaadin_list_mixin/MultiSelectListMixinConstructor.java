package js.lang.external.vaadin.vaadin_list_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-list-mixin",
    version = "^2.5.0"
)
@Import(
    symbols = {"MultiSelectListMixinConstructor as MultiSelectListMixinConstructor_MultiSelectListMixinConstructor"},
    module = "@vaadin/vaadin-list-mixin/vaadin-multi-select-list-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-list-mixin/vaadin-multi-select-list-mixin.js"
)
public interface MultiSelectListMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return MultiSelectListMixinConstructor_MultiSelectListMixinConstructor.apply(null, args)"
  )
  static MultiSelectListMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
