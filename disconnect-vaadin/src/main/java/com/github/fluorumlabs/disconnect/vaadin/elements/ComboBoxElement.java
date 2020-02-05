package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.*;
import js.lang.Any;
import js.web.dom.Element;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "ComboBoxElement",
		module = "@vaadin/vaadin-combo-box/src/vaadin-combo-box.js"
)
public interface ComboBoxElement<ITEM extends Any> extends HTMLElement,
		ElementMixin,
		ControlStateMixin,
		ComboBoxDataProviderMixin<ITEM>,
		ComboBoxMixin<ITEM>,
		ThemableMixin {
	/**
	 * FIXME type ?
	 */
	@JSProperty
	Element getInputElement();

	/**
	 * The label for this element.
	 */
	@Nullable
	@JSProperty
	String getLabel();

	/**
	 * The label for this element.
	 */
	@JSProperty
	void setLabel(String label);

	/**
	 * Set to true to mark the input as required.
	 */
	@JSProperty
	boolean isRequired();

	/**
	 * Set to true to mark the input as required.
	 */
	@JSProperty
	void setRequired(boolean required);

	/**
	 * Set to true to disable this input.
	 */
	@JSProperty
	boolean isDisabled();

	/**
	 * Set to true to disable this input.
	 */
	@JSProperty
	void setDisabled(boolean disabled);

	/**
	 * Set to true to prevent the user from entering invalid input.
	 */
	@JSProperty
	boolean isPreventInvalidInput();

	/**
	 * Set to true to prevent the user from entering invalid input.
	 */
	@JSProperty
	void setPreventInvalidInput(boolean preventInvalidInput);

	/**
	 * A pattern to validate the `input` with.
	 */
	@Nullable
	@JSProperty
	String getPattern();

	/**
	 * A pattern to validate the `input` with.
	 */
	@JSProperty
	void setPattern(String pattern);

	/**
	 * The error message to display when the input is invalid.
	 */
	@Nullable
	@JSProperty
	String getErrorMessage();

	/**
	 * The error message to display when the input is invalid.
	 */
	@JSProperty
	void setErrorMessage(String errorMessage);

	@JSProperty
	boolean isAutofocus();

	@JSProperty
	void setAutofocus(boolean autofocus);

	/**
	 * A placeholder string in addition to the label.
	 */
	@Nullable
	@JSProperty
	String getPlaceholder();

	/**
	 * A placeholder string in addition to the label.
	 */
	@JSProperty
	void setPlaceholder(String placeholder);

	@JSProperty
	boolean isReadonly();

	@JSProperty
	void setReadonly(boolean readonly);

	/**
	 * Set to true to display the clear icon which clears the input.
	 */
	@JSProperty
	boolean isClearButtonVisible();

	/**
	 * Set to true to display the clear icon which clears the input.
	 */
	@JSProperty
	void setClearButtonVisible(boolean clearButtonVisible);
}
