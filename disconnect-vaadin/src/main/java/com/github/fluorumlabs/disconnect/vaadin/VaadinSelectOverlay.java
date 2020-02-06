package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.SelectOverlayElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * The overlay element.
 *
 * <h3>Styling</h3>
 * See
 * <a href="https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html"><code>&lt;vaadin-overlay&gt;</code> documentation</a>
 * for <code>&lt;vaadin-select-overlay&gt;</code> parts.
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinSelectOverlay extends AbstractComponent<SelectOverlayElement>
		implements HasComponents<SelectOverlayElement, VaadinSelectOverlay, Component<?>> {
	public VaadinSelectOverlay() {
		super(SelectOverlayElement.TAGNAME());
	}
}
