package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.polymer.types.StringPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ComboBoxMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.ComboBoxRenderer;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;
import js.lang.JsString;
import js.util.collections.Array;
import js.web.dom.CustomEvent;
import js.web.dom.Event;

import javax.annotation.Nullable;

public interface HasComboBoxMixin<ITEM extends Any, E extends ComboBoxMixin<ITEM>, T extends Component<E>>
		extends Component<E> {
	/**
	 * True if the dropdown is open, false otherwise.
	 */
	default boolean opened() {
		return getNode().isOpened();
	}

	/**
	 * True if the dropdown is open, false otherwise.
	 */
	default T opened(boolean opened) {
		getNode().setOpened(opened);
		return (T) this;
	}

	/**
	 * Set to true to disable this element.
	 */
	default boolean disabled() {
		return getNode().isDisabled();
	}

	/**
	 * Set to true to disable this element.
	 */
	default T disabled(boolean disabled) {
		getNode().setDisabled(disabled);
		return (T) this;
	}

	/**
	 * When present, it specifies that the element field is read-only.
	 */
	default boolean readonly() {
		return getNode().isReadonly();
	}

	/**
	 * When present, it specifies that the element field is read-only.
	 */
	default T readonly(boolean readonly) {
		getNode().setReadonly(readonly);
		return (T) this;
	}

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
	default ComboBoxRenderer<ITEM> renderer() {
		return getNode().getRenderer();
	}

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
	default T renderer(ComboBoxRenderer<ITEM> renderer) {
		getNode().setRenderer(renderer);
		return (T) this;
	}

	/**
	 * A full set of items to filter the visible options from.
	 * The items can be of either <code>String</code> or <code>Object</code> type.
	 */
	@Nullable
	default Array<ITEM> items() {
		return getNode().getItems();
	}

	/**
	 * A full set of items to filter the visible options from.
	 * The items can be of either <code>String</code> or <code>Object</code> type.
	 */
	default T items(ITEM... items) {
		getNode().setItems(items);
		return (T) this;
	}

	default T items(Array<ITEM> items) {
		getNode().setItems(items);
		return (T) this;
	}

	/**
	 * If <code>true</code>, the user can input a value that is not present in the items list.
	 * <code>value</code> property will be set to the input value in this case.
	 * Also, when <code>value</code> is set programmatically, the input value will be set
	 * to reflect that value.
	 */
	default boolean allowCustomValue() {
		return getNode().isAllowCustomValue();
	}

	/**
	 * If <code>true</code>, the user can input a value that is not present in the items list.
	 * <code>value</code> property will be set to the input value in this case.
	 * Also, when <code>value</code> is set programmatically, the input value will be set
	 * to reflect that value.
	 */
	default T allowCustomValue(boolean allowCustomValue) {
		getNode().setAllowCustomValue(allowCustomValue);
		return (T) this;
	}

	/**
	 * A subset of items, filtered based on the user input. Filtered items
	 * can be assigned directly to omit the internal filtering functionality.
	 * The items can be of either <code>String</code> or <code>Object</code> type.
	 */
	@Nullable
	default Array<ITEM> filteredItems() {
		return getNode().getFilteredItems();
	}

	/**
	 * A subset of items, filtered based on the user input. Filtered items
	 * can be assigned directly to omit the internal filtering functionality.
	 * The items can be of either <code>String</code> or <code>Object</code> type.
	 */
	default T filteredItems(ITEM... filteredItems) {
		getNode().setFilteredItems(filteredItems);
		return (T) this;
	}

	default T filteredItems(Array<ITEM> filteredItems) {
		getNode().setFilteredItems(filteredItems);
		return (T) this;
	}

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
	default String value() {
		return getNode().getValue();
	}

	/**
	 * The <code>String</code> value for the selected item of the combo box. Provides
	 * the value for <code>iron-form</code>.
	 * <p>
	 * When there’s no item selected, the value is an empty string.
	 * <p>
	 * Use <code>selectedItem</code> property to get the raw selected item from
	 * the <code>items</code> array.
	 */
	default T value(String value) {
		getNode().setValue(value);
		return (T) this;
	}

	/**
	 * When set to <code>true</code>, &quot;loading&quot; attribute is added to host and the overlay element.
	 */
	default boolean loading() {
		return getNode().isLoading();
	}

	/**
	 * When set to <code>true</code>, &quot;loading&quot; attribute is added to host and the overlay element.
	 */
	default T loading(boolean loading) {
		getNode().setLoading(loading);
		return (T) this;
	}

	/**
	 * Filtering string the user has typed into the input field.
	 */
	@Nullable
	default String filter() {
		return getNode().getFilter();
	}

	/**
	 * Filtering string the user has typed into the input field.
	 */
	default T filter(String filter) {
		getNode().setFilter(filter);
		return (T) this;
	}

	/**
	 * The selected item from the <code>items</code> array.
	 */
	@Nullable
	default ITEM selectedItem() {
		return getNode().getSelectedItem();
	}

	/**
	 * The selected item from the <code>items</code> array.
	 */
	default T selectedItem(ITEM selectedItem) {
		getNode().setSelectedItem(selectedItem);
		return (T) this;
	}

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
	default String itemLabelPath() {
		return getNode().getItemLabelPath();
	}

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
	default T itemLabelPath(String itemLabelPath) {
		getNode().setItemLabelPath(itemLabelPath);
		return (T) this;
	}

	/**
	 * Path for the value of the item. If <code>items</code> is an array of objects, the
	 * <code>itemValuePath:</code> is used to fetch the string value for the selected
	 * item.
	 * <p>
	 * The item value is used in the <code>value</code> property of the combo box,
	 * to provide the form value.
	 */
	@Nullable
	default String itemValuePath() {
		return getNode().getItemValuePath();
	}

	/**
	 * Path for the value of the item. If <code>items</code> is an array of objects, the
	 * <code>itemValuePath:</code> is used to fetch the string value for the selected
	 * item.
	 * <p>
	 * The item value is used in the <code>value</code> property of the combo box,
	 * to provide the form value.
	 */
	default T itemValuePath(String itemValuePath) {
		getNode().setItemValuePath(itemValuePath);
		return (T) this;
	}

	/**
	 * Path for the id of the item. If <code>items</code> is an array of objects,
	 * the <code>itemIdPath</code> is used to compare and identify the same item
	 * in <code>selectedItem</code> and <code>filteredItems</code> (items given by the
	 * <code>dataProvider</code> callback).
	 */
	@Nullable
	default String itemIdPath() {
		return getNode().getItemIdPath();
	}

	/**
	 * Path for the id of the item. If <code>items</code> is an array of objects,
	 * the <code>itemIdPath</code> is used to compare and identify the same item
	 * in <code>selectedItem</code> and <code>filteredItems</code> (items given by the
	 * <code>dataProvider</code> callback).
	 */
	default T itemIdPath(String itemIdPath) {
		getNode().setItemIdPath(itemIdPath);
		return (T) this;
	}

	/**
	 * The name of this element.
	 */
	@Nullable
	default String name() {
		return getNode().getName();
	}

	/**
	 * The name of this element.
	 */
	default T name(String name) {
		getNode().setName(name);
		return (T) this;
	}

	/**
	 * Set to true if the value is invalid.
	 */
	default boolean invalid() {
		return getNode().isInvalid();
	}

	/**
	 * Set to true if the value is invalid.
	 */
	default T invalid(boolean invalid) {
		getNode().setInvalid(invalid);
		return (T) this;
	}

	/**
	 * Manually invoke existing renderer.
	 */
	default void render() {
		getNode().render();
	}

	/**
	 * Opens the dropdown list.
	 */
	default void open() {
		getNode().open();
	}

	/**
	 * Closes the dropdown list.
	 */
	default void close() {
		getNode().close();
	}

	/**
	 * Reverts back to original value.
	 */
	default void cancel() {
		getNode().cancel();
	}

	/**
	 * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
	 *
	 * @return True if the value is valid and sets the <code>invalid</code> flag appropriately
	 */
	default boolean validate() {
		return getNode().validate();
	}

	/**
	 * Returns true if the current input value satisfies all constraints (if any)
	 * <p>
	 * You can override the <code>checkValidity</code> method for custom validations.
	 */
	default boolean checkValidity() {
		return getNode().checkValidity();
	}

	/**
	 * Fired when value changes.
	 * To comply with
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/Events/change">https://developer.mozilla.org/en-US/docs/Web/Events/change</a>
	 */
	default ObservableEvent<Event> changeEvent() {
		return createEvent("change");
	}

	/**
	 * Fired when the user sets a custom value.
	 */
	default ObservableEvent<CustomEvent<JsString>> customValueSetEvent() {
		return createEvent("custom-value-set");
	}

	/**
	 * Fired when selected item changes.
	 */
	default ObservableEvent<PropertyChangeEvent<ITEM>> selectedItemChangedEvent() {
		return createEvent("selected-item-changed");
	}

	/**
	 * Fired when the value changes.
	 */
	default ObservableEvent<StringPropertyChangeEvent> valueChangedEvent() {
		return createEvent("value-changed");
	}
}
