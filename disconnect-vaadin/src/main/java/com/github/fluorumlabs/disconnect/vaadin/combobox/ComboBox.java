package com.github.fluorumlabs.disconnect.vaadin.combobox;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponentWithItem;
import com.github.fluorumlabs.disconnect.core.containers.ParentNodeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.core.utils.SerDes;
import com.github.fluorumlabs.disconnect.polymer.HasTemplate;
import com.github.fluorumlabs.disconnect.vaadin.ComponentRendererWithContext;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.DataProvider;
import js.lang.external.vaadin.combobox.ComboBoxDataProviderParams;
import js.lang.external.vaadin.combobox.ComboBoxElement;

import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.List;

/**
 * <code>&lt;vaadin-combo-box&gt;</code> is a combo box element combining a dropdown list with an input field for filtering the list of items. If you want to replace the default input field with a custom implementation, you should use the <a href="#/elements/vaadin-combo-box-light"><code>&lt;vaadin-combo-box-light&gt;</code></a> element.
 * <p>
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
 * <p>
 * This element can be used within an <code>iron-form</code>.
 *
 * <h3>Item rendering</h3>
 * <code>&lt;vaadin-combo-box&gt;</code> supports using custom renderer callback function for defining the content of <code>&lt;vaadin-combo-box-item&gt;</code>.
 * <p>
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
 * <thead>
 * <tr>
 * <th>Property name</th>
 * <th>Type</th>
 * <th>Description</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>index</code></td>
 * <td>Number</td>
 * <td>Index of the item in the <code>items</code> array</td>
 * </tr>
 * <tr>
 * <td><code>item</code></td>
 * <td>String or Object</td>
 * <td>The item reference</td>
 * </tr>
 * <tr>
 * <td><code>selected</code></td>
 * <td>Boolean</td>
 * <td>True when item is selected</td>
 * </tr>
 * <tr>
 * <td><code>focused</code></td>
 * <td>Boolean</td>
 * <td>True when item is focused</td>
 * </tr>
 * </tbody>
 * </table>
 * <h3>Lazy Loading with Function Data Provider</h3>
 * In addition to assigning an array to the items property, you can alternatively provide the <code>&lt;vaadin-combo-box&gt;</code> data through the <a href="#/elements/vaadin-combo-box#property-dataProvider"><code>dataProvider</code></a> function property. The <code>&lt;vaadin-combo-box&gt;</code> calls this function lazily, only when it needs more data to be displayed.
 * <p>
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
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--vaadin-combo-box-overlay-max-height</code></td>
 * <td>Property that determines the max height of overlay</td>
 * <td><code>65vh</code></td>
 * </tr>
 * </tbody>
 * </table>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr>
 * <th>Part name</th>
 * <th>Description</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>text-field</code></td>
 * <td>The text field</td>
 * </tr>
 * <tr>
 * <td><code>toggle-button</code></td>
 * <td>The toggle button</td>
 * </tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html"><code>&lt;vaadin-overlay&gt;</code> documentation</a> for <code>&lt;vaadin-combo-box-overlay&gt;</code> parts.
 * <p>
 * See <a href="https://vaadin.com/components/vaadin-text-field/html-api/elements/Vaadin.TextFieldElement"><code>&lt;vaadin-text-field&gt;</code> documentation</a> for the text field parts.
 * <p>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr>
 * <th>Attribute</th>
 * <th>Description</th>
 * <th>Part name</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>opened</code></td>
 * <td>Set when the combo box dropdown is open</td>
 * <td>:host</td>
 * </tr>
 * <tr>
 * <td><code>disabled</code></td>
 * <td>Set to a disabled combo box</td>
 * <td>:host</td>
 * </tr>
 * <tr>
 * <td><code>readonly</code></td>
 * <td>Set to a read only combo box</td>
 * <td>:host</td>
 * </tr>
 * <tr>
 * <td><code>has-value</code></td>
 * <td>Set when the element has a value</td>
 * <td>:host</td>
 * </tr>
 * <tr>
 * <td><code>invalid</code></td>
 * <td>Set when the element is invalid</td>
 * <td>:host</td>
 * </tr>
 * <tr>
 * <td><code>focused</code></td>
 * <td>Set when the element is focused</td>
 * <td>:host</td>
 * </tr>
 * <tr>
 * <td><code>focus-ring</code></td>
 * <td>Set when the element is keyboard focused</td>
 * <td>:host</td>
 * </tr>
 * <tr>
 * <td><code>loading</code></td>
 * <td>Set when new items are expected</td>
 * <td>:host</td>
 * </tr>
 * </tbody>
 * </table>
 * In addition to <code>&lt;vaadin-combo-box&gt;</code> itself, the following internal components are themable:
 *
 * <ul>
 * <li><code>&lt;vaadin-text-field&gt;</code></li>
 * <li><code>&lt;vaadin-combo-box-overlay&gt;</code></li>
 * <li><code>&lt;vaadin-combo-box-item&gt;</code></li>
 * </ul>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-combo-box&gt;</code> is propagated to the internal themable components listed above.
 * <p>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, ControlStateMixin, ThemableMixin, ComboBoxDataProviderMixin, ComboBoxMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-combo-box", external = true)
public class ComboBox<T extends Serializable> extends HtmlComponentWithItem<T, ComboBoxElement<Mirrored<T>>> implements HasTemplate, Themable<ComboBoxElement<Mirrored<T>>> {

    public ComboBox() {
    }

    public ComboBox(String textContent) {
        makeTemplate(textContent);
    }

    public ComboBox(Component<?>... components) {
        makeTemplate(components);
    }

    public ComboBox(Class<T> tClass) {
        super(tClass);
    }

    public ComboBox(Class<T> tClass, String textContent) {
        super(tClass);
        makeTemplate(textContent);
    }

    public ComboBox(Class<T> tClass, Component<?>... components) {
        super(tClass);
        makeTemplate(components);
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
     * <p>
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

    // !wca! click: (): void

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

    // !wca! get autofocus: boolean

    /**
     * Specify that this control should have input focus when the page loads.
     */
    public boolean isAutofocus() {
        return getElement().isAutofocus();
    }

    // !wca! set autofocus: boolean

    /**
     * Specify that this control should have input focus when the page loads.
     */
    public void setAutofocus(boolean value) {
        getElement().setAutofocus(value);
    }

    // !wca! observe autofocus: boolean

    // !wca! get clearButtonVisible: boolean

    /**
     * Set to true to display the clear icon which clears the input.
     */
    public boolean isClearButtonVisible() {
        return getElement().isClearButtonVisible();
    }

    // !wca! set clearButtonVisible: boolean

    /**
     * Set to true to display the clear icon which clears the input.
     */
    public void setClearButtonVisible(boolean value) {
        getElement().setClearButtonVisible(value);
    }

    // !wca! observe clearButtonVisible: boolean

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
     * - <code>items</code> Current page of items
     * - <code>size</code> Total number of items.
     *
     * @param value
     */
    // FIXME
    public void setDataProvider(@Nullable DataProvider<ComboBoxDataProviderParams, Mirrored<T>> value) {
        getElement().setDataProvider(value);
    }

    // !wca! observe dataProvider: ComboBoxDataProvider | null | undefined

    // !wca! get disabled: boolean

    /**
     * Set to true to disable this input.
     */
    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    // !wca! set disabled: boolean

    /**
     * Set to true to disable this input.
     */
    public void setDisabled(boolean value) {
        getElement().setDisabled(value);
    }

    // !wca! observe disabled: boolean

    // !wca! get errorMessage: string

    /**
     * The error message to display when the input is invalid.
     */
    public String getErrorMessage() {
        return getElement().getErrorMessage();
    }

    // !wca! set errorMessage: string

    /**
     * The error message to display when the input is invalid.
     */
    public void setErrorMessage(String value) {
        getElement().setErrorMessage(value);
    }

    // !wca! observe errorMessage: string

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

    // !wca! get focusElement: HTMLElement

    // !wca! observe focusElement: HTMLElement

    // !wca! get inputElement: ?

    // !wca! observe inputElement: ?

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
    public @Nullable
    String getItemIdPath() {
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
     * <p>
     * The item label is also used for matching items when processing user
     * input, i.e., for filtering and selecting items.
     * <p>
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
     * <p>
     * The item label is also used for matching items when processing user
     * input, i.e., for filtering and selecting items.
     * <p>
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
     * <p>
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
     * <p>
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
    @Nullable
    public List<T> getItems() {
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

    // !wca! get label: string

    /**
     * The label for this element.
     */
    public String getLabel() {
        return getElement().getLabel();
    }

    // !wca! set label: string

    /**
     * The label for this element.
     */
    public void setLabel(String value) {
        getElement().setLabel(value);
    }

    // !wca! observe label: string

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
    public @Nullable
    String getName() {
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
    public int getPageSize() {
        return getElement().getPageSize();
    }

    // !wca! set pageSize: number

    /**
     * Number of items fetched at a time from the dataprovider.
     */
    public void setPageSize(int value) {
        getElement().setPageSize(value);
    }

    // !wca! observe pageSize: number

    // !wca! get pattern: string

    /**
     * A pattern to validate the <code>input</code> with.
     */
    public String getPattern() {
        return getElement().getPattern();
    }

    // !wca! set pattern: string

    /**
     * A pattern to validate the <code>input</code> with.
     */
    public void setPattern(String value) {
        getElement().setPattern(value);
    }

    // !wca! observe pattern: string

    // !wca! get placeholder: string

    /**
     * A placeholder string in addition to the label.
     */
    public String getPlaceholder() {
        return getElement().getPlaceholder();
    }

    // !wca! set placeholder: string

    /**
     * A placeholder string in addition to the label.
     */
    public void setPlaceholder(String value) {
        getElement().setPlaceholder(value);
    }

    // !wca! observe placeholder: string

    // !wca! get preventInvalidInput: boolean

    /**
     * Set to true to prevent the user from entering invalid input.
     */
    public boolean isPreventInvalidInput() {
        return getElement().isPreventInvalidInput();
    }

    // !wca! set preventInvalidInput: boolean

    /**
     * Set to true to prevent the user from entering invalid input.
     */
    public void setPreventInvalidInput(boolean value) {
        getElement().setPreventInvalidInput(value);
    }

    // !wca! observe preventInvalidInput: boolean

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
     * <p>
     * - <code>root</code> The <code>&lt;vaadin-combo-box-item&gt;</code> internal container DOM element.
     * - <code>comboBox</code> The reference to the <code>&lt;vaadin-combo-box&gt;</code> element.
     * - <code>model</code> The object with the properties related with the rendered
     * item, contains:
     * - <code>model.index</code> The index of the rendered item.
     * - <code>model.item</code> The item.
     *
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

    // !wca! get required: boolean

    /**
     * Set to true to mark the input as required.
     */
    public boolean isRequired() {
        return getElement().isRequired();
    }

    // !wca! set required: boolean

    /**
     * Set to true to mark the input as required.
     */
    public void setRequired(boolean value) {
        getElement().setRequired(value);
    }

    // !wca! observe required: boolean

    // !wca! get selectedItem: string | ComboBoxItem | null | undefined

    /**
     * The selected item from the <code>items</code> array.
     */
    @Nullable
    public T getSelectedItem() {
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
     * <p>
     * When thereâ€™s no item selected, the value is an empty string.
     * <p>
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
     * <p>
     * When thereâ€™s no item selected, the value is an empty string.
     * <p>
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
     * <p>
     * When thereâ€™s no item selected, the value is an empty string.
     * <p>
     * Use <code>selectedItem</code> property to get the raw selected item from
     * the <code>items</code> array.
     */
    public ObservableValue<String> value() {
        return createObservableValue(this::getValue, this::setValue, "value-changed");
    }
}
