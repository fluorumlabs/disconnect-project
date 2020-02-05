package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.VerticalLayoutElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * `<vaadin-vertical-layout>` provides a simple way to vertically align your HTML elements.
 * <p>
 * ```
 * <vaadin-vertical-layout>
 * <div>Item 1</div>
 * <div>Item 2</div>
 * </vaadin-vertical-layout>
 * ```
 * <p>
 * ### Built-in Theme Variations
 * <p>
 * `<vaadin-vertical-layout>` supports the following theme variations:
 * <p>
 * Theme variation | Description
 * ---|---
 * `theme="margin"` | Applies the default amount of CSS margin for the host element (specified by the theme)
 * `theme="padding"` | Applies the default amount of CSS padding for the host element (specified by the theme)
 * `theme="spacing"` | Applies the default amount of CSS margin between items (specified by the theme)
 */
public class VaadinVerticalLayout extends AbstractComponent<VerticalLayoutElement>
		implements HasThemableMixin<VerticalLayoutElement, VaadinVerticalLayout>,
		HasComponents<VerticalLayoutElement, VaadinVerticalLayout, Component<?>> {
	public VaadinVerticalLayout() {
		super("vaadin-vertical-layout");
	}
}
