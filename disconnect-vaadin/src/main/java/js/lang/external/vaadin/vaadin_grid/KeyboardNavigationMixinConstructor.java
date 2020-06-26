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
    symbols = {"KeyboardNavigationMixinConstructor as KeyboardNavigationMixinConstructor_KeyboardNavigationMixinConstructor"},
    module = "@vaadin/vaadin-grid/src/vaadin-grid-keyboard-navigation-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-keyboard-navigation-mixin.js"
)
public interface KeyboardNavigationMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return KeyboardNavigationMixinConstructor_KeyboardNavigationMixinConstructor.apply(null, args)"
  )
  static KeyboardNavigationMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
