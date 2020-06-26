package js.lang.external.vaadin.vaadin_time_picker;

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
 * <code>&lt;vaadin-time-picker&gt;</code> is a Web Component providing a time-selection field.
 *
 * <pre><code class="language-html">&lt;vaadin-time-picker&gt;&lt;/vaadin-time-picker&gt;
 * </code></pre>
 * <pre><code class="language-js">timePicker.value = '14:30';
 * </code></pre>
 * When the selected <code>value</code> is changed, a <code>value-changed</code> event is triggered.
 *
 * <h3>Styling</h3>
 * The following custom properties are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>toggle-button</code></td><td>The toggle button</td></tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set to a disabled time picker</td><td>:host</td></tr>
 * <tr><td><code>readonly</code></td><td>Set to a read only time picker</td><td>:host</td></tr>
 * <tr><td><code>invalid</code></td><td>Set when the element is invalid</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the element is focused</td><td>:host</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the element is keyboard focused</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * In addition to <code>&lt;vaadin-time-picker&gt;</code> itself, the following internal
 * components are themable:
 *
 * <ul>
 * <li><code>&lt;vaadin-time-picker-text-field&gt;</code>, see
 * <a href="https://vaadin.com/components/vaadin-text-field/html-api/elements/Vaadin.TextFieldElement"><code>&lt;vaadin-text-field&gt;</code> documentation</a>
 * for the text field parts.</li>
 * <li><code>&lt;vaadin-combo-box-light&gt;</code>, see
 * <a href="https://vaadin.com/components/vaadin-combo-box/html-api/elements/Vaadin.ComboBoxElement"><code>&lt;vaadin-combo-box&gt;</code> documentation</a>
 * for the combo box parts.</li>
 * </ul>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-time-picker&gt;</code> is
 * propagated to the internal themable components listed above.
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-time-picker",
    version = "^2.3.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-time-picker/vaadin-time-picker.js"
)
public interface TimePickerElement extends PolymerElement, ControlStateMixin, ThemableMixin, ElementMixin {
  /**
   * Focusable element used by vaadin-control-state-mixin
   *
   */
  @JSProperty("focusElement")
  HTMLElement getFocusElement();

  /**
   * Set to true to disable this input.
   *
   */
  @JSProperty("disabled")
  boolean getDisabled();

  /**
   * Set to true to disable this input.
   *
   */
  @JSProperty("disabled")
  void setDisabled(boolean value);

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
   * The time value for this element.
   *
   * Supported time formats are in ISO 8601:
   *
   * <ul>
   * <li><code>hh:mm</code> (default)</li>
   * <li><code>hh:mm:ss</code></li>
   * <li><code>hh:mm:ss.fff</code></li>
   * </ul>
   */
  @JSProperty("value")
  String getValue();

  /**
   * The time value for this element.
   *
   * Supported time formats are in ISO 8601:
   *
   * <ul>
   * <li><code>hh:mm</code> (default)</li>
   * <li><code>hh:mm:ss</code></li>
   * <li><code>hh:mm:ss.fff</code></li>
   * </ul>
   */
  @JSProperty("value")
  void setValue(String value);

  /**
   * The label for this element.
   *
   */
  @JSProperty("label")
  @Nullable
  String getLabel();

  /**
   * The label for this element.
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable String value);

  /**
   * Set to true to mark the input as required.
   *
   */
  @JSProperty("required")
  boolean getRequired();

  /**
   * Set to true to mark the input as required.
   *
   */
  @JSProperty("required")
  void setRequired(boolean value);

  /**
   * Set to true to prevent the user from entering invalid input.
   *
   */
  @JSProperty("preventInvalidInput")
  boolean getPreventInvalidInput();

  /**
   * Set to true to prevent the user from entering invalid input.
   *
   */
  @JSProperty("preventInvalidInput")
  void setPreventInvalidInput(boolean value);

  /**
   * A pattern to validate the <code>input</code> with.
   *
   */
  @JSProperty("pattern")
  @Nullable
  String getPattern();

  /**
   * A pattern to validate the <code>input</code> with.
   *
   */
  @JSProperty("pattern")
  void setPattern(@Nullable String value);

  /**
   * The error message to display when the input is invalid.
   *
   */
  @JSProperty("errorMessage")
  @Nullable
  String getErrorMessage();

  /**
   * The error message to display when the input is invalid.
   *
   */
  @JSProperty("errorMessage")
  void setErrorMessage(@Nullable String value);

  /**
   * A placeholder string in addition to the label.
   *
   */
  @JSProperty("placeholder")
  String getPlaceholder();

  /**
   * A placeholder string in addition to the label.
   *
   */
  @JSProperty("placeholder")
  void setPlaceholder(String value);

  /**
   * Set to true to prevent user picking a date or typing in the input.
   *
   */
  @JSProperty("readonly")
  boolean getReadonly();

  /**
   * Set to true to prevent user picking a date or typing in the input.
   *
   */
  @JSProperty("readonly")
  void setReadonly(boolean value);

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
   * Minimum time allowed.
   *
   * Supported time formats are in ISO 8601:
   *
   * <ul>
   * <li><code>hh:mm</code></li>
   * <li><code>hh:mm:ss</code></li>
   * <li><code>hh:mm:ss.fff</code></li>
   * </ul>
   */
  @JSProperty("min")
  String getMin();

  /**
   * Minimum time allowed.
   *
   * Supported time formats are in ISO 8601:
   *
   * <ul>
   * <li><code>hh:mm</code></li>
   * <li><code>hh:mm:ss</code></li>
   * <li><code>hh:mm:ss.fff</code></li>
   * </ul>
   */
  @JSProperty("min")
  void setMin(String value);

