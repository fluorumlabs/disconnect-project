package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.SortDirection;
import js.lang.Any;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-grid/theme/lumo/vaadin-grid-sort-column.js"
)
public interface GridSortColumnElement<ITEM extends Any> extends GridColumnElement<ITEM> {
	static String TAGNAME() {
		return "vaadin-grid-sort-column";
	}

	/**
	 * How to sort the data.
	 * Possible values are <code>asc</code> to use an ascending algorithm, <code>desc</code> to sort the data in
	 * descending direction, or <code>null</code> for not sorting the data.
	 */
	@Nullable
	@JSProperty
	SortDirection getDirection();

	/**
	 * How to sort the data.
	 * Possible values are <code>asc</code> to use an ascending algorithm, <code>desc</code> to sort the data in
	 * descending direction, or <code>null</code> for not sorting the data.
	 */
	@JSProperty
	void setDirection(SortDirection direction);
}
