package com.github.fluorumlabs.disconnect.vaadin.combobox;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponentWithItem;
import com.github.fluorumlabs.disconnect.core.containers.ParentNodeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.observables.Observable;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.core.utils.SerDes;
import com.github.fluorumlabs.disconnect.vaadin.ComponentRendererWithContext;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.DataProvider;
import js.lang.external.vaadin.combobox.ComboBoxDataProviderParams;
import js.lang.external.vaadin.combobox.ComboBoxLightElement;

import javax.annotation.Nullable;
import java.util.List;

/**
 * <code>&lt;vaadin-combo-box-light&gt;</code> is a customizable version of the <code>&lt;vaadin-combo-box&gt;</code> providing only the dropdown functionality and leaving the input field definition to the user.
 *
 * The element has the same API as <code>&lt;vaadin-combo-box&gt;</code>.
 *
 * To create a custom input field, you need to add a child element which has a two-way data-bindable property representing the input value. The property name is expected to be <code>value</code> by default. See the example below for a simplest possible example using a <code>&lt;vaadin-text-field&gt;</code> element.
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box-light&gt;
 *    &lt;vaadin-text-field&gt;
 *    &lt;/vaadin-text-field&gt;
 * &lt;/vaadin-combo-box-light&gt;
 * </code></pre>
 * If you are using other custom input fields like <code>&lt;iron-input&gt;</code>, you need to define the name of the bindable property with the <code>attrForValue</code> attribute.
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box-light attr-for-value="bind-value"&gt;
 *    &lt;iron-input&gt;
 *      &lt;input&gt;
 *    &lt;/iron-input&gt;
 * &lt;/vaadin-combo-box-light&gt;
 * </code></pre>
 * In the next example you can see how to create a custom input field based on a <code>&lt;paper-input&gt;</code> decorated with a custom <code>&lt;iron-icon&gt;</code> and two <code>&lt;paper-button&gt;</code>s to act as the clear and toggle controls.
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box-light&gt;
 *    &lt;paper-input label="Elements" class="input"&gt;
 *      &lt;iron-icon icon="toll" slot="prefix"&gt;&lt;/iron-icon&gt;
 *      &lt;paper-button slot="suffix" class="clear-button"&gt;Clear&lt;/paper-button&gt;
 *      &lt;paper-button slot="suffix" class="toggle-button"&gt;Toggle&lt;/paper-button&gt;
 *    &lt;/paper-input&gt;
 * &lt;/vaadin-combo-box-light&gt;
 * </code></pre>
 * <strong>Mixins:</strong> ThemableMixin, ComboBoxDataProviderMixin, ComboBoxMixin, ElementMixin
 */
@CustomElement(tagName = "vaadin-combo-box-light", external = true)
public class ComboBoxLight<T> extends HtmlComponentWithItem<T, ComboBoxLightElement<Mirrored<T>>> implements Themable<ComboBoxLightElement<Mirrored<T>>> {

    public ComboBoxLight() {
    }

    public ComboBoxLight(String textContent) {
        super(textContent);
    }

    public ComboBoxLight(Component<?>... components) {
        super(components);
    }

    // !wca! cancel: (): void
    /**
     * Reverts back to original value.
     */
    public void cancel() {
        getElement().cancel();
    }

    // !wca! checkValidity: (): boolean | undefined
    /**
     * Returns true if the current input value satisfies all constraints (if any)
     *
     * You can override the <code>checkValidity</code> method for custom validations.
     */
    public boolean checkValidity() {
        return getElement().checkValidity();
    }

    // !wca! clearCache: (): void
    /**
     * Clears the cached pages and reloads data from dataprovider when needed.
     */
    public void clearCache() {
        getElement().clearCache();
    }

    // !wca! close: (): void
    /**
     * Closes the dropdown list.
     */
    public void close() {
        getElement().close();
    }

    // !wca! open: (): void
    /**
     * Opens the dropdown list.
     */
    public void open() {
        getElement().open();
    }

    // !wca! validate: (): boolean
    /**
     * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
     */
    public boolean validate() {
        return getElement().validate();
    }

    // !wca! get allowCustomValue: boolean
    /**
     * If <code>true</code>, the user can input a value that is not present in the items list.
     * <code>value</code> property will be set to the input value in this case.
     * Also, when <code>value</code> is set programmatically, the input value will be set
     * to reflect that value.
     */
    public boolean isAllowCustomValue() {
        return getElement().isAllowCustomValue();
    }

    // !wca! set allowCustomValue: boolean
    /**
     * If <code>true</code>, the user can input a value that is not present in the items list.
     * <code>value</code> property will be set to the input value in this case.
     * Also, when <code>value</code> is set programmatically, the input value will be set
     * to reflect that value.
     */
    public void setAllowCustomValue(boolean value) {
        getElement().setAllowCustomValue(value);
    }

