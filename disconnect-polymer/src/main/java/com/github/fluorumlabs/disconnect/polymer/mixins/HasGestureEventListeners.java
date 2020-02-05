package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.GestureEventListeners;
import com.github.fluorumlabs.disconnect.zero.component.Component;

/**
 * Element class mixin that provides API for adding Polymer's cross-platform
 * gesture events to nodes.
 * <p>
 * The API is designed to be compatible with override points implemented
 * in `TemplateStamp` such that declarative event listeners in
 * templates will support gesture events when this mixin is applied along with
 * `TemplateStamp`.
 */
public interface HasGestureEventListeners<E extends GestureEventListeners, T extends Component<E>>
		extends Component<E> {
}
