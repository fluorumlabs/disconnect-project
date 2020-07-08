package js.lang.external.polymer.ironlist;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>iron-list</code> displays a virtual, 'infinite' list. The template inside the iron-list element represents the DOM to create for each list item. The <code>items</code> property specifies an array of list item data.
 *
 * For performance reasons, not every item in the list is rendered at once; instead a small subset of actual template elements <em>(enough to fill the viewport)</em> are rendered and reused as the user scrolls. As such, it is important that all state of the list template is bound to the model driving it, since the view may be reused with a new model at any time. Particularly, any state that may change as the result of a user interaction with the list item must be bound to the model to avoid view state inconsistency.
 *
 * <h3>Sizing iron-list</h3>
 * <code>iron-list</code> must either be explicitly sized, or delegate scrolling to an explicitly sized parent. By "explicitly sized", we mean it either has an explicit CSS <code>height</code> property set via a class or inline style, or else is sized by other layout means (e.g. the <code>flex</code> or <code>fit</code> classes).
 *
 * <h4>Flexbox - <a href="https://jsbin.com/vejoni/edit?html,output">jsbin</a></h4>
 * <pre><code class="language-html">&lt;template is="x-list"&gt;
 *    &lt;style&gt;
 *      :host {
 *        display: block;
 *        height: 100vh;
 *        display: flex;
 *        flex-direction: column;
 *      }
 *
 *      iron-list {
 *        flex: 1 1 auto;
 *      }
 *    &lt;/style&gt;
 *    &lt;app-toolbar&gt;App name&lt;/app-toolbar&gt;
 *    &lt;iron-list items="[[items]]"&gt;
 *      &lt;template&gt;
 *        &lt;div&gt;
 *          ...
 *        &lt;/div&gt;
 *      &lt;/template&gt;
 *    &lt;/iron-list&gt;
 * &lt;/template&gt;
 * </code></pre>
 * <h4>Explicit size - <a href="https://jsbin.com/vopucus/edit?html,output">jsbin</a></h4>
 * <pre><code class="language-html">&lt;template is="x-list"&gt;
 *    &lt;style&gt;
 *      :host {
 *        display: block;
 *      }
 *
 *      iron-list {
 *        height: 100vh; /* don't use % values unless the parent element is sized.
 * \/
 *      }
 *    &lt;/style&gt;
 *    &lt;iron-list items="[[items]]"&gt;
 *      &lt;template&gt;
 *        &lt;div&gt;
 *          ...
 *        &lt;/div&gt;
 *      &lt;/template&gt;
 *    &lt;/iron-list&gt;
 * &lt;/template&gt;
 * </code></pre>
 * <h4>Main document scrolling -</h4>
 * <a href="https://jsbin.com/wevirow/edit?html,output">jsbin</a>
 *
 * <pre><code class="language-html">&lt;head&gt;
 *    &lt;style&gt;
 *      body {
 *        height: 100vh;
 *        margin: 0;
 *        display: flex;
 *        flex-direction: column;
 *      }
 *
 *      app-toolbar {
 *        position: fixed;
 *        top: 0;
 *        left: 0;
 *        right: 0;
 *      }
 *
 *      iron-list {
 *        /* add padding since the app-toolbar is fixed at the top *\/
 *        padding-top: 64px;
 *      }
 *    &lt;/style&gt;
 * &lt;/head&gt;
 * &lt;body&gt;
 *    &lt;app-toolbar&gt;App name&lt;/app-toolbar&gt;
 *    &lt;iron-list scroll-target="document"&gt;
 *      &lt;template&gt;
 *        &lt;div&gt;
 *          ...
 *        &lt;/div&gt;
 *      &lt;/template&gt;
 *    &lt;/iron-list&gt;
 * &lt;/body&gt;
 * </code></pre>
 * <code>iron-list</code> must be given a <code>&lt;template&gt;</code> which contains exactly one element. In the examples above we used a <code>&lt;div&gt;</code>, but you can provide any element (including custom elements).
 *
 * <h3>Template model</h3>
 * List item templates should bind to template models of the following structure:
 *
 * <pre><code class="language-js">{
 *    index: 0,        // index in the item array
 *    selected: false, // true if the current item is selected
 *    tabIndex: -1,    // a dynamically generated tabIndex for focus management
 *    item: {}         // user data corresponding to items[index]
 * }
 * </code></pre>
 * Alternatively, you can change the property name used as data index by changing the <code>indexAs</code> property. The <code>as</code> property defines the name of the variable to add to the binding scope for the array.
 *
 * For example, given the following <code>data</code> array:
 *
 * <h5>data.json</h5>
 * <pre><code class="language-js">[
 *    {"name": "Bob"},
 *    {"name": "Tim"},
 *    {"name": "Mike"}
 * ]
 * </code></pre>
 * The following code would render the list (note the name property is bound from the model object provided to the template scope):
 *
 * <pre><code class="language-html">&lt;iron-ajax url="data.json" last-response="{{data}}" auto&gt;&lt;/iron-ajax&gt;
 * &lt;iron-list items="[[data]]" as="item"&gt;
 *    &lt;template&gt;
 *      &lt;div&gt;
 *        Name: [[item.name]]
 *      &lt;/div&gt;
 *    &lt;/template&gt;
 * &lt;/iron-list&gt;
 * </code></pre>
 * <h3>Grid layout</h3>
 * <code>iron-list</code> supports a grid layout in addition to linear layout by setting the <code>grid</code> attribute. In this case, the list template item must have both fixed width and height (e.g. via CSS). Based on this, the number of items per row are determined automatically based on the size of the list viewport.
 *
 * <h3>Accessibility</h3>
 * <code>iron-list</code> automatically manages the focus state for the items. It also provides a <code>tabIndex</code> property within the template scope that can be used for keyboard navigation. For example, users can press the up and down keys to move to previous and next items in the list:
 *
 * <pre><code class="language-html">&lt;iron-list items="[[data]]" as="item"&gt;
 *    &lt;template&gt;
 *      &lt;div tabindex$="[[tabIndex]]"&gt;
 *        Name: [[item.name]]
 *      &lt;/div&gt;
 *    &lt;/template&gt;
 * &lt;/iron-list&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * You can use the <code>--iron-list-items-container</code> mixin to style the container of items:
 *
 * <pre><code class="language-css">iron-list {
 *   --iron-list-items-container: {
 *      margin: auto;
 *    };
 * }
 * </code></pre>
 * <h3>Resizing</h3>
 * <code>iron-list</code> lays out the items when it receives a notification via the <code>iron-resize</code> event. This event is fired by any element that implements <code>IronResizableBehavior</code>.
 *
 * By default, elements such as <code>iron-pages</code>, <code>paper-tabs</code> or <code>paper-dialog</code> will trigger this event automatically. If you hide the list manually (e.g. you use <code>display: none</code>) you might want to implement <code>IronResizableBehavior</code> or fire this event manually right after the list became visible again. For example:
 *
 * <pre><code class="language-js">document.querySelector('iron-list').fire('iron-resize');
 * </code></pre>
 * <h3>When should <code>&lt;iron-list&gt;</code> be used?</h3>
 * <code>iron-list</code> should be used when a page has significantly more DOM nodes than the ones visible on the screen. e.g. the page has 500 nodes, but only 20 are visible at a time. This is why we refer to it as a <code>virtual</code> list. In this case, a <code>dom-repeat</code> will still create 500 nodes which could slow down the web app, but <code>iron-list</code> will only create 20.
 *
 * However, having an <code>iron-list</code> does not mean that you can load all the data at once. Say you have a million records in the database, you want to split the data into pages so you can bring in a page at the time. The page could contain 500 items, and iron-list will only render 20.
 */
@NpmPackage(name = "@polymer/iron-list", version = "^3.1.0")
@Import(module = "@polymer/iron-list/iron-list.js")
public interface IronListElement<T extends Any> extends HTMLElement {

    // !wca! assignParentResizable: (parentResizable: any): void

    // !wca! clearSelection: (): void
    /**
     * Clears the current selection in the list.
     */
    @JSMethod("clearSelection")
    void clearSelection();

    // !wca! deselectIndex: (index: number): void
    /**
     * Deselects the item at the given index in the items array.
     *
     * <strong>index</strong>: The index of the item in the items array.
     */
    @JSMethod("deselectIndex")
    void deselectIndex(int index);

    // !wca! deselectItem: (item: object | null): any
    /**
     * Deselects the given item.
     *
     * <strong>item</strong>: The item instance.
     */
    @JSMethod("deselectItem")
    void deselectItem(@Nullable T item);

    // !wca! focusItem: (idx: any): void
    /**
     */
    @JSMethod("focusItem")
    void focusItem(int idx);

    // !wca! modelForElement: (el: HTMLElement | null): TemplateInstanceBase | null

    // !wca! notifyResize: (): void

    // !wca! resizerShouldNotify: (element: HTMLElement | null): boolean

    // !wca! scrollToIndex: (idx: number): void
    /**
     * Scroll to a specific index in the virtual list regardless
     * of the physical items in the DOM tree.
     *
     * <strong>idx</strong>: The index of the item
     */
    @JSMethod("scrollToIndex")
    void scrollToIndex(int idx);

    // !wca! scrollToItem: (item: object | null): any
    /**
     * Scroll to a specific item in the virtual list regardless
     * of the physical items in the DOM tree.
     *
     * <strong>item</strong>: The item to be scrolled to
     */
    @JSMethod("scrollToItem")
    void scrollToItem(@Nullable T item);

    // !wca! selectIndex: (index: number): void
    /**
     * Selects the item at the given index in the items array.
     *
     * <strong>index</strong>: The index of the item in the items array.
     */
    @JSMethod("selectIndex")
    void selectIndex(int index);

    // !wca! selectItem: (item: object | null): any
    /**
     * Selects the given item.
     *
     * <strong>item</strong>: The item instance.
     */
    @JSMethod("selectItem")
    void selectItem(@Nullable T item);

    // !wca! stamp: (model?: object | null | undefined): TemplateInstanceBase | null

    // !wca! stopResizeNotificationsFor: (target: any): void

    // !wca! templatize: (template: HTMLTemplateElement, mutableData?: boolean | undefined): void

    // !wca! toggleScrollListener: (yes: boolean): void

    // !wca! toggleSelectionForIndex: (index: number): void
    /**
     * Selects or deselects the item at the given index in the items array
     * depending on whether the item has already been selected.
     *
     * <strong>index</strong>: The index of the item in the items array.
     */
    @JSMethod("toggleSelectionForIndex")
    void toggleSelectionForIndex(int index);

    // !wca! toggleSelectionForItem: (item: object | null): any
    /**
     * Selects or deselects a given item depending on whether the item
     * has already been selected.
     *
     * <strong>item</strong>: The item object.
     */
    @JSMethod("toggleSelectionForItem")
    void toggleSelectionForItem(@Nullable T item);

    // !wca! updateSizeForIndex: (index: number): any
    /**
     * Updates the size of the item at the given index in the items array.
     *
     * <strong>index</strong>: The index of the item in the items array.
     */
    @JSMethod("updateSizeForIndex")
    void updateSizeForIndex(double index);

    // !wca! updateSizeForItem: (item: object | null): any
    /**
     * Updates the size of a given list item.
     *
     * <strong>item</strong>: The item instance.
     */
    @JSMethod("updateSizeForItem")
    void updateSizeForItem(@Nullable T item);

    // !wca! updateViewportBoundaries: (): void
    /**
     * Invoke this method if you dynamically update the viewport's
     * size or CSS padding.
     */
    @JSMethod("updateViewportBoundaries")
    void updateViewportBoundaries();

    // !wca! get as: string | null | undefined
    /**
     * The name of the variable to add to the binding scope for the array
     * element associated with a given template instance.
     */
    @JSProperty("as")
    @Nullable
    String getAs();

    // !wca! set as: string | null | undefined
    /**
     * The name of the variable to add to the binding scope for the array
     * element associated with a given template instance.
     */
    @JSProperty("as")
    void setAs(@Nullable String value);

    // !wca! get firstVisibleIndex: ?
    /**
     * Gets the index of the first visible item in the viewport.
     */
    @JSProperty("firstVisibleIndex")
    int getFirstVisibleIndex();

    // !wca! get grid: boolean | null | undefined
    /**
     * When true, the list is rendered as a grid. Grid items must have
     * fixed width and height set via CSS. e.g.
     *
     * <code>html&lt;br /&gt;&lt;iron-list grid&gt;&lt;br /&gt; &lt;template&gt;&lt;br /&gt; &lt;div style="width: 100px; height: 100px;"&gt; 100x100 &lt;/div&gt;&lt;br /&gt; &lt;/template&gt;&lt;br /&gt;&lt;/iron-list&gt;&lt;br /&gt;</code>
     */
    @JSProperty("grid")
    boolean isGrid();

    // !wca! set grid: boolean | null | undefined
    /**
     * When true, the list is rendered as a grid. Grid items must have
     * fixed width and height set via CSS. e.g.
     *
     * <code>html&lt;br /&gt;&lt;iron-list grid&gt;&lt;br /&gt; &lt;template&gt;&lt;br /&gt; &lt;div style="width: 100px; height: 100px;"&gt; 100x100 &lt;/div&gt;&lt;br /&gt; &lt;/template&gt;&lt;br /&gt;&lt;/iron-list&gt;&lt;br /&gt;</code>
     */
    @JSProperty("grid")
    void setGrid(boolean value);

    // !wca! get indexAs: string | null | undefined
    /**
     * The name of the variable to add to the binding scope with the index
     * for the row.
     */
    @JSProperty("indexAs")
    @Nullable
    String getIndexAs();

    // !wca! set indexAs: string | null | undefined
    /**
     * The name of the variable to add to the binding scope with the index
     * for the row.
     */
    @JSProperty("indexAs")
    void setIndexAs(@Nullable String value);

    // !wca! get items: any[] | null | undefined
    /**
     * An array containing items determining how many instances of the template
     * to stamp and that that each template instance should bind to.
     */
    @JSProperty("items")
    @Nullable
    Array<T> getItems();

    // !wca! set items: any[] | null | undefined
    /**
     * An array containing items determining how many instances of the template
     * to stamp and that that each template instance should bind to.
     */
    @JSProperty("items")
    void setItems(@Nullable Array<T> value);

    // !wca! get lastVisibleIndex: ?
    /**
     * Gets the index of the last visible item in the viewport.
     */
    @JSProperty("lastVisibleIndex")
    int getLastVisibleIndex();

    // !wca! get multiSelection: boolean | null | undefined
    /**
     * When <code>true</code>, multiple items may be selected at once (in this case,
     * <code>selected</code> is an array of currently selected items). When <code>false</code>,
     * only one item may be selected at a time.
     */
    @JSProperty("multiSelection")
    boolean isMultiSelection();

    // !wca! set multiSelection: boolean | null | undefined
    /**
     * When <code>true</code>, multiple items may be selected at once (in this case,
     * <code>selected</code> is an array of currently selected items). When <code>false</code>,
     * only one item may be selected at a time.
     */
    @JSProperty("multiSelection")
    void setMultiSelection(boolean value);

    // !wca! get mutableData: boolean | null | undefined
    /**
     * Instance-level flag for configuring the dirty-checking strategy
     * for this element. When true, Objects and Arrays will skip dirty
     * checking, otherwise strict equality checking will be used.
     */
    @JSProperty("mutableData")
    boolean isMutableData();

    // !wca! set mutableData: boolean | null | undefined
    /**
     * Instance-level flag for configuring the dirty-checking strategy
     * for this element. When true, Objects and Arrays will skip dirty
     * checking, otherwise strict equality checking will be used.
     */
    @JSProperty("mutableData")
    void setMutableData(boolean value);

    // !wca! get scrollOffset: number | null | undefined
    /**
     * The offset top from the scrolling element to the iron-list element.
     * This value can be computed using the position returned by
     * <code>getBoundingClientRect()</code> although it's preferred to use a constant value
     * when possible.
     *
     * This property is useful when an external scrolling element is used and
     * there's some offset between the scrolling element and the list. For
     * example: a header is placed above the list.
     */
    @JSProperty("scrollOffset")
    double getScrollOffset();

    // !wca! set scrollOffset: number | null | undefined
    /**
     * The offset top from the scrolling element to the iron-list element.
     * This value can be computed using the position returned by
     * <code>getBoundingClientRect()</code> although it's preferred to use a constant value
     * when possible.
     *
     * This property is useful when an external scrolling element is used and
     * there's some offset between the scrolling element and the list. For
     * example: a header is placed above the list.
     */
    @JSProperty("scrollOffset")
    void setScrollOffset(double value);

    // !wca! get scrollTarget: HTMLElement | null
    /**
     * Specifies the element that will handle the scroll event
     * on the behalf of the current element. This is typically a reference to an
     * element, but there are a few more posibilities:
     *
     * ### Elements id
     *
     * <code>html&lt;br /&gt;&lt;div id="scrollable-element" style="overflow: auto;"&gt;&lt;br /&gt; &lt;x-element scroll-target="scrollable-element"&gt;&lt;br /&gt; &lt;!-- Content--&gt;&lt;br /&gt; &lt;/x-element&gt;&lt;br /&gt;&lt;/div&gt;&lt;br /&gt;</code>
     * In this case, the <code>scrollTarget</code> will point to the outer div element.
     *
     * ### Document scrolling
     *
     * For document scrolling, you can use the reserved word <code>document</code>:
     *
     * <code>html&lt;br /&gt;&lt;x-element scroll-target="document"&gt;&lt;br /&gt; &lt;!-- Content --&gt;&lt;br /&gt;&lt;/x-element&gt;&lt;br /&gt;</code>
     *
     * ### Elements reference
     *
     * <code>js&lt;br /&gt;appHeader.scrollTarget = document.querySelector('#scrollable-element');&lt;br /&gt;</code>
     */
    @JSProperty("scrollTarget")
    @Nullable
    HTMLElement getScrollTarget();

    // !wca! set scrollTarget: HTMLElement | null
    /**
     * Specifies the element that will handle the scroll event
     * on the behalf of the current element. This is typically a reference to an
     * element, but there are a few more posibilities:
     *
     * ### Elements id
     *
     * <code>html&lt;br /&gt;&lt;div id="scrollable-element" style="overflow: auto;"&gt;&lt;br /&gt; &lt;x-element scroll-target="scrollable-element"&gt;&lt;br /&gt; &lt;!-- Content--&gt;&lt;br /&gt; &lt;/x-element&gt;&lt;br /&gt;&lt;/div&gt;&lt;br /&gt;</code>
     * In this case, the <code>scrollTarget</code> will point to the outer div element.
     *
     * ### Document scrolling
     *
     * For document scrolling, you can use the reserved word <code>document</code>:
     *
     * <code>html&lt;br /&gt;&lt;x-element scroll-target="document"&gt;&lt;br /&gt; &lt;!-- Content --&gt;&lt;br /&gt;&lt;/x-element&gt;&lt;br /&gt;</code>
     *
     * ### Elements reference
     *
     * <code>js&lt;br /&gt;appHeader.scrollTarget = document.querySelector('#scrollable-element');&lt;br /&gt;</code>
     */
    @JSProperty("scrollTarget")
    void setScrollTarget(@Nullable HTMLElement value);

    // !wca! get selectedAs: string | null | undefined
    /**
     * The name of the variable to add to the binding scope to indicate
     * if the row is selected.
     */
    @JSProperty("selectedAs")
    @Nullable
    String getSelectedAs();

    // !wca! set selectedAs: string | null | undefined
    /**
     * The name of the variable to add to the binding scope to indicate
     * if the row is selected.
     */
    @JSProperty("selectedAs")
    void setSelectedAs(@Nullable String value);

    // !wca! get selectedItem: object | null | undefined
    /**
     * When <code>multiSelection</code> is false, this is the currently selected item, or
     * <code>null</code> if no item is selected.
     */
    @JSProperty("selectedItem")
    @Nullable
    T getSelectedItem();

    // !wca! set selectedItem: object | null | undefined
    /**
     * When <code>multiSelection</code> is false, this is the currently selected item, or
     * <code>null</code> if no item is selected.
     */
    @JSProperty("selectedItem")
    void setSelectedItem(@Nullable T value);

    // !wca! get selectedItems: object | null | undefined
    /**
     * When <code>multiSelection</code> is true, this is an array that contains the
     * selected items.
     */
    @JSProperty("selectedItems")
    @Nullable
    Array<T> getSelectedItems();

    // !wca! set selectedItems: object | null | undefined
    /**
     * When <code>multiSelection</code> is true, this is an array that contains the
     * selected items.
     */
    @JSProperty("selectedItems")
    void setSelectedItems(@Nullable Array<T> value);

    // !wca! get selectionEnabled: boolean | null | undefined
    /**
     * When true, tapping a row will select the item, placing its data model
     * in the set of selected items retrievable via the selection property.
     *
     * Note that tapping focusable elements within the list item will not
     * result in selection, since they are presumed to have their * own action.
     */
    @JSProperty("selectionEnabled")
    boolean isSelectionEnabled();

    // !wca! set selectionEnabled: boolean | null | undefined
    /**
     * When true, tapping a row will select the item, placing its data model
     * in the set of selected items retrievable via the selection property.
     *
     * Note that tapping focusable elements within the list item will not
     * result in selection, since they are presumed to have their * own action.
     */
    @JSProperty("selectionEnabled")
    void setSelectionEnabled(boolean value);
}
