package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.ContextMenuListBoxElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

/**
 * The vaadin-context-menu-list-box element.
 */
@WebComponent
public class ContextMenuListBox extends AbstractComponent<ContextMenuListBoxElement>
		implements HasStyle<ContextMenuListBoxElement, ContextMenuListBox>, HasComponents<ContextMenuListBoxElement, ContextMenuListBox, HasElement<?>> {
	public ContextMenuListBox() {
		super(ContextMenuListBoxElement.TAGNAME());
	}
}
