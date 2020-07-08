package com.github.fluorumlabs.disconnect.vaadin.contextmenu;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ParentNodeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.ComponentRendererWithContext;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.contextmenu.ContextMenuElement;
import js.lang.external.vaadin.contextmenu.ContextMenuItem;
import js.lang.external.vaadin.contextmenu.ContextMenuRendererContext;
import js.util.collections.Array;
import js.web.dom.Event;
import js.web.dom.HTMLElement;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-context-menu&gt;</code> is a Web Component for creating context menus. The content of the menu can be populated in three ways: imperatively by using the items API or a renderer callback function and declaratively by using Polymer's Templates.
 *
 * <h3>Items</h3>
 * Items is a higher level convenience API for defining a (hierarchical) menu structure for the component. If a menu item has a non-empty <code>children</code> set, a sub-menu with the child items is opened next to the parent menu on mouseover, tap or a right arrow keypress.
 *
 * When an item is selected, <code>&lt;vaadin-context-menu&gt;</code> dispatches an "item-selected" event with the selected item as <code>event.detail.value</code> property.
 *
 * <pre><code class="language-javascript">contextMenu.items = [
 *    {text: 'Menu Item 1', children:
 *      [
 *        {text: 'Menu Item 1-1', checked: true},
 *        {text: 'Menu Item 1-2'}
 *      ]
 *    },
 *    {component: 'hr'},
 *    {text: 'Menu Item 2', children:
 *      [
 *        {text: 'Menu Item 2-1'},
 *        {text: 'Menu Item 2-2', disabled: true}
 *      ]
 *    },
 *    {text: 'Menu Item 3', disabled: true}
 * ];
 *
 * contextMenu.addEventListener('item-selected', e =&gt; {
 *    const item = e.detail.value;
 *    console.log(`${item.text} selected`);
 * });
 * </code></pre>
 * <strong>NOTE:</strong> when the <code>items</code> array is defined, the renderer or a template cannot be used.
 *
 * <h3>Rendering</h3>
 * The renderer function provides <code>root</code>, <code>contextMenu</code>, <code>model</code> arguments when applicable. Generate DOM content by using <code>model</code> object properties if needed, append it to the <code>root</code> element and control the state of the host element by accessing <code>contextMenu</code>. Before generating new content, the renderer function should check if there is already content in <code>root</code> for reusing it.
 *
 * <pre><code class="language-html">&lt;vaadin-context-menu id="contextMenu"&gt;
 *   &lt;p&gt;This paragraph has a context menu.&lt;/p&gt;
 * &lt;/vaadin-context-menu&gt;
 * </code></pre>
 * <pre><code class="language-js">const contextMenu = document.querySelector('#contextMenu');
 * contextMenu.renderer = (root, contextMenu, context) =&gt; {
 *    let listBox = root.firstElementChild;
 *    if (!listBox) {
 *      listBox = document.createElement('vaadin-list-box');
 *      root.appendChild(listBox);
 *    }
 *
 *    let item = listBox.querySelector('vaadin-item');
 *    if (!item) {
 *      item = document.createElement('vaadin-item');
 *      listBox.appendChild(item);
 *    }
 *    item.textContent = 'Content of the selector: ' + context.target.textContent;
 * };
 * </code></pre>
 * You can access the menu context inside the renderer using <code>context.target</code> and <code>context.detail</code>.
 *
 * Renderer is called on the opening of the context-menu and each time the related context is updated. DOM generated during the renderer call can be reused in the next renderer call and will be provided with the <code>root</code> argument. On first call it will be empty.
 *
 * <strong>NOTE:</strong> when the <code>renderer</code> function is defined, the template content is not in use.
 *
 * <h3>Polymer Templates</h3>
 * Alternatively to using the <code>renderer</code>, you can populate the menu content using Polymer's Templates:
 *
 * <pre><code class="language-html">&lt;vaadin-context-menu&gt;
 *    &lt;template&gt;
 *      &lt;vaadin-list-box&gt;
 *        &lt;vaadin-item&gt;First menu item&lt;/vaadin-item&gt;
 *        &lt;vaadin-item&gt;Second menu item&lt;/vaadin-item&gt;
 *      &lt;/vaadin-list-box&gt;
 *    &lt;/template&gt;
 * &lt;/vaadin-context-menu&gt;
 * </code></pre>
 * <h3>â€œvaadin-contextmenuâ€� Gesture Event</h3>
 * <code>vaadin-contextmenu</code> is a gesture event (a custom event), which is dispatched after either <code>contextmenu</code> and long touch events. This enables support for both mouse and touch environments in a uniform way.
 *
 * <code>&lt;vaadin-context-menu&gt;</code> opens the menu overlay on the <code>vaadin-contextmenu</code> event by default.
 *
 * <h3>Menu Listener</h3>
 * By default, the <code>&lt;vaadin-context-menu&gt;</code> element listens for the menu opening event on itself. In order to have a context menu on your content, wrap your content with the <code>&lt;vaadin-context-menu&gt;</code> element, and add a template element with a menu. Example:
 *
 * <pre><code class="language-html">&lt;vaadin-context-menu&gt;
 *    &lt;template&gt;
 *      &lt;vaadin-list-box&gt;
 *        &lt;vaadin-item&gt;First menu item&lt;/vaadin-item&gt;
 *        &lt;vaadin-item&gt;Second menu item&lt;/vaadin-item&gt;
 *      &lt;/vaadin-list-box&gt;
 *    &lt;/template&gt;
 *
 *    &lt;p&gt;This paragraph has the context menu provided in the above template.&lt;/p&gt;
 *    &lt;p&gt;Another paragraph with the context menu.&lt;/p&gt;
 * &lt;/vaadin-context-menu&gt;
 * </code></pre>
 * In case if you do not want to wrap the page content, you can listen for events on an element outside the <code>&lt;vaadin-context-menu&gt;</code> by setting the <code>listenOn</code> property:
 *
 * <pre><code class="language-html">&lt;vaadin-context-menu id="customListener"&gt;
 *    &lt;template&gt;
 *      &lt;vaadin-list-box&gt;
 *        ...
 *      &lt;/vaadin-list-box&gt;
 *    &lt;/template&gt;
 * &lt;/vaadin-context-menu&gt;
 *
 * &lt;div id="menuListener"&gt;The element that listens for the context menu.&lt;/div&gt;
 * </code></pre>
 * <pre><code class="language-javascript">   const contextMenu = document.querySelector('vaadin-context-menu#customListener');
 *    contextMenu.listenOn = document.querySelector('#menuListener');
 * </code></pre>
 * <h3>Filtering Menu Targets</h3>
 * By default, the listener element and all its descendants open the context menu. You can filter the menu targets to a smaller set of elements inside the listener element by setting the <code>selector</code> property.
 *
 * In the following example, only the elements matching <code>.has-menu</code> will open the context menu:
 *
 * <pre><code class="language-html">&lt;vaadin-context-menu selector=".has-menu"&gt;
 *    &lt;template&gt;
 *      &lt;vaadin-list-box&gt;
 *        ...
 *      &lt;/vaadin-list-box&gt;
 *    &lt;/template&gt;
 *
 *    &lt;p class="has-menu"&gt;This paragraph opens the context menu&lt;/p&gt;
 *    &lt;p&gt;This paragraph does not open the context menu&lt;/p&gt;
 * &lt;/vaadin-context-menu&gt;
 * </code></pre>
 * <h3>Menu Context</h3>
 * You can bind to the following properties in the menu template:
 *
 * <ul>
 *  <li><code>target</code> is the menu opening event target, which is the element that the user has called the context menu for</li>
 *  <li><code>detail</code> is the menu opening event detail</li>
 * </ul>
 * In the following example, the menu item text is composed with the contents of the element that opened the menu:
 *
 * <pre><code class="language-html">&lt;vaadin-context-menu selector="li"&gt;
 *    &lt;template&gt;
 *      &lt;vaadin-list-box&gt;
 *        &lt;vaadin-item&gt;The menu target: [[target.textContent]]&lt;/vaadin-item&gt;
 *      &lt;/vaadin-list-box&gt;
 *    &lt;/template&gt;
 *
 *    &lt;ul&gt;
 *      &lt;li&gt;Foo&lt;/li&gt;
 *      &lt;li&gt;Bar&lt;/li&gt;
 *      &lt;li&gt;Baz&lt;/li&gt;
 *    &lt;/ul&gt;
 * &lt;/vaadin-context-menu&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * <code>&lt;vaadin-context-menu&gt;</code> uses <code>&lt;vaadin-context-menu-overlay&gt;</code> internal themable component as the actual visible context menu overlay. See See <a href="https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html"><code>&lt;vaadin-overlay&gt;</code> documentation</a> for <code>&lt;vaadin-context-menu-overlay&gt;</code> parts.
 *
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-context-menu&gt;</code> is propagated to the internal <code>&lt;vaadin-context-menu-overlay&gt;</code> component. In case of using nested menu items, the <code>theme</code> attribute is also propagated to internal <code>vaadin-context-menu-list-box</code> and <code>vaadin-context-menu-item</code>'s.
 *
 * <strong>Mixins:</strong> ElementMixin, ThemePropertyMixin, ItemsMixin, GestureEventListeners, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-context-menu", external = true)
