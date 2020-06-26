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
    symbols = {"ThemableMixinConstructor as ThemableMixinConstructor_ThemableMixinConstructor"},
    module = "@vaadin/vaadin-themable-mixin/vaadin-themable-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-themable-mixin/vaadin-themable-mixin.js"
)
public interface ThemableMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ThemableMixinConstructor_ThemableMixinConstructor.apply(null, args)"
  )
  static ThemableMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  void finalize();
}
