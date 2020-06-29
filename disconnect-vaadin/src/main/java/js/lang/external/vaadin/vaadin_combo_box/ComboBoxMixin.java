package js.lang.external.vaadin.vaadin_combo_box;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@vaadin/vaadin-combo-box",
    version = "^5.3.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-combo-box/src/vaadin-combo-box-mixin.js"
)
public interface ComboBoxMixin extends Any {
  /**
   * True if the dropdown is open, false otherwise.
   *
   */
  @JSProperty("opened")
  boolean getOpened();

  /**
   * True if the dropdown is open, false otherwise.
   *
   */
  @JSProperty("opened")
  void setOpened(boolean value);

  /**
   * Set true to prevent the overlay from opening automatically.
   *
   */
  @JSProperty("autoOpenDisabled")
  boolean getAutoOpenDisabled();

  /**
   * Set true to prevent the overlay from opening automatically.
   *
   */
  @JSProperty("autoOpenDisabled")
  void setAutoOpenDisabled(boolean value);

  /**
   * Set to true to disable this element.
   *
   */
  @JSProperty("disabled")
  boolean getDisabled();

  /**
   * Set to true to disable this element.
   *
   */
  @JSProperty("disabled")
  void setDisabled(boolean value);

  /**
   * When present, it specifies that the element field is read-only.
   *
   */
  @JSProperty("readonly")
  boolean getReadonly();

  /**
   * When present, it specifies that the element field is read-only.
   *
   */
  @JSProperty("readonly")
  void setReadonly(boolean value);

  /**
   * Custom function for rendering the content of every item.
   * Receives three arguments:
   *
   * <ul>
   * <li><code>root</code> The <code>&lt;vaadin-combo-box-item&gt;</code> internal container DOM element.</li>
   * <li><code>comboBox</code> The reference to the <code>&lt;vaadin-combo-box&gt;</code> element.</li>
   * <li><code>model</code> The object with the properties related with the rendered
   * item, contains:
   * <ul>
   * <li><code>model.index</code> The index of the rendered item.</li>
   * <li><code>model.item</code> The item.</li>
   * </ul>
   * </li>
   * </ul>
   */
  @JSProperty("renderer")
  @Nullable
  ComboBoxRenderer getRenderer();

  /**
   * Custom function for rendering the content of every item.
   * Receives three arguments:
   *
   * <ul>
   * <li><code>root</code> The <code>&lt;vaadin-combo-box-item&gt;</code> internal container DOM element.</li>
   * <li><code>comboBox</code> The reference to the <code>&lt;vaadin-combo-box&gt;</code> element.</li>
   * <li><code>model</code> The object with the properties related with the rendered
   * item, contains:
   * <ul>
   * <li><code>model.index</code> The index of the rendered item.</li>
   * <li><code>model.item</code> The item.</li>
   * </ul>
   * </li>
   * </ul>
   */
  @JSProperty("renderer")
  void setRenderer(@Nullable ComboBoxRenderer value);

  /**
   * A full set of items to filter the visible options from.
   * The items can be of either <code>String</code> or <code>Object</code> type.
   *
   */
  @JSProperty("items")
  @Nullable
  Unknown /* Array < ComboBoxItem | string > | undefined */ getItems();

  /**
   * A full set of items to filter the visible options from.
   * The items can be of either <code>String</code> or <code>Object</code> type.
   *
   */
  @JSProperty("items")
  void setItems(Items... value);

  /**
   * A full set of items to filter the visible options from.
   * The items can be of either <code>String</code> or <code>Object</code> type.
   *
   */
  @JSProperty("items")
  void setItems(String... value);

  /**
   * If <code>true</code>, the user can input a value that is not present in the items list.
   * <code>value</code> property will be set to the input value in this case.
   * Also, when <code>value</code> is set programmatically, the input value will be set
   * to reflect that value.
   *
   */
  @JSProperty("allowCustomValue")
  boolean getAllowCustomValue();

  /**
   * If <code>true</code>, the user can input a value that is not present in the items list.
   * <code>value</code> property will be set to the input value in this case.
   * Also, when <code>value</code> is set programmatically, the input value will be set
   * to reflect that value.
   *
   */
  @JSProperty("allowCustomValue")
  void setAllowCustomValue(boolean value);

  /**
   * A subset of items, filtered based on the user input. Filtered items
   * can be assigned directly to omit the internal filtering functionality.
   * The items can be of either <code>String</code> or <code>Object</code> type.
   *
   */
  @JSProperty("filteredItems")
  @Nullable
  Unknown /* Array < ComboBoxItem | string > | undefined */ getFilteredItems();

  /**
   * A subset of items, filtered based on the user input. Filtered items
   * can be assigned directly to omit the internal filtering functionality.
   * The items can be of either <code>String</code> or <code>Object</code> type.
   *
   */
  @JSProperty("filteredItems")
  void setFilteredItems(FilteredItems... value);

  /**
   * A subset of items, filtered based on the user input. Filtered items
   * can be assigned directly to omit the internal filtering functionality.
   * The items can be of either <code>String</code> or <code>Object</code> type.
   *
   */
  @JSProperty("filteredItems")
  void setFilteredItems(String... value);

  /**
   * The <code>String</code> value for the selected item of the combo box. Provides
   * the value for <code>iron-form</code>.
   *
   * When there’s no item selected, the value is an empty string.
   *
   * Use <code>selectedItem</code> property to get the raw selected item from
   * the <code>items</code> array.
   *
   */
  @JSProperty("value")
  String getValue();

