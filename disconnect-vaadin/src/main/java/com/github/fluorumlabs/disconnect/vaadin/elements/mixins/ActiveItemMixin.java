package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import js.lang.Any;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

public interface ActiveItemMixin<ITEM extends Any> extends Element {
	/**
	 * The item user has last interacted with. Turns to <code>null</code> after user deactivates
	 * the item by re-interacting with the currently active item.
	 */
	@Nullable
	@JSProperty
	ITEM getActiveItem();

	/**
	 * The item user has last interacted with. Turns to <code>null</code> after user deactivates
	 * the item by re-interacting with the currently active item.
	 */
	@JSProperty
	void setActiveItem(ITEM activeItem);
}
