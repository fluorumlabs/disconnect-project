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
    symbols = {"SelectionMixinConstructor as SelectionMixinConstructor_SelectionMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-selection-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-selection-mixin.js"
)
public interface SelectionMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return SelectionMixinConstructor_SelectionMixinConstructor.apply(null, args)"
  )
  static SelectionMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