  /**
   * The <code>String</code> value for the selected item of the combo box. Provides
   * the value for <code>iron-form</code>.
   *
   * When there’s no item selected, the value is an empty string.
   *
   * Use <code>selectedItem</code> property to get the raw selected item from
   * the <code>items</code> array.
   *
   */
  @JSProperty("value")
  void setValue(String value);

  /**
   * When set to <code>true</code>, &quot;loading&quot; attribute is added to host and the overlay element.
   *
   */
  @JSProperty("loading")
  boolean getLoading();

  /**
   * When set to <code>true</code>, &quot;loading&quot; attribute is added to host and the overlay element.
   *
   */
  @JSProperty("loading")
  void setLoading(boolean value);

  /**
   * Filtering string the user has typed into the input field.
   *
   */
  @JSProperty("filter")
  String getFilter();

  /**
   * Filtering string the user has typed into the input field.
   *
   */
  @JSProperty("filter")
  void setFilter(String value);

  /**
   * The selected item from the <code>items</code> array.
   *
   */
  @JSProperty("selectedItem")
  @Nullable
  Unknown /* ComboBoxItem | string | null | undefined */ getSelectedItem();

  /**
   * The selected item from the <code>items</code> array.
   *
   */
  @JSProperty("selectedItem")
  void setSelectedItem(@Nullable String value);

  /**
   * The selected item from the <code>items</code> array.
   *
   */
  @JSProperty("selectedItem")
  void setSelectedItem(@Nullable SelectedItem value);

  /**
   * Path for label of the item. If <code>items</code> is an array of objects, the
   * <code>itemLabelPath</code> is used to fetch the displayed string label for each
   * item.
   *
   * The item label is also used for matching items when processing user
   * input, i.e., for filtering and selecting items.
   *
   * When using item templates, the property is still needed because it is used
   * for filtering, and for displaying the selected item value in the input box.
   *
   */
  @JSProperty("itemLabelPath")
  String getItemLabelPath();

  /**
   * Path for label of the item. If <code>items</code> is an array of objects, the
   * <code>itemLabelPath</code> is used to fetch the displayed string label for each
   * item.
   *
   * The item label is also used for matching items when processing user
   * input, i.e., for filtering and selecting items.
   *
   * When using item templates, the property is still needed because it is used
   * for filtering, and for displaying the selected item value in the input box.
   *
   */
  @JSProperty("itemLabelPath")
  void setItemLabelPath(String value);

  /**
   * Path for the value of the item. If <code>items</code> is an array of objects, the
   * <code>itemValuePath:</code> is used to fetch the string value for the selected
   * item.
   *
   * The item value is used in the <code>value</code> property of the combo box,
   * to provide the form value.
   *
   */
  @JSProperty("itemValuePath")
  String getItemValuePath();

  /**
   * Path for the value of the item. If <code>items</code> is an array of objects, the
   * <code>itemValuePath:</code> is used to fetch the string value for the selected
   * item.
   *
   * The item value is used in the <code>value</code> property of the combo box,
   * to provide the form value.
   *
   */
  @JSProperty("itemValuePath")
  void setItemValuePath(String value);

  /**
   * Path for the id of the item. If <code>items</code> is an array of objects,
   * the <code>itemIdPath</code> is used to compare and identify the same item
   * in <code>selectedItem</code> and <code>filteredItems</code> (items given by the
   * <code>dataProvider</code> callback).
   *
   */
  @JSProperty("itemIdPath")
  @Nullable
  String getItemIdPath();

  /**
   * Path for the id of the item. If <code>items</code> is an array of objects,
   * the <code>itemIdPath</code> is used to compare and identify the same item
   * in <code>selectedItem</code> and <code>filteredItems</code> (items given by the
   * <code>dataProvider</code> callback).
   *
   */
  @JSProperty("itemIdPath")
  void setItemIdPath(@Nullable String value);

  /**
   * The name of this element.
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * The name of this element.
   *
   */
  @JSProperty("name")
  void setName(@Nullable String value);

  /**
   * Set to true if the value is invalid.
   *
   */
  @JSProperty("invalid")
  boolean getInvalid();

  /**
   * Set to true if the value is invalid.
   *
   */
  @JSProperty("invalid")
  void setInvalid(boolean value);

  void ready();

  /**
   * Manually invoke existing renderer.
   *
   */
  void render();

  /**
   * Opens the dropdown list.
   *
   */
  void open();

  /**
   * Closes the dropdown list.
   *
   */
  void close();

  /**
   * Reverts back to original value.
   *
   */
  void cancel();

  /**
   * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
   *
   * @return True if the value is valid and sets the <code>invalid</code> flag appropriately
   *
   */
  boolean validate();

  /**
   * Returns true if the current input value satisfies all constraints (if any)
   *
   * You can override the <code>checkValidity</code> method for custom validations.
   *
   */
  boolean checkValidity();

  interface Items extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    static Items.Builder builder() {
      return new Items.Builder();
    }

    final class Builder {
      private final Items object = Any.empty();

      private Builder() {
      }

      public Items build() {
        return object;
      }

      public Items.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }

  interface FilteredItems extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    static FilteredItems.Builder builder() {
      return new FilteredItems.Builder();
    }

    final class Builder {
      private final FilteredItems object = Any.empty();

      private Builder() {
      }

      public FilteredItems build() {
        return object;
      }

      public FilteredItems.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }

  interface SelectedItem extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    static SelectedItem.Builder builder() {
      return new SelectedItem.Builder();
    }

    final class Builder {
      private final SelectedItem object = Any.empty();

      private Builder() {
      }

      public SelectedItem build() {
        return object;
      }

      public SelectedItem.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }
}
