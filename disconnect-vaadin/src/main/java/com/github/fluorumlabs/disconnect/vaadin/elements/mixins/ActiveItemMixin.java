package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.lang.Any;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "ActiveItemMixin",
        module = "@vaadin/vaadin-grid/src/vaadin-grid-active-item-mixin.js"
)
public interface ActiveItemMixin<ITEM extends Any> extends Element {
    /**
     * The item user has last interacted with. Turns to `null` after user deactivates
     * the item by re-interacting with the currently active item.
     */
    @Nullable
    @JSProperty
    ITEM getActiveItem();

    /**
     * The item user has last interacted with. Turns to `null` after user deactivates
     * the item by re-interacting with the currently active item.
     */
    @JSProperty
    void setActiveItem(ITEM activeItem);
}
