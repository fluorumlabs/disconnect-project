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
    symbols = {"ColumnReorderingMixinConstructor as ColumnReorderingMixinConstructor_ColumnReorderingMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-column-reordering-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-column-reordering-mixin.js"
)
public interface ColumnReorderingMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ColumnReorderingMixinConstructor_ColumnReorderingMixinConstructor.apply(null, args)"
  )
  static ColumnReorderingMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
