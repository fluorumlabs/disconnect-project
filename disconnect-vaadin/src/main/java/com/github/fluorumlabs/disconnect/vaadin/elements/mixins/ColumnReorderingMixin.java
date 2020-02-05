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
        symbols = "ColumnReorderingMixin",
        module = "@vaadin/vaadin-grid/src/vaadin-grid-column-reordering-mixin.js"
)
public interface ColumnReorderingMixin extends Element {
    /**
     * Set to true to allow column reordering.
     */
    @JSProperty
    boolean isColumnReorderingAllowed();

    /**
     * Set to true to allow column reordering.
     */
    @JSProperty
    void setColumnReorderingAllowed(boolean columnReorderingAllowed);
}
