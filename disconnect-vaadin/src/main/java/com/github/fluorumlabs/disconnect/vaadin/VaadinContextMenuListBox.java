package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.ContextMenuListBoxElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * The vaadin-context-menu-list-box element.
 */
public class VaadinContextMenuListBox extends AbstractComponent<ContextMenuListBoxElement>
		implements HasComponents<ContextMenuListBoxElement, VaadinContextMenuListBox, Component<?>> {
	public VaadinContextMenuListBox() {
		super("vaadin-context-menu-list-box");
	}
}
