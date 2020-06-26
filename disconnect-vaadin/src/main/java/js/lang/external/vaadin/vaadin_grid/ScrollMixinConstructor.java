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
    symbols = {"ScrollMixinConstructor as ScrollMixinConstructor_ScrollMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-scroll-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-scroll-mixin.js"
)
public interface ScrollMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ScrollMixinConstructor_ScrollMixinConstructor.apply(null, args)"
  )
  static ScrollMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
