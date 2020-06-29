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
    symbols = {"ColumnResizingMixinConstructor as ColumnResizingMixinConstructor_ColumnResizingMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-column-resizing-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-column-resizing-mixin.js"
)
public interface ColumnResizingMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ColumnResizingMixinConstructor_ColumnResizingMixinConstructor.apply(null, args)"
  )
  static ColumnResizingMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}