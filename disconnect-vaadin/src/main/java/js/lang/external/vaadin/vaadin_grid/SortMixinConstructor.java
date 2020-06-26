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
    symbols = {"SortMixinConstructor as SortMixinConstructor_SortMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-sort-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-sort-mixin.js"
)
public interface SortMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return SortMixinConstructor_SortMixinConstructor.apply(null, args)"
  )
  static SortMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
