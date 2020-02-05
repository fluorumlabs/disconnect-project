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
        symbols = "InteractionsMixin",
        module = "@vaadin/vaadin-menu-bar/src/vaadin-menu-bar-interactions-mixin.js"
)
public interface InteractionsMixin extends Element {
    /**
     * If true, the submenu will open on hover (mouseover) instead of click.
     */
    @JSProperty
    boolean isOpenOnHover();

    /**
     * If true, the submenu will open on hover (mouseover) instead of click.
     */
    @JSProperty
    void setOpenOnHover(boolean openOnHover);
}
