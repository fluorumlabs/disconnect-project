package js.lang.external.vaadin.vaadin_date_time_picker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-date-time-picker&gt;</code> is a Web Component providing a date time selection field.
 *
 * <pre><code class="language-html">&lt;vaadin-date-time-picker value=&quot;2019-09-16T15:00&quot;&gt;&lt;/vaadin-date-time-picker&gt;
 * </code></pre>
 * <pre><code class="language-js">dateTimePicker.value = '2019-09-16T15:00';
 * </code></pre>
 * When the selected <code>value</code> is changed, a <code>value-changed</code> event is triggered.
 *
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th><th>Theme for Element</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>date</code></td><td>Date picker element</td><td>vaadin-date-time-picker</td></tr>
 * <tr><td><code>time</code></td><td>Time picker element</td><td>vaadin-date-time-picker</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set when the element is disabled</td><td>:host</td></tr>
 * <tr><td><code>readonly</code></td><td>Set when the element is read-only</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin#stylable-shadow-parts">ThemableMixin – Stylable Shadow Parts</a>
 *
 * In addition to <code>&lt;vaadin-date-time-picker&gt;</code> itself, the following internal
 * components are themable:
 *
 * <ul>
 * <li><code>&lt;vaadin-custom-field&gt;</code>, see
 * <a href="https://vaadin.com/components/vaadin-custom-field/html-api/elements/Vaadin.CustomFieldElement"><code>custom-field</code> documentation</a>
 * for the custom field parts.</li>
 * <li><code>&lt;vaadin-date-picker&gt;</code>, see
 * <a href="https://vaadin.com/components/vaadin-date-picker/html-api/elements/Vaadin.DatePickerElement"><code>date-picker</code> documentation</a>
 * for the date picker parts.</li>
 * <li><code>&lt;vaadin-time-picker&gt;</code>, see
 * <a href="https://vaadin.com/components/vaadin-time-picker/html-api/elements/Vaadin.TimePickerElement"><code>time-picker</code> documentation</a>
 * for the time picker parts.</li>
 * </ul>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-date-time-picker&gt;</code> is
 * propagated to the internal themable components listed above.
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-date-time-picker",
    version = "^1.3.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-date-time-picker/vaadin-date-time-picker.js"
)
public interface DateTimePicker extends PolymerElement, ThemableMixin, ElementMixin {
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
   * The value for this element.
   *
   * Supported date time format is based on ISO 8601 (without a time zone designator):
   *
   * <ul>
   * <li>Minute precision <code>&quot;YYYY-MM-DDThh:mm&quot;</code> (default)</li>
   * <li>Second precision <code>&quot;YYYY-MM-DDThh:mm:ss&quot;</code></li>
   * <li>Millisecond precision <code>&quot;YYYY-MM-DDThh:mm:ss.fff&quot;</code></li>
   * </ul>
   */
  @JSProperty("value")
  String getValue();

  /**
   * The value for this element.
   *
   * Supported date time format is based on ISO 8601 (without a time zone designator):
   *
   * <ul>
   * <li>Minute precision <code>&quot;YYYY-MM-DDThh:mm&quot;</code> (default)</li>
   * <li>Second precision <code>&quot;YYYY-MM-DDThh:mm:ss&quot;</code></li>
   * <li>Millisecond precision <code>&quot;YYYY-MM-DDThh:mm:ss.fff&quot;</code></li>
   * </ul>
   */
  @JSProperty("value")
  void setValue(String value);

  /**
   * The earliest allowed value (date and time) that can be selected. All earlier values will be disabled.
   *
   * Supported date time format is based on ISO 8601 (without a time zone designator):
   *
   * <ul>
   * <li>Minute precision <code>&quot;YYYY-MM-DDThh:mm&quot;</code></li>
   * <li>Second precision <code>&quot;YYYY-MM-DDThh:mm:ss&quot;</code></li>
   * <li>Millisecond precision <code>&quot;YYYY-MM-DDThh:mm:ss.fff&quot;</code></li>
   * </ul>
   */
  @JSProperty("min")
  @Nullable
  String getMin();

