package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-grid-tree-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code>
 * that provides default template and functionality for toggling tree/hierarchical items.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items=&quot;[[items]]&quot;&gt;
 *  &lt;vaadin-grid-tree-column path=&quot;name.first&quot;&gt;&lt;/vaadin-grid-tree-column&gt;
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

		module = "@vaadin/vaadin-grid/vaadin-grid-tree-column.js"
)
public interface GridTreeColumnElement<ITEM extends Any> extends GridColumnElement<ITEM> {
	static String TAGNAME() {
		return "vaadin-grid-tree-column";
	}

	/**
	 * JS Path of the property in the item that indicates whether the item has child items.
	 */
	@Nullable
	@JSProperty
	String getItemHasChildrenPath();

	/**
	 * JS Path of the property in the item that indicates whether the item has child items.
	 */
	@JSProperty
	void setItemHasChildrenPath(String itemHasChildrenPath);
}
