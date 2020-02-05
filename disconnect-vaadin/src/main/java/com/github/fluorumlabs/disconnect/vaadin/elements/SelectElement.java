package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.SelectRenderer;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `<vaadin-select>` is a Web Component for selecting values from a list of items. The content of the
 * the select can be populated in two ways: imperatively by using renderer callback function and
 * declaratively by using Polymer's Templates.
 * <p>
 * ### Rendering
 * <p>
 * By default, the select uses the content provided by using the renderer callback function.
 * <p>
 * The renderer function provides `root`, `select` arguments.
 * Generate DOM content, append it to the `root` element and control the state
 * of the host element by accessing `select`.
 * <p>
 * ```html
 * <vaadin-select id="select"></vaadin-select>
 * ```
 * ```js
 * const select = document.querySelector('#select');
 * select.renderer = function(root, select) {
 * const listBox = document.createElement('vaadin-list-box');
 * // append 3 <vaadin-item> elements
 * ['Jose', 'Manolo', 'Pedro'].forEach(function(name) {
 * const item = document.createElement('vaadin-item');
 * item.textContent = name;
 * listBox.appendChild(item);
 * });
 * <p>
 * // update the content
 * root.appendChild(listBox);
 * };
 * ```
 * <p>
 * Renderer is called on initialization of new select and on its opening.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the `root` argument.
 * On first call it will be empty.
 * <p>
 * ### Polymer Templates
 * <p>
 * Alternatively, the content can be provided with Polymer's Template.
 * Select finds the first child template and uses that in case renderer callback function
 * is not provided. You can also set a custom template using the `template` property.
 * <p>
 * ```
 * <vaadin-select>
 * <template>
 * <vaadin-list-box>
 * <vaadin-item label="foo">Foo</vaadin-item>
 * <vaadin-item>Bar</vaadin-item>
 * <vaadin-item>Baz</vaadin-item>
 * </vaadin-list-box>
 * </template>
 * </vaadin-select>
 * ```
 * <p>
 * Hint: By setting the `label` property of inner vaadin-items you will
 * be able to change the visual representation of the selected value in the input part.
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ----------------|----------------
 * `toggle-button` | The toggle button
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|------------
 * `opened` | Set when the select is open | :host
 * `invalid` | Set when the element is invalid | :host
 * `focused` | Set when the element is focused | :host
 * `focus-ring` | Set when the element is keyboard focused | :host
 * `readonly` | Set when the select is read only | :host
 * <p>
 * `<vaadin-select>` element sets these custom CSS properties:
 * <p>
 * Property name | Description | Theme for element
 * --- | --- | ---
 * `--vaadin-select-text-field-width` | Width of the select text field | `vaadin-select-overlay`
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 * <p>
 * In addition to `<vaadin-select>` itself, the following internal
 * components are themable:
 * <p>
 * - `<vaadin-select-text-field>`
 * - `<vaadin-select-overlay>`
 * <p>
 * Note: the `theme` attribute value set on `<vaadin-select>` is
 * propagated to the internal themable components listed above.
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "SelectElement",
		module = "@vaadin/vaadin-select/src/vaadin-select.js"
)
public interface SelectElement extends HTMLElement, ElementMixin, ControlStateMixin, ThemableMixin {
	/**
	 * Set when the select is open
	 */
	@JSProperty
	boolean isOpened();

	/**
	 * Set when the select is open
	 */
	@JSProperty
	void setOpened(boolean opened);

	/**
	 * Custom function for rendering the content of the `<vaadin-select>`.
	 * Receives two arguments:
	 * <p>
	 * - `root` The `<vaadin-select-overlay>` internal container
	 * DOM element. Append your content to it.
	 * - `select` The reference to the `<vaadin-select>` element.
	 */
	@Nullable
	@JSProperty
	SelectRenderer getRenderer();

	/**
	 * Custom function for rendering the content of the `<vaadin-select>`.
	 * Receives two arguments:
	 * <p>
	 * - `root` The `<vaadin-select-overlay>` internal container
	 * DOM element. Append your content to it.
	 * - `select` The reference to the `<vaadin-select>` element.
	 */
	@JSProperty
	void setRenderer(SelectRenderer renderer);

	/**
	 * The error message to display when the select value is invalid
	 */
	@Nullable
	@JSProperty
	String getErrorMessage();

	/**
	 * The error message to display when the select value is invalid
	 */
	@JSProperty
	void setErrorMessage(String errorMessage);

	/**
	 * String used for the label element.
	 */
	@Nullable
	@JSProperty
	String getLabel();

	/**
	 * String used for the label element.
	 */
	@JSProperty
	void setLabel(String label);

	/**
	 * It stores the the `value` property of the selected item, providing the
	 * value for iron-form.
	 * When there’s an item selected, it's the value of that item, otherwise
	 * it's an empty string.
	 * On change or initialization, the component finds the item which matches the
	 * value and displays it.
	 * If no value is provided to the component, it selects the first item without
	 * value or empty value.
	 * Hint: If you do not want to select any item by default, you can either set all
	 * the values of inner vaadin-items, or set the vaadin-select value to
	 * an inexistent value in the items list.
	 */
	@Nullable
	@JSProperty
	String getValue();

	/**
	 * It stores the the `value` property of the selected item, providing the
	 * value for iron-form.
	 * When there’s an item selected, it's the value of that item, otherwise
	 * it's an empty string.
	 * On change or initialization, the component finds the item which matches the
	 * value and displays it.
	 * If no value is provided to the component, it selects the first item without
	 * value or empty value.
	 * Hint: If you do not want to select any item by default, you can either set all
	 * the values of inner vaadin-items, or set the vaadin-select value to
	 * an inexistent value in the items list.
	 */
	@JSProperty
	void setValue(String value);

	/**
	 * The current required state of the select. True if required.
	 */
	@JSProperty
	boolean isRequired();

	/**
	 * The current required state of the select. True if required.
	 */
	@JSProperty
	void setRequired(boolean required);

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
	 * A hint to the user of what can be entered in the control.
	 * The placeholder will be displayed in the case that there
	 * is no item selected, or the selected item has an empty
	 * string label, or the selected item has no label and it's
	 * DOM content is empty.
	 */
	@Nullable
	@JSProperty
	String getPlaceholder();

	/**
	 * A hint to the user of what can be entered in the control.
	 * The placeholder will be displayed in the case that there
	 * is no item selected, or the selected item has an empty
	 * string label, or the selected item has no label and it's
	 * DOM content is empty.
	 */
	@JSProperty
	void setPlaceholder(String placeholder);

	/**
	 * When present, it specifies that the element is read-only.
	 */
	@JSProperty
	boolean isReadonly();

	/**
	 * When present, it specifies that the element is read-only.
	 */
	@JSProperty
	void setReadonly(boolean readonly);

	/**
	 * Manually invoke existing renderer.
	 */
	void render();

	/**
	 * Returns true if `value` is valid, and sets the `invalid` flag appropriately.
	 *
	 * @return True if the value is valid and sets the `invalid` flag appropriately
	 */
	boolean validate();
}
