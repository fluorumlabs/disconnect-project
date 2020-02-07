package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;

/**
 * The vaadin-context-menu-list-box element.
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-context-menu/theme/lumo/vaadin-contextmenu-items-mixin.js"
)
public interface ContextMenuListBoxElement extends ListBoxElement {
	static String TAGNAME() {
		return "vaadin-context-menu-list-box";
	}
}
