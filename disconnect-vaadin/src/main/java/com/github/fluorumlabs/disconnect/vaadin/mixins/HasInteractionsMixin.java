package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.InteractionsMixin;
import com.github.fluorumlabs.disconnect.core.components.HasElement;

public interface HasInteractionsMixin<E extends InteractionsMixin, T extends HasElement<E>> extends HasElement<E> {
	/**
	 * If true, the submenu will open on hover (mouseover) instead of click.
	 */
	default boolean openOnHover() {
		return getNode().isOpenOnHover();
	}

	/**
	 * If true, the submenu will open on hover (mouseover) instead of click.
	 */
	default T openOnHover(boolean openOnHover) {
		getNode().setOpenOnHover(openOnHover);
		return (T) this;
	}
}
