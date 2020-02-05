package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.constants.SortDirection;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridSortColumnElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;

import javax.annotation.Nullable;

/**
 * `<vaadin-grid-sort-column>` is a helper element for the `<vaadin-grid>`
 * that provides default header template and functionality for sorting.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid items="[[items]]">
 * <vaadin-grid-sort-column path="name.first" direction="asc"></vaadin-grid-sort-column>
 * <p>
 * <vaadin-grid-column>
 * ...
 * ```
 */
public class VaadinGridSortColumn<ITEM extends Any> extends AbstractComponent<GridSortColumnElement<ITEM>>
		implements HasComponents<GridSortColumnElement<ITEM>, VaadinGridSortColumn<ITEM>, Component<?>> {
	public VaadinGridSortColumn() {
		super("vaadin-grid-sort-column");
	}

	/**
	 * JS Path of the property in the item used for sorting the data.
	 */
	@Nullable
	public String path() {
		return getNode().getPath();
	}

	/**
	 * JS Path of the property in the item used for sorting the data.
	 */
	public VaadinGridSortColumn<ITEM> path(String path) {
		getNode().setPath(path);
		return this;
	}

	/**
	 * How to sort the data.
	 * Possible values are `asc` to use an ascending algorithm, `desc` to sort the data in
	 * descending direction, or `null` for not sorting the data.
	 */
	@Nullable
	public SortDirection direction() {
		return getNode().getDirection();
	}

	/**
	 * How to sort the data.
	 * Possible values are `asc` to use an ascending algorithm, `desc` to sort the data in
	 * descending direction, or `null` for not sorting the data.
	 */
	public VaadinGridSortColumn<ITEM> direction(SortDirection direction) {
		getNode().setDirection(direction);
		return this;
	}

	/**
	 * Fired when the `direction` property changes.
	 */
	public ObservableEvent<PropertyChangeEvent<SortDirection>> directionChangedEvent() {
		return createEvent("direction-changed");
	}
}
