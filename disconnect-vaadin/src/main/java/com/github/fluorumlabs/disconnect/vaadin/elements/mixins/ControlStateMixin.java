package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import js.web.dom.Element;
import org.teavm.jso.JSProperty;

/**
 * Polymer.IronControlState is not a proper 2.0 class, also, its tabindex
 * implementation fails in the shadow dom, so we have this for vaadin elements.
 */

public interface ControlStateMixin extends Element {
	/**
	 * Any element extending this mixin is required to implement this getter.
	 * It returns the actual focusable element in the component.
	 */
	@JSProperty
	Element getFocusElement();

	/**
	 * Specify that this control should have input focus when the page loads.
	 */
	@JSProperty
	boolean isAutofocus();

	/**
	 * Specify that this control should have input focus when the page loads.
	 */
	@JSProperty
	void setAutofocus(boolean autofocus);

	/**
	 * If true, the user cannot interact with this element.
	 */
	@JSProperty
	boolean isDisabled();

	/**
	 * If true, the user cannot interact with this element.
	 */
	@JSProperty
	void setDisabled(boolean disabled);
}
