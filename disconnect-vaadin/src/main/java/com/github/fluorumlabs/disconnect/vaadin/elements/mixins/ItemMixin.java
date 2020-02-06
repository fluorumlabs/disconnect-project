package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import js.web.dom.Element;
import org.teavm.jso.JSProperty;

/**
 * A mixin providing <code>focused</code>, <code>focus-ring</code>, <code>active</code>, <code>disabled</code> and
 * <code>selected</code>.
 *
 * <code>focused</code>, <code>active</code> and <code>focus-ring</code> are set as only as attributes.
 */

public interface ItemMixin extends Element {
	/**
	 *
	 */
	@JSProperty
	String getValue();

	/**
	 *
	 */
	@JSProperty
	void setValue(String value);

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

	/**
	 * If true, the item is in selected state.
	 */
	@JSProperty
	boolean isSelected();

	/**
	 * If true, the item is in selected state.
	 */
	@JSProperty
	void setSelected(boolean selected);
}
