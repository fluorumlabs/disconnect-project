package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.i18n.TimePickerI18n;
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
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 * <p>
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
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "TimePickerElement",
		module = "@vaadin/vaadin-time-picker/vaadin-time-picker.js"
)
public interface TimePickerElement extends HTMLElement, ElementMixin, ControlStateMixin, ThemableMixin {
	String TAGNAME = "vaadin-time-picker";
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
	 * The time value for this element.
	 * <p>
	 * Supported time formats are in ISO 8601:
	 *
	 * <ul>
	 * <li><code>hh:mm</code> (default)</li>
	 * <li><code>hh:mm:ss</code></li>
	 * <li><code>hh:mm:ss.fff</code></li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	String getValue();

	/**
	 * The time value for this element.
	 * <p>
	 * Supported time formats are in ISO 8601:
	 *
	 * <ul>
	 * <li><code>hh:mm</code> (default)</li>
	 * <li><code>hh:mm:ss</code></li>
	 * <li><code>hh:mm:ss.fff</code></li>
	 * </ul>
	 */
	@JSProperty
	void setValue(String value);

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
	 * A pattern to validate the <code>input</code> with.
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

	/**
	 * Set to true to prevent user picking a date or typing in the input.
	 */
	@JSProperty
	boolean isReadonly();

	/**
	 * Set to true to prevent user picking a date or typing in the input.
	 */
	@JSProperty
	void setReadonly(boolean readonly);

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
	 * Minimum time allowed.
	 * <p>
	 * Supported time formats are in ISO 8601:
	 *
	 * <ul>
	 * <li><code>hh:mm</code></li>
	 * <li><code>hh:mm:ss</code></li>
	 * <li><code>hh:mm:ss.fff</code></li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	String getMin();

	/**
	 * Minimum time allowed.
	 * <p>
	 * Supported time formats are in ISO 8601:
	 *
	 * <ul>
	 * <li><code>hh:mm</code></li>
	 * <li><code>hh:mm:ss</code></li>
	 * <li><code>hh:mm:ss.fff</code></li>
	 * </ul>
	 */
	@JSProperty
	void setMin(String min);

	/**
	 * Maximum time allowed.
	 * <p>
	 * Supported time formats are in ISO 8601:
	 *
	 * <ul>
	 * <li><code>hh:mm</code></li>
	 * <li><code>hh:mm:ss</code></li>
	 * <li><code>hh:mm:ss.fff</code></li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	String getMax();

	/**
	 * Maximum time allowed.
	 * <p>
	 * Supported time formats are in ISO 8601:
	 *
	 * <ul>
	 * <li><code>hh:mm</code></li>
	 * <li><code>hh:mm:ss</code></li>
	 * <li><code>hh:mm:ss.fff</code></li>
	 * </ul>
	 */
	@JSProperty
	void setMax(String max);

	/**
	 * Specifies the number of valid intervals in a day used for
	 * configuring the items displayed in the selection box.
	 * <p>
	 * It also configures the precision of the value string. By default
	 * the component formats values as <code>hh:mm</code> but setting a step value
	 * lower than one minute or one second, format resolution changes to
	 * <code>hh:mm:ss</code> and <code>hh:mm:ss.fff</code> respectively.
	 * <p>
	 * Unit must be set in seconds, and for correctly configuring intervals
	 * in the dropdown, it need to evenly divide a day.
	 * <p>
	 * Note: it is possible to define step that is dividing an hour in inexact
	 * fragments (i.e. 5760 seconds which equals 1 hour 36 minutes), but it is
	 * not recommended to use it for better UX experience.
	 */
	@JSProperty
	double getStep();

	/**
	 * Specifies the number of valid intervals in a day used for
	 * configuring the items displayed in the selection box.
	 * <p>
	 * It also configures the precision of the value string. By default
	 * the component formats values as <code>hh:mm</code> but setting a step value
	 * lower than one minute or one second, format resolution changes to
	 * <code>hh:mm:ss</code> and <code>hh:mm:ss.fff</code> respectively.
	 * <p>
	 * Unit must be set in seconds, and for correctly configuring intervals
	 * in the dropdown, it need to evenly divide a day.
	 * <p>
	 * Note: it is possible to define step that is dividing an hour in inexact
	 * fragments (i.e. 5760 seconds which equals 1 hour 36 minutes), but it is
	 * not recommended to use it for better UX experience.
	 */
	@JSProperty
	void setStep(double step);

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

	/**
	 * The object used to localize this component.
	 * To change the default localization, replace the entire
	 * <em>i18n</em> object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure:
	 *
	 * <pre><code>      {
	 *         // A function to format given `Object` as
	 *         // time string. Object is in the format `{ hours: ..., minutes: ..., seconds: ..., milliseconds: ... }`
	 *         formatTime: (time) =&gt; {
	 *           // returns a string representation of the given
	 *           // object in `hh` / 'hh:mm' / 'hh:mm:ss' / 'hh:mm:ss.fff' - formats
	 *         },
	 *
	 *         // A function to parse the given text to an `Object` in the format
	 *         // `{ hours: ..., minutes: ..., seconds: ..., milliseconds: ... }`.
	 *         // Must properly parse (at least) text
	 *         // formatted by `formatTime`.
	 *         parseTime: text =&gt; {
	 *           // Parses a string in object/string that can be formatted by`formatTime`.
	 *         }
	 *
	 *         // Translation of the time selector icon button title.
	 *         selector: 'Time selector',
	 *
	 *         // Translation of the time selector clear button title.
	 *         clear: 'Clear'
	 *       }
	 * </code></pre>
	 */
	@Nullable
	@JSProperty
	TimePickerI18n getI18n();

	/**
	 * The object used to localize this component.
	 * To change the default localization, replace the entire
	 * <em>i18n</em> object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure:
	 *
	 * <pre><code>      {
	 *         // A function to format given `Object` as
	 *         // time string. Object is in the format `{ hours: ..., minutes: ..., seconds: ..., milliseconds: ... }`
	 *         formatTime: (time) =&gt; {
	 *           // returns a string representation of the given
	 *           // object in `hh` / 'hh:mm' / 'hh:mm:ss' / 'hh:mm:ss.fff' - formats
	 *         },
	 *
	 *         // A function to parse the given text to an `Object` in the format
	 *         // `{ hours: ..., minutes: ..., seconds: ..., milliseconds: ... }`.
	 *         // Must properly parse (at least) text
	 *         // formatted by `formatTime`.
	 *         parseTime: text =&gt; {
	 *           // Parses a string in object/string that can be formatted by`formatTime`.
	 *         }
	 *
	 *         // Translation of the time selector icon button title.
	 *         selector: 'Time selector',
	 *
	 *         // Translation of the time selector clear button title.
	 *         clear: 'Clear'
	 *       }
	 * </code></pre>
	 */
	@JSProperty
	void setI18n(TimePickerI18n i18n);

	/**
	 * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
	 *
	 * @return True if the value is valid and sets the <code>invalid</code> flag appropriately
	 */
	boolean validate();

	/**
	 * Returns true if the current input value satisfies all constraints (if any)
	 * <p>
	 * You can override the <code>checkValidity</code> method for custom validations.
	 */
	boolean checkValidity();
}
