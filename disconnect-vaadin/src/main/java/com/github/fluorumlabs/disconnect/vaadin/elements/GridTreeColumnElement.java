package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `<vaadin-grid-tree-column>` is a helper element for the `<vaadin-grid>`
 * that provides default template and functionality for toggling tree/hierarchical items.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid items="[[items]]">
 * <vaadin-grid-tree-column path="name.first"></vaadin-grid-tree-column>
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
        symbols = "GridTreeColumnElement",
        module = "@vaadin/vaadin-grid/src/vaadin-grid-tree-column.js"
)
public interface GridTreeColumnElement<ITEM extends Any> extends GridColumnElement<ITEM> {
    /**
     * JS Path of the property in the item that indicates whether the item has child items.
     */
    @Nullable
    @JSProperty
    String getItemHasChildrenPath();

    /**
     * JS Path of the property in the item that indicates whether the item has child items.
     */
    @JSProperty
    void setItemHasChildrenPath(String itemHasChildrenPath);
}
