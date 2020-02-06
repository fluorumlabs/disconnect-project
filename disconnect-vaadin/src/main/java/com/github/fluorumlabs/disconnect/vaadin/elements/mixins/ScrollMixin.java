package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import js.web.dom.Element;


public interface ScrollMixin extends Element {
	/**
	 * Scroll to a specific row index in the virtual list. Note that the row index is
	 * not always the same for any particular item. For example, sorting/filtering/expanding
	 * or collapsing hierarchical items can affect the row index related to an item.
	 *
	 * @param index Row index to scroll to
	 */
	void scrollToIndex(int index);
}
