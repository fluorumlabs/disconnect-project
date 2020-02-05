package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.Element;

@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "ButtonsMixin",
		module = "@vaadin/vaadin-menu-bar/src/vaadin-menu-bar-buttons-mixin.js"
)
public interface ButtonsMixin extends Element {
	/**
	 * Call this method after updating menu bar <code>items</code> dynamically, including changing
	 * any property on the item object corresponding to one of the menu bar buttons.
	 */
	void render();
}
