package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.types.MenuItem;
import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "ItemsMixin",
		module = "@vaadin/vaadin-context-menu/src/vaadin-contextmenu-items-mixin.js"
)
public interface ItemsMixin extends Element {
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
	@JSProperty
	Array<MenuItem> getItems();

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
	@JSProperty
	void setItems(@JSByRef MenuItem... items);

	@JSProperty
	void setItems(Array<MenuItem> items);
}
