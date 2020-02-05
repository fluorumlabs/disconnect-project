package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.mixins.HasGestureEventListeners;
import com.github.fluorumlabs.disconnect.vaadin.elements.ButtonElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasSlots;

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
public class VaadinButton extends AbstractComponent<ButtonElement>
		implements HasElementMixin<ButtonElement, VaadinButton>,
		HasControlStateMixin<ButtonElement, VaadinButton>,
		HasThemableMixin<ButtonElement, VaadinButton>,
		HasGestureEventListeners<ButtonElement, VaadinButton>,
		HasSlots<ButtonElement>,
		HasComponents<ButtonElement, VaadinButton, Component<?>> {
	public VaadinButton() {
		super("vaadin-button");
	}

	public HasSlots.Container prefix() {
		return slotted("prefix");
	}

	public HasSlots.Container suffix() {
		return slotted("suffix");
	}
}
