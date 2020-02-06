package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;

@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-menu-bar/vaadin-menu-bar-button.js"
)
public interface MenuBarButtonElement extends ButtonElement {
	static String TAGNAME() {
		return "vaadin-menu-bar-button";
	}
}
