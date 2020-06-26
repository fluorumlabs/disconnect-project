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
    symbols = {"A11yMixinConstructor as A11yMixinConstructor_A11yMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-a11y-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-a11y-mixin.js"
)
public interface A11yMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return A11yMixinConstructor_A11yMixinConstructor.apply(null, args)"
  )
  static A11yMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
