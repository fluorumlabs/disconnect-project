package com.github.fluorumlabs.disconnect.polymer.ironlist;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponentWithItem;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import com.github.fluorumlabs.disconnect.core.observables.Observable;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.core.utils.SerDes;
import com.github.fluorumlabs.disconnect.polymer.HasTemplate;
import js.lang.external.polymer.ironlist.IronListElement;
import js.web.dom.HTMLElement;

import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.List;

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
@CustomElement(tagName = "iron-list", external = true)
public class IronList<T extends Serializable> extends HtmlComponentWithItem<T, IronListElement<Mirrored<T>>> implements HasTemplate {
    public IronList() {
    }

    public IronList(String textContent) {
        makeTemplate(textContent);
    }

    public IronList(Component<?>... components) {
        makeTemplate(components);
    }

    public IronList(Class<T> itemClass) {
        super(itemClass);
    }

    public IronList(Class<T> itemClass, String textContent) {
        super(itemClass);
        makeTemplate(textContent);
    }

    public IronList(Class<T> itemClass, Component<?>... components) {
        super(itemClass);
        makeTemplate(components);
    }

    // !wca! assignParentResizable: (parentResizable: any): void

    // !wca! clearSelection: (): void
    /**
     * Clears the current selection in the list.
     */
    public void clearSelection() {
        getElement().clearSelection();
    }

    // !wca! deselectIndex: (index: number): void
    /**
     * Deselects the item at the given index in the items array.
     *
     * <strong>index</strong>: The index of the item in the items array.
     */
    public void deselectIndex(int index) {
        getElement().deselectIndex(index);
    }

    // !wca! deselectItem: (item: object | null): any
    /**
     * Deselects the given item.
     *
     * <strong>item</strong>: The item instance.
     */
    public void deselectItem(@Nullable T item) {
        getElement().deselectItem(SerDes.mirror(item));
    }

    // !wca! focusItem: (idx: any): void
    /**
     */
    public void focusItem(int idx) {
        getElement().focusItem(idx);
    }

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
    public void scrollToIndex(int idx) {
        getElement().scrollToIndex(idx);
    }

    // !wca! scrollToItem: (item: object | null): any
    /**
     * Scroll to a specific item in the virtual list regardless
     * of the physical items in the DOM tree.
     *
     * <strong>item</strong>: The item to be scrolled to
     */
    public void scrollToItem(@Nullable T item) {
        getElement().scrollToItem(SerDes.mirror(item));
    }

    // !wca! selectIndex: (index: number): void
    /**
     * Selects the item at the given index in the items array.
     *
     * <strong>index</strong>: The index of the item in the items array.
     */
    public void selectIndex(int index) {
        getElement().selectIndex(index);
    }

    // !wca! selectItem: (item: object | null): any
    /**
     * Selects the given item.
     *
     * <strong>item</strong>: The item instance.
     */
    public void selectItem(@Nullable T item) {
        getElement().selectItem(SerDes.mirror(item));
    }

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
    public void toggleSelectionForIndex(int index) {
        getElement().toggleSelectionForIndex(index);
    }

    // !wca! toggleSelectionForItem: (item: object | null): any
    /**
     * Selects or deselects a given item depending on whether the item
     * has already been selected.
     *
     * <strong>item</strong>: The item object.
     */
    public void toggleSelectionForItem(@Nullable T item) {
        getElement().toggleSelectionForItem(SerDes.mirror(item));
    }

    // !wca! updateSizeForIndex: (index: number): any
    /**
     * Updates the size of the item at the given index in the items array.
     *
     * <strong>index</strong>: The index of the item in the items array.
     */
    public void updateSizeForIndex(int index) {
        getElement().updateSizeForIndex(index);
    }

    // !wca! updateSizeForItem: (item: object | null): any
    /**
     * Updates the size of a given list item.
     *
     * <strong>item</strong>: The item instance.
     */
    public void updateSizeForItem(@Nullable T item) {
        getElement().updateSizeForItem(SerDes.mirror(item));
    }

    // !wca! updateViewportBoundaries: (): void
    /**
     * Invoke this method if you dynamically update the viewport's
     * size or CSS padding.
     */
    public void updateViewportBoundaries() {
        getElement().updateViewportBoundaries();
    }

    // !wca! get as: string | null | undefined
    /**
     * The name of the variable to add to the binding scope for the array
     * element associated with a given template instance.
     */
    @Nullable
    public String getAs() {
        return getElement().getAs();
    }

    // !wca! set as: string | null | undefined
    /**
     * The name of the variable to add to the binding scope for the array
     * element associated with a given template instance.
     */
    public void setAs(@Nullable String value) {
        getElement().setAs(value);
    }

