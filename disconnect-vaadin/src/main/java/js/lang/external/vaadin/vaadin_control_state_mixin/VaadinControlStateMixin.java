package js.lang.external.vaadin.vaadin_control_state_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-control-state-mixin",
    version = "^2.2.3"
)
@Import(
    symbols = {"ControlStateMixin as VaadinControlStateMixin_ControlStateMixin"},
    module = "@vaadin/vaadin-control-state-mixin/vaadin-control-state-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-control-state-mixin/vaadin-control-state-mixin.js"
)
public interface VaadinControlStateMixin extends Any {
  /**
   * Polymer.IronControlState is not a proper 2.0 class, also, its tabindex
   * implementation fails in the shadow dom, so we have this for vaadin elements.
   *
   */
  @JSBody(
      params = {"base"},
      script = "return VaadinControlStateMixin_ControlStateMixin(base)"
  )
  static <T extends JsFunction> Any ControlStateMixin(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
