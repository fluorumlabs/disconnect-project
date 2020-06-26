package js.lang.external.vaadin.vaadin_control_state_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-control-state-mixin",
    version = "^2.2.3"
)
@Import(
    module = "@vaadin/vaadin-control-state-mixin/vaadin-control-state-mixin.js"
)
public interface ControlStateMixin extends Any {
  /**
   * Any element extending this mixin is required to implement this getter.
   * It returns the actual focusable element in the component.
   *
   */
  @JSProperty("focusElement")
  @Nullable
  Element getFocusElement();

  /**
   * Specify that this control should have input focus when the page loads.
   *
   */
  @JSProperty("autofocus")
  boolean getAutofocus();

  /**
   * Specify that this control should have input focus when the page loads.
   *
   */
  @JSProperty("autofocus")
  void setAutofocus(boolean value);

  /**
   * If true, the user cannot interact with this element.
   *
   */
  @JSProperty("disabled")
  boolean getDisabled();

  /**
   * If true, the user cannot interact with this element.
   *
   */
  @JSProperty("disabled")
  void setDisabled(boolean value);

  void ready();

  void click();
}
