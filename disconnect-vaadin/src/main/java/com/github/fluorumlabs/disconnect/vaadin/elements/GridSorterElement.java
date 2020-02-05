package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.SortDirection;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `<vaadin-grid-sorter>` is a helper element for the `<vaadin-grid>` that provides out-of-the-box UI controls,
 * visual feedback, and handlers for sorting the grid data.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid-column>
 * <template class="header">
 * <vaadin-grid-sorter path="name.first">First name</vaadin-grid-sorter>
 * </template>
 * <template>[[item.name.first]]</template>
 * </vaadin-grid-column>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ----------------|----------------
 * `content` | The slotted content wrapper
 * `indicators` | The internal sorter indicators.
 * `order` | The internal sorter order
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|------------
 * `direction` | Sort direction of a sorter | :host
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "GridSorterElement",
		module = "@vaadin/vaadin-grid/src/vaadin-grid-sorter.js"
)
public interface GridSorterElement extends HTMLElement {
	/**
	 * JS Path of the property in the item used for sorting the data.
	 */
	@Nullable
	@JSProperty
	String getPath();

	/**
	 * JS Path of the property in the item used for sorting the data.
	 */
	@JSProperty
	void setPath(String path);

	/**
	 * How to sort the data.
	 * Possible values are `asc` to use an ascending algorithm, `desc` to sort the data in
	 * descending direction, or `null` for not sorting the data.
	 */
	@Nullable
	@JSProperty
	SortDirection getDirection();

	/**
	 * How to sort the data.
	 * Possible values are `asc` to use an ascending algorithm, `desc` to sort the data in
	 * descending direction, or `null` for not sorting the data.
	 */
	@JSProperty
	void setDirection(SortDirection direction);
}
