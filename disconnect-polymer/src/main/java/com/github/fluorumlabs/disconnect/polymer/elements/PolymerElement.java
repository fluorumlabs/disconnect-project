package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.ElementMixin;
import js.web.dom.HTMLElement;

/**
 * Base class that provides the core API for Polymer's meta-programming
 * features including template stamping, data-binding, attribute deserialization,
 * and property change observation.
 */
@Import(
        symbols = "PolymerElement",
        module = "@polymer/polymer/polymer-element.js"
)
public interface PolymerElement extends HTMLElement, ElementMixin {
}
