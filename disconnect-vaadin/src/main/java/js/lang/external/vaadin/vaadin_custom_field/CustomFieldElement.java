package js.lang.external.vaadin.vaadin_custom_field;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-custom-field&gt;</code> is a Web Component providing field wrapper functionality.
 *
 * <pre><code>&lt;vaadin-custom-field label=&quot;Appointment time&quot;&gt;
 *   &lt;vaadin-date-picker&gt;&lt;/vaadin-date-picker&gt;
 *   &lt;vaadin-time-picker&gt;&lt;/vaadin-time-picker&gt;
 * &lt;/vaadin-custom-field&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * You may set the attribute <code>disabled</code> or <code>readonly</code> on this component to make the label styles behave the same
 * way as they would on a <code>&lt;vaadin-text-field&gt;</code> which is disabled or readonly.
 *
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>label</code></td><td>The label element</td></tr>
 * <tr><td><code>error-message</code></td><td>The error message element</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>has-label</code></td><td>Set when the field has a label</td><td>:host</td></tr>
 * <tr><td><code>invalid</code></td><td>Set when the field is invalid</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the field contains focus</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-custom-field",
    version = "^1.2.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-custom-field/vaadin-custom-field.js"
)
public interface CustomFieldElement extends PolymerElement, ThemableMixin, ElementMixin, CustomFieldMixin {
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
   * The name of the control, which is submitted with the form data.
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * The name of the control, which is submitted with the form data.
   *
   */
  @JSProperty("name")
  void setName(@Nullable String value);

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
   * The value of the field. When wrapping several inputs, it will contain <code>\t</code>
   * (Tab character) as a delimiter indicating parts intended to be used as the
   * corresponding inputs values. Use the <a href="#/elements/vaadin-custom-field#property-i18n"><code>i18n</code></a>
   * property to customize this behavior.
   *
   */
  @JSProperty("value")
  @Nullable
  String getValue();

  /**
   * The value of the field. When wrapping several inputs, it will contain <code>\t</code>
   * (Tab character) as a delimiter indicating parts intended to be used as the
   * corresponding inputs values. Use the <a href="#/elements/vaadin-custom-field#property-i18n"><code>i18n</code></a>
   * property to customize this behavior.
   *
   */
  @JSProperty("value")
  void setValue(@Nullable String value);

  /**
   * This property is set to true when the control value is invalid.
   *
   */
  @JSProperty("invalid")
  boolean getInvalid();

  /**
   * This property is set to true when the control value is invalid.
   *
   */
  @JSProperty("invalid")
  void setInvalid(boolean value);

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
   * Returns true if <code>value</code> is valid.
   * <code>&lt;iron-form&gt;</code> uses this to check the validity or all its elements.
   *
   * @return True if the value is valid.
   *
   */
  boolean validate();

  /**
   * Returns true if the current inputs values satisfy all constraints (if any)
   *
   */
  boolean checkValidity();
}
