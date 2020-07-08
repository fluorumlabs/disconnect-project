package js.lang.external.vaadin.combobox;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.vaadin.DataProvider;
import js.lang.external.vaadin.RendererWithContext;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

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
@NpmPackage(name = "@vaadin/vaadin-combo-box", version = "^5.3.0-alpha4")
@Import(module = "@vaadin/vaadin-combo-box/vaadin-combo-box-light.js")
public interface ComboBoxLightElement<T extends Any> extends HTMLElement {

    // !wca! cancel: (): void
    /**
     * Reverts back to original value.
     */
    @JSMethod("cancel")
    void cancel();

    // !wca! checkValidity: (): boolean | undefined
    /**
     * Returns true if the current input value satisfies all constraints (if any)
     *
     * You can override the <code>checkValidity</code> method for custom validations.
     */
    @JSMethod("checkValidity")
    boolean checkValidity();

    /**
     * Returns true if the current input value satisfies all constraints (if any)
     *
     * You can override the <code>checkValidity</code> method for custom validations.
     */
    @JSProperty("checkValidity")
    void setCheckValidityHandler(CheckValidityHandler checkValidityHandler);

    // !wca! clearCache: (): void
    /**
     * Clears the cached pages and reloads data from dataprovider when needed.
     */
    @JSMethod("clearCache")
    void clearCache();

    // !wca! close: (): void
    /**
     * Closes the dropdown list.
     */
    @JSMethod("close")
    void close();

    // !wca! open: (): void
    /**
     * Opens the dropdown list.
     */
    @JSMethod("open")
    void open();

    // !wca! validate: (): boolean
    /**
     * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
     */
    @JSMethod("validate")
    boolean validate();

    // !wca! get allowCustomValue: boolean
    /**
     * If <code>true</code>, the user can input a value that is not present in the items list.
     * <code>value</code> property will be set to the input value in this case.
     * Also, when <code>value</code> is set programmatically, the input value will be set
     * to reflect that value.
     */
    @JSProperty("allowCustomValue")
    boolean isAllowCustomValue();

    // !wca! set allowCustomValue: boolean
    /**
     * If <code>true</code>, the user can input a value that is not present in the items list.
     * <code>value</code> property will be set to the input value in this case.
     * Also, when <code>value</code> is set programmatically, the input value will be set
     * to reflect that value.
     */
    @JSProperty("allowCustomValue")
    void setAllowCustomValue(boolean value);

    // !wca! get attrForValue: string
    /**
     * Name of the two-way data-bindable property representing the
     * value of the custom input field.
     */
    @JSProperty("attrForValue")
    String getAttrForValue();

    // !wca! set attrForValue: string
    /**
     * Name of the two-way data-bindable property representing the
     * value of the custom input field.
     */
    @JSProperty("attrForValue")
    void setAttrForValue(String value);

    // !wca! get autoOpenDisabled: boolean | null | undefined
    /**
     * Set true to prevent the overlay from opening automatically.
     */
    @JSProperty("autoOpenDisabled")
    boolean isAutoOpenDisabled();

    // !wca! set autoOpenDisabled: boolean | null | undefined
    /**
     * Set true to prevent the overlay from opening automatically.
     */
    @JSProperty("autoOpenDisabled")
    void setAutoOpenDisabled(boolean value);

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
     */
    @JSProperty("dataProvider")
    void setDataProvider(@Nullable DataProvider<ComboBoxDataProviderParams, T> value);

    // !wca! get disabled: boolean
    /**
     * Set to true to disable this element.
     */
    @JSProperty("disabled")
    boolean isDisabled();

    // !wca! set disabled: boolean
    /**
     * Set to true to disable this element.
     */
    @JSProperty("disabled")
    void setDisabled(boolean value);

    // !wca! get filter: string
    /**
     * Filtering string the user has typed into the input field.
     */
    @JSProperty("filter")
    String getFilter();

    // !wca! set filter: string
    /**
     * Filtering string the user has typed into the input field.
     */
    @JSProperty("filter")
    void setFilter(String value);

    // !wca! get filteredItems: (string | ComboBoxItem)[] | undefined
    /**
     * A subset of items, filtered based on the user input. Filtered items
     * can be assigned directly to omit the internal filtering functionality.
     * The items can be of either <code>String</code> or <code>Object</code> type.
     */
    @JSProperty("filteredItems")
    @Nullable
    Array<T> getFilteredItems();

    // !wca! set filteredItems: (string | ComboBoxItem)[] | undefined
    /**
     * A subset of items, filtered based on the user input. Filtered items
     * can be assigned directly to omit the internal filtering functionality.
     * The items can be of either <code>String</code> or <code>Object</code> type.
     */
    @JSProperty("filteredItems")
    void setFilteredItems(@Nullable Array<T> value);

    // !wca! get focused: boolean
    /**
     */
    @JSProperty("focused")
    boolean isFocused();

    // !wca! get inputElement: !Element | undefined

    // !wca! set inputElement: !Element | undefined

    // !wca! get invalid: boolean
    /**
     * Set to true if the value is invalid.
     */
    @JSProperty("invalid")
    boolean isInvalid();

