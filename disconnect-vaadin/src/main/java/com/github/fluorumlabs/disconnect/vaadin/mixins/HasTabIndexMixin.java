package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.TabIndexMixin;
import com.github.fluorumlabs.disconnect.zero.component.Component;

/**
 * A private mixin to avoid problems with dynamic properties and Polymer Analyzer.
 * No need to expose these properties in the API docs.
 */
public interface HasTabIndexMixin<E extends TabIndexMixin, T extends Component<E>> extends Component<E> {
}