  /**
   * The earliest allowed value (date and time) that can be selected. All earlier values will be disabled.
   *
   * Supported date time format is based on ISO 8601 (without a time zone designator):
   *
   * <ul>
   * <li>Minute precision <code>&quot;YYYY-MM-DDThh:mm&quot;</code></li>
   * <li>Second precision <code>&quot;YYYY-MM-DDThh:mm:ss&quot;</code></li>
   * <li>Millisecond precision <code>&quot;YYYY-MM-DDThh:mm:ss.fff&quot;</code></li>
   * </ul>
   */
  @JSProperty("min")
  void setMin(@Nullable String value);

  /**
   * The latest value (date and time) that can be selected. All later values will be disabled.
   *
   * Supported date time format is based on ISO 8601 (without a time zone designator):
   *
   * <ul>
   * <li>Minute precision <code>&quot;YYYY-MM-DDThh:mm&quot;</code></li>
   * <li>Second precision <code>&quot;YYYY-MM-DDThh:mm:ss&quot;</code></li>
   * <li>Millisecond precision <code>&quot;YYYY-MM-DDThh:mm:ss.fff&quot;</code></li>
   * </ul>
   */
  @JSProperty("max")
  @Nullable
  String getMax();

  /**
   * The latest value (date and time) that can be selected. All later values will be disabled.
   *
   * Supported date time format is based on ISO 8601 (without a time zone designator):
   *
   * <ul>
   * <li>Minute precision <code>&quot;YYYY-MM-DDThh:mm&quot;</code></li>
   * <li>Second precision <code>&quot;YYYY-MM-DDThh:mm:ss&quot;</code></li>
   * <li>Millisecond precision <code>&quot;YYYY-MM-DDThh:mm:ss.fff&quot;</code></li>
   * </ul>
   */
  @JSProperty("max")
  void setMax(@Nullable String value);

  /**
   * A placeholder string for the date field.
   *
   */
  @JSProperty("datePlaceholder")
  @Nullable
  String getDatePlaceholder();

  /**
   * A placeholder string for the date field.
   *
   */
  @JSProperty("datePlaceholder")
  void setDatePlaceholder(@Nullable String value);

  /**
   * A placeholder string for the time field.
   *
   */
  @JSProperty("timePlaceholder")
  @Nullable
  String getTimePlaceholder();

  /**
   * A placeholder string for the time field.
   *
   */
  @JSProperty("timePlaceholder")
  void setTimePlaceholder(@Nullable String value);

  /**
   * Specifies the number of valid intervals in a day used for
   * configuring the items displayed in the time selection box.
   *
   * It also configures the precision of the time part of the value string. By default
   * the component formats time values as <code>hh:mm</code> but setting a step value
   * lower than one minute or one second, format resolution changes to
   * <code>hh:mm:ss</code> and <code>hh:mm:ss.fff</code> respectively.
   *
   * Unit must be set in seconds, and for correctly configuring intervals
   * in the dropdown, it need to evenly divide a day.
   *
   * Note: it is possible to define step that is dividing an hour in inexact
   * fragments (i.e. 5760 seconds which equals 1 hour 36 minutes), but it is
   * not recommended to use it for better UX.
   *
   */
  @JSProperty("step")
  double getStep();

  /**
   * Specifies the number of valid intervals in a day used for
   * configuring the items displayed in the time selection box.
   *
   * It also configures the precision of the time part of the value string. By default
   * the component formats time values as <code>hh:mm</code> but setting a step value
   * lower than one minute or one second, format resolution changes to
   * <code>hh:mm:ss</code> and <code>hh:mm:ss.fff</code> respectively.
   *
   * Unit must be set in seconds, and for correctly configuring intervals
   * in the dropdown, it need to evenly divide a day.
   *
   * Note: it is possible to define step that is dividing an hour in inexact
   * fragments (i.e. 5760 seconds which equals 1 hour 36 minutes), but it is
   * not recommended to use it for better UX.
   *
   */
  @JSProperty("step")
  void setStep(double value);

