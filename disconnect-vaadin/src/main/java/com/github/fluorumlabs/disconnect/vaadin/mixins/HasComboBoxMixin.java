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
     * <p>
     * - `root` The `<vaadin-combo-box-item>` internal container DOM element.
     * - `comboBox` The reference to the `<vaadin-combo-box>` element.
     * - `model` The object with the properties related with the rendered
     * item, contains:
     * - `model.index` The index of the rendered item.
     * - `model.item` The item.
     */
    @Nullable
    default ComboBoxRenderer<ITEM> renderer() {
        return getNode().getRenderer();
    }

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
    default T renderer(ComboBoxRenderer<ITEM> renderer) {
        getNode().setRenderer(renderer);
        return (T) this;
    }

    /**
     * A full set of items to filter the visible options from.
     * The items can be of either `String` or `Object` type.
     */
    @Nullable
    default Array<ITEM> items() {
        return getNode().getItems();
    }

    /**
     * A full set of items to filter the visible options from.
     * The items can be of either `String` or `Object` type.
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
     * If `true`, the user can input a value that is not present in the items list.
     * `value` property will be set to the input value in this case.
     * Also, when `value` is set programmatically, the input value will be set
     * to reflect that value.
     */
    default boolean allowCustomValue() {
        return getNode().isAllowCustomValue();
    }

    /**
     * If `true`, the user can input a value that is not present in the items list.
     * `value` property will be set to the input value in this case.
     * Also, when `value` is set programmatically, the input value will be set
     * to reflect that value.
     */
    default T allowCustomValue(boolean allowCustomValue) {
        getNode().setAllowCustomValue(allowCustomValue);
        return (T) this;
    }

    /**
     * A subset of items, filtered based on the user input. Filtered items
     * can be assigned directly to omit the internal filtering functionality.
     * The items can be of either `String` or `Object` type.
     */
    @Nullable
    default Array<ITEM> filteredItems() {
        return getNode().getFilteredItems();
    }

    /**
     * A subset of items, filtered based on the user input. Filtered items
     * can be assigned directly to omit the internal filtering functionality.
     * The items can be of either `String` or `Object` type.
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
     * The `String` value for the selected item of the combo box. Provides
     * the value for `iron-form`.
     * <p>
     * When there’s no item selected, the value is an empty string.
     * <p>
     * Use `selectedItem` property to get the raw selected item from
     * the `items` array.
     */
    @Nullable
    default String value() {
        return getNode().getValue();
    }

    /**
     * The `String` value for the selected item of the combo box. Provides
     * the value for `iron-form`.
     * <p>
     * When there’s no item selected, the value is an empty string.
     * <p>
     * Use `selectedItem` property to get the raw selected item from
     * the `items` array.
     */
    default T value(String value) {
        getNode().setValue(value);
        return (T) this;
    }

    /**
     * When set to `true`, "loading" attribute is added to host and the overlay element.
     */
    default boolean loading() {
        return getNode().isLoading();
    }

    /**
     * When set to `true`, "loading" attribute is added to host and the overlay element.
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
     * The selected item from the `items` array.
     */
    @Nullable
    default ITEM selectedItem() {
        return getNode().getSelectedItem();
    }

    /**
     * The selected item from the `items` array.
     */
    default T selectedItem(ITEM selectedItem) {
        getNode().setSelectedItem(selectedItem);
        return (T) this;
    }

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
    default String itemLabelPath() {
        return getNode().getItemLabelPath();
    }

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
    default T itemLabelPath(String itemLabelPath) {
        getNode().setItemLabelPath(itemLabelPath);
        return (T) this;
    }

    /**
     * Path for the value of the item. If `items` is an array of objects, the
     * `itemValuePath:` is used to fetch the string value for the selected
     * item.
     * <p>
     * The item value is used in the `value` property of the combo box,
     * to provide the form value.
     */
    @Nullable
    default String itemValuePath() {
        return getNode().getItemValuePath();
    }

    /**
     * Path for the value of the item. If `items` is an array of objects, the
     * `itemValuePath:` is used to fetch the string value for the selected
     * item.
     * <p>
     * The item value is used in the `value` property of the combo box,
     * to provide the form value.
     */
    default T itemValuePath(String itemValuePath) {
        getNode().setItemValuePath(itemValuePath);
        return (T) this;
    }

    /**
     * Path for the id of the item. If `items` is an array of objects,
     * the `itemIdPath` is used to compare and identify the same item
     * in `selectedItem` and `filteredItems` (items given by the
     * `dataProvider` callback).
     */
    @Nullable
    default String itemIdPath() {
        return getNode().getItemIdPath();
    }

    /**
     * Path for the id of the item. If `items` is an array of objects,
     * the `itemIdPath` is used to compare and identify the same item
     * in `selectedItem` and `filteredItems` (items given by the
     * `dataProvider` callback).
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
     * Returns true if `value` is valid, and sets the `invalid` flag appropriately.
     *
     * @return True if the value is valid and sets the `invalid` flag appropriately
     */
    default boolean validate() {
        return getNode().validate();
    }

    /**
     * Returns true if the current input value satisfies all constraints (if any)
     * <p>
     * You can override the `checkValidity` method for custom validations.
     */
    default boolean checkValidity() {
        return getNode().checkValidity();
    }

    /**
     * Fired when value changes.
     * To comply with https://developer.mozilla.org/en-US/docs/Web/Events/change
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
