package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.constants.Autocorrect;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.TextFieldMixin;
import com.github.fluorumlabs.disconnect.vaadin.i18n.TextFieldI18n;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Autocapitalize;
import js.web.dom.Autocomplete;
import js.web.dom.Event;

import javax.annotation.Nullable;

public interface HasTextFieldMixin<E extends TextFieldMixin, T extends Component<E>>
		extends HasControlStateMixin<E, T> {

	/**
	 * Whether the value of the control can be automatically completed by the browser.
	 * List of available options at:
	 * <a href="https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete">https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete</a>
	 */
	@Nullable
	default Autocomplete autocomplete() {
		return getNode().getAutocomplete();
	}

	/**
	 * Whether the value of the control can be automatically completed by the browser.
	 * List of available options at:
	 * <a href="https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete">https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete</a>
	 */
	default T autocomplete(Autocomplete autocomplete) {
		getNode().setAutocomplete(autocomplete);
		return (T) this;
	}

	/**
	 * This is a property supported by Safari that is used to control whether
	 * autocorrection should be enabled when the user is entering/editing the text.
	 * Possible values are:
	 * on: Enable autocorrection.
	 * off: Disable autocorrection.
	 */
	@Nullable
	default Autocorrect autocorrect() {
		return getNode().getAutocorrect();
	}

	/**
	 * This is a property supported by Safari that is used to control whether
	 * autocorrection should be enabled when the user is entering/editing the text.
	 * Possible values are:
	 * on: Enable autocorrection.
	 * off: Disable autocorrection.
	 */
	default T autocorrect(Autocorrect autocorrect) {
		getNode().setAutocorrect(autocorrect);
		return (T) this;
	}

	/**
	 * This is a property supported by Safari and Chrome that is used to control whether
	 * autocapitalization should be enabled when the user is entering/editing the text.
	 * Possible values are:
	 * characters: Characters capitalization.
	 * words: Words capitalization.
	 * sentences: Sentences capitalization.
	 * none: No capitalization.
	 */
	@Nullable
	default Autocapitalize autocapitalize() {
		return getNode().getAutocapitalize();
	}

	/**
	 * This is a property supported by Safari and Chrome that is used to control whether
	 * autocapitalization should be enabled when the user is entering/editing the text.
	 * Possible values are:
	 * characters: Characters capitalization.
	 * words: Words capitalization.
	 * sentences: Sentences capitalization.
	 * none: No capitalization.
	 */
	default T autocapitalize(Autocapitalize autocapitalize) {
		getNode().setAutocapitalize(autocapitalize);
		return (T) this;
	}

	/**
	 * Specify that the value should be automatically selected when the field gains focus.
	 */
	default boolean autoselect() {
		return getNode().isAutoselect();
	}

	/**
	 * Specify that the value should be automatically selected when the field gains focus.
	 */
	default T autoselect(boolean autoselect) {
		getNode().setAutoselect(autoselect);
		return (T) this;
	}

	/**
	 * Set to true to display the clear icon which clears the input.
	 */
	default boolean clearButtonVisible() {
		return getNode().isClearButtonVisible();
	}

	/**
	 * Set to true to display the clear icon which clears the input.
	 */
	default T clearButtonVisible(boolean clearButtonVisible) {
		getNode().setClearButtonVisible(clearButtonVisible);
		return (T) this;
	}

	/**
	 * Error to show when the input value is invalid.
	 */
	@Nullable
	default String errorMessage() {
		return getNode().getErrorMessage();
	}

	/**
	 * Error to show when the input value is invalid.
	 */
	default T errorMessage(String errorMessage) {
		getNode().setErrorMessage(errorMessage);
		return (T) this;
	}

	/**
	 * Object with translated strings used for localization. Has
	 * the following structure and default values:
	 *
	 * <pre><code>{
	 *   // Translation of the clear icon button accessible label
	 *   clear: 'Clear'
	 * }
	 * </code></pre>
	 */
	@Nullable
	default TextFieldI18n i18n() {
		return getNode().getI18n();
	}

	/**
	 * Object with translated strings used for localization. Has
	 * the following structure and default values:
	 *
	 * <pre><code>{
	 *   // Translation of the clear icon button accessible label
	 *   clear: 'Clear'
	 * }
	 * </code></pre>
	 */
	default T i18n(TextFieldI18n i18n) {
		getNode().setI18n(i18n);
		return (T) this;
	}

	/**
	 * String used for the label element.
	 */
	@Nullable
	default String label() {
		return getNode().getLabel();
	}

	/**
	 * String used for the label element.
	 */
	default T label(String label) {
		getNode().setLabel(label);
		return (T) this;
	}

	/**
	 * Maximum number of characters (in Unicode code points) that the user can enter.
	 */
	default int maxlength() {
		return getNode().getMaxlength();
	}

	/**
	 * Maximum number of characters (in Unicode code points) that the user can enter.
	 */
	default T maxlength(int maxlength) {
		getNode().setMaxlength(maxlength);
		return (T) this;
	}

	/**
	 * Minimum number of characters (in Unicode code points) that the user can enter.
	 */
	default int minlength() {
		return getNode().getMinlength();
	}

	/**
	 * Minimum number of characters (in Unicode code points) that the user can enter.
	 */
	default T minlength(int minlength) {
		getNode().setMinlength(minlength);
		return (T) this;
	}

	/**
	 * The name of the control, which is submitted with the form data.
	 */
	@Nullable
	default String name() {
		return getNode().getName();
	}

	/**
	 * The name of the control, which is submitted with the form data.
	 */
	default T name(String name) {
		getNode().setName(name);
		return (T) this;
	}

	/**
	 * A hint to the user of what can be entered in the control.
	 */
	@Nullable
	default String placeholder() {
		return getNode().getPlaceholder();
	}

	/**
	 * A hint to the user of what can be entered in the control.
	 */
	default T placeholder(String placeholder) {
		getNode().setPlaceholder(placeholder);
		return (T) this;
	}

	/**
	 * This attribute indicates that the user cannot modify the value of the control.
	 */
	default boolean readonly() {
		return getNode().isReadonly();
	}

	/**
	 * This attribute indicates that the user cannot modify the value of the control.
	 */
	default T readonly(boolean readonly) {
		getNode().setReadonly(readonly);
		return (T) this;
	}

	/**
	 * Specifies that the user must fill in a value.
	 */
	default boolean required() {
		return getNode().isRequired();
	}

	/**
	 * Specifies that the user must fill in a value.
	 */
	default T required(boolean required) {
		getNode().setRequired(required);
		return (T) this;
	}

	/**
	 * The initial value of the control.
	 * It can be used for two-way data binding.
	 */
	@Nullable
	default String value() {
		return getNode().getValue();
	}

	/**
	 * The initial value of the control.
	 * It can be used for two-way data binding.
	 */
	default T value(String value) {
		getNode().setValue(value);
		return (T) this;
	}

	/**
	 * This property is set to true when the control value is invalid.
	 */
	default boolean invalid() {
		return getNode().isInvalid();
	}

	/**
	 * This property is set to true when the control value is invalid.
	 */
	default T invalid(boolean invalid) {
		getNode().setInvalid(invalid);
		return (T) this;
	}

	/**
	 * Specifies that the text field has value.
	 */
	default boolean hasValue() {
		return getNode().isHasValue();
	}

	/**
	 * Specifies that the text field has value.
	 */
	default T hasValue(boolean hasValue) {
		getNode().setHasValue(hasValue);
		return (T) this;
	}

	/**
	 * When set to true, user is prevented from typing a value that
	 * conflicts with the given <code>pattern</code>.
	 */
	default boolean preventInvalidInput() {
		return getNode().isPreventInvalidInput();
	}

	/**
	 * When set to true, user is prevented from typing a value that
	 * conflicts with the given <code>pattern</code>.
	 */
	default T preventInvalidInput(boolean preventInvalidInput) {
		getNode().setPreventInvalidInput(preventInvalidInput);
		return (T) this;
	}

	/**
	 * Returns true if the current input value satisfies all constraints (if any)
	 */
	default boolean checkValidity() {
		return getNode().checkValidity();
	}

	/**
	 * Returns true if <code>value</code> is valid.
	 * <code>&lt;iron-form&gt;</code> uses this to check the validity for all its elements.
	 *
	 * @return True if the value is valid.
	 */
	default boolean validate() {
		return getNode().validate();
	}

	default void clear() {
		getNode().clear();
	}

	/**
	 * Fired when the size of the element changes.
	 */
	default ObservableEvent<Event> ironResizeEvent() {
		return createEvent("iron-resize");
	}
}
