package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.MenuBarSubmenuElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

@WebComponent
public class MenuBarSubmenu extends AbstractComponent<MenuBarSubmenuElement>
		implements HasStyle<MenuBarSubmenuElement, MenuBarSubmenu>, HasComponents<MenuBarSubmenuElement, MenuBarSubmenu, Component<?>> {
	public MenuBarSubmenu() {
		super(MenuBarSubmenuElement.TAGNAME());
	}

	/**
	 * Overriding the public method to reset expanded button state.
	 */
	public void close() {
		getNode().close();
	}
}
