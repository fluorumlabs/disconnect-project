package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.Element;

@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "DynamicColumnsMixin",
        module = "@vaadin/vaadin-grid/src/vaadin-grid-dynamic-columns-mixin.js"
)
public interface DynamicColumnsMixin extends Element {
}
