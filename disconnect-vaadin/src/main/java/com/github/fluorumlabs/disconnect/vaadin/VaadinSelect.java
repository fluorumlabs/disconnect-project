package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.polymer.types.StringPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.SelectElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.SelectRenderer;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Element;
import js.web.dom.Event;

import javax.annotation.Nullable;

/**
 * `<vaadin-select>` is a Web Component for selecting values from a list of items. The content of the
 * the select can be populated in two ways: imperatively by using renderer callback function and
 * declaratively by using Polymer's Templates.
 * <p>
 * ### Rendering
 * <p>
 * By default, the select uses the content provided by using the renderer callback function.
 * <p>
 * The renderer function provides `root`, `select` arguments.
 * Generate DOM content, append it to the `root` element and control the state
 * of the host element by accessing `select`.
 * <p>
 * ```html
 * <vaadin-select id="select"></vaadin-select>
 * ```
 * ```js
 * const select = document.querySelector('#select');
 * select.renderer = function(root, select) {
 * const listBox = document.createElement('vaadin-list-box');
 * // append 3 <vaadin-item> elements
 * ['Jose', 'Manolo', 'Pedro'].forEach(function(name) {
 * const item = document.createElement('vaadin-item');
 * item.textContent = name;
 * listBox.appendChild(item);
 * });
 * <p>
 * // update the content
 * root.appendChild(listBox);
 * };
 * ```
 * <p>
 * Renderer is called on initialization of new select and on its opening.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the `root` argument.
 * On first call it will be empty.
 * <p>
 * ### Polymer Templates
 * <p>
 * Alternatively, the content can be provided with Polymer's Template.
 * Select finds the first child template and uses that in case renderer callback function
 * is not provided. You can also set a custom template using the `template` property.
 * <p>
 * ```
 * <vaadin-select>
 * <template>
 * <vaadin-list-box>
 * <vaadin-item label="foo">Foo</vaadin-item>
 * <vaadin-item>Bar</vaadin-item>
 * <vaadin-item>Baz</vaadin-item>
 * </vaadin-list-box>
 * </template>
 * </vaadin-select>
 * ```
 * <p>
 * Hint: By setting the `label` property of inner vaadin-items you will
 * be able to change the visual representation of the selected value in the input part.
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ----------------|----------------
 * `toggle-button` | The toggle button
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|------------
 * `opened` | Set when the select is open | :host
 * `invalid` | Set when the element is invalid | :host
 * `focused` | Set when the element is focused | :host
 * `focus-ring` | Set when the element is keyboard focused | :host
 * `readonly` | Set when the select is read only | :host
 * <p>
 * `<vaadin-select>` element sets these custom CSS properties:
 * <p>
 * Property name | Description | Theme for element
 * --- | --- | ---
 * `--vaadin-select-text-field-width` | Width of the select text field | `vaadin-select-overlay`
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 * <p>
 * In addition to `<vaadin-select>` itself, the following internal
 * components are themable:
 * <p>
 * - `<vaadin-select-text-field>`
 * - `<vaadin-select-overlay>`
 * <p>
 * Note: the `theme` attribute value set on `<vaadin-select>` is
 * propagated to the internal themable components listed above.
 */
