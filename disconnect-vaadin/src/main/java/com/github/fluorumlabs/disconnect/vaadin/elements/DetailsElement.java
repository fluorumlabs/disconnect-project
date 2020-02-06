package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-details&gt;</code> is a Web Component which the creates an
 * expandable panel similar to <code>&lt;details&gt;</code> HTML element.
 *
 * <pre><code>&lt;vaadin-details&gt;
 *   &lt;div slot=&quot;summary&quot;&gt;Expandable Details&lt;/div&gt;
 *   Toggle using mouse, Enter and Space keys.
 * &lt;/vaadin-details&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are exposed for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>summary</code></td><td>The element used to open and close collapsible content.</td></tr>
 * <tr><td><code>toggle</code></td><td>The element used as indicator, can represent an icon.</td></tr>
 * <tr><td><code>summary-content</code></td><td>The wrapper for the slotted summary content.</td></tr>
 * <tr><td><code>content</code></td><td>The wrapper for the collapsible details content.</td></tr>
 * </tbody>
 * </table>
 * The following attributes are exposed for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>opened</code></td><td>Set when the collapsible content is expanded and visible.</td></tr>
 * <tr><td><code>disabled</code></td><td>Set when the element is disabled.</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the element is focused using the keyboard.</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the element is focused.</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "DetailsElement",
		module = "@vaadin/vaadin-details/vaadin-details.js"
)
public interface DetailsElement extends HTMLElement, ControlStateMixin, ElementMixin, ThemableMixin {
	String TAGNAME = "vaadin-details";

	/**
	 * If true, the details content is visible.
	 */
	@JSProperty
	boolean isOpened();

	/**
	 * If true, the details content is visible.
	 */
	@JSProperty
	void setOpened(boolean opened);
}
