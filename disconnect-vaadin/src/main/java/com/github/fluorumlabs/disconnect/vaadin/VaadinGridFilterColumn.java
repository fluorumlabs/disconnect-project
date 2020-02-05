package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridFilterColumnElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.lang.Any;

import javax.annotation.Nullable;

/**
 * `<vaadin-grid-filter-column>` is a helper element for the `<vaadin-grid>`
 * that provides default header template and functionality for filtering.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid items="[[items]]">
 * <vaadin-grid-filter-column path="name.first"></vaadin-grid-filter-column>
 * <p>
 * <vaadin-grid-column>
 * ...
 * ```
 */
public class VaadinGridFilterColumn<ITEM extends Any> extends AbstractComponent<GridFilterColumnElement<ITEM>>
        implements HasComponents<GridFilterColumnElement<ITEM>, VaadinGridFilterColumn<ITEM>, Component<?>> {
    public VaadinGridFilterColumn() {
        super("vaadin-grid-filter-column");
    }

    /**
     * JS Path of the property in the item used for filtering the data.
     */
    @Nullable
    public String path() {
        return getNode().getPath();
    }

    /**
     * JS Path of the property in the item used for filtering the data.
     */
    public VaadinGridFilterColumn<ITEM> path(String path) {
        getNode().setPath(path);
        return this;
    }

    /**
     * Text to display as the label of the column filter text-field.
     */
    @Nullable
    public String header() {
        return getNode().getHeader();
    }

    /**
     * Text to display as the label of the column filter text-field.
     */
    public VaadinGridFilterColumn<ITEM> header(String header) {
        getNode().setHeader(header);
        return this;
    }
}
