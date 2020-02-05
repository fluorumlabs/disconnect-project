package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridTreeToggleElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;

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
public class VaadinGridTreeToggle extends AbstractComponent<GridTreeToggleElement>
		implements HasThemableMixin<GridTreeToggleElement, VaadinGridTreeToggle>,
		HasComponents<GridTreeToggleElement, VaadinGridTreeToggle, Component<?>> {
	public VaadinGridTreeToggle() {
		super("vaadin-grid-tree-toggle");
	}

	/**
	 * Current level of the tree represented with a horizontal offset
	 * of the toggle button.
	 */
	public double level() {
		return getNode().getLevel();
	}

	/**
	 * Current level of the tree represented with a horizontal offset
	 * of the toggle button.
	 */
	public VaadinGridTreeToggle level(double level) {
		getNode().setLevel(level);
		return this;
	}

	/**
	 * Hides the toggle icon and disables toggling a tree sublevel.
	 */
	public boolean leaf() {
		return getNode().isLeaf();
	}

	/**
	 * Hides the toggle icon and disables toggling a tree sublevel.
	 */
	public VaadinGridTreeToggle leaf(boolean leaf) {
		getNode().setLeaf(leaf);
		return this;
	}

	/**
	 * Sublevel toggle state.
	 */
	public boolean expanded() {
		return getNode().isExpanded();
	}

	/**
	 * Sublevel toggle state.
	 */
	public VaadinGridTreeToggle expanded(boolean expanded) {
		getNode().setExpanded(expanded);
		return this;
	}

	/**
	 * Fired when the `expanded` property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> expandedChangedEvent() {
		return createEvent("expanded-changed");
	}
}
