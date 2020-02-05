package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.SelectOverlayElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * The overlay element.
 * <p>
 * ### Styling
 * <p>
 * See [`<vaadin-overlay>` documentation](https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html)
 * for `<vaadin-select-overlay>` parts.
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinSelectOverlay extends AbstractComponent<SelectOverlayElement>
		implements HasComponents<SelectOverlayElement, VaadinSelectOverlay, Component<?>> {
	public VaadinSelectOverlay() {
		super("vaadin-select-overlay");
	}
}
