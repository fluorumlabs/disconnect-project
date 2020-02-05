package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ButtonsMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.InteractionsMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.MenuItem;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "MenuBarElement",
        module = "@vaadin/vaadin-menu-bar/src/vaadin-menu-bar.js"
)
public interface MenuBarElement extends HTMLElement, ButtonsMixin, InteractionsMixin, ElementMixin, ThemableMixin {
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
    @JSProperty
    Array<MenuItem> getItems();

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
    @JSProperty
    void setItems(@JSByRef MenuItem... items);

    @JSProperty
    void setItems(Array<MenuItem> items);
}