    // !wca! observe as: string | null | undefined

    // !wca! get firstVisibleIndex: ?
    /**
     * Gets the index of the first visible item in the viewport.
     */
    public int getFirstVisibleIndex() {
        return getElement().getFirstVisibleIndex();
    }

    // !wca! observe firstVisibleIndex: ?
    /**
     * Gets the index of the first visible item in the viewport.
     */
    public Observable<Integer> firstVisibleIndex() {
        return createObservable(this::getFirstVisibleIndex, "first-visible-index-changed");
    }

    // !wca! get grid: boolean | null | undefined
    /**
     * When true, the list is rendered as a grid. Grid items must have
     * fixed width and height set via CSS. e.g.
     *
     * <code>html&lt;br /&gt;&lt;iron-list grid&gt;&lt;br /&gt; &lt;template&gt;&lt;br /&gt; &lt;div style="width: 100px; height: 100px;"&gt; 100x100 &lt;/div&gt;&lt;br /&gt; &lt;/template&gt;&lt;br /&gt;&lt;/iron-list&gt;&lt;br /&gt;</code>
     */
    public boolean isGrid() {
        return getElement().isGrid();
    }

    // !wca! set grid: boolean | null | undefined
    /**
     * When true, the list is rendered as a grid. Grid items must have
     * fixed width and height set via CSS. e.g.
     *
     * <code>html&lt;br /&gt;&lt;iron-list grid&gt;&lt;br /&gt; &lt;template&gt;&lt;br /&gt; &lt;div style="width: 100px; height: 100px;"&gt; 100x100 &lt;/div&gt;&lt;br /&gt; &lt;/template&gt;&lt;br /&gt;&lt;/iron-list&gt;&lt;br /&gt;</code>
     */
    public void setGrid(boolean value) {
        getElement().setGrid(value);
    }

    // !wca! observe grid: boolean | null | undefined

    // !wca! get indexAs: string | null | undefined
    /**
     * The name of the variable to add to the binding scope with the index
     * for the row.
     */
    @Nullable
    public String getIndexAs() {
        return getElement().getIndexAs();
    }

    // !wca! set indexAs: string | null | undefined
    /**
     * The name of the variable to add to the binding scope with the index
     * for the row.
     */
    public void setIndexAs(@Nullable String value) {
        getElement().setIndexAs(value);
    }

    // !wca! observe indexAs: string | null | undefined

    // !wca! get items: any[] | null | undefined
    /**
     * An array containing items determining how many instances of the template
     * to stamp and that that each template instance should bind to.
     */
    @Nullable
    public List<T> getItems() {
        return SerDes.unmirrorList(getElement().getItems(), getItemClass());
    }

    // !wca! set items: any[] | null | undefined
    /**
     * An array containing items determining how many instances of the template
     * to stamp and that that each template instance should bind to.
     */
    public void setItems(@Nullable List<T> value) {
        getElement().setItems(SerDes.mirror(value).cast());
    }

    // !wca! observe items: any[] | null | undefined
    /**
     * An array containing items determining how many instances of the template
     * to stamp and that that each template instance should bind to.
     */
    public ObservableValue<List<T>> items() {
        return createObservableValue(this::getItems, this::setItems, "items-changed");
    }

    // !wca! get lastVisibleIndex: ?
    /**
     * Gets the index of the last visible item in the viewport.
     */
    public int getLastVisibleIndex() {
        return getElement().getLastVisibleIndex();
    }

    // !wca! observe lastVisibleIndex: ?
    /**
     * Gets the index of the last visible item in the viewport.
     */
    public Observable<Integer> lastVisibleIndex() {
        return createObservable(this::getLastVisibleIndex, "last-visible-index-changed");
    }

    // !wca! get multiSelection: boolean | null | undefined
    /**
     * When <code>true</code>, multiple items may be selected at once (in this case,
     * <code>selected</code> is an array of currently selected items). When <code>false</code>,
     * only one item may be selected at a time.
     */
    public boolean isMultiSelection() {
        return getElement().isMultiSelection();
    }

    // !wca! set multiSelection: boolean | null | undefined
    /**
     * When <code>true</code>, multiple items may be selected at once (in this case,
     * <code>selected</code> is an array of currently selected items). When <code>false</code>,
     * only one item may be selected at a time.
     */
    public void setMultiSelection(boolean value) {
        getElement().setMultiSelection(value);
    }

    // !wca! observe multiSelection: boolean | null | undefined

