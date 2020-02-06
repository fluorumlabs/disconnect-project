package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.TextAreaElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasTextFieldMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasSlots;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Event;

/**
 * <code>&lt;vaadin-text-area&gt;</code> is a Web Component for text area control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-text-area label=&quot;Add description&quot;&gt;
 * &lt;/vaadin-text-area&gt;
 * </code></pre>
 * <h3>Prefixes and suffixes</h3>
 * These are child elements of a <code>&lt;vaadin-text-area&gt;</code> that are displayed
 * inline with the input, before or after.
 * In order for an element to be considered as a prefix, it must have the slot
 * attribute set to <code>prefix</code> (and similarly for <code>suffix</code>).
 *
 * <pre><code class="language-html">&lt;vaadin-text-area label=&quot;Add description&quot;&gt;
 *   &lt;div slot=&quot;prefix&quot;&gt;Details:&lt;/div&gt;
 *   &lt;div slot=&quot;suffix&quot;&gt;The end!&lt;/div&gt;
 * &lt;/vaadin-text-area&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>label</code></td><td>The label element</td></tr>
 * <tr><td><code>input-field</code></td><td>The element that wraps prefix, value and suffix</td></tr>
 * <tr><td><code>value</code></td><td>The text value element inside the <code>input-field</code> element</td></tr>
 * <tr><td><code>error-message</code></td><td>The error message element</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set to a disabled text field</td><td>:host</td></tr>
 * <tr><td><code>has-value</code></td><td>Set when the element has a value</td><td>:host</td></tr>
 * <tr><td><code>has-label</code></td><td>Set when the element has a label</td><td>:host</td></tr>
 * <tr><td><code>invalid</code></td><td>Set when the element is invalid</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the element is focused</td><td>:host</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the element is keyboard focused</td><td>:host</td></tr>
 * <tr><td><code>readonly</code></td><td>Set to a readonly text field</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinTextArea extends AbstractComponent<TextAreaElement>
		implements HasTextFieldMixin<TextAreaElement, VaadinTextArea>,
		HasThemableMixin<TextAreaElement, VaadinTextArea>,
		HasSlots<TextAreaElement>,
		HasComponents<TextAreaElement, VaadinTextArea, Component<?>> {
	public VaadinTextArea() {
		super(TextAreaElement.TAGNAME());
	}

	/**
	 * Fired when the text-area height changes.
	 */
	public ObservableEvent<Event> ironResizeEvent() {
		return createEvent("iron-resize");
	}

	public HasSlots.Container prefixSlot() {
		return slotted("prefix");
	}

	public HasSlots.Container textareaSlot() {
		return slotted("textarea");
	}

	public HasSlots.Container suffixSlot() {
		return slotted("suffix");
	}
}