    // !wca! set invalid: boolean
    /**
     * Set to true if the value is invalid.
     */
    @JSProperty("invalid")
    void setInvalid(boolean value);

    // !wca! get itemIdPath: string | null | undefined
    /**
     * Path for the id of the item. If <code>items</code> is an array of objects,
     * the <code>itemIdPath</code> is used to compare and identify the same item
     * in <code>selectedItem</code> and <code>filteredItems</code> (items given by the
     * <code>dataProvider</code> callback).
     */
    @JSProperty("itemIdPath")
    @Nullable
    String getItemIdPath();

    // !wca! set itemIdPath: string | null | undefined
    /**
     * Path for the id of the item. If <code>items</code> is an array of objects,
     * the <code>itemIdPath</code> is used to compare and identify the same item
     * in <code>selectedItem</code> and <code>filteredItems</code> (items given by the
     * <code>dataProvider</code> callback).
     */
    @JSProperty("itemIdPath")
    void setItemIdPath(@Nullable String value);

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
    @JSProperty("itemLabelPath")
    String getItemLabelPath();

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
    @JSProperty("itemLabelPath")
    void setItemLabelPath(String value);

    // !wca! get itemValuePath: string
    /**
     * Path for the value of the item. If <code>items</code> is an array of objects, the
     * <code>itemValuePath:</code> is used to fetch the string value for the selected
     * item.
     *
     * The item value is used in the <code>value</code> property of the combo box,
     * to provide the form value.
     */
    @JSProperty("itemValuePath")
    String getItemValuePath();

    // !wca! set itemValuePath: string
    /**
     * Path for the value of the item. If <code>items</code> is an array of objects, the
     * <code>itemValuePath:</code> is used to fetch the string value for the selected
     * item.
     *
     * The item value is used in the <code>value</code> property of the combo box,
     * to provide the form value.
     */
    @JSProperty("itemValuePath")
    void setItemValuePath(String value);

    // !wca! get items: (string | ComboBoxItem)[] | undefined
    /**
     * A full set of items to filter the visible options from.
     * The items can be of either <code>String</code> or <code>Object</code> type.
     */
    @JSProperty("items")
    @Nullable
    Array<T> getItems();

    // !wca! set items: (string | ComboBoxItem)[] | undefined
    /**
     * A full set of items to filter the visible options from.
     * The items can be of either <code>String</code> or <code>Object</code> type.
     */
    @JSProperty("items")
    void setItems(@Nullable Array<T> value);

    // !wca! get loading: boolean
    /**
     * When set to <code>true</code>, "loading" attribute is added to host and the overlay element.
     */
    @JSProperty("loading")
    boolean isLoading();

    // !wca! set loading: boolean
    /**
     * When set to <code>true</code>, "loading" attribute is added to host and the overlay element.
     */
    @JSProperty("loading")
    void setLoading(boolean value);

    // !wca! get name: string | null | undefined
    /**
     * The name of this element.
     */
    @JSProperty("name")
    @Nullable
    String getName();

    // !wca! set name: string | null | undefined
    /**
     * The name of this element.
     */
    @JSProperty("name")
    void setName(@Nullable String value);

    // !wca! get opened: boolean
    /**
     * True if the dropdown is open, false otherwise.
     */
    @JSProperty("opened")
    boolean isOpened();

    // !wca! set opened: boolean
    /**
     * True if the dropdown is open, false otherwise.
     */
    @JSProperty("opened")
    void setOpened(boolean value);

    // !wca! get pageSize: number
    /**
     * Number of items fetched at a time from the dataprovider.
     */
    @JSProperty("pageSize")
    double getPageSize();

    // !wca! set pageSize: number
    /**
     * Number of items fetched at a time from the dataprovider.
     */
    @JSProperty("pageSize")
    void setPageSize(double value);

    // !wca! get readonly: boolean
    /**
     * When present, it specifies that the element field is read-only.
     */
    @JSProperty("readonly")
    boolean isReadonly();

    // !wca! set readonly: boolean
    /**
     * When present, it specifies that the element field is read-only.
     */
    @JSProperty("readonly")
    void setReadonly(boolean value);

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
     */
    @JSProperty("renderer")
    void setRenderer(@Nullable RendererWithContext<ComboBoxElement<T>,ComboBoxItemModel<T>> value);

    // !wca! get selectedItem: string | ComboBoxItem | null | undefined
    /**
     * The selected item from the <code>items</code> array.
     */
    @JSProperty("selectedItem")
    @Nullable
    T getSelectedItem();

    // !wca! set selectedItem: string | ComboBoxItem | null | undefined
    /**
     * The selected item from the <code>items</code> array.
     */
    @JSProperty("selectedItem")
    void setSelectedItem(@Nullable T value);

    // !wca! get size: number | undefined
    /**
     * Total number of items.
     */
    @JSProperty("size")
    int getSize();

    // !wca! set size: number | undefined
    /**
     * Total number of items.
     */
    @JSProperty("size")
    void setSize(int value);

    // !wca! get theme: string | null | undefined

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
    @JSProperty("value")
    String getValue();

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
    @JSProperty("value")
    void setValue(String value);
}
