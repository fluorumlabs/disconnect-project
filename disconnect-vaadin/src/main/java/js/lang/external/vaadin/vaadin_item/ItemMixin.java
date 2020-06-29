package js.lang.external.vaadin.vaadin_item;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-item",
    version = "^2.3.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-item/src/vaadin-item-mixin.js"
)
public interface ItemMixin extends Any {
  @JSProperty("value")
  String getValue();

  @JSProperty("value")
  void setValue(String value);

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

  /**
   * If true, the item is in selected state.
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * If true, the item is in selected state.
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  void ready();
}
