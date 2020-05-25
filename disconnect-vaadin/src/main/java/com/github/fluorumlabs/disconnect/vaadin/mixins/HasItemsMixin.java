package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ItemsMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.MenuItem;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import js.util.collections.Array;

public interface HasItemsMixin<E extends ItemsMixin, T extends HasElement<E>> extends HasElement<E> {
	/**
	 * Defines a (hierarchical) menu structure for the component.
	 * If a menu item has a non-empty <code>children</code> set, a sub-menu with the child items is opened
	 * next to the parent menu on mouseover, tap or a right arrow keypress.
	 * <p>
	 * The items API can't be used together with a renderer or a template!
	 *
	 * <h4>Example</h4>
	 * <pre><code class="language-javascript">contextMenu.items = [
	 *   {text: 'Menu Item 1', children:
	 *     [
	 *       {text: 'Menu Item 1-1', checked: true},
	 *       {text: 'Menu Item 1-2'}
	 *     ]
	 *   },
	 *   {component: 'hr'},
	 *   {text: 'Menu Item 2', children:
	 *     [
	 *       {text: 'Menu Item 2-1'},
	 *       {text: 'Menu Item 2-2', disabled: true}
	 *     ]
	 *   },
	 *   {text: 'Menu Item 3', disabled: true}
	 * ];
	 * </code></pre>
	 */
	default Array<MenuItem> items() {
		return getNode().getItems();
	}

	/**
	 * Defines a (hierarchical) menu structure for the component.
	 * If a menu item has a non-empty <code>children</code> set, a sub-menu with the child items is opened
	 * next to the parent menu on mouseover, tap or a right arrow keypress.
	 * <p>
	 * The items API can't be used together with a renderer or a template!
	 *
	 * <h4>Example</h4>
	 * <pre><code class="language-javascript">contextMenu.items = [
	 *   {text: 'Menu Item 1', children:
	 *     [
	 *       {text: 'Menu Item 1-1', checked: true},
	 *       {text: 'Menu Item 1-2'}
	 *     ]
	 *   },
	 *   {component: 'hr'},
	 *   {text: 'Menu Item 2', children:
	 *     [
	 *       {text: 'Menu Item 2-1'},
	 *       {text: 'Menu Item 2-2', disabled: true}
	 *     ]
	 *   },
	 *   {text: 'Menu Item 3', disabled: true}
	 * ];
	 * </code></pre>
	 */
	default T items(MenuItem... items) {
		getNode().setItems(items);
		return (T) this;
	}

	default T items(Array<MenuItem> items) {
		getNode().setItems(items);
		return (T) this;
	}
}
