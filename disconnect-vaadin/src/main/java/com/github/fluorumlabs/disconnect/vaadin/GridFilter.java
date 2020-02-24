package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.polymer.types.StringPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridFilterElement;
import com.github.fluorumlabs.disconnect.zero.component.*;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-grid-filter&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code> that provides
 * out-of-the-box UI controls,
 * and handlers for filtering the grid data.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid-column&gt;
 *   &lt;template class=&quot;header&quot;&gt;
 *     &lt;vaadin-grid-filter path=&quot;name.first&quot;&gt;&lt;/vaadin-grid-filter&gt;
 *   &lt;/template&gt;
 *   &lt;template&gt;[[item.name.first]]&lt;/template&gt;
 * &lt;/vaadin-grid-column&gt;
 * </code></pre>
 */
@WebComponent
public class GridFilter extends AbstractComponent<GridFilterElement>
		implements HasSlots<GridFilterElement>, HasStyle<GridFilterElement, GridFilter>, HasComponents<GridFilterElement, GridFilter, Component<?>> {
	public GridFilter() {
		super(GridFilterElement.TAGNAME());
	}

	/**
	 * JS Path of the property in the item used for filtering the data.
	 */
	@Nullable
	public String path() {
		return getNode().getPath();
	}

	/**
	 * JS Path of the property in the item used for filtering the data.
	 */
	public GridFilter path(String path) {
		getNode().setPath(path);
		return this;
	}

	/**
	 * Current filter value.
	 */
	@Nullable
	public String value() {
		return getNode().getValue();
	}

	/**
	 * Current filter value.
	 */
	public GridFilter value(String value) {
		getNode().setValue(value);
		return this;
	}

	public void focus() {
		getNode().focus();
	}

	/**
	 * Fired when the <code>value</code> property changes.
	 */
	public ObservableEvent<StringPropertyChangeEvent> valueChangedEvent() {
		return createEvent("value-changed");
	}

	public HasSlots.Container filterSlot() {
		return slotted("filter");
	}
}
