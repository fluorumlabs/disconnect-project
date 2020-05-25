package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.DetailsElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.ThemeVariant;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import js.extras.JsEnum;

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
@WebComponent
public class Details extends AbstractComponent<DetailsElement>
		implements HasControlStateMixin<DetailsElement, Details>,
		HasElementMixin<DetailsElement, Details>,
		HasThemableMixin<Details.Variant, DetailsElement, Details>,
		HasSlots<DetailsElement>,
		HasStyle<DetailsElement, Details>, HasComponents<DetailsElement, Details, HasElement<?>> {
	public Details() {
		super(DetailsElement.TAGNAME());
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
	public Details opened(boolean opened) {
		getNode().setOpened(opened);
		return this;
	}

	/**
	 * Fired when the <code>opened</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> openedChangedEvent() {
		return createEvent("opened-changed");
	}

	public HasSlots.Container summarySlot() {
		return slotted("summary");
	}

	public abstract static class Variant extends ThemeVariant {
		public static final Variant FILLED = JsEnum.of("filled");

		public static final Variant SMALL = JsEnum.of("small");

		public static final Variant REVERSE = JsEnum.of("reverse");
	}

}
