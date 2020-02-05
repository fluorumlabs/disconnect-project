package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.DrawerToggleElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

import javax.annotation.Nullable;

/**
 * The Drawer Toggle component controls the drawer in App Layout component.
 *
 * <pre><code>&lt;vaadin-app-layout&gt;
 *   &lt;vaadin-drawer-toggle slot=&quot;navbar&quot;&gt;Toggle drawer&lt;/vaadin-drawer-toggle&gt;
 * &lt;/vaadin-app-layout&gt;
 * </code></pre>
 */
public class VaadinDrawerToggle extends AbstractComponent<DrawerToggleElement>
		implements HasComponents<DrawerToggleElement, VaadinDrawerToggle, Component<?>> {
	public VaadinDrawerToggle() {
		super("vaadin-drawer-toggle");
	}

	@Nullable
	public String ariaLabel() {
		return getNode().getAriaLabel();
	}

	public VaadinDrawerToggle ariaLabel(String ariaLabel) {
		getNode().setAriaLabel(ariaLabel);
		return this;
	}
}
