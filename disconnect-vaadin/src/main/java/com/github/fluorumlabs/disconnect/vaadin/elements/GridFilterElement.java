package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `<vaadin-grid-filter>` is a helper element for the `<vaadin-grid>` that provides out-of-the-box UI controls,
 * and handlers for filtering the grid data.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid-column>
 * <template class="header">
 * <vaadin-grid-filter path="name.first"></vaadin-grid-filter>
 * </template>
 * <template>[[item.name.first]]</template>
 * </vaadin-grid-column>
 * ```
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "GridFilterElement",
		module = "@vaadin/vaadin-grid/src/vaadin-grid-filter.js"
)
public interface GridFilterElement extends HTMLElement {
	/**
	 * JS Path of the property in the item used for filtering the data.
	 */
	@Nullable
	@JSProperty
	String getPath();

	/**
	 * JS Path of the property in the item used for filtering the data.
	 */
	@JSProperty
	void setPath(String path);

	/**
	 * Current filter value.
	 */
	@Nullable
	@JSProperty
	String getValue();

	/**
	 * Current filter value.
	 */
	@JSProperty
	void setValue(String value);
}
