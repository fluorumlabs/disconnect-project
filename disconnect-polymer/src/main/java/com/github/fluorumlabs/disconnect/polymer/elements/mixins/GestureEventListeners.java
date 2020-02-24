package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import js.web.dom.Element;

/**
 * Element class mixin that provides API for adding Polymer's cross-platform gesture events to nodes.
 * <p>
 * The API is designed to be compatible with override points implemented in <code>TemplateStamp</code> such that
 * declarative event listeners in templates will support gesture events when this mixin is applied along with
 * <code>TemplateStamp</code>.
 */
public interface GestureEventListeners extends Element {
}
