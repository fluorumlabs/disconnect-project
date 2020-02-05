package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.ComboBoxLightElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasComboBoxDataProviderMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasComboBoxMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.lang.Any;
import js.web.dom.Element;

import javax.annotation.Nullable;

/**
 * `<vaadin-combo-box-light>` is a customizable version of the `<vaadin-combo-box>` providing
 * only the dropdown functionality and leaving the input field definition to the user.
 * <p>
 * The element has the same API as `<vaadin-combo-box>`.
 * <p>
 * To create a custom input field, you need to add a child element which has a two-way
 * data-bindable property representing the input value. The property name is expected
 * to be `value` by default. See the example below for a simplest possible example
 * using a `<vaadin-text-field>` element.
 * <p>
 * ```html
 * <vaadin-combo-box-light>
 * <vaadin-text-field>
 * </vaadin-text-field>
 * </vaadin-combo-box-light>
 * ```
 * <p>
 * If you are using other custom input fields like `<iron-input>`, you
 * need to define the name of the bindable property with the `attrForValue` attribute.
 * <p>
 * ```html
 * <vaadin-combo-box-light attr-for-value="bind-value">
 * <iron-input>
 * <input>
 * </iron-input>
 * </vaadin-combo-box-light>
 * ```
 * <p>
 * In the next example you can see how to create a custom input field based
 * on a `<paper-input>` decorated with a custom `<iron-icon>` and
 * two `<paper-button>`s to act as the clear and toggle controls.
 * <p>
 * ```html
 * <vaadin-combo-box-light>
 * <paper-input label="Elements" class="input">
 * <iron-icon icon="toll" slot="prefix"></iron-icon>
 * <paper-button slot="suffix" class="clear-button">Clear</paper-button>
 * <paper-button slot="suffix" class="toggle-button">Toggle</paper-button>
 * </paper-input>
 * </vaadin-combo-box-light>
 * ```
 */
public class VaadinComboBoxLight<ITEM extends Any> extends AbstractComponent<ComboBoxLightElement<ITEM>>
        implements HasComboBoxDataProviderMixin<ITEM, ComboBoxLightElement<ITEM>, VaadinComboBoxLight<ITEM>>,
        HasComboBoxMixin<ITEM, ComboBoxLightElement<ITEM>, VaadinComboBoxLight<ITEM>>,
        HasThemableMixin<ComboBoxLightElement<ITEM>, VaadinComboBoxLight<ITEM>>,
        HasComponents<ComboBoxLightElement<ITEM>, VaadinComboBoxLight<ITEM>, Component<?>> {
    public VaadinComboBoxLight() {
        super("vaadin-combo-box-light");
    }

    /**
     *
     */
    public Element focused() {
        return getNode().getFocused();
    }

    /**
     * Name of the two-way data-bindable property representing the
     * value of the custom input field.
     */
    @Nullable
    public String attrForValue() {
        return getNode().getAttrForValue();
    }

    /**
     * Name of the two-way data-bindable property representing the
     * value of the custom input field.
     */
    public VaadinComboBoxLight<ITEM> attrForValue(String attrForValue) {
        getNode().setAttrForValue(attrForValue);
        return this;
    }

    @Nullable
    public Element inputElement() {
        return getNode().getInputElement();
    }
}
