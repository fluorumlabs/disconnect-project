package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ItemMixin;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;

/**
 * A mixin providing <code>focused</code>, <code>focus-ring</code>, <code>active</code>, <code>disabled</code> and
 * <code>selected</code>.
 *
 * <code>focused</code>, <code>active</code> and <code>focus-ring</code> are set as only as attributes.
 */
public interface HasItemMixin<E extends ItemMixin, T extends HasElement<E>> extends HasElement<E> {
	/**
	 *
	 */
	default String value() {
		return getNode().getValue();
	}

	/**
	 *
	 */
	default T value(String value) {
		getNode().setValue(value);
		return (T) this;
	}

	/**
	 * If true, the user cannot interact with this element.
	 */
	default boolean disabled() {
		return getNode().isDisabled();
	}

	/**
	 * If true, the user cannot interact with this element.
	 */
	default T disabled(boolean disabled) {
		getNode().setDisabled(disabled);
		return (T) this;
	}

	/**
	 * If true, the item is in selected state.
	 */
	default boolean selected() {
		return getNode().isSelected();
	}

	/**
	 * If true, the item is in selected state.
	 */
	default T selected(boolean selected) {
		getNode().setSelected(selected);
		return (T) this;
	}
}
