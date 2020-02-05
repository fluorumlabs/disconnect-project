package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.CrudGridElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasIncludedMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * <code>&lt;vaadin-crud-grid&gt;</code> is a <code>&lt;vaadin-grid&gt;</code> which automatically configures all its
 * columns based
 * on the JSON structure of the first item received.
 * <p>
 * You cannot manually configure columns but you can still style the grid as it's described in
 * <code>&lt;vaadin-grid&gt;</code>
 * <a href="https://vaadin.com/components/vaadin-grid/html-api/elements/Vaadin.GridElement">Documentation</a>
 */
public class VaadinCrudGrid extends AbstractComponent<CrudGridElement>
		implements HasIncludedMixin<CrudGridElement, VaadinCrudGrid>,
		HasComponents<CrudGridElement, VaadinCrudGrid, Component<?>> {
	public VaadinCrudGrid() {
		super("vaadin-crud-grid");
	}

	/**
	 * Disable filtering in the generated columns.
	 */
	public boolean noFilter() {
		return getNode().isNoFilter();
	}

	/**
	 * Disable filtering in the generated columns.
	 */
	public VaadinCrudGrid noFilter(boolean noFilter) {
		getNode().setNoFilter(noFilter);
		return this;
	}

	/**
	 * Disable sorting in the generated columns.
	 */
	public boolean noSort() {
		return getNode().isNoSort();
	}

	/**
	 * Disable sorting in the generated columns.
	 */
	public VaadinCrudGrid noSort(boolean noSort) {
		getNode().setNoSort(noSort);
		return this;
	}

	/**
	 * Do not add headers to columns.
	 */
	public boolean noHead() {
		return getNode().isNoHead();
	}

	/**
	 * Do not add headers to columns.
	 */
	public VaadinCrudGrid noHead(boolean noHead) {
		getNode().setNoHead(noHead);
		return this;
	}
}
