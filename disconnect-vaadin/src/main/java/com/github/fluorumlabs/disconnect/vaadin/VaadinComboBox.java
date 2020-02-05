package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.ComboBoxElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.*;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import js.lang.Any;
import js.web.dom.Element;

import javax.annotation.Nullable;

/**
 * `<vaadin-combo-box>` is a combo box element combining a dropdown list with an
 * input field for filtering the list of items. If you want to replace the default
 * input field with a custom implementation, you should use the
 * [`<vaadin-combo-box-light>`](#/elements/vaadin-combo-box-light) element.
 * <p>
 * Items in the dropdown list must be provided as a list of `String` values.
 * Defining the items is done using the `items` property, which can be assigned
 * with data-binding, using an attribute or directly with the JavaScript property.
 * <p>
 * ```html
 * <vaadin-combo-box
 * label="Fruit"
 * items="[[data]]">
 * </vaadin-combo-box>
 * ```
 * <p>
 * ```js
 * combobox.items = ['apple', 'orange', 'banana'];
 * ```
 * <p>
 * When the selected `value` is changed, a `value-changed` event is triggered.
 * <p>
 * This element can be used within an `iron-form`.
 * <p>
 * ### Item rendering
 * <p>
 * `<vaadin-combo-box>` supports using custom renderer callback function for defining the
 * content of `<vaadin-combo-box-item>`.
 * <p>
 * The renderer function provides `root`, `comboBox`, `model` arguments when applicable.
 * Generate DOM content by using `model` object properties if needed, append it to the `root`
 * element and control the state of the host element by accessing `comboBox`. Before generating new
 * content, users are able to check if there is already content in `root` for reusing it.
 * <p>
 * ```html
 * <vaadin-combo-box id="combo-box"></vaadin-combo-box>
 * ```
 * ```js
 * const comboBox = document.querySelector('#combo-box');
 * comboBox.items = [{'label': 'Hydrogen', 'value': 'H'}];
 * comboBox.renderer = function(root, comboBox, model) {
 * root.innerHTML = model.index + ': ' +
 * model.item.label + ' ' +
 * '<b>' + model.item.value + '</b>';
 * };
 * ```
 * <p>
 * Renderer is called on the opening of the combo-box and each time the related model is updated.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the `root` argument.
 * On first call it will be empty.
 * <p>
 * ### Item Template
 * <p>
 * Alternatively, the content of the `<vaadin-combo-box-item>` can be populated by using
 * custom item template provided in the light DOM:
 * <p>
 * ```html
 * <vaadin-combo-box items='[{"label": "Hydrogen", "value": "H"}]'>
 * <template>
 * [[index]]: [[item.label]] <b>[[item.value]</b>
 * </template>
 * </vaadin-combo-box>
 * ```
 * <p>
 * The following properties are available for item template bindings:
 * <p>
 * Property name | Type | Description
 * --------------|------|------------
 * `index`| Number | Index of the item in the `items` array
 * `item` | String or Object | The item reference
 * `selected` | Boolean | True when item is selected
 * `focused` | Boolean | True when item is focused
 * <p>
 * ### Lazy Loading with Function Data Provider
 * <p>
 * In addition to assigning an array to the items property, you can alternatively
 * provide the `<vaadin-combo-box>` data through the
 * [`dataProvider`](#/elements/vaadin-combo-box#property-dataProvider) function property.
 * The `<vaadin-combo-box>` calls this function lazily, only when it needs more data
 * to be displayed.
 * <p>
 * See the [`dataProvider`](#/elements/vaadin-combo-box#property-dataProvider) in
 * the API reference below for the detailed data provider arguments description,
 * and the “Lazy Loading“ example on “Basics” page in the demos.
 * <p>
 * __Note that when using function data providers, the total number of items
 * needs to be set manually. The total number of items can be returned
 * in the second argument of the data provider callback:__
 * <p>
 * ```javascript
 * comboBox.dataProvider = function(params, callback) {
 * var url = 'https://api.example/data' +
 * '?page=' + params.page +        // the requested page index
 * '&per_page=' + params.pageSize; // number of items on the page
 * var xhr = new XMLHttpRequest();
 * xhr.onload = function() {
 * var response = JSON.parse(xhr.responseText);
 * callback(
 * response.employees, // requested page of items
 * response.totalSize  // total number of items
 * );
 * };
 * xhr.open('GET', url, true);
 * xhr.send();
 * };
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following custom properties are available for styling:
 * <p>
 * Custom property | Description | Default
 * ----------------|-------------|-------------
 * `--vaadin-combo-box-overlay-max-height` | Property that determines the max height of overlay | `65vh`
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ----------------|----------------
 * `text-field` | The text field
 * `toggle-button` | The toggle button
 * <p>
 * See [`<vaadin-overlay>` documentation](https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html)
 * for `<vaadin-combo-box-overlay>` parts.
 * <p>
 * See [`<vaadin-text-field>` documentation](https://vaadin.com/components/vaadin-text-field/html-api/elements/Vaadin
 * .TextFieldElement)
 * for the text field parts.
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|------------
 * `opened` | Set when the combo box dropdown is open | :host
 * `disabled` | Set to a disabled combo box | :host
 * `readonly` | Set to a read only combo box | :host
 * `has-value` | Set when the element has a value | :host
 * `invalid` | Set when the element is invalid | :host
 * `focused` | Set when the element is focused | :host
 * `focus-ring` | Set when the element is keyboard focused | :host
 * `loading` | Set when new items are expected | :host
 * <p>
 * In addition to `<vaadin-combo-box>` itself, the following internal
 * components are themable:
 * <p>
 * - `<vaadin-text-field>`
 * - `<vaadin-combo-box-overlay>`
 * - `<vaadin-combo-box-item>`
 * <p>
 * Note: the `theme` attribute value set on `<vaadin-combo-box>` is
 * propagated to the internal themable components listed above.
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinComboBox<ITEM extends Any> extends AbstractComponent<ComboBoxElement<ITEM>>
        implements HasElementMixin<ComboBoxElement<ITEM>, VaadinComboBox<ITEM>>,
        HasControlStateMixin<ComboBoxElement<ITEM>, VaadinComboBox<ITEM>>,
        HasComboBoxDataProviderMixin<ITEM, ComboBoxElement<ITEM>, VaadinComboBox<ITEM>>,
        HasComboBoxMixin<ITEM, ComboBoxElement<ITEM>, VaadinComboBox<ITEM>>,
        HasThemableMixin<ComboBoxElement<ITEM>, VaadinComboBox<ITEM>>,
        HasSlottedComponents<ComboBoxElement<ITEM>, VaadinComboBox<ITEM>, Component<? extends Element>> {
    public VaadinComboBox() {
        super("vaadin-combo-box");
    }

    /**
     *
     */
    public Element inputElement() {
        return getNode().getInputElement();
    }

    /**
     * Focusable element used by vaadin-control-state-mixin
     */
    public Element focusElement() {
        return getNode().getFocusElement();
    }

    /**
     * The label for this element.
     */
    @Nullable
    public String label() {
        return getNode().getLabel();
    }

    /**
     * The label for this element.
     */
    public VaadinComboBox<ITEM> label(String label) {
        getNode().setLabel(label);
        return this;
    }

    /**
     * Set to true to mark the input as required.
     */
    public boolean required() {
        return getNode().isRequired();
    }

    /**
     * Set to true to mark the input as required.
     */
    public VaadinComboBox<ITEM> required(boolean required) {
        getNode().setRequired(required);
        return this;
    }

    /**
     * Set to true to disable this input.
     */
    public boolean disabled() {
        return getNode().isDisabled();
    }

    /**
     * Set to true to disable this input.
     */
    public VaadinComboBox<ITEM> disabled(boolean disabled) {
        getNode().setDisabled(disabled);
        return this;
    }

    /**
     * Set to true to prevent the user from entering invalid input.
     */
    public boolean preventInvalidInput() {
        return getNode().isPreventInvalidInput();
    }

    /**
     * Set to true to prevent the user from entering invalid input.
     */
    public VaadinComboBox<ITEM> preventInvalidInput(boolean preventInvalidInput) {
        getNode().setPreventInvalidInput(preventInvalidInput);
        return this;
    }

    /**
     * A pattern to validate the `input` with.
     */
    @Nullable
    public String pattern() {
        return getNode().getPattern();
    }

    /**
     * A pattern to validate the `input` with.
     */
    public VaadinComboBox<ITEM> pattern(String pattern) {
        getNode().setPattern(pattern);
        return this;
    }

    /**
     * The error message to display when the input is invalid.
     */
    @Nullable
    public String errorMessage() {
        return getNode().getErrorMessage();
    }

    /**
     * The error message to display when the input is invalid.
     */
    public VaadinComboBox<ITEM> errorMessage(String errorMessage) {
        getNode().setErrorMessage(errorMessage);
        return this;
    }

    public boolean autofocus() {
        return getNode().isAutofocus();
    }

    public VaadinComboBox<ITEM> autofocus(boolean autofocus) {
        getNode().setAutofocus(autofocus);
        return this;
    }

    /**
     * A placeholder string in addition to the label.
     */
    @Nullable
    public String placeholder() {
        return getNode().getPlaceholder();
    }

    /**
     * A placeholder string in addition to the label.
     */
    public VaadinComboBox<ITEM> placeholder(String placeholder) {
        getNode().setPlaceholder(placeholder);
        return this;
    }

    public boolean readonly() {
        return getNode().isReadonly();
    }

    public VaadinComboBox<ITEM> readonly(boolean readonly) {
        getNode().setReadonly(readonly);
        return this;
    }

    /**
     * Set to true to display the clear icon which clears the input.
     */
    public boolean clearButtonVisible() {
        return getNode().isClearButtonVisible();
    }

    /**
     * Set to true to display the clear icon which clears the input.
     */
    public VaadinComboBox<ITEM> clearButtonVisible(boolean clearButtonVisible) {
        getNode().setClearButtonVisible(clearButtonVisible);
        return this;
    }

    public VaadinComboBox<ITEM> setPrefix(Component<? extends Element> component) {
        return replaceSlotted("prefix", component);
    }

    public VaadinComboBox<ITEM> setPrefix(Component<? extends Element>... components) {
        return replaceSlotted("prefix", components);
    }

    public VaadinComboBox<ITEM> addToPrefix(Component<? extends Element> component) {
        return addSlotted("prefix", component);
    }

    public VaadinComboBox<ITEM> addToPrefix(Component<? extends Element>... components) {
        return addSlotted("prefix", components);
    }

    public VaadinComboBox<ITEM> insertToPrefix(Component<? extends Element> component) {
        return insertSlotted("prefix", component);
    }

    public VaadinComboBox<ITEM> insertToPrefix(Component<? extends Element>... components) {
        return insertSlotted("prefix", components);
    }

    public VaadinComboBox<ITEM> clearPrefix() {
        return removeAllSlotted("prefix");
    }
}
