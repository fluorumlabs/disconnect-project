package js.lang.external.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.external.polymer.PolymerElement;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"ArraySelectorMixin as ArraySelector_ArraySelectorMixin"},
    module = "@polymer/polymer/lib/elements/array-selector.js"
)
@Import(
    module = "@polymer/polymer/lib/elements/array-selector.js"
)
public interface ArraySelector extends ArraySelectorMixin, PolymerElement {
  /**
   * Element mixin for recording dynamic associations between item paths in a
   * master <code>items</code> array and a <code>selected</code> array such that path changes to the
   * master array (at the host) element or elsewhere via data-binding) are
   * correctly propagated to items in the selected array and vice-versa.
   *
   * The <code>items</code> property accepts an array of user data, and via the
   * <code>select(item)</code> and <code>deselect(item)</code> API, updates the <code>selected</code> property
   * which may be bound to other parts of the application, and any changes to
   * sub-fields of <code>selected</code> item(s) will be kept in sync with items in the
   * <code>items</code> array.  When <code>multi</code> is false, <code>selected</code> is a property
   * representing the last selected item.  When <code>multi</code> is true, <code>selected</code>
   * is an array of multiply selected items.
   *
   */
  @JSBody(
      params = {"base"},
      script = "return ArraySelector_ArraySelectorMixin(base)"
  )
  static <T extends JsFunction> Any ArraySelectorMixin(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
