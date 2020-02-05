package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "SelectionMixin",
        module = "@vaadin/vaadin-grid/src/vaadin-grid-selection-mixin.js"
)
public interface SelectionMixin<ITEM extends Any> extends Element {
    /**
     * An array that contains the selected items.
     */
    @Nullable
    @JSProperty
    Array<ITEM> getSelectedItems();

    /**
     * An array that contains the selected items.
     */
    @JSProperty
    void setSelectedItems(@JSByRef ITEM... selectedItems);

    @JSProperty
    void setSelectedItems(Array<ITEM> selectedItems);

    /**
     * Selects the given item.
     *
     * @param item The item object
     */
    void selectItem(ITEM item);

    /**
     * Deselects the given item if it is already selected.
     *
     * @param item The item object
     */
    void deselectItem(ITEM item);
}
