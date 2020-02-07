package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ColumnBaseMixin;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A <code>&lt;vaadin-grid-column-group&gt;</code> is used to make groups of columns in <code>&lt;vaadin-grid&gt;
 * </code> and
 * to configure additional headers and footers.
 * <p>
 * Groups can be nested to create complex header and footer configurations.
 * <p>
 * The <code>class</code> attribute is used to differentiate header and footer templates.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid-column-group resizable&gt;
 *  &lt;template class=&quot;header&quot;&gt;Name&lt;/template&gt;
 *
 *  &lt;vaadin-grid-column&gt;
 *    &lt;template class=&quot;header&quot;&gt;First&lt;/template&gt;
 *    &lt;template&gt;[[item.name.first]]&lt;/template&gt;
 *  &lt;/vaadin-grid-column&gt;
 *  &lt;vaadin-grid-column&gt;
 *    &lt;template class=&quot;header&quot;&gt;Last&lt;/template&gt;
 *    &lt;template&gt;[[item.name.last]]&lt;/template&gt;
 *  &lt;/vaadin-grid-column&gt;
 * &lt;/vaadin-grid-column-group&gt;
 * </code></pre>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-grid/theme/lumo/vaadin-grid-column-group.js"
)
public interface GridColumnGroupElement<ITEM extends Any> extends HTMLElement, ColumnBaseMixin<ITEM> {
	static String TAGNAME() {
		return "vaadin-grid-column-group";
	}

	/**
	 * Flex grow ratio for the column group as the sum of the ratios of its child columns.
	 */
	@JSProperty
	double getFlexGrow();

	/**
	 * Width of the column group as the sum of the widths of its child columns.
	 */
	@Nullable
	@JSProperty
	String getWidth();
}
