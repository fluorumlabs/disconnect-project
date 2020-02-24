package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.MenuBarButtonElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

@WebComponent
public class MenuBarButton extends AbstractComponent<MenuBarButtonElement>
		implements HasThemableMixin<Button.Variant, MenuBarButtonElement, MenuBarButton>,
		HasStyle<MenuBarButtonElement, MenuBarButton>, HasComponents<MenuBarButtonElement, MenuBarButton, Component<?>> {
	public MenuBarButton() {
		super(MenuBarButtonElement.TAGNAME());
	}

}
