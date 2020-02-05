package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The Drawer Toggle component controls the drawer in App Layout component.
 * <p>
 * ```
 * <vaadin-app-layout>
 * <vaadin-drawer-toggle slot="navbar">Toggle drawer</vaadin-drawer-toggle>
 * </vaadin-app-layout>
 * ```
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "DrawerToggleElement",
		module = "@vaadin/vaadin-app-layout/src/vaadin-drawer-toggle.js"
)
public interface DrawerToggleElement extends ButtonElement {
	@Nullable
	@JSProperty
	String getAriaLabel();

	@JSProperty
	void setAriaLabel(String ariaLabel);
}
