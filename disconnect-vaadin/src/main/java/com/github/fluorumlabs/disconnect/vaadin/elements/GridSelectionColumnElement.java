package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-grid-selection-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code>
 * that provides default templates and functionality for item selection.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items=&quot;[[items]]&quot;&gt;
 *  &lt;vaadin-grid-selection-column frozen auto-select&gt;&lt;/vaadin-grid-selection-column&gt;
 *
 *  &lt;vaadin-grid-column&gt;
 *    ...
 * </code></pre>
 * By default the selection column displays <code>&lt;vaadin-checkbox&gt;</code> elements in the
 * column cells. The checkboxes in the body rows toggle selection of the corresponding row items.
 * <p>
 * When the grid data is provided as an array of <a href="#/elements/vaadin-grid#property-items"><code>items</code></a>,
 * the column header gets an additional checkbox that can be used for toggling
 * selection for all the items at once.
 *
 * <strong>The default content can also be overridden</strong>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-grid/vaadin-grid-selection-column.js"
)
public interface GridSelectionColumnElement<ITEM extends Any> extends GridColumnElement<ITEM> {
	static String TAGNAME() {
		return "vaadin-grid-selection-column";
	}

	/**
	 * When true, all the items are selected.
	 */
	@JSProperty
	boolean isSelectAll();

	/**
	 * When true, all the items are selected.
	 */
	@JSProperty
	void setSelectAll(boolean selectAll);

	/**
	 * When true, the active gets automatically selected.
	 */
	@JSProperty
	boolean isAutoSelect();

	/**
	 * When true, the active gets automatically selected.
	 */
	@JSProperty
	void setAutoSelect(boolean autoSelect);
}
