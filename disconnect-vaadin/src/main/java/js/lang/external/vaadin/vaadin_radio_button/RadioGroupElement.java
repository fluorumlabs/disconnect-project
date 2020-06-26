package js.lang.external.vaadin.vaadin_radio_button;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.DirMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-radio-group&gt;</code> is a Web Component for grouping vaadin-radio-buttons.
 *
 * <pre><code class="language-html">&lt;vaadin-radio-group&gt;
 *   &lt;vaadin-radio-button name=&quot;foo&quot;&gt;Foo&lt;/vaadin-radio-button&gt;
 *   &lt;vaadin-radio-button name=&quot;bar&quot;&gt;Bar&lt;/vaadin-radio-button&gt;
 *   &lt;vaadin-radio-button name=&quot;baz&quot;&gt;Baz&lt;/vaadin-radio-button&gt;
 * &lt;/vaadin-radio-group&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>label</code></td><td>The label element</td></tr>
 * <tr><td><code>group-field</code></td><td>The element that wraps radio-buttons</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set when the radio group and its children are disabled.</td><td>:host</td></tr>
 * <tr><td><code>readonly</code></td><td>Set to a readonly radio group</td><td>:host</td></tr>
 * <tr><td><code>invalid</code></td><td>Set when the element is invalid</td><td>:host</td></tr>
 * <tr><td><code>has-label</code></td><td>Set when the element has a label</td><td>:host</td></tr>
 * <tr><td><code>has-value</code></td><td>Set when the element has a value</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the element contains focus</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-radio-button",
    version = "^1.4.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-radio-button/src/vaadin-radio-group.js"
)
public interface RadioGroupElement extends DirMixin, PolymerElement, ThemableMixin {
  /**
   * The current disabled state of the radio group. True if group and all internal radio buttons are disabled.
   *
   */
  @JSProperty("disabled")
  boolean getDisabled();

  /**
   * The current disabled state of the radio group. True if group and all internal radio buttons are disabled.
   *
   */
  @JSProperty("disabled")
  void setDisabled(boolean value);

  /**
   * This attribute indicates that the user cannot modify the value of the control.
   *
   */
  @JSProperty("readonly")
  boolean getReadonly();

  /**
   * This attribute indicates that the user cannot modify the value of the control.
   *
   */
  @JSProperty("readonly")
  void setReadonly(boolean value);

  /**
   * This property is set to true when the value is invalid.
   *
   */
  @JSProperty("invalid")
  boolean getInvalid();

  /**
   * This property is set to true when the value is invalid.
   *
   */
  @JSProperty("invalid")
  void setInvalid(boolean value);

  /**
   * Specifies that the user must fill in a value.
   *
   */
  @JSProperty("required")
  boolean getRequired();

  /**
   * Specifies that the user must fill in a value.
   *
   */
  @JSProperty("required")
  void setRequired(boolean value);

  /**
   * Error to show when the input value is invalid.
   *
   */
  @JSProperty("errorMessage")
  String getErrorMessage();

  /**
   * Error to show when the input value is invalid.
   *
   */
  @JSProperty("errorMessage")
  void setErrorMessage(String value);

  /**
   * String used for the label element.
   *
   */
  @JSProperty("label")
  String getLabel();

  /**
   * String used for the label element.
   *
   */
  @JSProperty("label")
  void setLabel(String value);

  /**
   * Value of the radio group.
   *
   */
  @JSProperty("value")
  @Nullable
  String getValue();

  /**
   * Value of the radio group.
   *
   */
  @JSProperty("value")
  void setValue(@Nullable String value);

  void ready();

  /**
   * Returns true if <code>value</code> is valid.
   * <code>&lt;iron-form&gt;</code> uses this to check the validity or all its elements.
   *
   * @return True if the value is valid.
   *
   */
  boolean validate();

  /**
   * Returns true if the current input value satisfies all constraints (if any)
   *
   */
  boolean checkValidity();
}
