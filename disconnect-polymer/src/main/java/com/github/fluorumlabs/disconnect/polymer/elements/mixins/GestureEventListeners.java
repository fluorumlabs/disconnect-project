package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.Element;

/**
 * Element class mixin that provides API for adding Polymer's cross-platform
 * gesture events to nodes.
 * <p>
 * The API is designed to be compatible with override points implemented
 * in `TemplateStamp` such that declarative event listeners in
 * templates will support gesture events when this mixin is applied along with
 * `TemplateStamp`.
 */
@Import(
        symbols = "GestureEventListeners",
        module = "@polymer/polymer/lib/mixins/gesture-event-listeners.js"
)
public interface GestureEventListeners extends Polymer, Element {
}
