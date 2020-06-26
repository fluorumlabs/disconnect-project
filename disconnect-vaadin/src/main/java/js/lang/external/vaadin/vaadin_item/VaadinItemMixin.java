package js.lang.external.vaadin.vaadin_item;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-item",
    version = "^2.3.0-alpha1"
)
@Import(
    symbols = {"ItemMixin as VaadinItemMixin_ItemMixin"},
    module = "@vaadin/vaadin-item/src/vaadin-item-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-item/src/vaadin-item-mixin.js"
)
public interface VaadinItemMixin extends Any {
  /**
   * A mixin providing <code>focused</code>, <code>focus-ring</code>, <code>active</code>, <code>disabled</code> and <code>selected</code>.
   *
   * <code>focused</code>, <code>active</code> and <code>focus-ring</code> are set as only as attributes.
   *
   */
  @JSBody(
      params = {"base"},
      script = "return VaadinItemMixin_ItemMixin(base)"
  )
  static <T extends JsFunction> Any ItemMixin(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
