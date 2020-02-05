package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ActiveItemMixin;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.lang.Any;

import javax.annotation.Nullable;

public interface HasActiveItemMixin<ITEM extends Any, E extends ActiveItemMixin<ITEM>, T extends Component<E>>
		extends Component<E> {
	/**
	 * The item user has last interacted with. Turns to `null` after user deactivates
	 * the item by re-interacting with the currently active item.
	 */
	@Nullable
	default ITEM activeItem() {
		return getNode().getActiveItem();
	}

	/**
	 * The item user has last interacted with. Turns to `null` after user deactivates
	 * the item by re-interacting with the currently active item.
	 */
	default T activeItem(ITEM activeItem) {
		getNode().setActiveItem(activeItem);
		return (T) this;
	}
}
