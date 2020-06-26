package js.lang.external.vaadin.vaadin_themable_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-themable-mixin",
    version = "^1.6.1"
)
@Import(
    symbols = {"ThemePropertyMixinConstructor as ThemePropertyMixinConstructor_ThemePropertyMixinConstructor"},
    module = "@vaadin/vaadin-themable-mixin/vaadin-theme-property-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-themable-mixin/vaadin-theme-property-mixin.js"
)
public interface ThemePropertyMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ThemePropertyMixinConstructor_ThemePropertyMixinConstructor.apply(null, args)"
  )
  static ThemePropertyMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
