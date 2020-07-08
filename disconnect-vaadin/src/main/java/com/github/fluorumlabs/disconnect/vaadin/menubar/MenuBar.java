package com.github.fluorumlabs.disconnect.vaadin.menubar;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.contextmenu.ContextMenuItem;
import js.lang.external.vaadin.menubar.MenuBarElement;
import js.util.collections.Array;

/**
 * <code>&lt;vaadin-menu-bar&gt;</code> is a Web Component providing a set of horizontally stacked buttons offering the user quick access to a consistent set of commands. Each button can toggle a submenu with support for additional levels of nested menus.
 *
 * To create the menu bar, first add the component to the page:
 *
 * <pre><code>&lt;vaadin-menu-bar&gt;&lt;/vaadin-menu-bar&gt;
 * </code></pre>
 * And then use <a href="#/elements/vaadin-menu-bar#property-items"><code>items</code></a> property to initialize the structure:
 *
 * <pre><code>document.querySelector('vaadin-menu-bar').items = [{text: 'File'}, {text: 'Edit'}];
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are exposed for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Part name</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>container</code></td>
 *    <td>The container wrapping menu bar buttons.</td>
 *   </tr>
 *   <tr>
 *    <td><code>menu-bar-button</code></td>
 *    <td>The menu bar button.</td>
 *   </tr>
 *   <tr>
 *    <td><code>overflow-button</code></td>
 *    <td>The "overflow" button appearing when menu bar width is not enough to fit all the buttons.</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ButtonsMixin, InteractionsMixin, ElementMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-menu-bar", external = true)
public class MenuBar extends HtmlComponent<MenuBarElement> implements Themable<MenuBarElement> {

    public MenuBar() {
    }

    public MenuBar(String textContent) {
        super(textContent);
    }

    public MenuBar(Component<?>... components) {
        super(components);
    }

    // !wca! notifyResize: (): void

    // !wca! get items: !Array<!MenuBarItem>
    /**
     * Defines a hierarchical structure, where root level items represent menu bar buttons,
     * and <code>children</code> property configures a submenu with items to be opened below
     * the button on click, Enter, Space, Up and Down arrow keys.
     *
     * #### Example
     *
     * <code>js&lt;br /&gt;menubar.items = [&lt;br /&gt; {&lt;br /&gt; text: 'File',&lt;br /&gt; children: [&lt;br /&gt; {text: 'Open'}&lt;br /&gt; {text: 'Auto Save', checked: true},&lt;br /&gt; ]&lt;br /&gt; },&lt;br /&gt; {component: 'hr'},&lt;br /&gt; {&lt;br /&gt; text: 'Edit',&lt;br /&gt; children: [&lt;br /&gt; {text: 'Undo', disabled: true},&lt;br /&gt; {text: 'Redo'}&lt;br /&gt; ]&lt;br /&gt; },&lt;br /&gt; {text: 'Help'}&lt;br /&gt;];&lt;br /&gt;</code>
     * @return
     */
    public Array<ContextMenuItem> getItems() {
        return getElement().getItems();
    }

    // !wca! set items: !Array<!MenuBarItem>
    /**
     * Defines a hierarchical structure, where root level items represent menu bar buttons,
     * and <code>children</code> property configures a submenu with items to be opened below
     * the button on click, Enter, Space, Up and Down arrow keys.
     *
     * #### Example
     *
     * <code>js&lt;br /&gt;menubar.items = [&lt;br /&gt; {&lt;br /&gt; text: 'File',&lt;br /&gt; children: [&lt;br /&gt; {text: 'Open'}&lt;br /&gt; {text: 'Auto Save', checked: true},&lt;br /&gt; ]&lt;br /&gt; },&lt;br /&gt; {component: 'hr'},&lt;br /&gt; {&lt;br /&gt; text: 'Edit',&lt;br /&gt; children: [&lt;br /&gt; {text: 'Undo', disabled: true},&lt;br /&gt; {text: 'Redo'}&lt;br /&gt; ]&lt;br /&gt; },&lt;br /&gt; {text: 'Help'}&lt;br /&gt;];&lt;br /&gt;</code>
     * @param value
     */
    public void setItems(Array<ContextMenuItem> value) {
        getElement().setItems(value);
    }

    // !wca! observe items: !Array<!MenuBarItem>

    // !wca! get openOnHover: boolean | null | undefined
    /**
     * If true, the submenu will open on hover (mouseover) instead of click.
     */
    public boolean isOpenOnHover() {
        return getElement().isOpenOnHover();
    }

    // !wca! set openOnHover: boolean | null | undefined
    /**
     * If true, the submenu will open on hover (mouseover) instead of click.
     */
    public void setOpenOnHover(boolean value) {
        getElement().setOpenOnHover(value);
    }

    // !wca! observe openOnHover: boolean | null | undefined

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined
}
