package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridColumnGroupElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasColumnBaseMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.lang.Any;

import javax.annotation.Nullable;

/**
 * A `<vaadin-grid-column-group>` is used to make groups of columns in `<vaadin-grid>` and
 * to configure additional headers and footers.
 * <p>
 * Groups can be nested to create complex header and footer configurations.
 * <p>
 * The `class` attribute is used to differentiate header and footer templates.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid-column-group resizable>
 * <template class="header">Name</template>
 * <p>
 * <vaadin-grid-column>
 * <template class="header">First</template>
 * <template>[[item.name.first]]</template>
 * </vaadin-grid-column>
 * <vaadin-grid-column>
 * <template class="header">Last</template>
 * <template>[[item.name.last]]</template>
 * </vaadin-grid-column>
 * </vaadin-grid-column-group>
 * ```
 */
public class VaadinGridColumnGroup<ITEM extends Any> extends AbstractComponent<GridColumnGroupElement<ITEM>>
		implements HasColumnBaseMixin<ITEM, GridColumnGroupElement<ITEM>, VaadinGridColumnGroup<ITEM>>,
		HasComponents<GridColumnGroupElement<ITEM>, VaadinGridColumnGroup<ITEM>, Component<?>> {
	public VaadinGridColumnGroup() {
		super("vaadin-grid-column-group");
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
