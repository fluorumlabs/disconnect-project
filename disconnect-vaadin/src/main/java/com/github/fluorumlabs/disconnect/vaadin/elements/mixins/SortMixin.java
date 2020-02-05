package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "SortMixin",
        module = "@vaadin/vaadin-grid/src/vaadin-grid-sort-mixin.js"
)
public interface SortMixin extends Element {
    /**
     * When `true`, all `<vaadin-grid-sorter>` are applied for sorting.
     */
    @JSProperty
    boolean isMultiSort();

    /**
     * When `true`, all `<vaadin-grid-sorter>` are applied for sorting.
     */
    @JSProperty
    void setMultiSort(boolean multiSort);
}
