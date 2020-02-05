package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * `<vaadin-grid-tree-toggle>` is a helper element for the `<vaadin-grid>`
 * that provides toggle and level display functionality for the item tree.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid-column>
 * <template class="header">Package name</template>
 * <template>
 * <vaadin-grid-tree-toggle
 * leaf="[[!item.hasChildren]]"
 * expanded="{{expanded}}"
 * level="[[level]]">
 * [[item.name]]
 * </vaadin-grid-tree-toggle>
 * </template>
 * </vaadin-grid-column>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ---|---
 * `toggle` | The tree toggle icon
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute    | Description | Part name
 * ---|---|---
 * `expanded` | When present, the toggle is expanded | :host
 * `leaf` | When present, the toggle is not expandable, i. e., the current item is a leaf | :host
 * <p>
 * The following custom CSS properties are available on
 * the `<vaadin-grid-tree-toggle>` element:
 * <p>
 * Custom CSS property | Description | Default
 * ---|---|---
 * `--vaadin-grid-tree-toggle-level-offset` | Visual offset step for each tree sublevel | `1em`
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "GridTreeToggleElement",
		module = "@vaadin/vaadin-grid/src/vaadin-grid-tree-toggle.js"
)
public interface GridTreeToggleElement extends HTMLElement, ThemableMixin {
	/**
	 * Current level of the tree represented with a horizontal offset
	 * of the toggle button.
	 */
	@JSProperty
	double getLevel();

	/**
	 * Current level of the tree represented with a horizontal offset
	 * of the toggle button.
	 */
	@JSProperty
	void setLevel(double level);

	/**
	 * Hides the toggle icon and disables toggling a tree sublevel.
	 */
	@JSProperty
	boolean isLeaf();

	/**
	 * Hides the toggle icon and disables toggling a tree sublevel.
	 */
	@JSProperty
	void setLeaf(boolean leaf);

	/**
	 * Sublevel toggle state.
	 */
	@JSProperty
	boolean isExpanded();

	/**
	 * Sublevel toggle state.
	 */
	@JSProperty
	void setExpanded(boolean expanded);
}