    // !wca! get mutableData: boolean | null | undefined
    /**
     * Instance-level flag for configuring the dirty-checking strategy
     * for this element. When true, Objects and Arrays will skip dirty
     * checking, otherwise strict equality checking will be used.
     */
    public boolean isMutableData() {
        return getElement().isMutableData();
    }

    // !wca! set mutableData: boolean | null | undefined
    /**
     * Instance-level flag for configuring the dirty-checking strategy
     * for this element. When true, Objects and Arrays will skip dirty
     * checking, otherwise strict equality checking will be used.
     */
    public void setMutableData(boolean value) {
        getElement().setMutableData(value);
    }

    // !wca! observe mutableData: boolean | null | undefined

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
    public double getScrollOffset() {
        return getElement().getScrollOffset();
    }

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
    public void setScrollOffset(double value) {
        getElement().setScrollOffset(value);
    }

    // !wca! observe scrollOffset: number | null | undefined
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
    public ObservableValue<Double> scrollOffset() {
        return createObservableValue(this::getScrollOffset, this::setScrollOffset, "scroll-offset-changed");
    }

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
    @Nullable
    public Component<? extends HTMLElement> getScrollTarget() {
        return TagRegistry.recover(getElement().getScrollTarget());
    }

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
    public void setScrollTarget(@Nullable Component<? extends HTMLElement> value) {
        getElement().setScrollTarget(value == null ? null : value.getElement());
    }

    // !wca! observe scrollTarget: HTMLElement | null

    // !wca! get selectedAs: string | null | undefined
    /**
     * The name of the variable to add to the binding scope to indicate
     * if the row is selected.
     */
    @Nullable
    public String getSelectedAs() {
        return getElement().getSelectedAs();
    }

    // !wca! set selectedAs: string | null | undefined
    /**
     * The name of the variable to add to the binding scope to indicate
     * if the row is selected.
     */
    public void setSelectedAs(@Nullable String value) {
        getElement().setSelectedAs(value);
    }

    // !wca! observe selectedAs: string | null | undefined

    // !wca! get selectedItem: object | null | undefined
    /**
     * When <code>multiSelection</code> is false, this is the currently selected item, or
     * <code>null</code> if no item is selected.
     */
    @Nullable
    public T getSelectedItem() {
        return SerDes.unmirror(getElement().getSelectedItem(), getItemClass());
    }

    // !wca! set selectedItem: object | null | undefined
    /**
     * When <code>multiSelection</code> is false, this is the currently selected item, or
     * <code>null</code> if no item is selected.
     */
    public void setSelectedItem(@Nullable T value) {
        getElement().setSelectedItem(SerDes.mirror(value));
    }

    // !wca! observe selectedItem: object | null | undefined
    /**
     * When <code>multiSelection</code> is false, this is the currently selected item, or
     * <code>null</code> if no item is selected.
     */
    public ObservableValue<T> selectedItem() {
        return createObservableValue(this::getSelectedItem, this::setSelectedItem, "selected-item-changed");
    }

    // !wca! get selectedItems: object | null | undefined
    /**
     * When <code>multiSelection</code> is true, this is an array that contains the
     * selected items.
     */
    public @Nullable List<T> getSelectedItems() {
        return SerDes.unmirrorList(getElement().getSelectedItems(), getItemClass());
    }

    // !wca! set selectedItems: object | null | undefined
    /**
     * When <code>multiSelection</code> is true, this is an array that contains the
     * selected items.
     */
    public void setSelectedItems(@Nullable List<T> value) {
        getElement().setSelectedItems(SerDes.mirror(value).cast());
    }

    // !wca! observe selectedItems: object | null | undefined
    /**
     * When <code>multiSelection</code> is true, this is an array that contains the
     * selected items.
     */
    public ObservableValue<List<T>> selectedItems() {
        return createObservableValue(this::getSelectedItems, this::setSelectedItems, "selected-items-changed");
    }

    // !wca! get selectionEnabled: boolean | null | undefined
    /**
     * When true, tapping a row will select the item, placing its data model
     * in the set of selected items retrievable via the selection property.
     *
     * Note that tapping focusable elements within the list item will not
     * result in selection, since they are presumed to have their * own action.
     */
    public boolean isSelectionEnabled() {
        return getElement().isSelectionEnabled();
    }

    // !wca! set selectionEnabled: boolean | null | undefined
    /**
     * When true, tapping a row will select the item, placing its data model
     * in the set of selected items retrievable via the selection property.
     *
     * Note that tapping focusable elements within the list item will not
     * result in selection, since they are presumed to have their * own action.
     */
    public void setSelectionEnabled(boolean value) {
        getElement().setSelectionEnabled(value);
    }

    // !wca! observe selectionEnabled: boolean | null | undefined
}
