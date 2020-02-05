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
 * `<vaadin-checkbox>` is a Web Component for customized checkboxes.
 * <p>
 * ```html
 * <vaadin-checkbox>
 * Make my profile visible
 * </vaadin-checkbox>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name         | Description
 * ------------------|----------------
 * `checkbox`        | The wrapper element for the native <input type="checkbox">
 * `label`           | The wrapper element in which the component's children, namely the label, is slotted
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|--------------
 * `active`     | Set when the checkbox is pressed down, either with mouse, touch or the keyboard. | `:host`
 * `disabled`   | Set when the checkbox is disabled. | `:host`
 * `focus-ring` | Set when the checkbox is focused using the keyboard. | `:host`
 * `focused`    | Set when the checkbox is focused. | `:host`
 * `indeterminate` | Set when the checkbox is in indeterminate mode. | `:host`
 * `checked` | Set when the checkbox is checked. | `:host`
 * `empty` | Set when there is no label provided. | `label`
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "CheckboxElement",
        module = "@vaadin/vaadin-checkbox/src/vaadin-checkbox.js"
)
public interface CheckboxElement
        extends HTMLElement, ElementMixin, ControlStateMixin, ThemableMixin, GestureEventListeners {
    /**
     * Name of the element.
     */
    @JSProperty
    String getName();

    /**
     * Name of the element.
     */
    @JSProperty
    void setName(String name);

    /**
     * True if the checkbox is checked.
     */
    @JSProperty
    boolean isChecked();

    /**
     * True if the checkbox is checked.
     */
    @JSProperty
    void setChecked(boolean checked);

    /**
     * Indeterminate state of the checkbox when it's neither checked nor unchecked, but undetermined.
     * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes
     */
    @JSProperty
    boolean isIndeterminate();

    /**
     * Indeterminate state of the checkbox when it's neither checked nor unchecked, but undetermined.
     * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes
     */
    @JSProperty
    void setIndeterminate(boolean indeterminate);

    /**
     * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
     */
    @Nullable
    @JSProperty
    String getValue();

    /**
     * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
     */
    @JSProperty
    void setValue(String value);
}