  /**
   * Date which should be visible in the date picker overlay when there is no value selected.
   *
   * The same date formats as for the <code>value</code> property are supported but without the time part.
   *
   */
  @JSProperty("initialPosition")
  @Nullable
  String getInitialPosition();

  /**
   * Date which should be visible in the date picker overlay when there is no value selected.
   *
   * The same date formats as for the <code>value</code> property are supported but without the time part.
   *
   */
  @JSProperty("initialPosition")
  void setInitialPosition(@Nullable String value);

  /**
   * Set true to display ISO-8601 week numbers in the calendar. Notice that
   * displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code>
   * is 1 (Monday).
   *
   */
  @JSProperty("showWeekNumbers")
  boolean getShowWeekNumbers();

  /**
   * Set true to display ISO-8601 week numbers in the calendar. Notice that
   * displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code>
   * is 1 (Monday).
   *
   */
  @JSProperty("showWeekNumbers")
  void setShowWeekNumbers(boolean value);

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
   * Set to true to prevent the overlays from opening automatically.
   *
   */
  @JSProperty("autoOpenDisabled")
  boolean getAutoOpenDisabled();

  /**
   * Set to true to prevent the overlays from opening automatically.
   *
   */
  @JSProperty("autoOpenDisabled")
  void setAutoOpenDisabled(boolean value);

  /**
   * Set to true to disable this element.
   *
   */
  @JSProperty("disabled")
  boolean getDisabled();

  /**
   * Set to true to disable this element.
   *
   */
  @JSProperty("disabled")
  void setDisabled(boolean value);

  /**
   * Set to true to make this element read-only.
   *
   */
  @JSProperty("readonly")
  boolean getReadonly();

  /**
   * Set to true to make this element read-only.
   *
   */
  @JSProperty("readonly")
  void setReadonly(boolean value);

  /**
   * Specify that this control should have input focus when the page loads.
   *
   */
  @JSProperty("autofocus")
  boolean getAutofocus();

  /**
   * Specify that this control should have input focus when the page loads.
   *
   */
  @JSProperty("autofocus")
  void setAutofocus(boolean value);

  /**
   * The object used to localize this component.
   * To change the default localization, replace the entire
   * <code>i18n</code> object or just the properties you want to modify.
   *
   * The object is a combination of the i18n properties supported by
   * <code>&lt;vaadin-date-picker&gt;</code> and <code>&lt;vaadin-time-picker&gt;</code>. See <code>i18n</code> property at:
   *
   * <ul>
   * <li><a href="https://vaadin.com/components/vaadin-date-picker/html-api/elements/Vaadin.DatePickerElement"><code>date-picker</code> documentation</a></li>
   * <li><a href="https://vaadin.com/components/vaadin-time-picker/html-api/elements/Vaadin.TimePickerElement"><code>time-picker</code> documentation</a></li>
   * </ul>
   */
  @JSProperty("i18n")
  DateTimePickerI18n getI18n();

  /**
   * The object used to localize this component.
   * To change the default localization, replace the entire
   * <code>i18n</code> object or just the properties you want to modify.
   *
   * The object is a combination of the i18n properties supported by
   * <code>&lt;vaadin-date-picker&gt;</code> and <code>&lt;vaadin-time-picker&gt;</code>. See <code>i18n</code> property at:
   *
   * <ul>
   * <li><a href="https://vaadin.com/components/vaadin-date-picker/html-api/elements/Vaadin.DatePickerElement"><code>date-picker</code> documentation</a></li>
   * <li><a href="https://vaadin.com/components/vaadin-time-picker/html-api/elements/Vaadin.TimePickerElement"><code>time-picker</code> documentation</a></li>
   * </ul>
   */
  @JSProperty("i18n")
  void setI18n(DateTimePickerI18n value);

  void ready();

  void focus();

  /**
   * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
   *
   * @return True if the value is valid.
   *
   */
  boolean validate();

  /**
   * Returns true if the current input value satisfies all constraints (if any)
   *
   * You can override the <code>checkValidity</code> method for custom validations.
   *
   */
  boolean checkValidity();
}
