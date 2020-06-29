package js.lang.external.vaadin.vaadin_select;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_control_state_mixin.ControlStateMixin;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
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
 *
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
 * <tr><td><code>--vaadin-select-text-field-width</code></td><td>Width of the select text field</td><td><code>vaadin-select-overlay</code></td></tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 * In addition to <code>&lt;vaadin-select&gt;</code> itself, the following internal
 * components are themable:
 *
 * <ul>
 * <li><code>&lt;vaadin-select-text-field&gt;</code></li>
 * <li><code>&lt;vaadin-select-overlay&gt;</code></li>
 * </ul>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-select&gt;</code> is
 * propagated to the internal themable components listed above.
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-select",
    version = "^2.3.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-select/src/vaadin-select.js"
)
public interface SelectElement extends PolymerElement, ControlStateMixin, ThemableMixin, ElementMixin {
  @JSProperty("focusElement")
  HTMLElement getFocusElement();

  /**
   * Set when the select is open
   *
   */
  @JSProperty("opened")
  boolean getOpened();

  /**
   * Set when the select is open
   *
   */
  @JSProperty("opened")
  void setOpened(boolean value);

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
  @JSProperty("renderer")
  @Nullable
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
  @JSProperty("renderer")
  void setRenderer(@Nullable SelectRenderer value);

  /**
   * The error message to display when the select value is invalid
   *
   */
  @JSProperty("errorMessage")
  String getErrorMessage();

  /**
   * The error message to display when the select value is invalid
   *
   */
  @JSProperty("errorMessage")
  void setErrorMessage(String value);

  /**
   * String used for the label element.
   *
   */
  @JSProperty("label")
  @Nullable
  String getLabel();

  /**
   * String used for the label element.
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable String value);

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
   *
   */
  @JSProperty("value")
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
   *
   */
  @JSProperty("value")
  void setValue(String value);

  /**
   * The current required state of the select. True if required.
   *
   */
  @JSProperty("required")
  boolean getRequired();

  /**
   * The current required state of the select. True if required.
   *
   */
  @JSProperty("required")
  void setRequired(boolean value);

  /**
   * Set to true if the value is invalid.
   *
   */
  @JSProperty("invalid")
  boolean getInvalid();

  /**
   * Set to true if the value is invalid.
   *
   */
  @JSProperty("invalid")
  void setInvalid(boolean value);

  /**
   * The name of this element.
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * The name of this element.
   *
   */
  @JSProperty("name")
  void setName(@Nullable String value);

  /**
   * A hint to the user of what can be entered in the control.
   * The placeholder will be displayed in the case that there
   * is no item selected, or the selected item has an empty
   * string label, or the selected item has no label and it's
   * DOM content is empty.
   *
   */
  @JSProperty("placeholder")
  @Nullable
  String getPlaceholder();

  /**
   * A hint to the user of what can be entered in the control.
   * The placeholder will be displayed in the case that there
   * is no item selected, or the selected item has an empty
   * string label, or the selected item has no label and it's
   * DOM content is empty.
   *
   */
  @JSProperty("placeholder")
  void setPlaceholder(@Nullable String value);

  /**
   * When present, it specifies that the element is read-only.
   *
   */
  @JSProperty("readonly")
  boolean getReadonly();

  /**
   * When present, it specifies that the element is read-only.
   *
   */
  @JSProperty("readonly")
  void setReadonly(boolean value);

  void ready();

  /**
   * Manually invoke existing renderer.
   *
   */
  void render();

  void notifyResize();

  /**
   * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
   *
   * @return True if the value is valid and sets the <code>invalid</code> flag appropriately
   *
   */
  boolean validate();
}
