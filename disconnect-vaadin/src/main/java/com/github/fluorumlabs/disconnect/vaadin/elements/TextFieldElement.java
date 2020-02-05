package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.TextFieldMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "TextFieldElement",
        module = "@vaadin/vaadin-text-field/src/vaadin-text-field.js"
)
public interface TextFieldElement extends HTMLElement, TextFieldMixin, ThemableMixin {
    /**
     * Identifies a list of pre-defined options to suggest to the user.
     * The value must be the id of a <datalist> element in the same document.
     */
    @Nullable
    @JSProperty
    String getList();

    /**
     * Identifies a list of pre-defined options to suggest to the user.
     * The value must be the id of a <datalist> element in the same document.
     */
    @JSProperty
    void setList(String list);

    /**
     * A regular expression that the value is checked against.
     * The pattern must match the entire value, not just some subset.
     */
    @Nullable
    @JSProperty
    String getPattern();

    /**
     * A regular expression that the value is checked against.
     * The pattern must match the entire value, not just some subset.
     */
    @JSProperty
    void setPattern(String pattern);
}
