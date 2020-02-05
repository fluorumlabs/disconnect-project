package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.IntegerFieldElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * `<vaadin-integer-field>` is a Web Component for integer field control in forms.
 * <p>
 * ```html
 * <vaadin-integer-field label="Number">
 * </vaadin-integer-field>
 * ```
 */
public class VaadinIntegerField extends AbstractComponent<IntegerFieldElement>
        implements HasComponents<IntegerFieldElement, VaadinIntegerField, Component<?>> {
    public VaadinIntegerField() {
        super("vaadin-integer-field");
    }
}
