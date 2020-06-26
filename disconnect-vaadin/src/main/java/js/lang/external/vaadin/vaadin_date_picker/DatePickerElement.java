package js.lang.external.vaadin.vaadin_date_picker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.polymer.mixins.GestureEventListeners;
import js.lang.external.vaadin.vaadin_control_state_mixin.ControlStateMixin;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-date-picker&gt;</code> is a date selection field which includes a scrollable
 * month calendar view.
 *
 * <pre><code class="language-html">&lt;vaadin-date-picker label=&quot;Birthday&quot;&gt;&lt;/vaadin-date-picker&gt;
 * </code></pre>
 * <pre><code class="language-js">datePicker.value = '2016-03-02';
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
 * <tr><td><code>text-field</code></td><td>Input element</td><td>vaadin-date-picker</td></tr>
 * <tr><td><code>clear-button</code></td><td>Clear button</td><td>vaadin-date-picker</td></tr>
 * <tr><td><code>toggle-button</code></td><td>Toggle button</td><td>vaadin-date-picker</td></tr>
 * <tr><td><code>overlay-content</code></td><td>The overlay element</td><td>vaadin-date-picker</td></tr>
 * <tr><td><code>overlay-header</code></td><td>Fullscreen mode header</td><td>vaadin-date-picker-overlay-content</td></tr>
 * <tr><td><code>label</code></td><td>Fullscreen mode value/label</td><td>vaadin-date-picker-overlay-content</td></tr>
 * <tr><td><code>clear-button</code></td><td>Fullscreen mode clear button</td><td>vaadin-date-picker-overlay-content</td></tr>
 * <tr><td><code>toggle-button</code></td><td>Fullscreen mode toggle button</td><td>vaadin-date-picker-overlay-content</td></tr>
 * <tr><td><code>years-toggle-button</code></td><td>Fullscreen mode years scroller toggle</td><td>vaadin-date-picker-overlay-content</td></tr>
 * <tr><td><code>months</code></td><td>Months scroller</td><td>vaadin-date-picker-overlay-content</td></tr>
 * <tr><td><code>years</code></td><td>Years scroller</td><td>vaadin-date-picker-overlay-content</td></tr>
 * <tr><td><code>toolbar</code></td><td>Footer bar with buttons</td><td>vaadin-date-picker-overlay-content</td></tr>
 * <tr><td><code>today-button</code></td><td>Today button</td><td>vaadin-date-picker-overlay-content</td></tr>
 * <tr><td><code>cancel-button</code></td><td>Cancel button</td><td>vaadin-date-picker-overlay-content</td></tr>
 * <tr><td><code>month</code></td><td>Month calendar</td><td>vaadin-date-picker-overlay-content</td></tr>
 * <tr><td><code>year-number</code></td><td>Year number</td><td>vaadin-date-picker-overlay-content</td></tr>
 * <tr><td><code>year-separator</code></td><td>Year separator</td><td>vaadin-date-picker-overlay-content</td></tr>
 * <tr><td><code>month-header</code></td><td>Month title</td><td>vaadin-month-calendar</td></tr>
 * <tr><td><code>weekdays</code></td><td>Weekday container</td><td>vaadin-month-calendar</td></tr>
 * <tr><td><code>weekday</code></td><td>Weekday element</td><td>vaadin-month-calendar</td></tr>
 * <tr><td><code>week-numbers</code></td><td>Week numbers container</td><td>vaadin-month-calendar</td></tr>
 * <tr><td><code>week-number</code></td><td>Week number element</td><td>vaadin-month-calendar</td></tr>
 * <tr><td><code>date</code></td><td>Date element</td><td>vaadin-month-calendar</td></tr>
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
 * <tr><td><code>invalid</code></td><td>Set when the element is invalid</td><td>:host</td></tr>
 * <tr><td><code>opened</code></td><td>Set when the date selector overlay is opened</td><td>:host</td></tr>
 * <tr><td><code>readonly</code></td><td>Set when the element is readonly</td><td>:host</td></tr>
 * <tr><td><code>disabled</code></td><td>Set when the element is disabled</td><td>:host</td></tr>
 * <tr><td><code>today</code></td><td>Set on the date corresponding to the current day</td><td>date</td></tr>
 * <tr><td><code>focused</code></td><td>Set on the focused date</td><td>date</td></tr>
 * <tr><td><code>disabled</code></td><td>Set on the date out of the allowed range</td><td>date</td></tr>
 * <tr><td><code>selected</code></td><td>Set on the selected date</td><td>date</td></tr>
 * </tbody>
 * </table>
 * If you want to replace the default input field with a custom implementation, you should use the
 * <a href="#vaadin-date-picker-light"><code>&lt;vaadin-date-picker-light&gt;</code></a> element.
 *
 * In addition to <code>&lt;vaadin-date-picker&gt;</code> itself, the following internal
 * components are themable:
 *
 * <ul>
 * <li><code>&lt;vaadin-text-field&gt;</code></li>
 * <li><code>&lt;vaadin-date-picker-overlay&gt;</code></li>
 * <li><code>&lt;vaadin-date-picker-overlay-content&gt;</code></li>
 * <li><code>&lt;vaadin-month-calendar&gt;</code></li>
 * </ul>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-date-picker&gt;</code> is
 * propagated to the internal themable components listed above.
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-date-picker",
    version = "^4.3.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-date-picker/vaadin-date-picker.js"
)
public interface DatePickerElement extends GestureEventListeners, DatePickerMixin, PolymerElement, ControlStateMixin, ThemableMixin, ElementMixin {
  /**
   * Focusable element used by vaadin-control-state-mixin
   *
   */
  @JSProperty("focusElement")
  HTMLElement getFocusElement();

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
   * A placeholder string in addition to the label. If this is set, the label will always float.
   *
   */
  @JSProperty("placeholder")
  @Nullable
  String getPlaceholder();

  /**
   * A placeholder string in addition to the label. If this is set, the label will always float.
   *
   */
  @JSProperty("placeholder")
  void setPlaceholder(@Nullable String value);

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
   * This property is set to true when the control value invalid.
   *
   */
  @JSProperty("invalid")
  boolean getInvalid();

  /**
   * This property is set to true when the control value invalid.
   *
   */
  @JSProperty("invalid")
  void setInvalid(boolean value);

  void ready();
}
