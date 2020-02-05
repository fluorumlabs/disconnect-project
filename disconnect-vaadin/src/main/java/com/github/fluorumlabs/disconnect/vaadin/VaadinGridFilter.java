package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.StringPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridFilterElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Element;

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
public class VaadinGridFilter extends AbstractComponent<GridFilterElement>
		implements HasSlottedComponents<GridFilterElement, VaadinGridFilter, Component<? extends Element>> {
	public VaadinGridFilter() {
		super("vaadin-grid-filter");
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
	public VaadinGridFilter path(String path) {
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
	public VaadinGridFilter value(String value) {
		getNode().setValue(value);
		return this;
	}

	public void focus() {
		getNode().focus();
	}

	/**
	 * Fired when the <code>value</code> property changes.
	 */
	public ObservableEvent<StringPropertyChangeEvent> ValueChangedEvent() {
		return createEvent("value-changed");
	}

	public VaadinGridFilter setFilter(Component<? extends Element> component) {
		return replaceSlotted("filter", component);
	}

	public VaadinGridFilter setFilter(Component<? extends Element>... components) {
		return replaceSlotted("filter", components);
	}

	public VaadinGridFilter addToFilter(Component<? extends Element> component) {
		return addSlotted("filter", component);
	}

	public VaadinGridFilter addToFilter(Component<? extends Element>... components) {
		return addSlotted("filter", components);
	}

	public VaadinGridFilter insertToFilter(Component<? extends Element> component) {
		return insertSlotted("filter", component);
	}

	public VaadinGridFilter insertToFilter(Component<? extends Element>... components) {
		return insertSlotted("filter", components);
	}

	public VaadinGridFilter clearFilter() {
		return removeAllSlotted("filter");
	}
}
