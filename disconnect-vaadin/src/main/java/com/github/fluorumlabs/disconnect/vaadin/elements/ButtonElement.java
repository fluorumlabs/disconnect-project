package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.GestureEventListeners;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;

/**
 * <code>&lt;vaadin-button&gt;</code> is a Web Component providing an accessible and customizable button.
 *
 * <pre><code class="language-html">&lt;vaadin-button&gt;
 * &lt;/vaadin-button&gt;
 * </code></pre>
 * <pre><code class="language-js">document.querySelector('vaadin-button').addEventListener('click', () =&gt; alert
 * ('Hello World!'));
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are exposed for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>label</code></td><td>The label (text) inside the button</td></tr>
 * <tr><td><code>prefix</code></td><td>A slot for e.g. an icon before the label</td></tr>
 * <tr><td><code>suffix</code></td><td>A slot for e.g. an icon after the label</td></tr>
 * </tbody>
 * </table>
 * The following attributes are exposed for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>active</code></td><td>Set when the button is pressed down, either with mouse, touch or the keyboard
 * .</td></tr>
 * <tr><td><code>disabled</code></td><td>Set when the button is disabled.</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the button is focused using the keyboard.</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the button is focused.</td></tr>
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
		module = "@vaadin/vaadin-button/theme/lumo/vaadin-button.js"
)
public interface ButtonElement
		extends HTMLElement, ElementMixin, ControlStateMixin, ThemableMixin, GestureEventListeners {
	static String TAGNAME() {
		return "vaadin-button";
	}
}