    // !wca! observe allowCustomValue: boolean

    // !wca! get attrForValue: string
    /**
     * Name of the two-way data-bindable property representing the
     * value of the custom input field.
     */
    public String getAttrForValue() {
        return getElement().getAttrForValue();
    }

    // !wca! set attrForValue: string
    /**
     * Name of the two-way data-bindable property representing the
     * value of the custom input field.
     */
    public void setAttrForValue(String value) {
        getElement().setAttrForValue(value);
    }

    // !wca! observe attrForValue: string

    // !wca! get autoOpenDisabled: boolean | null | undefined
    /**
     * Set true to prevent the overlay from opening automatically.
     */
    public boolean isAutoOpenDisabled() {
        return getElement().isAutoOpenDisabled();
    }

    // !wca! set autoOpenDisabled: boolean | null | undefined
    /**
     * Set true to prevent the overlay from opening automatically.
     */
    public void setAutoOpenDisabled(boolean value) {
        getElement().setAutoOpenDisabled(value);
    }

    // !wca! observe autoOpenDisabled: boolean | null | undefined

    // !wca! get dataProvider: ComboBoxDataProvider | null | undefined

    // !wca! set dataProvider: ComboBoxDataProvider | null | undefined
    /**
     * Function that provides items lazily. Receives arguments <code>params</code>, <code>callback</code>
     *
     * <code>params.page</code> Requested page index
     *
     * <code>params.pageSize</code> Current page size
     *
     * <code>params.filter</code> Currently applied filter
     *
     * <code>callback(items, size)</code> Callback function with arguments:
     *  - <code>items</code> Current page of items
     *  - <code>size</code> Total number of items.
     * @param value
     */
    public void setDataProvider(@Nullable DataProvider<ComboBoxDataProviderParams, Mirrored<T>> value) {
        getElement().setDataProvider(value);
    }

    // !wca! observe dataProvider: ComboBoxDataProvider | null | undefined

    // !wca! get disabled: boolean
    /**
     * Set to true to disable this element.
     */
    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    // !wca! set disabled: boolean
    /**
     * Set to true to disable this element.
     */
    public void setDisabled(boolean value) {
        getElement().setDisabled(value);
    }

    // !wca! observe disabled: boolean

    // !wca! get filter: string
    /**
     * Filtering string the user has typed into the input field.
     */
    public String getFilter() {
        return getElement().getFilter();
    }

    // !wca! set filter: string
    /**
     * Filtering string the user has typed into the input field.
     */
    public void setFilter(String value) {
        getElement().setFilter(value);
    }

    // !wca! observe filter: string
    /**
     * Filtering string the user has typed into the input field.
     */
    public ObservableValue<String> filter() {
        return createObservableValue(this::getFilter, this::setFilter, "filter-changed");
    }

    // !wca! get filteredItems: (string | ComboBoxItem)[] | undefined
    /**
     * A subset of items, filtered based on the user input. Filtered items
     * can be assigned directly to omit the internal filtering functionality.
     * The items can be of either <code>String</code> or <code>Object</code> type.
     */
    @Nullable
    public List<T> getFilteredItems() {
        return SerDes.unmirrorList(getElement().getFilteredItems(), getItemClass());
    }

    // !wca! set filteredItems: (string | ComboBoxItem)[] | undefined
    /**
     * A subset of items, filtered based on the user input. Filtered items
     * can be assigned directly to omit the internal filtering functionality.
     * The items can be of either <code>String</code> or <code>Object</code> type.
     */
    public void setFilteredItems(@Nullable List<T> value) {
        getElement().setFilteredItems(SerDes.mirror(value).cast());
    }

    // !wca! observe filteredItems: (string | ComboBoxItem)[] | undefined
    /**
     * A subset of items, filtered based on the user input. Filtered items
     * can be assigned directly to omit the internal filtering functionality.
     * The items can be of either <code>String</code> or <code>Object</code> type.
     */
    public ObservableValue<List<T>> filteredItems() {
        return createObservableValue(this::getFilteredItems, this::setFilteredItems, "filtered-items-changed");
    }

    // !wca! get focused: boolean
    /**
     */
    public boolean isFocused() {
        return getElement().isFocused();
    }

    // !wca! observe focused: boolean
    /**
     */
    public Observable<Boolean> focused() {
        return createObservable(this::isFocused, "focused-changed");
    }

    // !wca! get inputElement: !Element | undefined

    // !wca! set inputElement: !Element | undefined

