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
    symbols = {"RowDetailsMixinConstructor as RowDetailsMixinConstructor_RowDetailsMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-row-details-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-row-details-mixin.js"
)
public interface RowDetailsMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return RowDetailsMixinConstructor_RowDetailsMixinConstructor.apply(null, args)"
  )
  static RowDetailsMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
