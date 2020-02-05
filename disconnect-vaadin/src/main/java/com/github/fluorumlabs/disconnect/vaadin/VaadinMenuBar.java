package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.MenuBarElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasButtonsMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasInteractionsMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.ItemSelectedEvent;
import com.github.fluorumlabs.disconnect.vaadin.types.MenuItem;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.util.collections.Array;

/**
 * `<vaadin-menu-bar>` is a Web Component providing a set of horizontally stacked buttons offering
 * the user quick access to a consistent set of commands. Each button can toggle a submenu with
 * support for additional levels of nested menus.
 * <p>
 * To create the menu bar, first add the component to the page:
 * <p>
 * ```
 * <vaadin-menu-bar></vaadin-menu-bar>
 * ```
 * <p>
 * And then use [`items`](#/elements/vaadin-menu-bar#property-items) property to initialize the structure:
 * <p>
 * ```
 * document.querySelector('vaadin-menu-bar').items = [{text: 'File'}, {text: 'Edit'}];
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are exposed for styling:
 * <p>
 * Part name         | Description
 * ------------------|----------------
 * `container`       | The container wrapping menu bar buttons.
 * `menu-bar-button` | The menu bar button.
 * `overflow-button` | The "overflow" button appearing when menu bar width is not enough to fit all the buttons.
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinMenuBar extends AbstractComponent<MenuBarElement>
        implements HasButtonsMixin<MenuBarElement, VaadinMenuBar>,
        HasInteractionsMixin<MenuBarElement, VaadinMenuBar>,
        HasElementMixin<MenuBarElement, VaadinMenuBar>,
        HasThemableMixin<MenuBarElement, VaadinMenuBar>,
        HasComponents<MenuBarElement, VaadinMenuBar, Component<?>> {
    public VaadinMenuBar() {
        super("vaadin-menu-bar");
    }

    /**
     * Defines a hierarchical structure, where root level items represent menu bar buttons,
     * and `children` property configures a submenu with items to be opened below
     * the button on click, Enter, Space, Up and Down arrow keys.
     * <p>
     * #### Example
     * <p>
     * ```js
     * menubar.items = [
     * {
     * text: 'File',
     * children: [
     * {text: 'Open'}
     * {text: 'Auto Save', checked: true},
     * ]
     * },
     * {component: 'hr'},
     * {
     * text: 'Edit',
     * children: [
     * {text: 'Undo', disabled: true},
     * {text: 'Redo'}
     * ]
     * },
     * {text: 'Help'}
     * ];
     * ```
     */
    public Array<MenuItem> items() {
        return getNode().getItems();
    }

    /**
     * Defines a hierarchical structure, where root level items represent menu bar buttons,
     * and `children` property configures a submenu with items to be opened below
     * the button on click, Enter, Space, Up and Down arrow keys.
     * <p>
     * #### Example
     * <p>
     * ```js
     * menubar.items = [
     * {
     * text: 'File',
     * children: [
     * {text: 'Open'}
     * {text: 'Auto Save', checked: true},
     * ]
     * },
     * {component: 'hr'},
     * {
     * text: 'Edit',
     * children: [
     * {text: 'Undo', disabled: true},
     * {text: 'Redo'}
     * ]
     * },
     * {text: 'Help'}
     * ];
     * ```
     */
    public VaadinMenuBar items(MenuItem... items) {
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