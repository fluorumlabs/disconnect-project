package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.A11yMixin;
import com.github.fluorumlabs.disconnect.core.components.HasElement;

public interface HasA11yMixin<E extends A11yMixin, T extends HasElement<E>>
		extends HasElement<E> {
}
