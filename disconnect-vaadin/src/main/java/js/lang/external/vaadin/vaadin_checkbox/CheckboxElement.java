package js.lang.external.vaadin.vaadin_checkbox;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.polymer.mixins.GestureEventListeners;
import js.lang.external.vaadin.vaadin_control_state_mixin.ControlStateMixin;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import js.web.dom.HTMLInputElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-checkbox&gt;</code> is a Web Component for customized checkboxes.
 *
 * <pre><code class="language-html">&lt;vaadin-checkbox&gt;
 *   Make my profile visible
 * &lt;/vaadin-checkbox&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>checkbox</code></td><td>The wrapper element for the native <input type="checkbox"></td></tr>
 * <tr><td><code>label</code></td><td>The wrapper element in which the component's children, namely the label, is slotted</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>active</code></td><td>Set when the checkbox is pressed down, either with mouse, touch or the keyboard.</td><td><code>:host</code></td></tr>
 * <tr><td><code>disabled</code></td><td>Set when the checkbox is disabled.</td><td><code>:host</code></td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the checkbox is focused using the keyboard.</td><td><code>:host</code></td></tr>
 * <tr><td><code>focused</code></td><td>Set when the checkbox is focused.</td><td><code>:host</code></td></tr>
 * <tr><td><code>indeterminate</code></td><td>Set when the checkbox is in indeterminate mode.</td><td><code>:host</code></td></tr>
 * <tr><td><code>checked</code></td><td>Set when the checkbox is checked.</td><td><code>:host</code></td></tr>
 * <tr><td><code>empty</code></td><td>Set when there is no label provided.</td><td><code>label</code></td></tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-checkbox",
    version = "^2.4.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-checkbox/src/vaadin-checkbox.js"
)
public interface CheckboxElement extends GestureEventListeners, PolymerElement, ControlStateMixin, ThemableMixin, ElementMixin {
  @JSProperty("focusElement")
  HTMLInputElement getFocusElement();

  /**
   * Name of the element.
   *
   */
  @JSProperty("name")
  String getName();

  /**
   * Name of the element.
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * True if the checkbox is checked.
   *
   */
  @JSProperty("checked")
  boolean getChecked();

  /**
   * True if the checkbox is checked.
   *
   */
  @JSProperty("checked")
  void setChecked(boolean value);

  /**
   * Indeterminate state of the checkbox when it's neither checked nor unchecked, but undetermined.
   * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes">https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes</a>
   *
   */
  @JSProperty("indeterminate")
  boolean getIndeterminate();

  /**
   * Indeterminate state of the checkbox when it's neither checked nor unchecked, but undetermined.
   * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes">https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes</a>
   *
   */
  @JSProperty("indeterminate")
  void setIndeterminate(boolean value);

  /**
   * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
   *
   */
  @JSProperty("value")
  @Nullable
  String getValue();

  /**
   * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
   *
   */
  @JSProperty("value")
  void setValue(@Nullable String value);

  void ready();
}
