package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.vaadin.i18n.CustomFieldI18n;
import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface CustomFieldMixin extends Element {
	/**
	 * Array of available input nodes
	 */
	@Nullable
	@JSProperty
	Array<Element> getInputs();

	/**
	 * The object used to localize this component.
	 * To change the default localization, replace the entire
	 * <em>i18n</em> object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure:
	 *
	 * <pre><code>     {
	 *        // A function to format given `Array` as
	 *        // component value. Array is list of all internal values
	 *        // in the order of their presence in the DOM
	 *        // This function is called each time the internal input
	 *        // value is changed.
	 *        formatValue: inputValues =&gt; {
	 *          // returns a representation of the given array of values
	 *          // in the form of string with delimiter characters
	 *        },
	 *
	 *        // A function to parse the given value to an `Array` in the format
	 *        // of the list of all internal values
	 *        // in the order of their presence in the DOM
	 *        // This function is called when value of the
	 *        // custom field is set.
	 *        parseValue: value =&gt; {
	 *          // returns the array of values from parsed value string.
	 *        }
	 * </code></pre>
	 */
	@Nullable
	@JSProperty
	CustomFieldI18n getI18n();

	/**
	 * The object used to localize this component.
	 * To change the default localization, replace the entire
	 * <em>i18n</em> object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure:
	 *
	 * <pre><code>     {
	 *        // A function to format given `Array` as
	 *        // component value. Array is list of all internal values
	 *        // in the order of their presence in the DOM
	 *        // This function is called each time the internal input
	 *        // value is changed.
	 *        formatValue: inputValues =&gt; {
	 *          // returns a representation of the given array of values
	 *          // in the form of string with delimiter characters
	 *        },
	 *
	 *        // A function to parse the given value to an `Array` in the format
	 *        // of the list of all internal values
	 *        // in the order of their presence in the DOM
	 *        // This function is called when value of the
	 *        // custom field is set.
	 *        parseValue: value =&gt; {
	 *          // returns the array of values from parsed value string.
	 *        }
	 * </code></pre>
	 */
	@JSProperty
	void setI18n(CustomFieldI18n i18n);
}
