package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridFilterColumnElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;
import js.lang.Any;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-grid-filter-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code>
 * that provides default header template and functionality for filtering.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items=&quot;[[items]]&quot;&gt;
 *  &lt;vaadin-grid-filter-column path=&quot;name.first&quot;&gt;&lt;/vaadin-grid-filter-column&gt;
 *
 *  &lt;vaadin-grid-column&gt;
 *    ...
 * </code></pre>
 */
@WebComponent
public class GridFilterColumn<ITEM extends Any> extends AbstractComponent<GridFilterColumnElement<ITEM>>
		implements HasStyle<GridFilterColumnElement<ITEM>, GridFilterColumn<ITEM>>, HasComponents<GridFilterColumnElement<ITEM>, GridFilterColumn<ITEM>, Component<?>> {
	public GridFilterColumn() {
		super(GridFilterColumnElement.TAGNAME());
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
	public GridFilterColumn<ITEM> path(String path) {
		getNode().setPath(path);
		return this;
	}

	/**
	 * Text to display as the label of the column filter text-field.
	 */
	@Nullable
	public String header() {
		return getNode().getHeader();
	}

	/**
	 * Text to display as the label of the column filter text-field.
	 */
	public GridFilterColumn<ITEM> header(String header) {
		getNode().setHeader(header);
		return this;
	}
}
