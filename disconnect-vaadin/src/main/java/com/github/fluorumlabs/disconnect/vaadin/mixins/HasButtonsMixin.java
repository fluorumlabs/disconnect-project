package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ButtonsMixin;
import com.github.fluorumlabs.disconnect.core.components.HasElement;

public interface HasButtonsMixin<E extends ButtonsMixin, T extends HasElement<E>> extends HasElement<E> {
	/**
	 * Call this method after updating menu bar <code>items</code> dynamically, including changing
	 * any property on the item object corresponding to one of the menu bar buttons.
	 */
	default void render() {
		getNode().render();
	}
}
