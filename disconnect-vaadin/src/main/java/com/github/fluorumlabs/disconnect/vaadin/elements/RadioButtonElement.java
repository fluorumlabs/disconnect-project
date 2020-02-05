package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.GestureEventListeners;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `<vaadin-radio-button>` is a Web Component for radio buttons.
 * <p>
 * ```html
 * <vaadin-radio-button value="foo">Foo</vaadin-radio-button>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name         | Description
 * ------------------|----------------
 * `radio`           | The radio button element
 * `label`           | The label content element
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute  | Description | Part name
 * -----------|-------------|------------
 * `disabled`   | Set when the radio button is disabled. | :host
 * `focus-ring` | Set when the radio button is focused using the keyboard. | :host
 * `focused`    | Set when the radio button is focused. | :host
 * `checked`    | Set when the radio button is checked. | :host
 * `empty`      | Set when there is no label provided. | label
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "RadioButtonElement",
        module = "@vaadin/vaadin-radio-button/src/vaadin-radio-button.js"
)
public interface RadioButtonElement
        extends HTMLElement, ElementMixin, ControlStateMixin, ThemableMixin, GestureEventListeners {
    /**
     * Name of the element.
     */
    @Nullable
    @JSProperty
    String getName();

    /**
     * Name of the element.
     */
    @JSProperty
    void setName(String name);

    /**
     * True if the radio button is checked.
     */
    @JSProperty
    boolean isChecked();

    /**
     * True if the radio button is checked.
     */
    @JSProperty
    void setChecked(boolean checked);

    /**
     * The value for this element.
     */
    @Nullable
    @JSProperty
    String getValue();

    /**
     * The value for this element.
     */
    @JSProperty
    void setValue(String value);
}
