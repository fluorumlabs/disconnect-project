package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.constants.SortDirection;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridSorterElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-grid-sorter&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code> that provides
 * out-of-the-box UI controls,
 * visual feedback, and handlers for sorting the grid data.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid-column&gt;
 *   &lt;template class=&quot;header&quot;&gt;
 *     &lt;vaadin-grid-sorter path=&quot;name.first&quot;&gt;First name&lt;/vaadin-grid-sorter&gt;
 *   &lt;/template&gt;
 *   &lt;template&gt;[[item.name.first]]&lt;/template&gt;
 * &lt;/vaadin-grid-column&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>content</code></td><td>The slotted content wrapper</td></tr>
 * <tr><td><code>indicators</code></td><td>The internal sorter indicators.</td></tr>
 * <tr><td><code>order</code></td><td>The internal sorter order</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>direction</code></td><td>Sort direction of a sorter</td><td>:host</td></tr>
 * </tbody>
 * </table>
 */
@WebComponent
public class GridSorter extends AbstractComponent<GridSorterElement>
		implements HasStyle<GridSorterElement, GridSorter>, HasComponents<GridSorterElement, GridSorter, HasElement<?>> {
	public GridSorter() {
		super(GridSorterElement.TAGNAME());
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
	public GridSorter path(String path) {
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
	public GridSorter direction(SortDirection direction) {
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
