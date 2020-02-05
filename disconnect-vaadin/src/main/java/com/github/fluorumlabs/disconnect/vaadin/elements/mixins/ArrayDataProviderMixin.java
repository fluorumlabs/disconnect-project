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
        symbols = "ArrayDataProviderMixin",
        module = "@vaadin/vaadin-grid/src/vaadin-grid-array-data-provider-mixin.js"
)
public interface ArrayDataProviderMixin<ITEM extends Any> extends Element {
    /**
     * An array containing the items which will be stamped to the column template
     * instances.
     */
    @Nullable
    @JSProperty
    Array<ITEM> getItems();

    /**
     * An array containing the items which will be stamped to the column template
     * instances.
     */
    @JSProperty
    void setItems(@JSByRef ITEM... items);

    @JSProperty
    void setItems(Array<ITEM> items);
}
