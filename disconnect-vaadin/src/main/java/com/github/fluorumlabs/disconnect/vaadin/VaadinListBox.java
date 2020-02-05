package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.ListBoxElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasMultiSelectListMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * `<vaadin-list-box>` is a Web Component for creating menus.
 * <p>
 * ```
 * <vaadin-list-box selected="2">
 * <vaadin-item>Item 1</vaadin-item>
 * <vaadin-item>Item 2</vaadin-item>
 * <vaadin-item>Item 3</vaadin-item>
 * <vaadin-item>Item 4</vaadin-item>
 * </vaadin-list-box>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name         | Description
 * ------------------|------------------------
 * `items`           | The items container
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinListBox extends AbstractComponent<ListBoxElement>
		implements HasMultiSelectListMixin<ListBoxElement, VaadinListBox>,
		HasThemableMixin<ListBoxElement, VaadinListBox>,
		HasComponents<ListBoxElement, VaadinListBox, Component<?>> {
	public VaadinListBox() {
		super("vaadin-list-box");
	}
}
