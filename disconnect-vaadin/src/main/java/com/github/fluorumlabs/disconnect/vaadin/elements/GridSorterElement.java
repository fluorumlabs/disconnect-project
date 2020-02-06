package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.SortDirection;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "GridSorterElement",
		module = "@vaadin/vaadin-grid/vaadin-grid-sorter.js"
)
public interface GridSorterElement extends HTMLElement {
	String TAGNAME = "vaadin-grid-sorter";
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
