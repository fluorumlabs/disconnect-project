package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.MenuBarButtonElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

public class VaadinMenuBarButton extends AbstractComponent<MenuBarButtonElement>
		implements HasComponents<MenuBarButtonElement, VaadinMenuBarButton, Component<?>> {
	public VaadinMenuBarButton() {
		super(MenuBarButtonElement.TAGNAME());
	}
}
