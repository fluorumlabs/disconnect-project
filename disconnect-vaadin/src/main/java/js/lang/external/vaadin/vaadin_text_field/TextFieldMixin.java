package js.lang.external.vaadin.vaadin_text_field;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.Autocapitalize;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@vaadin/vaadin-text-field",
    version = "^2.7.0-alpha5"
)
@Import(
    module = "@vaadin/vaadin-text-field/src/vaadin-text-field-mixin.js"
)
public interface TextFieldMixin extends Any {
  @JSProperty("focusElement")
  @Nullable
  HTMLElement getFocusElement();

  @JSProperty("inputElement")
  @Nullable
  HTMLElement getInputElement();

  /**
   * Whether the value of the control can be automatically completed by the browser.
   * List of available options at:
   * <a href="https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete">https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete</a>
   *
   */
  @JSProperty("autocomplete")
  @Nullable
  String getAutocomplete();

  /**
   * Whether the value of the control can be automatically completed by the browser.
   * List of available options at:
   * <a href="https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete">https://developer.mozilla.org/en/docs/Web/HTML/Element/input#attr-autocomplete</a>
   *
   */
  @JSProperty("autocomplete")
  void setAutocomplete(@Nullable String value);

  /**
   * This is a property supported by Safari that is used to control whether
   * autocorrection should be enabled when the user is entering/editing the text.
   * Possible values are:
   * on: Enable autocorrection.
   * off: Disable autocorrection.
   *
   */
  @JSProperty("autocorrect")
  @Nullable
  TextFieldAutoCorrect getAutocorrect();

  /**
   * This is a property supported by Safari that is used to control whether
   * autocorrection should be enabled when the user is entering/editing the text.
   * Possible values are:
   * on: Enable autocorrection.
   * off: Disable autocorrection.
   *
   */
  @JSProperty("autocorrect")
  void setAutocorrect(@Nullable TextFieldAutoCorrect value);

  /**
   * This is a property supported by Safari and Chrome that is used to control whether
   * autocapitalization should be enabled when the user is entering/editing the text.
   * Possible values are:
   * characters: Characters capitalization.
   * words: Words capitalization.
   * sentences: Sentences capitalization.
   * none: No capitalization.
   *
   */
  @JSProperty("autocapitalize")
  @Nullable
  Autocapitalize getAutocapitalize();

  /**
   * This is a property supported by Safari and Chrome that is used to control whether
   * autocapitalization should be enabled when the user is entering/editing the text.
   * Possible values are:
   * characters: Characters capitalization.
   * words: Words capitalization.
   * sentences: Sentences capitalization.
   * none: No capitalization.
   *
   */
  @JSProperty("autocapitalize")
  void setAutocapitalize(@Nullable Autocapitalize value);

  /**
   * Specify that the value should be automatically selected when the field gains focus.
   *
   */
  @JSProperty("autoselect")
  boolean getAutoselect();

  /**
   * Specify that the value should be automatically selected when the field gains focus.
   *
   */
  @JSProperty("autoselect")
  void setAutoselect(boolean value);

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
   * Object with translated strings used for localization. Has
   * the following structure and default values:
   *
   * <pre><code>{
   *   // Translation of the clear icon button accessible label
   *   clear: 'Clear'
   * }
   * </code></pre>
   */
  @JSProperty("i18n")
  I18n getI18n();

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
  @JSProperty("i18n")
  void setI18n(I18n value);

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
   * Maximum number of characters (in Unicode code points) that the user can enter.
   *
   */
  @JSProperty("maxlength")
  double getMaxlength();

  /**
   * Maximum number of characters (in Unicode code points) that the user can enter.
   *
   */
  @JSProperty("maxlength")
  void setMaxlength(double value);

  /**
   * Minimum number of characters (in Unicode code points) that the user can enter.
   *
   */
  @JSProperty("minlength")
  double getMinlength();

  /**
   * Minimum number of characters (in Unicode code points) that the user can enter.
   *
   */
  @JSProperty("minlength")
  void setMinlength(double value);

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
   * A hint to the user of what can be entered in the control.
   *
   */
  @JSProperty("placeholder")
  @Nullable
  String getPlaceholder();

  /**
   * A hint to the user of what can be entered in the control.
   *
   */
  @JSProperty("placeholder")
  void setPlaceholder(@Nullable String value);

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
   * The initial value of the control.
   * It can be used for two-way data binding.
   *
   */
  @JSProperty("value")
  String getValue();

  /**
   * The initial value of the control.
   * It can be used for two-way data binding.
   *
   */
  @JSProperty("value")
  void setValue(String value);

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
   * Specifies that the text field has value.
   *
   */
  @JSProperty("hasValue")
  boolean getHasValue();

  /**
   * Specifies that the text field has value.
   *
   */
  @JSProperty("hasValue")
  void setHasValue(boolean value);

  /**
   * When set to true, user is prevented from typing a value that
   * conflicts with the given <code>pattern</code>.
   *
   */
  @JSProperty("preventInvalidInput")
  boolean getPreventInvalidInput();

  /**
   * When set to true, user is prevented from typing a value that
   * conflicts with the given <code>pattern</code>.
   *
   */
  @JSProperty("preventInvalidInput")
  void setPreventInvalidInput(boolean value);

  /**
   * Returns true if the current input value satisfies all constraints (if any)
   *
   */
  boolean checkValidity();

  void ready();

  /**
   * Returns true if <code>value</code> is valid.
   * <code>&lt;iron-form&gt;</code> uses this to check the validity for all its elements.
   *
   * @return True if the value is valid.
   *
   */
  boolean validate();

  void clear();

  interface I18n extends Any {
    @JSProperty("clear")
    String getClear();

    @JSProperty("clear")
    void setClear(String value);

    class Builder {
      private final I18n object = Any.empty();

      public I18n build() {
        return object;
      }

      public I18n.Builder clear(String value) {
        object.setClear(value);
        return this;
      }
    }
  }
}