  /**
   * Maximum time allowed.
   *
   * Supported time formats are in ISO 8601:
   *
   * <ul>
   * <li><code>hh:mm</code></li>
   * <li><code>hh:mm:ss</code></li>
   * <li><code>hh:mm:ss.fff</code></li>
   * </ul>
   */
  @JSProperty("max")
  String getMax();

  /**
   * Maximum time allowed.
   *
   * Supported time formats are in ISO 8601:
   *
   * <ul>
   * <li><code>hh:mm</code></li>
   * <li><code>hh:mm:ss</code></li>
   * <li><code>hh:mm:ss.fff</code></li>
   * </ul>
   */
  @JSProperty("max")
  void setMax(String value);

  /**
   * Specifies the number of valid intervals in a day used for
   * configuring the items displayed in the selection box.
   *
   * It also configures the precision of the value string. By default
   * the component formats values as <code>hh:mm</code> but setting a step value
   * lower than one minute or one second, format resolution changes to
   * <code>hh:mm:ss</code> and <code>hh:mm:ss.fff</code> respectively.
   *
   * Unit must be set in seconds, and for correctly configuring intervals
   * in the dropdown, it need to evenly divide a day.
   *
   * Note: it is possible to define step that is dividing an hour in inexact
   * fragments (i.e. 5760 seconds which equals 1 hour 36 minutes), but it is
   * not recommended to use it for better UX experience.
   *
   */
  @JSProperty("step")
  double getStep();

  /**
   * Specifies the number of valid intervals in a day used for
   * configuring the items displayed in the selection box.
   *
   * It also configures the precision of the value string. By default
   * the component formats values as <code>hh:mm</code> but setting a step value
   * lower than one minute or one second, format resolution changes to
   * <code>hh:mm:ss</code> and <code>hh:mm:ss.fff</code> respectively.
   *
   * Unit must be set in seconds, and for correctly configuring intervals
   * in the dropdown, it need to evenly divide a day.
   *
   * Note: it is possible to define step that is dividing an hour in inexact
   * fragments (i.e. 5760 seconds which equals 1 hour 36 minutes), but it is
   * not recommended to use it for better UX experience.
   *
   */
  @JSProperty("step")
  void setStep(double value);

  /**
   * Set to true to display the clear icon which clears the input.
   *
   */
  @JSProperty("clearButtonVisible")
  boolean getClearButtonVisible();

  /**
   * Set to true to display the clear icon which clears the input.
   *
   */
  @JSProperty("clearButtonVisible")
  void setClearButtonVisible(boolean value);

  /**
   * Set true to prevent the overlay from opening automatically.
   *
   */
  @JSProperty("autoOpenDisabled")
  boolean getAutoOpenDisabled();

  /**
   * Set true to prevent the overlay from opening automatically.
   *
   */
  @JSProperty("autoOpenDisabled")
  void setAutoOpenDisabled(boolean value);

  /**
   * The object used to localize this component.
   * To change the default localization, replace the entire
   * <em>i18n</em> object or just the property you want to modify.
   *
   * The object has the following JSON structure:
   *
   * <pre><code>       {
   *          // A function to format given `Object` as
   *          // time string. Object is in the format `{ hours: ..., minutes: ..., seconds: ..., milliseconds: ... }`
   *          formatTime: (time) =&gt; {
   *            // returns a string representation of the given
   *            // object in `hh` / 'hh:mm' / 'hh:mm:ss' / 'hh:mm:ss.fff' - formats
   *          },
   *
   *          // A function to parse the given text to an `Object` in the format
   *          // `{ hours: ..., minutes: ..., seconds: ..., milliseconds: ... }`.
   *          // Must properly parse (at least) text
   *          // formatted by `formatTime`.
   *          parseTime: text =&gt; {
   *            // Parses a string in object/string that can be formatted by`formatTime`.
   *          }
   *
   *          // Translation of the time selector icon button title.
   *          selector: 'Time selector',
   *
   *          // Translation of the time selector clear button title.
   *          clear: 'Clear'
   *        }
   * </code></pre>
   */
  @JSProperty("i18n")
  TimePickerI18n getI18n();

  /**
   * The object used to localize this component.
   * To change the default localization, replace the entire
   * <em>i18n</em> object or just the property you want to modify.
   *
   * The object has the following JSON structure:
   *
   * <pre><code>       {
   *          // A function to format given `Object` as
   *          // time string. Object is in the format `{ hours: ..., minutes: ..., seconds: ..., milliseconds: ... }`
   *          formatTime: (time) =&gt; {
   *            // returns a string representation of the given
   *            // object in `hh` / 'hh:mm' / 'hh:mm:ss' / 'hh:mm:ss.fff' - formats
   *          },
   *
   *          // A function to parse the given text to an `Object` in the format
   *          // `{ hours: ..., minutes: ..., seconds: ..., milliseconds: ... }`.
   *          // Must properly parse (at least) text
   *          // formatted by `formatTime`.
   *          parseTime: text =&gt; {
   *            // Parses a string in object/string that can be formatted by`formatTime`.
   *          }
   *
   *          // Translation of the time selector icon button title.
   *          selector: 'Time selector',
   *
   *          // Translation of the time selector clear button title.
   *          clear: 'Clear'
   *        }
   * </code></pre>
   */
  @JSProperty("i18n")
  void setI18n(TimePickerI18n value);

  void ready();

  /**
   * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
   *
   * @return True if the value is valid and sets the <code>invalid</code> flag appropriately
   *
   */
  boolean validate();

  /**
   * Returns true if the current input value satisfies all constraints (if any)
   *
   * You can override the <code>checkValidity</code> method for custom validations.
   *
   * @return True if the value is valid
   *
   */
  boolean checkValidity();
}
