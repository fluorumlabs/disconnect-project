package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.DrawerToggleElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

import javax.annotation.Nullable;

/**
 * The Drawer Toggle component controls the drawer in App Layout component.
 *
 * <pre><code>&lt;vaadin-app-layout&gt;
 *   &lt;vaadin-drawer-toggle slot=&quot;navbar&quot;&gt;Toggle drawer&lt;/vaadin-drawer-toggle&gt;
 * &lt;/vaadin-app-layout&gt;
 * </code></pre>
 */
@WebComponent
public class DrawerToggle extends AbstractComponent<DrawerToggleElement>
		implements HasStyle<DrawerToggleElement, DrawerToggle>, HasComponents<DrawerToggleElement, DrawerToggle, Component<?>> {
	public DrawerToggle() {
		super(DrawerToggleElement.TAGNAME());
	}

	@Nullable
	public String ariaLabel() {
		return getNode().getAriaLabel();
	}

	public DrawerToggle ariaLabel(String ariaLabel) {
		getNode().setAriaLabel(ariaLabel);
		return this;
	}
}
