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
 * <code>&lt;vaadin-combo-box&gt;</code> is a combo box element combining a dropdown list with an input field for filtering the list of items. If you want to replace the default input field with a custom implementation, you should use the <a href="#/elements/vaadin-combo-box-light"><code>&lt;vaadin-combo-box-light&gt;</code></a> element.
 *
 * Items in the dropdown list must be provided as a list of <code>String</code> values. Defining the items is done using the <code>items</code> property, which can be assigned with data-binding, using an attribute or directly with the JavaScript property.
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box
 *      label="Fruit"
 *      items="[[data]]"&gt;
 * &lt;/vaadin-combo-box&gt;
 * </code></pre>
 * <pre><code class="language-js">combobox.items = ['apple', 'orange', 'banana'];
 * </code></pre>
 * When the selected <code>value</code> is changed, a <code>value-changed</code> event is triggered.
 *
 * This element can be used within an <code>iron-form</code>.
 *
 * <h3>Item rendering</h3>
 * <code>&lt;vaadin-combo-box&gt;</code> supports using custom renderer callback function for defining the content of <code>&lt;vaadin-combo-box-item&gt;</code>.
 *
 * The renderer function provides <code>root</code>, <code>comboBox</code>, <code>model</code> arguments when applicable. Generate DOM content by using <code>model</code> object properties if needed, append it to the <code>root</code> element and control the state of the host element by accessing <code>comboBox</code>. Before generating new content, users are able to check if there is already content in <code>root</code> for reusing it.
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box id="combo-box"&gt;&lt;/vaadin-combo-box&gt;
 * </code></pre>
 * <pre><code class="language-js">const comboBox = document.querySelector('#combo-box');
 * comboBox.items = [{'label': 'Hydrogen', 'value': 'H'}];
 * comboBox.renderer = function(root, comboBox, model) {
 *    root.innerHTML = model.index + ': ' +
 *                     model.item.label + ' ' +
 *                     '&lt;b&gt;' + model.item.value + '&lt;/b&gt;';
 * };
 * </code></pre>
 * Renderer is called on the opening of the combo-box and each time the related model is updated. DOM generated during the renderer call can be reused in the next renderer call and will be provided with the <code>root</code> argument. On first call it will be empty.
 *
 * <h3>Item Template</h3>
 * Alternatively, the content of the <code>&lt;vaadin-combo-box-item&gt;</code> can be populated by using custom item template provided in the light DOM:
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box items='[{"label": "Hydrogen", "value": "H"}]'&gt;
 *    &lt;template&gt;
 *      [[index]]: [[item.label]] &lt;b&gt;[[item.value]&lt;/b&gt;
 *    &lt;/template&gt;
 * &lt;/vaadin-combo-box&gt;
 * </code></pre>
 * The following properties are available for item template bindings:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Property name</th>
 *    <th>Type</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>index</code></td>
 *    <td>Number</td>
 *    <td>Index of the item in the <code>items</code> array</td>
 *   </tr>
 *   <tr>
 *    <td><code>item</code></td>
 *    <td>String or Object</td>
 *    <td>The item reference</td>
 *   </tr>
 *   <tr>
 *    <td><code>selected</code></td>
 *    <td>Boolean</td>
 *    <td>True when item is selected</td>
 *   </tr>
 *   <tr>
 *    <td><code>focused</code></td>
 *    <td>Boolean</td>
 *    <td>True when item is focused</td>
 *   </tr>
 *  </tbody>
 * </table>
 * <h3>Lazy Loading with Function Data Provider</h3>
 * In addition to assigning an array to the items property, you can alternatively provide the <code>&lt;vaadin-combo-box&gt;</code> data through the <a href="#/elements/vaadin-combo-box#property-dataProvider"><code>dataProvider</code></a> function property. The <code>&lt;vaadin-combo-box&gt;</code> calls this function lazily, only when it needs more data to be displayed.
 *
 * See the <a href="#/elements/vaadin-combo-box#property-dataProvider"><code>dataProvider</code></a> in the API reference below for the detailed data provider arguments description, and the â€œLazy Loadingâ€œ example on â€œBasicsâ€� page in the demos.
 *
 * <strong>Note that when using function data providers, the total number of items needs to be set manually. The total number of items can be returned in the second argument of the data provider callback:</strong>
 *
 * <pre><code class="language-javascript">comboBox.dataProvider = function(params, callback) {
 *    var url = 'https://api.example/data' +
 *        '?page=' + params.page +        // the requested page index
 *        '&amp;per_page=' + params.pageSize; // number of items on the page
 *    var xhr = new XMLHttpRequest();
 *    xhr.onload = function() {
 *      var response = JSON.parse(xhr.responseText);
 *      callback(
 *        response.employees, // requested page of items
 *        response.totalSize  // total number of items
 *      );
 *    };
 *    xhr.open('GET', url, true);
 *    xhr.send();
 * };
 * </code></pre>
 * <h3>Styling</h3>
 * The following custom properties are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Custom property</th>
 *    <th>Description</th>
 *    <th>Default</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>--vaadin-combo-box-overlay-max-height</code></td>
 *    <td>Property that determines the max height of overlay</td>
 *    <td><code>65vh</code></td>
 *   </tr>
 *  </tbody>
 * </table>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Part name</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>text-field</code></td>
 *    <td>The text field</td>
 *   </tr>
 *   <tr>
 *    <td><code>toggle-button</code></td>
 *    <td>The toggle button</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html"><code>&lt;vaadin-overlay&gt;</code> documentation</a> for <code>&lt;vaadin-combo-box-overlay&gt;</code> parts.
 *
 * See <a href="https://vaadin.com/components/vaadin-text-field/html-api/elements/Vaadin.TextFieldElement"><code>&lt;vaadin-text-field&gt;</code> documentation</a> for the text field parts.
 *
 * The following state attributes are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Attribute</th>
 *    <th>Description</th>
 *    <th>Part name</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>opened</code></td>
 *    <td>Set when the combo box dropdown is open</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>disabled</code></td>
 *    <td>Set to a disabled combo box</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>readonly</code></td>
 *    <td>Set to a read only combo box</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>has-value</code></td>
 *    <td>Set when the element has a value</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>invalid</code></td>
 *    <td>Set when the element is invalid</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>focused</code></td>
 *    <td>Set when the element is focused</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>focus-ring</code></td>
 *    <td>Set when the element is keyboard focused</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>loading</code></td>
 *    <td>Set when new items are expected</td>
 *    <td>:host</td>
 *   </tr>
 *  </tbody>
 * </table>
 * In addition to <code>&lt;vaadin-combo-box&gt;</code> itself, the following internal components are themable:
 *
 * <ul>
 *  <li><code>&lt;vaadin-text-field&gt;</code></li>
 *  <li><code>&lt;vaadin-combo-box-overlay&gt;</code></li>
 *  <li><code>&lt;vaadin-combo-box-item&gt;</code></li>
 * </ul>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-combo-box&gt;</code> is propagated to the internal themable components listed above.
 *
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, ControlStateMixin, ThemableMixin, ComboBoxDataProviderMixin, ComboBoxMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-combo-box", version = "^5.3.0-alpha4")
@Import(module = "@vaadin/vaadin-combo-box/vaadin-combo-box.js")
public interface ComboBoxElement<T extends Any> extends HTMLElement {

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

    // !wca! click: (): void

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

    // !wca! get autofocus: boolean
    /**
     * Specify that this control should have input focus when the page loads.
     */
    @JSProperty("autofocus")
    boolean isAutofocus();

    // !wca! set autofocus: boolean
    /**
     * Specify that this control should have input focus when the page loads.
     */
    @JSProperty("autofocus")
    void setAutofocus(boolean value);

    // !wca! get clearButtonVisible: boolean
    /**
     * Set to true to display the clear icon which clears the input.
     */
    @JSProperty("clearButtonVisible")
    boolean isClearButtonVisible();

    // !wca! set clearButtonVisible: boolean
    /**
     * Set to true to display the clear icon which clears the input.
     */
    @JSProperty("clearButtonVisible")
    void setClearButtonVisible(boolean value);

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
     * Set to true to disable this input.
     */
    @JSProperty("disabled")
    boolean isDisabled();

    // !wca! set disabled: boolean
    /**
     * Set to true to disable this input.
     */
    @JSProperty("disabled")
    void setDisabled(boolean value);

    // !wca! get errorMessage: string
    /**
     * The error message to display when the input is invalid.
     */
    @JSProperty("errorMessage")
    String getErrorMessage();

    // !wca! set errorMessage: string
    /**
     * The error message to display when the input is invalid.
     */
    @JSProperty("errorMessage")
    void setErrorMessage(String value);

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

    // !wca! get focusElement: HTMLElement

    // !wca! get inputElement: ?

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

    // !wca! get label: string
    /**
     * The label for this element.
     */
    @JSProperty("label")
    String getLabel();

    // !wca! set label: string
    /**
     * The label for this element.
     */
    @JSProperty("label")
    void setLabel(String value);

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
    int getPageSize();

    // !wca! set pageSize: number
    /**
     * Number of items fetched at a time from the dataprovider.
     */
    @JSProperty("pageSize")
    void setPageSize(int value);

    // !wca! get pattern: string
    /**
     * A pattern to validate the <code>input</code> with.
     */
    @JSProperty("pattern")
    String getPattern();

    // !wca! set pattern: string
    /**
     * A pattern to validate the <code>input</code> with.
     */
    @JSProperty("pattern")
    void setPattern(String value);

    // !wca! get placeholder: string
    /**
     * A placeholder string in addition to the label.
     */
    @JSProperty("placeholder")
    String getPlaceholder();

    // !wca! set placeholder: string
    /**
     * A placeholder string in addition to the label.
     */
    @JSProperty("placeholder")
    void setPlaceholder(String value);

    // !wca! get preventInvalidInput: boolean
    /**
     * Set to true to prevent the user from entering invalid input.
     */
    @JSProperty("preventInvalidInput")
    boolean isPreventInvalidInput();

    // !wca! set preventInvalidInput: boolean
    /**
     * Set to true to prevent the user from entering invalid input.
     */
    @JSProperty("preventInvalidInput")
    void setPreventInvalidInput(boolean value);

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

    // !wca! get required: boolean
    /**
     * Set to true to mark the input as required.
     */
    @JSProperty("required")
    boolean isRequired();

    // !wca! set required: boolean
    /**
     * Set to true to mark the input as required.
     */
    @JSProperty("required")
    void setRequired(boolean value);

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
