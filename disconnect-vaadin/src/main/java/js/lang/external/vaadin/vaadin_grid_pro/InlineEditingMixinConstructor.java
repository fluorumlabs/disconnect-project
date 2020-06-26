package js.lang.external.vaadin.vaadin_grid_pro;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-grid-pro",
    version = "^2.2.0-alpha3"
)
@Import(
    symbols = {"InlineEditingMixinConstructor as InlineEditingMixinConstructor_InlineEditingMixinConstructor"},
    module = "@vaadin/vaadin-grid-pro/src/vaadin-grid-pro-inline-editing-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid-pro/src/vaadin-grid-pro-inline-editing-mixin.js"
)
public interface InlineEditingMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return InlineEditingMixinConstructor_InlineEditingMixinConstructor.apply(null, args)"
  )
  static InlineEditingMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
