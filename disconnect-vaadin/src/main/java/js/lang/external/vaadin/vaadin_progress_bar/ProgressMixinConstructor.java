package js.lang.external.vaadin.vaadin_progress_bar;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-progress-bar",
    version = "^1.3.0-alpha1"
)
@Import(
    symbols = {"ProgressMixinConstructor as ProgressMixinConstructor_ProgressMixinConstructor"},
    module = "@vaadin/vaadin-progress-bar/src/vaadin-progress-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-progress-bar/src/vaadin-progress-mixin.js"
)
public interface ProgressMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ProgressMixinConstructor_ProgressMixinConstructor.apply(null, args)"
  )
  static ProgressMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
