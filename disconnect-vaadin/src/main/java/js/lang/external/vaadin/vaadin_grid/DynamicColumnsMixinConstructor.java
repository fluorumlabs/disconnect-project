package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    symbols = {"DynamicColumnsMixinConstructor as DynamicColumnsMixinConstructor_DynamicColumnsMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-dynamic-columns-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-dynamic-columns-mixin.js"
)
public interface DynamicColumnsMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return DynamicColumnsMixinConstructor_DynamicColumnsMixinConstructor.apply(null, args)"
  )
  static DynamicColumnsMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
