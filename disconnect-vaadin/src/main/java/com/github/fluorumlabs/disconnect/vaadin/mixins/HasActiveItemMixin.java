package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ActiveItemMixin;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import js.lang.Any;

import javax.annotation.Nullable;

public interface HasActiveItemMixin<ITEM extends Any, E extends ActiveItemMixin<ITEM>, T extends HasElement<E>>
		extends HasElement<E> {
	/**
	 * The item user has last interacted with. Turns to <code>null</code> after user deactivates
	 * the item by re-interacting with the currently active item.
	 */
	@Nullable
	default ITEM activeItem() {
		return getNode().getActiveItem();
	}

	/**
	 * The item user has last interacted with. Turns to <code>null</code> after user deactivates
	 * the item by re-interacting with the currently active item.
	 */
	default T activeItem(ITEM activeItem) {
		getNode().setActiveItem(activeItem);
		return (T) this;
	}
}
