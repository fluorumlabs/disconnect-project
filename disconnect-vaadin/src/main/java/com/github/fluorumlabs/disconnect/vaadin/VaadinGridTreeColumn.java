package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridTreeColumnElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.lang.Any;

import javax.annotation.Nullable;

/**
 * `<vaadin-grid-tree-column>` is a helper element for the `<vaadin-grid>`
 * that provides default template and functionality for toggling tree/hierarchical items.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid items="[[items]]">
 * <vaadin-grid-tree-column path="name.first"></vaadin-grid-tree-column>
 * <p>
 * <vaadin-grid-column>
 * ...
 * ```
 */
public class VaadinGridTreeColumn<ITEM extends Any> extends AbstractComponent<GridTreeColumnElement<ITEM>>
		implements HasComponents<GridTreeColumnElement<ITEM>, VaadinGridTreeColumn<ITEM>, Component<?>> {
	public VaadinGridTreeColumn() {
		super("vaadin-grid-tree-column");
	}

	/**
	 * JS Path of the property in the item used as text content for the tree toggle.
	 */
	@Nullable
	public String path() {
		return getNode().getPath();
	}

	/**
	 * JS Path of the property in the item used as text content for the tree toggle.
	 */
	public VaadinGridTreeColumn<ITEM> path(String path) {
		getNode().setPath(path);
		return this;
	}

	/**
	 * JS Path of the property in the item that indicates whether the item has child items.
	 */
	@Nullable
	public String itemHasChildrenPath() {
		return getNode().getItemHasChildrenPath();
	}

	/**
	 * JS Path of the property in the item that indicates whether the item has child items.
	 */
	public VaadinGridTreeColumn<ITEM> itemHasChildrenPath(String itemHasChildrenPath) {
		getNode().setItemHasChildrenPath(itemHasChildrenPath);
		return this;
	}
}
