package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.core.components.HasElement;

public interface HasElementMixin<E extends ElementMixin, T extends HasElement<E>> extends HasElement<E> {
}
