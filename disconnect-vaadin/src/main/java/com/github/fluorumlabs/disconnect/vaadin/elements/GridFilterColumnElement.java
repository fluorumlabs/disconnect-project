package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.lang.Any;

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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "GridFilterColumnElement",
		module = "@vaadin/vaadin-grid/vaadin-grid-filter-column.js"
)
public interface GridFilterColumnElement<ITEM extends Any> extends GridColumnElement<ITEM> {
}
