package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.MenuBarSubmenuElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

public class VaadinMenuBarSubmenu extends AbstractComponent<MenuBarSubmenuElement>
		implements HasComponents<MenuBarSubmenuElement, VaadinMenuBarSubmenu, Component<?>> {
	public VaadinMenuBarSubmenu() {
		super("vaadin-menu-bar-submenu");
	}

	/**
	 * Overriding the public method to reset expanded button state.
	 */
	public void close() {
		getNode().close();
	}
}
