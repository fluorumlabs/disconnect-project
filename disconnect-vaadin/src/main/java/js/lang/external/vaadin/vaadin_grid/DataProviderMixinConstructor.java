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
    symbols = {"DataProviderMixinConstructor as DataProviderMixinConstructor_DataProviderMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-data-provider-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-data-provider-mixin.js"
)
public interface DataProviderMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return DataProviderMixinConstructor_DataProviderMixinConstructor.apply(null, args)"
  )
  static DataProviderMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
