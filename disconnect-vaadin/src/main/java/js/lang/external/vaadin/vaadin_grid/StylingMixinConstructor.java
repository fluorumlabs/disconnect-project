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
    symbols = {"StylingMixinConstructor as StylingMixinConstructor_StylingMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-styling-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-styling-mixin.js"
)
public interface StylingMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return StylingMixinConstructor_StylingMixinConstructor.apply(null, args)"
  )
  static StylingMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
