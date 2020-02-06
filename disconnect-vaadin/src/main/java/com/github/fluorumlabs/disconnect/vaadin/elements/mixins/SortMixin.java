package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import js.web.dom.Element;
import org.teavm.jso.JSProperty;


public interface SortMixin extends Element {
	/**
	 * When <code>true</code>, all <code>&lt;vaadin-grid-sorter&gt;</code> are applied for sorting.
	 */
	@JSProperty
	boolean isMultiSort();

	/**
	 * When <code>true</code>, all <code>&lt;vaadin-grid-sorter&gt;</code> are applied for sorting.
	 */
	@JSProperty
	void setMultiSort(boolean multiSort);
}
