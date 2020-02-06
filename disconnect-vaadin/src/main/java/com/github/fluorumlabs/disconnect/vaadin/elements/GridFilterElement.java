package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-grid/vaadin-grid-filter.js"
)
public interface GridFilterElement extends HTMLElement {
	static String TAGNAME() {
		return "vaadin-grid-filter";
	}

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
