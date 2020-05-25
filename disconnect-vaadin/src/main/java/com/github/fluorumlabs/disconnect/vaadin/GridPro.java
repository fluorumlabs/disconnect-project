package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridProElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasInlineEditingMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;
import js.lang.Any;

/**
 * <code>&lt;vaadin-grid-pro&gt;</code> is a high quality data grid / data table Web Component with extended
 * functionality.
 * It extends <code>&lt;vaadin-grid&gt;</code> and adds extra features on top of the basic ones.
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-grid/blob/master/src/vaadin-grid.html"><code>&lt;vaadin-grid&gt;</code> documentation</a>
 * for details.
 *
 * <pre><code>&lt;vaadin-grid-pro&gt;&lt;/vaadin-grid-pro&gt;
 * </code></pre>
 */
@WebComponent
public class GridPro<ITEM extends Any> extends AbstractComponent<GridProElement>
		implements HasInlineEditingMixin<ITEM, GridProElement, GridPro<ITEM>>,
		HasStyle<GridProElement, GridPro<ITEM>>,
		HasComponents<GridProElement, GridPro<ITEM>, HasElement<?>> {
	public GridPro() {
		super(GridProElement.TAGNAME());
	}
}
