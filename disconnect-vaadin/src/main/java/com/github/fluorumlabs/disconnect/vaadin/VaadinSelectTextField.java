package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.SelectTextFieldElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.web.dom.Element;

/**
 * The text-field element.
 * <p>
 * ### Styling
 * <p>
 * See [`<vaadin-text-field>` documentation](https://github
 * .com/vaadin/vaadin-text-field/blob/master/src/vaadin-text-field.html)
 * for `<vaadin-select-text-field>` parts and available slots (prefix, suffix etc.)
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinSelectTextField extends AbstractComponent<SelectTextFieldElement>
        implements HasComponents<SelectTextFieldElement, VaadinSelectTextField, Component<?>> {
    public VaadinSelectTextField() {
        super("vaadin-select-text-field");
    }

    /**
     *
     */
    public Element focusElement() {
        return getNode().getFocusElement();
    }

    /**
     *
     */
    public Element inputElement() {
        return getNode().getInputElement();
    }
}
