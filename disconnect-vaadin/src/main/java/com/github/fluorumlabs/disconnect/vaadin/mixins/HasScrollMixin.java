package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ScrollMixin;
import com.github.fluorumlabs.disconnect.zero.component.Component;

public interface HasScrollMixin<E extends ScrollMixin, T extends Component<E>> extends Component<E> {
	/**
	 * Scroll to a specific row index in the virtual list. Note that the row index is
	 * not always the same for any particular item. For example, sorting/filtering/expanding
	 * or collapsing hierarchical items can affect the row index related to an item.
	 *
	 * @param index Row index to scroll to
	 */
	default void scrollToIndex(int index) {
		getNode().scrollToIndex(index);
	}
}
