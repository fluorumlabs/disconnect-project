package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridColumnGroupElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasColumnBaseMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.lang.Any;

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
public class VaadinGridColumnGroup<ITEM extends Any> extends AbstractComponent<GridColumnGroupElement<ITEM>>
		implements HasColumnBaseMixin<ITEM, GridColumnGroupElement<ITEM>, VaadinGridColumnGroup<ITEM>>,
		HasComponents<GridColumnGroupElement<ITEM>, VaadinGridColumnGroup<ITEM>, Component<?>> {
	public VaadinGridColumnGroup() {
		super(GridColumnGroupElement.TAGNAME());
	}

	/**
	 * Flex grow ratio for the column group as the sum of the ratios of its child columns.
	 */
	public double flexGrow() {
		return getNode().getFlexGrow();
	}

	/**
	 * Width of the column group as the sum of the widths of its child columns.
	 */
	@Nullable
	public String width() {
		return getNode().getWidth();
	}
}
