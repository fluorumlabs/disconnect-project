package js.lang.external.vaadin.vaadin_control_state_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-control-state-mixin",
    version = "^2.2.3"
)
@Import(
    symbols = {"ControlStateMixinConstructor as ControlStateMixinConstructor_ControlStateMixinConstructor"},
    module = "@vaadin/vaadin-control-state-mixin/vaadin-control-state-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-control-state-mixin/vaadin-control-state-mixin.js"
)
public interface ControlStateMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ControlStateMixinConstructor_ControlStateMixinConstructor.apply(null, args)"
  )
  static ControlStateMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
