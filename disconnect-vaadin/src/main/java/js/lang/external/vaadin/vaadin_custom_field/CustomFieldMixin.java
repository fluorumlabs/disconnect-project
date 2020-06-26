package js.lang.external.vaadin.vaadin_custom_field;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-custom-field",
    version = "^1.2.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-custom-field/src/vaadin-custom-field-mixin.js"
)
public interface CustomFieldMixin extends Any {
  /**
   * Array of available input nodes
   *
   */
  @JSProperty("inputs")
  @Nullable
  HTMLElement[] getInputs();

  /**
   * The object used to localize this component.
   * To change the default localization, replace the entire
   * <em>i18n</em> object or just the property you want to modify.
   *
   * The object has the following JSON structure:
   *
   * <pre><code>      {
   *         // A function to format given `Array` as
   *         // component value. Array is list of all internal values
   *         // in the order of their presence in the DOM
   *         // This function is called each time the internal input
   *         // value is changed.
   *         formatValue: inputValues =&gt; {
   *           // returns a representation of the given array of values
   *           // in the form of string with delimiter characters
   *         },
   *
   *         // A function to parse the given value to an `Array` in the format
   *         // of the list of all internal values
   *         // in the order of their presence in the DOM
   *         // This function is called when value of the
   *         // custom field is set.
   *         parseValue: value =&gt; {
   *           // returns the array of values from parsed value string.
   *         }
   * </code></pre>
   */
  @JSProperty("i18n")
  CustomFieldI18n getI18n();

  /**
   * The object used to localize this component.
   * To change the default localization, replace the entire
   * <em>i18n</em> object or just the property you want to modify.
   *
   * The object has the following JSON structure:
   *
   * <pre><code>      {
   *         // A function to format given `Array` as
   *         // component value. Array is list of all internal values
   *         // in the order of their presence in the DOM
   *         // This function is called each time the internal input
   *         // value is changed.
   *         formatValue: inputValues =&gt; {
   *           // returns a representation of the given array of values
   *           // in the form of string with delimiter characters
   *         },
   *
   *         // A function to parse the given value to an `Array` in the format
   *         // of the list of all internal values
   *         // in the order of their presence in the DOM
   *         // This function is called when value of the
   *         // custom field is set.
   *         parseValue: value =&gt; {
   *           // returns the array of values from parsed value string.
   *         }
   * </code></pre>
   */
  @JSProperty("i18n")
  void setI18n(CustomFieldI18n value);

  void ready();

  void focus();
}
