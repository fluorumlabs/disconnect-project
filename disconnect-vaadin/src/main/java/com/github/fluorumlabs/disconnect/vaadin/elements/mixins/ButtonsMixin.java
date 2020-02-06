package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import js.web.dom.Element;

public interface ButtonsMixin extends Element {
	/**
	 * Call this method after updating menu bar <code>items</code> dynamically, including changing
	 * any property on the item object corresponding to one of the menu bar buttons.
	 */
	void render();
}
