package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.HorizontalLayoutElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * `<vaadin-horizontal-layout>` provides a simple way to horizontally align your HTML elements.
 * <p>
 * ```
 * <vaadin-horizontal-layout>
 * <div>Item 1</div>
 * <div>Item 2</div>
 * </vaadin-horizontal-layout>
 * ```
 * <p>
 * ### Built-in Theme Variations
 * <p>
 * `<vaadin-horizontal-layout>` supports the following theme variations:
 * <p>
 * Theme variation | Description
 * ---|---
 * `theme="margin"` | Applies the default amount of CSS margin for the host element (specified by the theme)
 * `theme="padding"` | Applies the default amount of CSS padding for the host element (specified by the theme)
 * `theme="spacing"` | Applies the default amount of CSS margin between items (specified by the theme)
 */
public class VaadinHorizontalLayout extends AbstractComponent<HorizontalLayoutElement>
		implements HasThemableMixin<HorizontalLayoutElement, VaadinHorizontalLayout>,
		HasComponents<HorizontalLayoutElement, VaadinHorizontalLayout, Component<?>> {
	public VaadinHorizontalLayout() {
		super("vaadin-horizontal-layout");
	}
}
