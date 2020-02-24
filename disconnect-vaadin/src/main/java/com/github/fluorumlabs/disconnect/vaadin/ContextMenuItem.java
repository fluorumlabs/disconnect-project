package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.ContextMenuItemElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

/**
 * The vaadin-context-menu-item element.
 */
@WebComponent
public class ContextMenuItem extends AbstractComponent<ContextMenuItemElement>
		implements HasStyle<ContextMenuItemElement, ContextMenuItem>, HasComponents<ContextMenuItemElement, ContextMenuItem, Component<?>> {
	public ContextMenuItem() {
		super(ContextMenuItemElement.TAGNAME());
	}
}
