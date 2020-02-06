package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.vaadin.renderers.ComboBoxRenderer;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


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
	@Nullable
	@JSProperty
	ComboBoxRenderer<ITEM> getRenderer();

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
	@JSProperty
	void setRenderer(ComboBoxRenderer<ITEM> renderer);

	/**
	 * A full set of items to filter the visible options from.
	 * The items can be of either <code>String</code> or <code>Object</code> type.
	 */
	@Nullable
	@JSProperty
	Array<ITEM> getItems();

	/**
	 * A full set of items to filter the visible options from.
	 * The items can be of either <code>String</code> or <code>Object</code> type.
	 */
	@JSProperty
	void setItems(@JSByRef ITEM... items);

	@JSProperty
	void setItems(Array<ITEM> items);

	/**
	 * If <code>true</code>, the user can input a value that is not present in the items list.
	 * <code>value</code> property will be set to the input value in this case.
	 * Also, when <code>value</code> is set programmatically, the input value will be set
	 * to reflect that value.
	 */
	@JSProperty
	boolean isAllowCustomValue();

	/**
	 * If <code>true</code>, the user can input a value that is not present in the items list.
	 * <code>value</code> property will be set to the input value in this case.
	 * Also, when <code>value</code> is set programmatically, the input value will be set
	 * to reflect that value.
	 */
	@JSProperty
	void setAllowCustomValue(boolean allowCustomValue);

	/**
	 * A subset of items, filtered based on the user input. Filtered items
	 * can be assigned directly to omit the internal filtering functionality.
	 * The items can be of either <code>String</code> or <code>Object</code> type.
	 */
	@Nullable
	@JSProperty
	Array<ITEM> getFilteredItems();

	/**
	 * A subset of items, filtered based on the user input. Filtered items
	 * can be assigned directly to omit the internal filtering functionality.
	 * The items can be of either <code>String</code> or <code>Object</code> type.
	 */
	@JSProperty
	void setFilteredItems(@JSByRef ITEM... filteredItems);

	@JSProperty
	void setFilteredItems(Array<ITEM> filteredItems);

	/**
	 * The <code>String</code> value for the selected item of the combo box. Provides
	 * the value for <code>iron-form</code>.
	 * <p>
	 * When there’s no item selected, the value is an empty string.
	 * <p>
	 * Use <code>selectedItem</code> property to get the raw selected item from
	 * the <code>items</code> array.
	 */
	@Nullable
	@JSProperty
	String getValue();

	/**
	 * The <code>String</code> value for the selected item of the combo box. Provides
	 * the value for <code>iron-form</code>.
	 * <p>
	 * When there’s no item selected, the value is an empty string.
	 * <p>
	 * Use <code>selectedItem</code> property to get the raw selected item from
	 * the <code>items</code> array.
	 */
	@JSProperty
	void setValue(String value);

	/**
	 * When set to <code>true</code>, &quot;loading&quot; attribute is added to host and the overlay element.
	 */
	@JSProperty
	boolean isLoading();

	/**
	 * When set to <code>true</code>, &quot;loading&quot; attribute is added to host and the overlay element.
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
	 * The selected item from the <code>items</code> array.
	 */
	@Nullable
	@JSProperty
	ITEM getSelectedItem();

	/**
	 * The selected item from the <code>items</code> array.
	 */
	@JSProperty
	void setSelectedItem(ITEM selectedItem);

	/**
	 * Path for label of the item. If <code>items</code> is an array of objects, the
	 * <code>itemLabelPath</code> is used to fetch the displayed string label for each
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
	 * Path for label of the item. If <code>items</code> is an array of objects, the
	 * <code>itemLabelPath</code> is used to fetch the displayed string label for each
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
	 * Path for the value of the item. If <code>items</code> is an array of objects, the
	 * <code>itemValuePath:</code> is used to fetch the string value for the selected
	 * item.
	 * <p>
	 * The item value is used in the <code>value</code> property of the combo box,
	 * to provide the form value.
	 */
	@Nullable
	@JSProperty
	String getItemValuePath();

	/**
	 * Path for the value of the item. If <code>items</code> is an array of objects, the
	 * <code>itemValuePath:</code> is used to fetch the string value for the selected
	 * item.
	 * <p>
	 * The item value is used in the <code>value</code> property of the combo box,
	 * to provide the form value.
	 */
	@JSProperty
	void setItemValuePath(String itemValuePath);

	/**
	 * Path for the id of the item. If <code>items</code> is an array of objects,
	 * the <code>itemIdPath</code> is used to compare and identify the same item
	 * in <code>selectedItem</code> and <code>filteredItems</code> (items given by the
	 * <code>dataProvider</code> callback).
	 */
	@Nullable
	@JSProperty
	String getItemIdPath();

	/**
	 * Path for the id of the item. If <code>items</code> is an array of objects,
	 * the <code>itemIdPath</code> is used to compare and identify the same item
	 * in <code>selectedItem</code> and <code>filteredItems</code> (items given by the
	 * <code>dataProvider</code> callback).
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
	 * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
	 *
	 * @return True if the value is valid and sets the <code>invalid</code> flag appropriately
	 */
	boolean validate();

	/**
	 * Returns true if the current input value satisfies all constraints (if any)
	 * <p>
	 * You can override the <code>checkValidity</code> method for custom validations.
	 */
	boolean checkValidity();
}
