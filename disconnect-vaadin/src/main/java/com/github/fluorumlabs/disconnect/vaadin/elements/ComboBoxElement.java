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
 * <code>&lt;vaadin-combo-box&gt;</code> is a combo box element combining a dropdown list with an
 * input field for filtering the list of items. If you want to replace the default
 * input field with a custom implementation, you should use the
 * <a href="#/elements/vaadin-combo-box-light"><code>&lt;vaadin-combo-box-light&gt;</code></a> element.
 * <p>
 * Items in the dropdown list must be provided as a list of <code>String</code> values.
 * Defining the items is done using the <code>items</code> property, which can be assigned
 * with data-binding, using an attribute or directly with the JavaScript property.
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box
 *     label=&quot;Fruit&quot;
 *     items=&quot;[[data]]&quot;&gt;
 * &lt;/vaadin-combo-box&gt;
 * </code></pre>
 * <pre><code class="language-js">combobox.items = ['apple', 'orange', 'banana'];
 * </code></pre>
 * When the selected <code>value</code> is changed, a <code>value-changed</code> event is triggered.
 * <p>
 * This element can be used within an <code>iron-form</code>.
 *
 * <h3>Item rendering</h3>
 * <code>&lt;vaadin-combo-box&gt;</code> supports using custom renderer callback function for defining the
 * content of <code>&lt;vaadin-combo-box-item&gt;</code>.
 * <p>
 * The renderer function provides <code>root</code>, <code>comboBox</code>, <code>model</code> arguments when
 * applicable.
 * Generate DOM content by using <code>model</code> object properties if needed, append it to the <code>root</code>
 * element and control the state of the host element by accessing <code>comboBox</code>. Before generating new
 * content, users are able to check if there is already content in <code>root</code> for reusing it.
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box id=&quot;combo-box&quot;&gt;&lt;/vaadin-combo-box&gt;
 * </code></pre>
 * <pre><code class="language-js">const comboBox = document.querySelector('#combo-box');
 * comboBox.items = [{'label': 'Hydrogen', 'value': 'H'}];
 * comboBox.renderer = function(root, comboBox, model) {
 *   root.innerHTML = model.index + ': ' +
 *                    model.item.label + ' ' +
 *                    '&lt;b&gt;' + model.item.value + '&lt;/b&gt;';
 * };
 * </code></pre>
 * Renderer is called on the opening of the combo-box and each time the related model is updated.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the <code>root</code> argument.
 * On first call it will be empty.
 *
 * <h3>Item Template</h3>
 * Alternatively, the content of the <code>&lt;vaadin-combo-box-item&gt;</code> can be populated by using
 * custom item template provided in the light DOM:
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box items='[{&quot;label&quot;: &quot;Hydrogen&quot;, &quot;
 * value&quot;: &quot;H&quot;}]'&gt;
 *   &lt;template&gt;
 *     [[index]]: [[item.label]] &lt;b&gt;[[item.value]&lt;/b&gt;
 *   &lt;/template&gt;
 * &lt;/vaadin-combo-box&gt;
 * </code></pre>
 * The following properties are available for item template bindings:
 *
 * <table>
 * <thead>
 * <tr><th>Property name</th><th>Type</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>index</code></td><td>Number</td><td>Index of the item in the <code>items</code> array</td></tr>
 * <tr><td><code>item</code></td><td>String or Object</td><td>The item reference</td></tr>
 * <tr><td><code>selected</code></td><td>Boolean</td><td>True when item is selected</td></tr>
 * <tr><td><code>focused</code></td><td>Boolean</td><td>True when item is focused</td></tr>
 * </tbody>
 * </table>
 * <h3>Lazy Loading with Function Data Provider</h3>
 * In addition to assigning an array to the items property, you can alternatively
 * provide the <code>&lt;vaadin-combo-box&gt;</code> data through the
 * <a href="#/elements/vaadin-combo-box#property-dataProvider"><code>dataProvider</code></a> function property.
 * The <code>&lt;vaadin-combo-box&gt;</code> calls this function lazily, only when it needs more data
 * to be displayed.
 * <p>
 * See the <a href="#/elements/vaadin-combo-box#property-dataProvider"><code>dataProvider</code></a> in
 * the API reference below for the detailed data provider arguments description,
 * and the “Lazy Loading“ example on “Basics” page in the demos.
 *
 * <strong>Note that when using function data providers, the total number of items
 * needs to be set manually. The total number of items can be returned
 * in the second argument of the data provider callback:</strong>
 *
 * <pre><code class="language-javascript">comboBox.dataProvider = function(params, callback) {
 *   var url = 'https://api.example/data' +
 *       '?page=' + params.page +        // the requested page index
 *       '&amp;per_page=' + params.pageSize; // number of items on the page
 *   var xhr = new XMLHttpRequest();
 *   xhr.onload = function() {
 *     var response = JSON.parse(xhr.responseText);
 *     callback(
 *       response.employees, // requested page of items
 *       response.totalSize  // total number of items
 *     );
 *   };
 *   xhr.open('GET', url, true);
 *   xhr.send();
 * };
 * </code></pre>
 * <h3>Styling</h3>
 * The following custom properties are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Custom property</th><th>Description</th><th>Default</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>--vaadin-combo-box-overlay-max-height</code></td><td>Property that determines the max height of
 * overlay</td><td><code>65vh</code></td></tr>
 * </tbody>
 * </table>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>text-field</code></td><td>The text field</td></tr>
 * <tr><td><code>toggle-button</code></td><td>The toggle button</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html"><code>&lt;vaadin-overlay&gt;</code> documentation</a>
 * for <code>&lt;vaadin-combo-box-overlay&gt;</code> parts.
 * <p>
 * See
 * <a href="https://vaadin.com/components/vaadin-text-field/html-api/elements/Vaadin.TextFieldElement"><code>&lt;vaadin-text-field&gt;</code> documentation</a>
 * for the text field parts.
 * <p>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>opened</code></td><td>Set when the combo box dropdown is open</td><td>:host</td></tr>
 * <tr><td><code>disabled</code></td><td>Set to a disabled combo box</td><td>:host</td></tr>
 * <tr><td><code>readonly</code></td><td>Set to a read only combo box</td><td>:host</td></tr>
 * <tr><td><code>has-value</code></td><td>Set when the element has a value</td><td>:host</td></tr>
 * <tr><td><code>invalid</code></td><td>Set when the element is invalid</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the element is focused</td><td>:host</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the element is keyboard focused</td><td>:host</td></tr>
 * <tr><td><code>loading</code></td><td>Set when new items are expected</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * In addition to <code>&lt;vaadin-combo-box&gt;</code> itself, the following internal
 * components are themable:
 *
 * <ul>
 * <li><code>&lt;vaadin-text-field&gt;</code></li>
 * <li><code>&lt;vaadin-combo-box-overlay&gt;</code></li>
 * <li><code>&lt;vaadin-combo-box-item&gt;</code></li>
 * </ul>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-combo-box&gt;</code> is
 * propagated to the internal themable components listed above.
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "ComboBoxElement",
		module = "@vaadin/vaadin-combo-box/vaadin-combo-box.js"
)
public interface ComboBoxElement<ITEM extends Any> extends HTMLElement,
		ElementMixin,
		ControlStateMixin,
		ComboBoxDataProviderMixin<ITEM>,
		ComboBoxMixin<ITEM>,
		ThemableMixin {
	String TAGNAME = "vaadin-combo-box";
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
	 * A pattern to validate the <code>input</code> with.
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
