package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.DetailsElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Element;

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
public class VaadinDetails extends AbstractComponent<DetailsElement>
		implements HasControlStateMixin<DetailsElement, VaadinDetails>,
		HasElementMixin<DetailsElement, VaadinDetails>,
		HasThemableMixin<DetailsElement, VaadinDetails>,
		HasSlottedComponents<DetailsElement, VaadinDetails, Component<? extends Element>> {
	public VaadinDetails() {
		super("vaadin-details");
	}

	/**
	 * If true, the details content is visible.
	 */
	public boolean opened() {
		return getNode().isOpened();
	}

	/**
	 * If true, the details content is visible.
	 */
	public VaadinDetails opened(boolean opened) {
		getNode().setOpened(opened);
		return this;
	}

	/**
	 * Fired when the <code>opened</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> openedChangedEvent() {
		return createEvent("opened-changed");
	}

	public VaadinDetails setSummary(Component<? extends Element> component) {
		return replaceSlotted("summary", component);
	}

	public VaadinDetails setSummary(Component<? extends Element>... components) {
		return replaceSlotted("summary", components);
	}

	public VaadinDetails addToSummary(Component<? extends Element> component) {
		return addSlotted("summary", component);
	}

	public VaadinDetails addToSummary(Component<? extends Element>... components) {
		return addSlotted("summary", components);
	}

	public VaadinDetails insertToSummary(Component<? extends Element> component) {
		return insertSlotted("summary", component);
	}

	public VaadinDetails insertToSummary(Component<? extends Element>... components) {
		return insertSlotted("summary", components);
	}

	public VaadinDetails clearSummary() {
		return removeAllSlotted("summary");
	}
}