    // !wca! observe inputElement: !Element | undefined

    // !wca! get invalid: boolean
    /**
     * Set to true if the value is invalid.
     */
    public boolean isInvalid() {
        return getElement().isInvalid();
    }

    // !wca! set invalid: boolean
    /**
     * Set to true if the value is invalid.
     */
    public void setInvalid(boolean value) {
        getElement().setInvalid(value);
    }

    // !wca! observe invalid: boolean

    // !wca! get itemIdPath: string | null | undefined
    /**
     * Path for the id of the item. If <code>items</code> is an array of objects,
     * the <code>itemIdPath</code> is used to compare and identify the same item
     * in <code>selectedItem</code> and <code>filteredItems</code> (items given by the
     * <code>dataProvider</code> callback).
     */
    public @Nullable String getItemIdPath() {
        return getElement().getItemIdPath();
    }

    // !wca! set itemIdPath: string | null | undefined
    /**
     * Path for the id of the item. If <code>items</code> is an array of objects,
     * the <code>itemIdPath</code> is used to compare and identify the same item
     * in <code>selectedItem</code> and <code>filteredItems</code> (items given by the
     * <code>dataProvider</code> callback).
     */
    public void setItemIdPath(@Nullable String value) {
        getElement().setItemIdPath(value);
    }

    // !wca! observe itemIdPath: string | null | undefined


    // !wca! get itemLabelPath: string
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
     */
    public String getItemLabelPath() {
        return getElement().getItemLabelPath();
    }

    // !wca! set itemLabelPath: string
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
     */
    public void setItemLabelPath(String value) {
        getElement().setItemLabelPath(value);
    }

    // !wca! observe itemLabelPath: string

    // !wca! get itemValuePath: string
    /**
     * Path for the value of the item. If <code>items</code> is an array of objects, the
     * <code>itemValuePath:</code> is used to fetch the string value for the selected
     * item.
     *
     * The item value is used in the <code>value</code> property of the combo box,
     * to provide the form value.
     */
    public String getItemValuePath() {
        return getElement().getItemValuePath();
    }

    // !wca! set itemValuePath: string
    /**
     * Path for the value of the item. If <code>items</code> is an array of objects, the
     * <code>itemValuePath:</code> is used to fetch the string value for the selected
     * item.
     *
     * The item value is used in the <code>value</code> property of the combo box,
     * to provide the form value.
     */
    public void setItemValuePath(String value) {
        getElement().setItemValuePath(value);
    }

    // !wca! observe itemValuePath: string

    // !wca! get items: (string | ComboBoxItem)[] | undefined
    /**
     * A full set of items to filter the visible options from.
     * The items can be of either <code>String</code> or <code>Object</code> type.
     */
    public @Nullable List<T> getItems() {
        return SerDes.unmirrorList(getElement().getItems(), getItemClass());
    }

    // !wca! set items: (string | ComboBoxItem)[] | undefined
    /**
     * A full set of items to filter the visible options from.
     * The items can be of either <code>String</code> or <code>Object</code> type.
     */
    public void setItems(@Nullable List<T> value) {
        getElement().setItems(SerDes.mirror(value).cast());
    }

    // !wca! observe items: (string | ComboBoxItem)[] | undefined
    /**
     * A full set of items to filter the visible options from.
     * The items can be of either <code>String</code> or <code>Object</code> type.
     */
    public ObservableValue<List<T>> items() {
        return createObservableValue(this::getItems, this::setItems, "items-changed");
    }

    // !wca! get loading: boolean
    /**
     * When set to <code>true</code>, "loading" attribute is added to host and the overlay element.
     */
    public boolean isLoading() {
        return getElement().isLoading();
    }

    // !wca! set loading: boolean
    /**
     * When set to <code>true</code>, "loading" attribute is added to host and the overlay element.
     */
    public void setLoading(boolean value) {
        getElement().setLoading(value);
    }

    // !wca! observe loading: boolean
    /**
     * When set to <code>true</code>, "loading" attribute is added to host and the overlay element.
     */
    public ObservableValue<Boolean> loading() {
        return createObservableValue(this::isLoading, this::setLoading, "loading-changed");
    }

    // !wca! get name: string | null | undefined
    /**
     * The name of this element.
     */
    public @Nullable String getName() {
        return getElement().getName();
    }

    // !wca! set name: string | null | undefined
    /**
     * The name of this element.
     */
    public void setName(@Nullable String value) {
        getElement().setName(value);
    }

    // !wca! observe name: string | null | undefined

    // !wca! get opened: boolean
    /**
     * True if the dropdown is open, false otherwise.
     */
    public boolean isOpened() {
        return getElement().isOpened();
    }

