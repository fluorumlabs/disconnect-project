package js.lang.external.vaadin.vaadin_list_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-list-mixin",
    version = "^2.5.0"
)
@Import(
    symbols = {"MultiSelectListMixin as VaadinMultiSelectListMixin_MultiSelectListMixin"},
    module = "@vaadin/vaadin-list-mixin/vaadin-multi-select-list-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-list-mixin/vaadin-multi-select-list-mixin.js"
)
public interface VaadinMultiSelectListMixin extends Any {
  /**
   * A mixin for <code>nav</code> elements, facilitating multiple selection of childNodes.
   *
   */
  @JSBody(
      params = {"base"},
      script = "return VaadinMultiSelectListMixin_MultiSelectListMixin(base)"
  )
  static <T extends JsFunction> Any MultiSelectListMixin(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
