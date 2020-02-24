package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.constants.SortDirection;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridSortColumnElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-grid-sort-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code>
 * that provides default header template and functionality for sorting.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items=&quot;[[items]]&quot;&gt;
 *  &lt;vaadin-grid-sort-column path=&quot;name.first&quot; direction=&quot;asc&quot;&gt;&lt;
 *  /vaadin-grid-sort-column&gt;
 *
 *  &lt;vaadin-grid-column&gt;
 *    ...
 * </code></pre>
 */
@WebComponent
public class GridSortColumn<ITEM extends Any> extends AbstractComponent<GridSortColumnElement<ITEM>>
		implements HasStyle<GridSortColumnElement<ITEM>, GridSortColumn<ITEM>>, HasComponents<GridSortColumnElement<ITEM>, GridSortColumn<ITEM>, Component<?>> {
	public GridSortColumn() {
		super(GridSortColumnElement.TAGNAME());
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
	public GridSortColumn<ITEM> path(String path) {
		getNode().setPath(path);
		return this;
	}

	/**
	 * How to sort the data.
	 * Possible values are <code>asc</code> to use an ascending algorithm, <code>desc</code> to sort the data in
	 * descending direction, or <code>null</code> for not sorting the data.
	 */
	@Nullable
	public SortDirection direction() {
		return getNode().getDirection();
	}

	/**
	 * How to sort the data.
	 * Possible values are <code>asc</code> to use an ascending algorithm, <code>desc</code> to sort the data in
	 * descending direction, or <code>null</code> for not sorting the data.
	 */
	public GridSortColumn<ITEM> direction(SortDirection direction) {
		getNode().setDirection(direction);
		return this;
	}

	/**
	 * Fired when the <code>direction</code> property changes.
	 */
	public ObservableEvent<PropertyChangeEvent<SortDirection>> directionChangedEvent() {
		return createEvent("direction-changed");
	}
}
