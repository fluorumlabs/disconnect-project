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
    symbols = {"ColumnBaseMixinConstructor as ColumnBaseMixinConstructor_ColumnBaseMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-column.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-column.js"
)
public interface ColumnBaseMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ColumnBaseMixinConstructor_ColumnBaseMixinConstructor.apply(null, args)"
  )
  static ColumnBaseMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