    // !wca! set opened: boolean
    /**
     * True if the dropdown is open, false otherwise.
     */
    public void setOpened(boolean value) {
        getElement().setOpened(value);
    }

    // !wca! observe opened: boolean
    /**
     * True if the dropdown is open, false otherwise.
     */
    public ObservableValue<Boolean> opened() {
        return createObservableValue(this::isOpened, this::setOpened, "opened-changed");
    }

    // !wca! get pageSize: number
    /**
     * Number of items fetched at a time from the dataprovider.
     */
    public double getPageSize() {
        return getElement().getPageSize();
    }

    // !wca! set pageSize: number
    /**
     * Number of items fetched at a time from the dataprovider.
     */
    public void setPageSize(double value) {
        getElement().setPageSize(value);
    }

    // !wca! observe pageSize: number

    // !wca! get readonly: boolean
    /**
     * When present, it specifies that the element field is read-only.
     */
    public boolean isReadonly() {
        return getElement().isReadonly();
    }

    // !wca! set readonly: boolean
    /**
     * When present, it specifies that the element field is read-only.
     */
    public void setReadonly(boolean value) {
        getElement().setReadonly(value);
    }

    // !wca! observe readonly: boolean

    // !wca! get renderer: ComboBoxRenderer | null | undefined

    // !wca! set renderer: ComboBoxRenderer | null | undefined
    /**
     * Custom function for rendering the content of every item.
     * Receives three arguments:
     *
     * - <code>root</code> The <code>&lt;vaadin-combo-box-item&gt;</code> internal container DOM element.
     * - <code>comboBox</code> The reference to the <code>&lt;vaadin-combo-box&gt;</code> element.
     * - <code>model</code> The object with the properties related with the rendered
     *  item, contains:
     *  - <code>model.index</code> The index of the rendered item.
     *  - <code>model.item</code> The item.
     * @param value
     */
    public void setRenderer(@Nullable ComponentRendererWithContext<ItemModel<T>> value) {
        if (value == null) {
            getElement().setRenderer(null);
            return;
        }
        getElement().setRenderer(((root, element, context) -> value.renderTo(new ParentNodeBackedComponentList<>(root), new ItemModel<>(context, getItemClass()))));
    }

    // !wca! observe renderer: ComboBoxRenderer | null | undefined

    // !wca! get selectedItem: string | ComboBoxItem | null | undefined
    /**
     * The selected item from the <code>items</code> array.
     */
    public @Nullable T getSelectedItem() {
        return SerDes.unmirror(getElement().getSelectedItem(), getItemClass());
    }

    // !wca! set selectedItem: string | ComboBoxItem | null | undefined
    /**
     * The selected item from the <code>items</code> array.
     */
    public void setSelectedItem(@Nullable T value) {
        getElement().setSelectedItem(SerDes.mirror(value));
    }

    // !wca! observe selectedItem: string | ComboBoxItem | null | undefined
    /**
     * The selected item from the <code>items</code> array.
     */
    public ObservableValue<T> selectedItem() {
        return createObservableValue(this::getSelectedItem, this::setSelectedItem, "selected-item-changed");
    }

    // !wca! get size: number | undefined
    /**
     * Total number of items.
     */
    public int getSize() {
        return getElement().getSize();
    }

    // !wca! set size: number | undefined
    /**
     * Total number of items.
     */
    public void setSize(int value) {
        getElement().setSize(value);
    }

    // !wca! observe size: number | undefined

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! get value: string
    /**
     * The <code>String</code> value for the selected item of the combo box. Provides
     * the value for <code>iron-form</code>.
     *
     * When thereâ€™s no item selected, the value is an empty string.
     *
     * Use <code>selectedItem</code> property to get the raw selected item from
     * the <code>items</code> array.
     */
    public String getValue() {
        return getElement().getValue();
    }

    // !wca! set value: string
    /**
     * The <code>String</code> value for the selected item of the combo box. Provides
     * the value for <code>iron-form</code>.
     *
     * When thereâ€™s no item selected, the value is an empty string.
     *
     * Use <code>selectedItem</code> property to get the raw selected item from
     * the <code>items</code> array.
     */
    public void setValue(String value) {
        getElement().setValue(value);
    }

    // !wca! observe value: string
    /**
     * The <code>String</code> value for the selected item of the combo box. Provides
     * the value for <code>iron-form</code>.
     *
     * When thereâ€™s no item selected, the value is an empty string.
     *
     * Use <code>selectedItem</code> property to get the raw selected item from
     * the <code>items</code> array.
     */
    public ObservableValue<String> value() {
        return createObservableValue(this::getValue, this::setValue, "value-changed");
    }
}
