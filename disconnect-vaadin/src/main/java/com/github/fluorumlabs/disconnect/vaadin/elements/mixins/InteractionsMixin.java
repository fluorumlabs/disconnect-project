package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import js.web.dom.Element;
import org.teavm.jso.JSProperty;


public interface InteractionsMixin extends Element {
	/**
	 * If true, the submenu will open on hover (mouseover) instead of click.
	 */
	@JSProperty
	boolean isOpenOnHover();

	/**
	 * If true, the submenu will open on hover (mouseover) instead of click.
	 */
	@JSProperty
	void setOpenOnHover(boolean openOnHover);
}
