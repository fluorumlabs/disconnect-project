package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import js.web.dom.Element;
import org.teavm.jso.JSProperty;


public interface ColumnReorderingMixin extends Element {
	/**
	 * Set to true to allow column reordering.
	 */
	@JSProperty
	boolean isColumnReorderingAllowed();

	/**
	 * Set to true to allow column reordering.
	 */
	@JSProperty
	void setColumnReorderingAllowed(boolean columnReorderingAllowed);
}
