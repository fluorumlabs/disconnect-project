package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.TextFieldElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasTextFieldMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import js.web.dom.Element;

import javax.annotation.Nullable;

/**
 * `<vaadin-text-field>` is a Web Component for text field control in forms.
 * <p>
 * ```html
 * <vaadin-text-field label="First Name">
 * </vaadin-text-field>
 * ```
 * <p>
 * ### Prefixes and suffixes
 * <p>
 * These are child elements of a `<vaadin-text-field>` that are displayed
 * inline with the input, before or after.
 * In order for an element to be considered as a prefix, it must have the slot
 * attribute set to `prefix` (and similarly for `suffix`).
 * <p>
 * ```html
 * <vaadin-text-field label="Email address">
 * <div slot="prefix">Sent to:</div>
 * <div slot="suffix">@vaadin.com</div>
 * </vaadin-text-area>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following custom properties are available for styling:
 * <p>
 * Custom property | Description | Default
 * ----------------|-------------|-------------
 * `--vaadin-text-field-default-width` | Set the default width of the input field | `12em`
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
 * `input-prevented` | Temporarily set when invalid input is prevented | :host
 * `focused` | Set when the element is focused | :host
 * `focus-ring` | Set when the element is keyboard focused | :host
 * `readonly` | Set to a readonly text field | :host
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinTextField extends AbstractComponent<TextFieldElement>
        implements HasTextFieldMixin<TextFieldElement, VaadinTextField>,
        HasThemableMixin<TextFieldElement, VaadinTextField>,
        HasSlottedComponents<TextFieldElement, VaadinTextField, Component<? extends Element>> {
    public VaadinTextField() {
        super("vaadin-text-field");
    }

    /**
     * Identifies a list of pre-defined options to suggest to the user.
     * The value must be the id of a <datalist> element in the same document.
     */
    @Nullable
    public String list() {
        return getNode().getList();
    }

    /**
     * Identifies a list of pre-defined options to suggest to the user.
     * The value must be the id of a <datalist> element in the same document.
     */
    public VaadinTextField list(String list) {
        getNode().setList(list);
        return this;
    }

    /**
     * A regular expression that the value is checked against.
     * The pattern must match the entire value, not just some subset.
     */
    @Nullable
    public String pattern() {
        return getNode().getPattern();
    }

    /**
     * A regular expression that the value is checked against.
     * The pattern must match the entire value, not just some subset.
     */
    public VaadinTextField pattern(String pattern) {
        getNode().setPattern(pattern);
        return this;
    }

    /**
     * The text usually displayed in a tooltip popup when the mouse is over the field.
     */
    @Nullable
    public String title() {
        return getNode().getTitle();
    }

    /**
     * The text usually displayed in a tooltip popup when the mouse is over the field.
     */
    public VaadinTextField title(String title) {
        getNode().setTitle(title);
        return this;
    }

    public VaadinTextField setPrefix(Component<? extends Element> component) {
        return replaceSlotted("prefix", component);
    }

    public VaadinTextField setPrefix(Component<? extends Element>... components) {
        return replaceSlotted("prefix", components);
    }

    public VaadinTextField addToPrefix(Component<? extends Element> component) {
        return addSlotted("prefix", component);
    }

    public VaadinTextField addToPrefix(Component<? extends Element>... components) {
        return addSlotted("prefix", components);
    }

    public VaadinTextField insertToPrefix(Component<? extends Element> component) {
        return insertSlotted("prefix", component);
    }

    public VaadinTextField insertToPrefix(Component<? extends Element>... components) {
        return insertSlotted("prefix", components);
    }

    public VaadinTextField clearPrefix() {
        return removeAllSlotted("prefix");
    }

    public VaadinTextField setInput(Component<? extends Element> component) {
        return replaceSlotted("input", component);
    }

    public VaadinTextField setInput(Component<? extends Element>... components) {
        return replaceSlotted("input", components);
    }

    public VaadinTextField addToInput(Component<? extends Element> component) {
        return addSlotted("input", component);
    }

    public VaadinTextField addToInput(Component<? extends Element>... components) {
        return addSlotted("input", components);
    }

    public VaadinTextField insertToInput(Component<? extends Element> component) {
        return insertSlotted("input", component);
    }

    public VaadinTextField insertToInput(Component<? extends Element>... components) {
        return insertSlotted("input", components);
    }

    public VaadinTextField clearInput() {
        return removeAllSlotted("input");
    }

    public VaadinTextField setSuffix(Component<? extends Element> component) {
        return replaceSlotted("suffix", component);
    }

    public VaadinTextField setSuffix(Component<? extends Element>... components) {
        return replaceSlotted("suffix", components);
    }

    public VaadinTextField addToSuffix(Component<? extends Element> component) {
        return addSlotted("suffix", component);
    }

    public VaadinTextField addToSuffix(Component<? extends Element>... components) {
        return addSlotted("suffix", components);
    }

    public VaadinTextField insertToSuffix(Component<? extends Element> component) {
        return insertSlotted("suffix", component);
    }

    public VaadinTextField insertToSuffix(Component<? extends Element>... components) {
        return insertSlotted("suffix", components);
    }

    public VaadinTextField clearSuffix() {
        return removeAllSlotted("suffix");
    }
}