public class VaadinSelect extends AbstractComponent<SelectElement>
        implements HasElementMixin<SelectElement, VaadinSelect>,
        HasControlStateMixin<SelectElement, VaadinSelect>,
        HasThemableMixin<SelectElement, VaadinSelect>,
        HasSlottedComponents<SelectElement, VaadinSelect, Component<? extends Element>> {
    public VaadinSelect() {
        super("vaadin-select");
    }

    /**
     * Set when the select is open
     */
    public boolean opened() {
        return getNode().isOpened();
    }

    /**
     * Set when the select is open
     */
    public VaadinSelect opened(boolean opened) {
        getNode().setOpened(opened);
        return this;
    }

    /**
     * Custom function for rendering the content of the `<vaadin-select>`.
     * Receives two arguments:
     * <p>
     * - `root` The `<vaadin-select-overlay>` internal container
     * DOM element. Append your content to it.
     * - `select` The reference to the `<vaadin-select>` element.
     */
    @Nullable
    public SelectRenderer renderer() {
        return getNode().getRenderer();
    }

    /**
     * Custom function for rendering the content of the `<vaadin-select>`.
     * Receives two arguments:
     * <p>
     * - `root` The `<vaadin-select-overlay>` internal container
     * DOM element. Append your content to it.
     * - `select` The reference to the `<vaadin-select>` element.
     */
    public VaadinSelect renderer(SelectRenderer renderer) {
        getNode().setRenderer(renderer);
        return this;
    }

    /**
     * The error message to display when the select value is invalid
     */
    @Nullable
    public String errorMessage() {
        return getNode().getErrorMessage();
    }

    /**
     * The error message to display when the select value is invalid
     */
    public VaadinSelect errorMessage(String errorMessage) {
        getNode().setErrorMessage(errorMessage);
        return this;
    }

    /**
     * String used for the label element.
     */
    @Nullable
    public String label() {
        return getNode().getLabel();
    }

    /**
     * String used for the label element.
     */
    public VaadinSelect label(String label) {
        getNode().setLabel(label);
        return this;
    }

    /**
     * It stores the the `value` property of the selected item, providing the
     * value for iron-form.
     * When there’s an item selected, it's the value of that item, otherwise
     * it's an empty string.
     * On change or initialization, the component finds the item which matches the
     * value and displays it.
     * If no value is provided to the component, it selects the first item without
     * value or empty value.
     * Hint: If you do not want to select any item by default, you can either set all
     * the values of inner vaadin-items, or set the vaadin-select value to
     * an inexistent value in the items list.
     */
    @Nullable
    public String value() {
        return getNode().getValue();
    }

    /**
     * It stores the the `value` property of the selected item, providing the
     * value for iron-form.
     * When there’s an item selected, it's the value of that item, otherwise
     * it's an empty string.
     * On change or initialization, the component finds the item which matches the
     * value and displays it.
     * If no value is provided to the component, it selects the first item without
     * value or empty value.
     * Hint: If you do not want to select any item by default, you can either set all
     * the values of inner vaadin-items, or set the vaadin-select value to
     * an inexistent value in the items list.
     */
    public VaadinSelect value(String value) {
        getNode().setValue(value);
        return this;
    }

    /**
     * The current required state of the select. True if required.
     */
    public boolean required() {
        return getNode().isRequired();
    }

    /**
     * The current required state of the select. True if required.
     */
    public VaadinSelect required(boolean required) {
        getNode().setRequired(required);
        return this;
    }

    /**
     * Set to true if the value is invalid.
     */
    public boolean invalid() {
        return getNode().isInvalid();
    }

    /**
     * Set to true if the value is invalid.
     */
    public VaadinSelect invalid(boolean invalid) {
        getNode().setInvalid(invalid);
        return this;
    }

    /**
     * The name of this element.
     */
    @Nullable
    public String name() {
        return getNode().getName();
    }

    /**
     * The name of this element.
     */
    public VaadinSelect name(String name) {
        getNode().setName(name);
        return this;
    }

    /**
     * A hint to the user of what can be entered in the control.
     * The placeholder will be displayed in the case that there
     * is no item selected, or the selected item has an empty
     * string label, or the selected item has no label and it's
     * DOM content is empty.
     */
    @Nullable
    public String placeholder() {
        return getNode().getPlaceholder();
    }

    /**
     * A hint to the user of what can be entered in the control.
     * The placeholder will be displayed in the case that there
     * is no item selected, or the selected item has an empty
     * string label, or the selected item has no label and it's
     * DOM content is empty.
     */
    public VaadinSelect placeholder(String placeholder) {
        getNode().setPlaceholder(placeholder);
        return this;
    }

    /**
     * When present, it specifies that the element is read-only.
     */
    public boolean readonly() {
        return getNode().isReadonly();
    }

    /**
     * When present, it specifies that the element is read-only.
     */
    public VaadinSelect readonly(boolean readonly) {
        getNode().setReadonly(readonly);
        return this;
    }

    /**
     * Manually invoke existing renderer.
     */
    public void render() {
        getNode().render();
    }

    /**
     * Returns true if `value` is valid, and sets the `invalid` flag appropriately.
     *
     * @return True if the value is valid and sets the `invalid` flag appropriately
     */
    public boolean validate() {
        return getNode().validate();
    }

    /**
     * Fired when the user commits a value change.
     */
    public ObservableEvent<Event> changeEvent() {
        return createEvent("change");
    }

    /**
     * Fired when the `opened` property changes.
     */
    public ObservableEvent<BooleanPropertyChangeEvent> openedChangedEvent() {
        return createEvent("opened-changed");
    }

    /**
     * Fired when the `value` property changes.
     */
    public ObservableEvent<StringPropertyChangeEvent> valueChangedEvent() {
        return createEvent("value-changed");
    }

    /**
     * Fired when the `invalid` property changes.
     */
    public ObservableEvent<BooleanPropertyChangeEvent> InvalidChangedEvent() {
        return createEvent("invalid-changed");
    }

    public VaadinSelect setPrefix(Component<? extends Element> component) {
        return replaceSlotted("prefix", component);
    }

    public VaadinSelect setPrefix(Component<? extends Element>... components) {
        return replaceSlotted("prefix", components);
    }

    public VaadinSelect addToPrefix(Component<? extends Element> component) {
        return addSlotted("prefix", component);
    }

    public VaadinSelect addToPrefix(Component<? extends Element>... components) {
        return addSlotted("prefix", components);
    }

    public VaadinSelect insertToPrefix(Component<? extends Element> component) {
        return insertSlotted("prefix", component);
    }

    public VaadinSelect insertToPrefix(Component<? extends Element>... components) {
        return insertSlotted("prefix", components);
    }

    public VaadinSelect clearPrefix() {
        return removeAllSlotted("prefix");
    }
}
