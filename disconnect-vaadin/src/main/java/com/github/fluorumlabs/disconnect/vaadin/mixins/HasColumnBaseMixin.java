package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ColumnBaseMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.GridHeaderFooterRenderer;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import js.lang.Any;

import javax.annotation.Nullable;

public interface HasColumnBaseMixin<ITEM extends Any, E extends ColumnBaseMixin<ITEM>, T extends HasElement<E>>
		extends HasElement<E> {
	/**
	 * When set to true, the column is user-resizable.
	 */
	default boolean resizable() {
		return getNode().isResizable();
	}

	/**
	 * When set to true, the column is user-resizable.
	 */
	default T resizable(boolean resizable) {
		getNode().setResizable(resizable);
		return (T) this;
	}

	/**
	 * When true, the column is frozen. When a column inside of a column group is frozen,
	 * all of the sibling columns inside the group will get frozen also.
	 */
	default boolean frozen() {
		return getNode().isFrozen();
	}

	/**
	 * When true, the column is frozen. When a column inside of a column group is frozen,
	 * all of the sibling columns inside the group will get frozen also.
	 */
	default T frozen(boolean frozen) {
		getNode().setFrozen(frozen);
		return (T) this;
	}

	/**
	 * When set to true, the cells for this column are hidden.
	 */
	default boolean hidden() {
		return getNode().isHidden();
	}

	/**
	 * When set to true, the cells for this column are hidden.
	 */
	default T hidden(boolean hidden) {
		getNode().setHidden(hidden);
		return (T) this;
	}

	/**
	 * Text content to display in the header cell of the column.
	 */
	@Nullable
	default String header() {
		return getNode().getHeader();
	}

	/**
	 * Text content to display in the header cell of the column.
	 */
	default T header(String header) {
		getNode().setHeader(header);
		return (T) this;
	}

	/**
	 * Aligns the columns cell content horizontally.
	 * Supported values: &quot;start&quot;, &quot;center&quot; and &quot;end&quot;.
	 */
	@Nullable
	default String textAlign() {
		return getNode().getTextAlign();
	}

	/**
	 * Aligns the columns cell content horizontally.
	 * Supported values: &quot;start&quot;, &quot;center&quot; and &quot;end&quot;.
	 */
	default T textAlign(String textAlign) {
		getNode().setTextAlign(textAlign);
		return (T) this;
	}

	/**
	 * Custom function for rendering the header content.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The header cell content DOM element. Append your content to it.</li>
	 * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
	 * </ul>
	 */
	@Nullable
	default GridHeaderFooterRenderer<ITEM> headerRenderer() {
		return getNode().getHeaderRenderer();
	}

	/**
	 * Custom function for rendering the header content.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The header cell content DOM element. Append your content to it.</li>
	 * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
	 * </ul>
	 */
	default T headerRenderer(GridHeaderFooterRenderer<ITEM> headerRenderer) {
		getNode().setHeaderRenderer(headerRenderer);
		return (T) this;
	}

	/**
	 * Custom function for rendering the footer content.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The footer cell content DOM element. Append your content to it.</li>
	 * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
	 * </ul>
	 */
	@Nullable
	default GridHeaderFooterRenderer<ITEM> footerRenderer() {
		return getNode().getFooterRenderer();
	}

	/**
	 * Custom function for rendering the footer content.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The footer cell content DOM element. Append your content to it.</li>
	 * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
	 * </ul>
	 */
	default T footerRenderer(GridHeaderFooterRenderer<ITEM> footerRenderer) {
		getNode().setFooterRenderer(footerRenderer);
		return (T) this;
	}
}
