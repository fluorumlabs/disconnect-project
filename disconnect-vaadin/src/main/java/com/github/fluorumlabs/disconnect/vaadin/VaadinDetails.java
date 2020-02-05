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
 * `<vaadin-details>` is a Web Component which the creates an
 * expandable panel similar to `<details>` HTML element.
 * <p>
 * ```
 * <vaadin-details>
 * <div slot="summary">Expandable Details</div>
 * Toggle using mouse, Enter and Space keys.
 * </vaadin-details>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are exposed for styling:
 * <p>
 * Part name        | Description
 * -----------------|----------------
 * `summary`        | The element used to open and close collapsible content.
 * `toggle`         | The element used as indicator, can represent an icon.
 * `summary-content`| The wrapper for the slotted summary content.
 * `content`        | The wrapper for the collapsible details content.
 * <p>
 * The following attributes are exposed for styling:
 * <p>
 * Attribute    | Description
 * -------------| -----------
 * `opened`     | Set when the collapsible content is expanded and visible.
 * `disabled`   | Set when the element is disabled.
 * `focus-ring` | Set when the element is focused using the keyboard.
 * `focused`    | Set when the element is focused.
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
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
	 * Fired when the `opened` property changes.
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
