package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The Drawer Toggle component controls the drawer in App Layout component.
 *
 * <pre><code>&lt;vaadin-app-layout&gt;
 *   &lt;vaadin-drawer-toggle slot=&quot;navbar&quot;&gt;Toggle drawer&lt;/vaadin-drawer-toggle&gt;
 * &lt;/vaadin-app-layout&gt;
 * </code></pre>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "DrawerToggleElement",
		module = "@vaadin/vaadin-app-layout/vaadin-drawer-toggle.js"
)
public interface DrawerToggleElement extends ButtonElement {
	String TAGNAME = "vaadin-drawer-toggle";

	@Nullable
	@JSProperty
	String getAriaLabel();

	@JSProperty
	void setAriaLabel(String ariaLabel);
}
