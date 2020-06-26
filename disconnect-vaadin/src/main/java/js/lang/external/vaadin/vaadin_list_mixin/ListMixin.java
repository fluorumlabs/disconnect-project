package js.lang.external.vaadin.vaadin_list_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.vaadin.vaadin_item.ItemMixin;
import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@vaadin/vaadin-list-mixin",
    version = "^2.5.0"
)
@Import(
    module = "@vaadin/vaadin-list-mixin/vaadin-list-mixin.js"
)
public interface ListMixin extends Any {
  @JSProperty("focused")
  @Nullable
  Element getFocused();

  /**
   * The index of the item selected in the items array.
   * Note: Not updated when used in <code>multiple</code> selection mode.
   *
   */
  @JSProperty("selected")
  int getSelected();

  /**
   * The index of the item selected in the items array.
   * Note: Not updated when used in <code>multiple</code> selection mode.
   *
   */
  @JSProperty("selected")
  void setSelected(int value);

  /**
   * Define how items are disposed in the dom.
   * Possible values are: <code>horizontal|vertical</code>.
   * It also changes navigation keys from left/right to up/down.
   *
   */
  @JSProperty("orientation")
  ListOrientation getOrientation();

  /**
   * Define how items are disposed in the dom.
   * Possible values are: <code>horizontal|vertical</code>.
   * It also changes navigation keys from left/right to up/down.
   *
   */
  @JSProperty("orientation")
  void setOrientation(ListOrientation value);

  /**
   * The list of items from which a selection can be made.
   * It is populated from the elements passed to the light DOM,
   * and updated dynamically when adding or removing items.
   *
   * The item elements must implement <code>Vaadin.ItemMixin</code>.
   *
   * Note: unlike <code>&lt;vaadin-combo-box&gt;</code>, this property is read-only,
   * so if you want to provide items by iterating array of data,
   * you have to use <code>dom-repeat</code> and place it to the light DOM.
   *
   */
  @JSProperty("items")
  @Nullable
  Array<ItemMixin> getItems();

  void ready();

  void focus();
}