public class ContextMenu extends HtmlComponent<ContextMenuElement> implements Themable<ContextMenuElement> {

    public ContextMenu() {
    }

    public ContextMenu(String textContent) {
        super(textContent);
    }

    public ContextMenu(Component<?>... components) {
        super(components);
    }

    // !wca! close: (): void
    /**
     * Closes the overlay.
     */
    public void close() {
        getElement().close();
    }

    // !wca! open: (e: Event | undefined): void
    /**
     * Opens the overlay.
     *
     * <strong>e</strong>: used as the context for the menu. Overlay coordinates are taken from this event.
     * @param e
     */
    public void open(@Nullable Event e) {
        getElement().open(e);
    }

    // !wca! get closeOn: string
    /**
     * Event name to listen for closing the context menu.
     */
    public String getCloseOn() {
        return getElement().getCloseOn();
    }

    // !wca! set closeOn: string
    /**
     * Event name to listen for closing the context menu.
     */
    public void setCloseOn(String value) {
        getElement().setCloseOn(value);
    }

    // !wca! observe closeOn: string

    // !wca! get items: ContextMenuItem[] | undefined
    /**
     * Defines a (hierarchical) menu structure for the component.
     * If a menu item has a non-empty <code>children</code> set, a sub-menu with the child items is opened
     * next to the parent menu on mouseover, tap or a right arrow keypress.
     *
     * The items API can't be used together with a renderer or a template!
     *
     * #### Example
     *
     * <code>javascript&lt;br /&gt;contextMenu.items = [&lt;br /&gt; {text: 'Menu Item 1', children:&lt;br /&gt; [&lt;br /&gt; {text: 'Menu Item 1-1', checked: true},&lt;br /&gt; {text: 'Menu Item 1-2'}&lt;br /&gt; ]&lt;br /&gt; },&lt;br /&gt; {component: 'hr'},&lt;br /&gt; {text: 'Menu Item 2', children:&lt;br /&gt; [&lt;br /&gt; {text: 'Menu Item 2-1'},&lt;br /&gt; {text: 'Menu Item 2-2', disabled: true}&lt;br /&gt; ]&lt;br /&gt; },&lt;br /&gt; {text: 'Menu Item 3', disabled: true}&lt;br /&gt;];&lt;br /&gt;</code>
     * @return
     */
    public @Nullable
    Array<ContextMenuItem> getItems() {
        return getElement().getItems();
    }

