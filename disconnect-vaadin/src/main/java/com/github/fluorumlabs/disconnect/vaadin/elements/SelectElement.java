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
 * <code>&lt;vaadin-select&gt;</code> is a Web Component for selecting values from a list of items. The content of the
 * the select can be populated in two ways: imperatively by using renderer callback function and
 * declaratively by using Polymer's Templates.
 *
 * <h3>Rendering</h3>
 * By default, the select uses the content provided by using the renderer callback function.
 * <p>
 * The renderer function provides <code>root</code>, <code>select</code> arguments.
 * Generate DOM content, append it to the <code>root</code> element and control the state
 * of the host element by accessing <code>select</code>.
 *
 * <pre><code class="language-html">&lt;vaadin-select id=&quot;select&quot;&gt;&lt;/vaadin-select&gt;
 * </code></pre>
 * <pre><code class="language-js">const select = document.querySelector('#select');
 * select.renderer = function(root, select) {
 *   const listBox = document.createElement('vaadin-list-box');
 *   // append 3 &lt;vaadin-item&gt; elements
 *   ['Jose', 'Manolo', 'Pedro'].forEach(function(name) {
 *     const item = document.createElement('vaadin-item');
 *     item.textContent = name;
 *     listBox.appendChild(item);
 *   });
 *
 *   // update the content
 *   root.appendChild(listBox);
 * };
 * </code></pre>
 * Renderer is called on initialization of new select and on its opening.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the <code>root</code> argument.
 * On first call it will be empty.
 *
 * <h3>Polymer Templates</h3>
 * Alternatively, the content can be provided with Polymer's Template.
 * Select finds the first child template and uses that in case renderer callback function
 * is not provided. You can also set a custom template using the <code>template</code> property.
 *
 * <pre><code>&lt;vaadin-select&gt;
 *   &lt;template&gt;
 *     &lt;vaadin-list-box&gt;
 *       &lt;vaadin-item label=&quot;foo&quot;&gt;Foo&lt;/vaadin-item&gt;
 *       &lt;vaadin-item&gt;Bar&lt;/vaadin-item&gt;
 *       &lt;vaadin-item&gt;Baz&lt;/vaadin-item&gt;
 *     &lt;/vaadin-list-box&gt;
 *   &lt;/template&gt;
 * &lt;/vaadin-select&gt;
 * </code></pre>
 * Hint: By setting the <code>label</code> property of inner vaadin-items you will
 * be able to change the visual representation of the selected value in the input part.
 *
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>toggle-button</code></td><td>The toggle button</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>opened</code></td><td>Set when the select is open</td><td>:host</td></tr>
 * <tr><td><code>invalid</code></td><td>Set when the element is invalid</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the element is focused</td><td>:host</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the element is keyboard focused</td><td>:host</td></tr>
 * <tr><td><code>readonly</code></td><td>Set when the select is read only</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * <code>&lt;vaadin-select&gt;</code> element sets these custom CSS properties:
 *
 * <table>
 * <thead>
 * <tr><th>Property name</th><th>Description</th><th>Theme for element</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>--vaadin-select-text-field-width</code></td><td>Width of the select text
 * field</td><td><code>vaadin-select-overlay</code></td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 * <p>
 * In addition to <code>&lt;vaadin-select&gt;</code> itself, the following internal
 * components are themable:
 *
 * <ul>
 * <li><code>&lt;vaadin-select-text-field&gt;</code></li>
 * <li><code>&lt;vaadin-select-overlay&gt;</code></li>
 * </ul>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-select&gt;</code> is
 * propagated to the internal themable components listed above.
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-select/theme/lumo/vaadin-select.js"
)
public interface SelectElement extends HTMLElement, ElementMixin, ControlStateMixin, ThemableMixin {
	static String TAGNAME() {
		return "vaadin-select";
	}

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
	 * Custom function for rendering the content of the <code>&lt;vaadin-select&gt;</code>.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The <code>&lt;vaadin-select-overlay&gt;</code> internal container
	 * DOM element. Append your content to it.</li>
	 * <li><code>select</code> The reference to the <code>&lt;vaadin-select&gt;</code> element.</li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	SelectRenderer getRenderer();

	/**
	 * Custom function for rendering the content of the <code>&lt;vaadin-select&gt;</code>.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The <code>&lt;vaadin-select-overlay&gt;</code> internal container
	 * DOM element. Append your content to it.</li>
	 * <li><code>select</code> The reference to the <code>&lt;vaadin-select&gt;</code> element.</li>
	 * </ul>
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
	 * It stores the the <code>value</code> property of the selected item, providing the
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
	 * It stores the the <code>value</code> property of the selected item, providing the
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
	 * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
	 *
	 * @return True if the value is valid and sets the <code>invalid</code> flag appropriately
	 */
	boolean validate();
}
