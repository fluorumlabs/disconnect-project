package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.CrudEditColumnElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

import javax.annotation.Nullable;

/**
 * `<vaadin-crud-edit-column>` is a helper element for the `<vaadin-grid>`
 * that provides a clickable and themable edit icon.
 * <p>
 * Typical usage is in a custom `<vaadin-grid>` inside a `<vaadin-crud>`.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid items="[[items]]">
 * <vaadin-crud-edit-column></vaadin-crud-edit-column>
 * <p>
 * <vaadin-grid-column>
 * ...
 * ```
 */
public class VaadinCrudEditColumn extends AbstractComponent<CrudEditColumnElement>
        implements HasComponents<CrudEditColumnElement, VaadinCrudEditColumn, Component<?>> {
    public VaadinCrudEditColumn() {
        super("vaadin-crud-edit-column");
    }

    /**
     * The arial-label for the edit button
     */
    @Nullable
    public String ariaLabel() {
        return getNode().getAriaLabel();
    }

    /**
     * The arial-label for the edit button
     */
    public VaadinCrudEditColumn ariaLabel(String ariaLabel) {
        getNode().setAriaLabel(ariaLabel);
        return this;
    }
}
