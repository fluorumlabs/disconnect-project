package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.CustomFieldMixin;
import com.github.fluorumlabs.disconnect.vaadin.i18n.CustomFieldI18n;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.util.collections.Array;
import js.web.dom.Element;
import js.web.dom.Event;

import javax.annotation.Nullable;

public interface HasCustomFieldMixin<E extends CustomFieldMixin, T extends Component<E>> extends Component<E> {
	/**
	 * Array of available input nodes
	 */
	@Nullable
	default Array<Element> inputs() {
		return getNode().getInputs();
	}

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
	default CustomFieldI18n i18n() {
		return getNode().getI18n();
	}

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
	default T i18n(CustomFieldI18n i18n) {
		getNode().setI18n(i18n);
		return (T) this;
	}

	/**
	 * Fired when the user commits a value change for any of the internal inputs.
	 */
	default ObservableEvent<Event> changeEvent() {
		return createEvent("change");
	}

	/**
	 * Fired on Tab keydown triggered from the internal inputs,
	 * meaning focus will not leave the inputs.
	 */
	default ObservableEvent<Event> internalTabEvent() {
		return createEvent("internal-tab");
	}
}
