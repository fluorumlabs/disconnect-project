package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    symbols = {"DataProviderMixin as VaadinGridDataProviderMixin_DataProviderMixin"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-data-provider-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-data-provider-mixin.js"
)
public interface VaadinGridDataProviderMixin extends Any {
  @JSBody(
      params = {"base"},
      script = "return VaadinGridDataProviderMixin_DataProviderMixin(base)"
  )
  static <T extends JsFunction> Any DataProviderMixin(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
