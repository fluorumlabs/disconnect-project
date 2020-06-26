package js.lang.external.vaadin.vaadin_element_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-element-mixin",
    version = "^2.4.1"
)
@Import(
    symbols = {"DirMixinConstructor as DirMixinConstructor_DirMixinConstructor"},
    module = "@vaadin/vaadin-element-mixin/vaadin-dir-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-element-mixin/vaadin-dir-mixin.js"
)
public interface DirMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return DirMixinConstructor_DirMixinConstructor.apply(null, args)"
  )
  static DirMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  void finalize();
}
