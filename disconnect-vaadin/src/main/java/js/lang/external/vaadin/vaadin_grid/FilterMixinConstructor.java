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
    symbols = {"FilterMixinConstructor as FilterMixinConstructor_FilterMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-filter-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-filter-mixin.js"
)
public interface FilterMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return FilterMixinConstructor_FilterMixinConstructor.apply(null, args)"
  )
  static FilterMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
