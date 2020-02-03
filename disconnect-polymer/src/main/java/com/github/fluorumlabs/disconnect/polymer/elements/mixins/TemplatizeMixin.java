package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.Element;

@Import(
        symbols = "TemplatizeMixin",
        module = "@polymer/polymer/lib/legacy/legacy-data-mixin.js"
)
public interface TemplatizeMixin extends Polymer, Element {
}