    // !wca! set items: ContextMenuItem[] | undefined
    /**
     * Defines a (hierarchical) menu structure for the component.
     * If a menu item has a non-empty <code>children</code> set, a sub-menu with the child items is opened
     * next to the parent menu on mouseover, tap or a right arrow keypress.
     *
     * The items API can't be used together with a renderer or a template!
     *
     * #### Example
     *
     * <code>javascript&lt;br /&gt;contextMenu.items = [&lt;br /&gt; {text: 'Menu Item 1', children:&lt;br /&gt; [&lt;br /&gt; {text: 'Menu Item 1-1', checked: true},&lt;br /&gt; {text: 'Menu Item 1-2'}&lt;br /&gt; ]&lt;br /&gt; },&lt;br /&gt; {component: 'hr'},&lt;br /&gt; {text: 'Menu Item 2', children:&lt;br /&gt; [&lt;br /&gt; {text: 'Menu Item 2-1'},&lt;br /&gt; {text: 'Menu Item 2-2', disabled: true}&lt;br /&gt; ]&lt;br /&gt; },&lt;br /&gt; {text: 'Menu Item 3', disabled: true}&lt;br /&gt;];&lt;br /&gt;</code>
     * @param value
     */
    public void setItems(@Nullable Array<ContextMenuItem> value) {
        getElement().setItems(value);
    }

