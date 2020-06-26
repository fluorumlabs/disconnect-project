package js.lang.external.vaadin.vaadin_crud;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-crud",
    version = "^1.3.0-alpha2"
)
@Import(
    symbols = {"IncludedMixinConstructor as IncludedMixinConstructor_IncludedMixinConstructor"},
    module = "@vaadin/vaadin-crud/src/vaadin-crud-include-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-crud/src/vaadin-crud-include-mixin.js"
)
public interface IncludedMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return IncludedMixinConstructor_IncludedMixinConstructor.apply(null, args)"
  )
  static IncludedMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
