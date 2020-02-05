package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.ComboBoxRenderer;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "ComboBoxMixin",
		module = "@vaadin/vaadin-combo-box/src/vaadin-combo-box-mixin.js"
)
public interface ComboBoxMixin<ITEM extends Any> extends Element {
	/**
	 * True if the dropdown is open, false otherwise.
	 */
	@JSProperty
	boolean isOpened();

	/**
	 * True if the dropdown is open, false otherwise.
	 */
	@JSProperty
	void setOpened(boolean opened);

	/**
	 * Set to true to disable this element.
	 */
	@JSProperty
	boolean isDisabled();

	/**
	 * Set to true to disable this element.
	 */
	@JSProperty
	void setDisabled(boolean disabled);

	/**
	 * When present, it specifies that the element field is read-only.
	 */
	@JSProperty
	boolean isReadonly();

	/**
	 * When present, it specifies that the element field is read-only.
	 */
	@JSProperty
	void setReadonly(boolean readonly);

	/**
	 * Custom function for rendering the content of every item.
	 * Receives three arguments:
	 * <p>
	 * - `root` The `<vaadin-combo-box-item>` internal container DOM element.
	 * - `comboBox` The reference to the `<vaadin-combo-box>` element.
	 * - `model` The object with the properties related with the rendered
	 * item, contains:
	 * - `model.index` The index of the rendered item.
	 * - `model.item` The item.
	 */
	@Nullable
	@JSProperty
	ComboBoxRenderer<ITEM> getRenderer();

	/**
	 * Custom function for rendering the content of every item.
	 * Receives three arguments:
	 * <p>
	 * - `root` The `<vaadin-combo-box-item>` internal container DOM element.
	 * - `comboBox` The reference to the `<vaadin-combo-box>` element.
	 * - `model` The object with the properties related with the rendered
	 * item, contains:
	 * - `model.index` The index of the rendered item.
	 * - `model.item` The item.
	 */
	@JSProperty
	void setRenderer(ComboBoxRenderer<ITEM> renderer);

	/**
	 * A full set of items to filter the visible options from.
	 * The items can be of either `String` or `Object` type.
	 */
	@Nullable
	@JSProperty
	Array<ITEM> getItems();

	/**
	 * A full set of items to filter the visible options from.
	 * The items can be of either `String` or `Object` type.
	 */
	@JSProperty
	void setItems(@JSByRef ITEM... items);

	@JSProperty
	void setItems(Array<ITEM> items);

	/**
	 * If `true`, the user can input a value that is not present in the items list.
	 * `value` property will be set to the input value in this case.
	 * Also, when `value` is set programmatically, the input value will be set
	 * to reflect that value.
	 */
	@JSProperty
	boolean isAllowCustomValue();

	/**
	 * If `true`, the user can input a value that is not present in the items list.
	 * `value` property will be set to the input value in this case.
	 * Also, when `value` is set programmatically, the input value will be set
	 * to reflect that value.
	 */
	@JSProperty
	void setAllowCustomValue(boolean allowCustomValue);

	/**
	 * A subset of items, filtered based on the user input. Filtered items
	 * can be assigned directly to omit the internal filtering functionality.
	 * The items can be of either `String` or `Object` type.
	 */
	@Nullable
	@JSProperty
	Array<ITEM> getFilteredItems();

	/**
	 * A subset of items, filtered based on the user input. Filtered items
	 * can be assigned directly to omit the internal filtering functionality.
	 * The items can be of either `String` or `Object` type.
	 */
	@JSProperty
	void setFilteredItems(@JSByRef ITEM... filteredItems);

	@JSProperty
	void setFilteredItems(Array<ITEM> filteredItems);

	/**
	 * The `String` value for the selected item of the combo box. Provides
	 * the value for `iron-form`.
	 * <p>
	 * When there’s no item selected, the value is an empty string.
	 * <p>
	 * Use `selectedItem` property to get the raw selected item from
	 * the `items` array.
	 */
	@Nullable
	@JSProperty
	String getValue();

	/**
	 * The `String` value for the selected item of the combo box. Provides
	 * the value for `iron-form`.
	 * <p>
	 * When there’s no item selected, the value is an empty string.
	 * <p>
	 * Use `selectedItem` property to get the raw selected item from
	 * the `items` array.
	 */
	@JSProperty
	void setValue(String value);

