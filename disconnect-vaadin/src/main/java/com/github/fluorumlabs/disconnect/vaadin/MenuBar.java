package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.MenuBarElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasButtonsMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasInteractionsMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.ItemSelectedEvent;
import com.github.fluorumlabs.disconnect.vaadin.types.MenuItem;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import js.util.collections.Array;

/**
 * <code>&lt;vaadin-menu-bar&gt;</code> is a Web Component providing a set of horizontally stacked buttons offering
 * the user quick access to a consistent set of commands. Each button can toggle a submenu with
 * support for additional levels of nested menus.
 * <p>
 * To create the menu bar, first add the component to the page:
 *
 * <pre><code>&lt;vaadin-menu-bar&gt;&lt;/vaadin-menu-bar&gt;
 * </code></pre>
 * And then use <a href="#/elements/vaadin-menu-bar#property-items"><code>items</code></a>
 * property to initialize the structure:
 *
 * <pre><code>document.querySelector('vaadin-menu-bar').items = [{text: 'File'}, {text: 'Edit'}];
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are exposed for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>container</code></td><td>The container wrapping menu bar buttons.</td></tr>
 * <tr><td><code>menu-bar-button</code></td><td>The menu bar button.</td></tr>
 * <tr><td><code>overflow-button</code></td><td>The &quot;overflow&quot; button appearing when menu bar width is not
 * enough to fit all the buttons.</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@WebComponent
public class MenuBar extends AbstractComponent<MenuBarElement>
		implements HasButtonsMixin<MenuBarElement, MenuBar>,
		HasInteractionsMixin<MenuBarElement, MenuBar>,
		HasElementMixin<MenuBarElement, MenuBar>,
		HasStyle<MenuBarElement, MenuBar>, HasComponents<MenuBarElement, MenuBar, HasElement<?>> {
	public MenuBar() {
		super(MenuBarElement.TAGNAME());
	}

	/**
	 * Defines a hierarchical structure, where root level items represent menu bar buttons,
	 * and <code>children</code> property configures a submenu with items to be opened below
	 * the button on click, Enter, Space, Up and Down arrow keys.
	 *
	 * <h4>Example</h4>
	 * <pre><code class="language-js">menubar.items = [
	 *   {
	 *     text: 'File',
	 *     children: [
	 *       {text: 'Open'}
	 *       {text: 'Auto Save', checked: true},
	 *     ]
	 *   },
	 *   {component: 'hr'},
	 *   {
	 *     text: 'Edit',
	 *     children: [
	 *       {text: 'Undo', disabled: true},
	 *       {text: 'Redo'}
	 *     ]
	 *   },
	 *   {text: 'Help'}
	 * ];
	 * </code></pre>
	 */
	public Array<MenuItem> items() {
		return getNode().getItems();
	}

	/**
	 * Defines a hierarchical structure, where root level items represent menu bar buttons,
	 * and <code>children</code> property configures a submenu with items to be opened below
	 * the button on click, Enter, Space, Up and Down arrow keys.
	 *
	 * <h4>Example</h4>
	 * <pre><code class="language-js">menubar.items = [
	 *   {
	 *     text: 'File',
	 *     children: [
	 *       {text: 'Open'}
	 *       {text: 'Auto Save', checked: true},
	 *     ]
	 *   },
	 *   {component: 'hr'},
	 *   {
	 *     text: 'Edit',
	 *     children: [
	 *       {text: 'Undo', disabled: true},
	 *       {text: 'Redo'}
	 *     ]
	 *   },
	 *   {text: 'Help'}
	 * ];
	 * </code></pre>
	 */
	public MenuBar items(MenuItem... items) {
		getNode().setItems(items);
		return this;
	}

	/**
	 * Fired when either a submenu item or menu bar button without nested children is clicked.
	 */
	public ObservableEvent<ItemSelectedEvent<MenuItem>> itemSelectedEvent() {
		return createEvent("item-selected");
	}
}
