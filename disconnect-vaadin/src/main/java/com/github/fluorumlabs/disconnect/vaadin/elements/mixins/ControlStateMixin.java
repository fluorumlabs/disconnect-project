package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

/**
 * Polymer.IronControlState is not a proper 2.0 class, also, its tabindex
 * implementation fails in the shadow dom, so we have this for vaadin elements.
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "ControlStateMixin",
		module = "@vaadin/vaadin-control-state-mixin/vaadin-control-state-mixin.js"
)
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
