package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.IncludedMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-crud-grid&gt;</code> is a <code>&lt;vaadin-grid&gt;</code> which automatically configures all its
 * columns based
 * on the JSON structure of the first item received.
 * <p>
 * You cannot manually configure columns but you can still style the grid as it's described in
 * <code>&lt;vaadin-grid&gt;</code>
 * <a href="https://vaadin.com/components/vaadin-grid/html-api/elements/Vaadin.GridElement">Documentation</a>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "CrudGridElement",
		module = "@vaadin/vaadin-crud/src/vaadin-crud-grid.js"
)
public interface CrudGridElement extends HTMLElement, IncludedMixin {
	/**
	 * Disable filtering in the generated columns.
	 */
	@JSProperty
	boolean isNoFilter();

	/**
	 * Disable filtering in the generated columns.
	 */
	@JSProperty
	void setNoFilter(boolean noFilter);

	/**
	 * Disable sorting in the generated columns.
	 */
	@JSProperty
	boolean isNoSort();

	/**
	 * Disable sorting in the generated columns.
	 */
	@JSProperty
	void setNoSort(boolean noSort);

	/**
	 * Do not add headers to columns.
	 */
	@JSProperty
	boolean isNoHead();

	/**
	 * Do not add headers to columns.
	 */
	@JSProperty
	void setNoHead(boolean noHead);
}
