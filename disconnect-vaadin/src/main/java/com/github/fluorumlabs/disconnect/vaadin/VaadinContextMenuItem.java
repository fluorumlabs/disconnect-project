package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.ContextMenuItemElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * The vaadin-context-menu-item element.
 */
public class VaadinContextMenuItem extends AbstractComponent<ContextMenuItemElement>
		implements HasComponents<ContextMenuItemElement, VaadinContextMenuItem, Component<?>> {
	public VaadinContextMenuItem() {
		super(ContextMenuItemElement.TAGNAME());
	}
}