	/**
	 * When set to `true`, "loading" attribute is added to host and the overlay element.
	 */
	@JSProperty
	boolean isLoading();

	/**
	 * When set to `true`, "loading" attribute is added to host and the overlay element.
	 */
	@JSProperty
	void setLoading(boolean loading);

	/**
	 * Filtering string the user has typed into the input field.
	 */
	@Nullable
	@JSProperty
	String getFilter();

	/**
	 * Filtering string the user has typed into the input field.
	 */
	@JSProperty
	void setFilter(String filter);

	/**
	 * The selected item from the `items` array.
	 */
	@Nullable
	@JSProperty
	ITEM getSelectedItem();

	/**
	 * The selected item from the `items` array.
	 */
	@JSProperty
	void setSelectedItem(ITEM selectedItem);

	/**
	 * Path for label of the item. If `items` is an array of objects, the
	 * `itemLabelPath` is used to fetch the displayed string label for each
	 * item.
	 * <p>
	 * The item label is also used for matching items when processing user
	 * input, i.e., for filtering and selecting items.
	 * <p>
	 * When using item templates, the property is still needed because it is used
	 * for filtering, and for displaying the selected item value in the input box.
	 */
	@Nullable
	@JSProperty
	String getItemLabelPath();

	/**
	 * Path for label of the item. If `items` is an array of objects, the
	 * `itemLabelPath` is used to fetch the displayed string label for each
	 * item.
	 * <p>
	 * The item label is also used for matching items when processing user
	 * input, i.e., for filtering and selecting items.
	 * <p>
	 * When using item templates, the property is still needed because it is used
	 * for filtering, and for displaying the selected item value in the input box.
	 */
	@JSProperty
	void setItemLabelPath(String itemLabelPath);

	/**
	 * Path for the value of the item. If `items` is an array of objects, the
	 * `itemValuePath:` is used to fetch the string value for the selected
	 * item.
	 * <p>
	 * The item value is used in the `value` property of the combo box,
	 * to provide the form value.
	 */
	@Nullable
	@JSProperty
	String getItemValuePath();

	/**
	 * Path for the value of the item. If `items` is an array of objects, the
	 * `itemValuePath:` is used to fetch the string value for the selected
	 * item.
	 * <p>
	 * The item value is used in the `value` property of the combo box,
	 * to provide the form value.
	 */
	@JSProperty
	void setItemValuePath(String itemValuePath);

	/**
	 * Path for the id of the item. If `items` is an array of objects,
	 * the `itemIdPath` is used to compare and identify the same item
	 * in `selectedItem` and `filteredItems` (items given by the
	 * `dataProvider` callback).
	 */
	@Nullable
	@JSProperty
	String getItemIdPath();

	/**
	 * Path for the id of the item. If `items` is an array of objects,
	 * the `itemIdPath` is used to compare and identify the same item
	 * in `selectedItem` and `filteredItems` (items given by the
	 * `dataProvider` callback).
	 */
	@JSProperty
	void setItemIdPath(String itemIdPath);

	/**
	 * The name of this element.
	 */
	@Nullable
	@JSProperty
	String getName();

	/**
	 * The name of this element.
	 */
	@JSProperty
	void setName(String name);

	/**
	 * Set to true if the value is invalid.
	 */
	@JSProperty
	boolean isInvalid();

	/**
	 * Set to true if the value is invalid.
	 */
	@JSProperty
	void setInvalid(boolean invalid);

	/**
	 * Manually invoke existing renderer.
	 */
	void render();

	/**
	 * Opens the dropdown list.
	 */
	void open();

	/**
	 * Closes the dropdown list.
	 */
	void close();

	/**
	 * Reverts back to original value.
	 */
	void cancel();

	/**
	 * Returns true if `value` is valid, and sets the `invalid` flag appropriately.
	 *
	 * @return True if the value is valid and sets the `invalid` flag appropriately
	 */
	boolean validate();

	/**
	 * Returns true if the current input value satisfies all constraints (if any)
	 * <p>
	 * You can override the `checkValidity` method for custom validations.
	 */
	boolean checkValidity();
}
