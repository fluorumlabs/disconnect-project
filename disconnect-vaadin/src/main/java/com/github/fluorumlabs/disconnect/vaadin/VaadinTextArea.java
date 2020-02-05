package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.TextAreaElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasTextFieldMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Element;
import js.web.dom.Event;

/**
 * `<vaadin-text-area>` is a Web Component for text area control in forms.
 * <p>
 * ```html
 * <vaadin-text-area label="Add description">
 * </vaadin-text-area>
 * ```
 * <p>
 * ### Prefixes and suffixes
 * <p>
 * These are child elements of a `<vaadin-text-area>` that are displayed
 * inline with the input, before or after.
 * In order for an element to be considered as a prefix, it must have the slot
 * attribute set to `prefix` (and similarly for `suffix`).
 * <p>
 * ```html
 * <vaadin-text-area label="Add description">
 * <div slot="prefix">Details:</div>
 * <div slot="suffix">The end!</div>
 * </vaadin-text-area>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ----------------|----------------
 * `label` | The label element
 * `input-field` | The element that wraps prefix, value and suffix
 * `value` | The text value element inside the `input-field` element
 * `error-message` | The error message element
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|------------
 * `disabled` | Set to a disabled text field | :host
 * `has-value` | Set when the element has a value | :host
 * `has-label` | Set when the element has a label | :host
 * `invalid` | Set when the element is invalid | :host
 * `focused` | Set when the element is focused | :host
 * `focus-ring` | Set when the element is keyboard focused | :host
 * `readonly` | Set to a readonly text field | :host
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinTextArea extends AbstractComponent<TextAreaElement>
		implements HasTextFieldMixin<TextAreaElement, VaadinTextArea>,
		HasThemableMixin<TextAreaElement, VaadinTextArea>,
		HasSlottedComponents<TextAreaElement, VaadinTextArea, Component<? extends Element>> {
	public VaadinTextArea() {
		super("vaadin-text-area");
	}

	/**
	 * Fired when the text-area height changes.
	 */
	public ObservableEvent<Event> ironResizeEvent() {
		return createEvent("iron-resize");
	}

	public VaadinTextArea setPrefix(Component<? extends Element> component) {
		return replaceSlotted("prefix", component);
	}

	public VaadinTextArea setPrefix(Component<? extends Element>... components) {
		return replaceSlotted("prefix", components);
	}

	public VaadinTextArea addToPrefix(Component<? extends Element> component) {
		return addSlotted("prefix", component);
	}

	public VaadinTextArea addToPrefix(Component<? extends Element>... components) {
		return addSlotted("prefix", components);
	}

	public VaadinTextArea insertToPrefix(Component<? extends Element> component) {
		return insertSlotted("prefix", component);
	}

	public VaadinTextArea insertToPrefix(Component<? extends Element>... components) {
		return insertSlotted("prefix", components);
	}

	public VaadinTextArea clearPrefix() {
		return removeAllSlotted("prefix");
	}

	public VaadinTextArea setTextarea(Component<? extends Element> component) {
		return replaceSlotted("textarea", component);
	}

	public VaadinTextArea setTextarea(Component<? extends Element>... components) {
		return replaceSlotted("textarea", components);
	}

	public VaadinTextArea addToTextarea(Component<? extends Element> component) {
		return addSlotted("textarea", component);
	}

	public VaadinTextArea addToTextarea(Component<? extends Element>... components) {
		return addSlotted("textarea", components);
	}

	public VaadinTextArea insertToTextarea(Component<? extends Element> component) {
		return insertSlotted("textarea", component);
	}

	public VaadinTextArea insertToTextarea(Component<? extends Element>... components) {
		return insertSlotted("textarea", components);
	}

	public VaadinTextArea clearTextarea() {
		return removeAllSlotted("textarea");
	}

	public VaadinTextArea setSuffix(Component<? extends Element> component) {
		return replaceSlotted("suffix", component);
	}

	public VaadinTextArea setSuffix(Component<? extends Element>... components) {
		return replaceSlotted("suffix", components);
	}

	public VaadinTextArea addToSuffix(Component<? extends Element> component) {
		return addSlotted("suffix", component);
	}

	public VaadinTextArea addToSuffix(Component<? extends Element>... components) {
		return addSlotted("suffix", components);
	}

	public VaadinTextArea insertToSuffix(Component<? extends Element> component) {
		return insertSlotted("suffix", component);
	}

	public VaadinTextArea insertToSuffix(Component<? extends Element>... components) {
		return insertSlotted("suffix", components);
	}

	public VaadinTextArea clearSuffix() {
		return removeAllSlotted("suffix");
	}
}
