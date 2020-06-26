package js.lang.external.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import js.lang.external.polymer.mixins.*;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/elements/array-selector.js"
)
public interface ArraySelectorMixin extends TemplateStamp, PropertiesMixin, PropertyEffects, ElementMixin, PropertyAccessors, PropertiesChanged {
  /**
   * An array containing items from which selection will be made.
   *
   */
  @JSProperty("items")
  @Nullable
  Any[] getItems();

  /**
   * An array containing items from which selection will be made.
   *
   */
  @JSProperty("items")
  void setItems(Any[] value);

  /**
   * When <code>true</code>, multiple items may be selected at once (in this case,
   * <code>selected</code> is an array of currently selected items).  When <code>false</code>,
   * only one item may be selected at a time.
   *
   */
  @JSProperty("multi")
  boolean getMulti();

  /**
   * When <code>true</code>, multiple items may be selected at once (in this case,
   * <code>selected</code> is an array of currently selected items).  When <code>false</code>,
   * only one item may be selected at a time.
   *
   */
  @JSProperty("multi")
  void setMulti(boolean value);

  /**
   * When <code>multi</code> is true, this is an array that contains any selected.
   * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
   * if no item is selected.
   *
   */
  @JSProperty("selected")
  @Nullable
  Unknown /* object | object [ ] | null */ getSelected();

  /**
   * When <code>multi</code> is true, this is an array that contains any selected.
   * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
   * if no item is selected.
   *
   */
  @JSProperty("selected")
  void setSelected(Any[] value);

  /**
   * When <code>multi</code> is true, this is an array that contains any selected.
   * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
   * if no item is selected.
   *
   */
  @JSProperty("selected")
  void setSelected(@Nullable Any value);

  /**
   * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
   * if no item is selected.
   *
   */
  @JSProperty("selectedItem")
  @Nullable
  Any getSelectedItem();

  /**
   * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
   * if no item is selected.
   *
   */
  @JSProperty("selectedItem")
  void setSelectedItem(@Nullable Any value);

  /**
   * When <code>true</code>, calling <code>select</code> on an item that is already selected
   * will deselect the item.
   *
   */
  @JSProperty("toggle")
  boolean getToggle();

  /**
   * When <code>true</code>, calling <code>select</code> on an item that is already selected
   * will deselect the item.
   *
   */
  @JSProperty("toggle")
  void setToggle(boolean value);

  /**
   * Clears the selection state.
   *
   */
  void clearSelection();

  /**
   * Returns whether the item is currently selected.
   *
   * @param item Item from <code>items</code> array to test
   * @return Whether the item is selected
   *
   */
  boolean isSelected(Any item);

  /**
   * Returns whether the item is currently selected.
   *
   * @param idx Index from <code>items</code> array to test
   * @return Whether the item is selected
   *
   */
  boolean isIndexSelected(double idx);

  /**
   * Deselects the given item if it is already selected.
   *
   * @param item Item from <code>items</code> array to deselect
   *
   */
  void deselect(Any item);

  /**
   * Deselects the given index if it is already selected.
   *
   * @param idx Index from <code>items</code> array to deselect
   *
   */
  void deselectIndex(double idx);

  /**
   * Selects the given item.  When <code>toggle</code> is true, this will automatically
   * deselect the item if already selected.
   *
   * @param item Item from <code>items</code> array to select
   *
   */
  void select(Any item);

  /**
   * Selects the given index.  When <code>toggle</code> is true, this will automatically
   * deselect the item if already selected.
   *
   * @param idx Index from <code>items</code> array to select
   *
   */
  void selectIndex(double idx);
}
