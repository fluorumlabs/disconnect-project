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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "GridColumnGroupElement",
		module = "@vaadin/vaadin-grid/src/vaadin-grid-column-group.js"
)
public interface GridColumnGroupElement<ITEM extends Any> extends HTMLElement, ColumnBaseMixin<ITEM> {
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
