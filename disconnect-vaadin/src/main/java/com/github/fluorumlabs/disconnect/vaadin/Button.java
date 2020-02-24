package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.polymer.mixins.HasGestureEventListeners;
import com.github.fluorumlabs.disconnect.vaadin.elements.ButtonElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.ThemeVariant;
import com.github.fluorumlabs.disconnect.zero.component.*;
import js.extras.JsEnum;

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
@WebComponent
public class Button extends AbstractComponent<ButtonElement>
		implements HasElementMixin<ButtonElement, Button>,
		HasControlStateMixin<ButtonElement, Button>,
		HasThemableMixin<Button.Variant, ButtonElement, Button>,
		HasGestureEventListeners<ButtonElement, Button>,
		HasSlots<ButtonElement>,
		HasStyle<ButtonElement, Button>, HasComponents<ButtonElement, Button, Component<?>> {
	public Button() {
		super(ButtonElement.TAGNAME());
	}

	public HasSlots.Container prefix() {
		return slotted("prefix");
	}

	public HasSlots.Container suffix() {
		return slotted("suffix");
	}

	public abstract static class Variant extends ThemeVariant {
		public static final Variant SMALL = JsEnum.of("small");

		public static final Variant LARGE = JsEnum.of("large");

		public static final Variant TERTIARY = JsEnum.of("tertiary");

		public static final Variant TERTIARY_INLINE = JsEnum.of("tertiary-inline");

		public static final Variant PRIMARY = JsEnum.of("primary");

		public static final Variant SUCCESS = JsEnum.of("success");

		public static final Variant ERROR = JsEnum.of("error");

		public static final Variant CONTRAST = JsEnum.of("contrast");

		public static final Variant ICON = JsEnum.of("icon");
	}

}