    // !wca! observe items: ContextMenuItem[] | undefined

    // !wca! get listenOn: !HTMLElement
    /**
     * The target element that's listened to for context menu opening events.
     * By default the vaadin-context-menu listens to the target's <code>vaadin-contextmenu</code>
     * events.
     * @return
     */
    public HTMLElement getListenOn() {
        return getElement().getListenOn();
    }

    // !wca! set listenOn: !HTMLElement
    /**
     * The target element that's listened to for context menu opening events.
     * By default the vaadin-context-menu listens to the target's <code>vaadin-contextmenu</code>
     * events.
     * @param value
     */
    public void setListenOn(HTMLElement value) {
        getElement().setListenOn(value);
    }

    // !wca! observe listenOn: !HTMLElement

    // !wca! get openOn: string
    /**
     * Event name to listen for opening the context menu.
     */
    public String getOpenOn() {
        return getElement().getOpenOn();
    }

    // !wca! set openOn: string
    /**
     * Event name to listen for opening the context menu.
     */
    public void setOpenOn(String value) {
        getElement().setOpenOn(value);
    }

    // !wca! observe openOn: string

    // !wca! get opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    public boolean isOpened() {
        return getElement().isOpened();
    }

    // !wca! set opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    public void setOpened(boolean value) {
        getElement().setOpened(value);
    }

    // !wca! observe opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    public ObservableValue<Boolean> opened() {
        return createObservableValue(this::isOpened, this::setOpened, "opened-changed");
    }

    // !wca! get renderer: ContextMenuRenderer | undefined

    // !wca! set renderer: ContextMenuRenderer | undefined
    /**
     * Custom function for rendering the content of the menu overlay.
     * Receives three arguments:
     *
     * - <code>root</code> The root container DOM element. Append your content to it.
     * - <code>contextMenu</code> The reference to the <code>&lt;vaadin-context-menu&gt;</code> element.
     * - <code>context</code> The object with the menu context, contains:
     *  - <code>context.target</code> the target of the menu opening event,
     *  - <code>context.detail</code> the menu opening event detail.
     * @param value
     */
    public void setRenderer(@Nullable ComponentRendererWithContext<ContextMenuRendererContext> value) {
        if (value == null) {
            getElement().setRenderer(null);
            return;
        }
        getElement().setRenderer(((root, element, context) -> value.renderTo(new ParentNodeBackedComponentList<>(root), context)));
    }

    // !wca! observe renderer: ContextMenuRenderer | undefined

    // !wca! get selector: string
    /**
     * CSS selector that can be used to target any child element
     * of the context menu to listen for <code>openOn</code> events.
     */
    public String getSelector() {
        return getElement().getSelector();
    }

    // !wca! set selector: string
    /**
     * CSS selector that can be used to target any child element
     * of the context menu to listen for <code>openOn</code> events.
     */
    public void setSelector(String value) {
        getElement().setSelector(value);
    }

    // !wca! observe selector: string

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined
}
