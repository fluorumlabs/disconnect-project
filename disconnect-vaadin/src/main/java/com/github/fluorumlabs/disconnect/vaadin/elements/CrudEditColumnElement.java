package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "CrudEditColumnElement",
        module = "@vaadin/vaadin-crud/src/vaadin-crud-edit-column.js"
)
public interface CrudEditColumnElement extends HTMLElement {
    /**
     * The arial-label for the edit button
     */
    @Nullable
    @JSProperty
    String getAriaLabel();

    /**
     * The arial-label for the edit button
     */
    @JSProperty
    void setAriaLabel(String ariaLabel);
}
