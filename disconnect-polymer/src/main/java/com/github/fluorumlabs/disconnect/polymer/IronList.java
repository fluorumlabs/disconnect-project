package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.polymer.elements.IronListElement;
import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasComponent;
import com.github.fluorumlabs.disconnect.zero.component.Template;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;
import js.util.collections.Array;

import javax.annotation.Nullable;

/**
 * `iron-list` displays a virtual, 'infinite' list. The template inside
 * the iron-list element represents the DOM to create for each list item.
 * The `items` property specifies an array of list item data.
 * <p>
 * For performance reasons, not every item in the list is rendered at once;
 * instead a small subset of actual template elements *(enough to fill the
 * viewport)* are rendered and reused as the user scrolls. As such, it is important
 * that all state of the list template is bound to the model driving it, since the
 * view may be reused with a new model at any time. Particularly, any state that
 * may change as the result of a user interaction with the list item must be bound
 * to the model to avoid view state inconsistency.
 * <p>
 * ### Sizing iron-list
 * <p>
 * `iron-list` must either be explicitly sized, or delegate scrolling to an
 * explicitly sized parent. By "explicitly sized", we mean it either has an
 * explicit CSS `height` property set via a class or inline style, or else is sized
 * by other layout means (e.g. the `flex` or `fit` classes).
 * <p>
 * #### Flexbox - [jsbin](https://jsbin.com/vejoni/edit?html,output)
 * <p>
 * ```html
 * <template is="x-list">
 * <style>
 * :host {
 * display: block;
 * height: 100vh;
 * display: flex;
 * flex-direction: column;
 * }
 * <p>
 * iron-list {
 * flex: 1 1 auto;
 * }
 * </style>
 * <app-toolbar>App name</app-toolbar>
 * <iron-list items="[[items]]">
 * <template>
 * <div>
 * ...
 * </div>
 * </template>
 * </iron-list>
 * </template>
 * ```
 * #### Explicit size - [jsbin](https://jsbin.com/vopucus/edit?html,output)
 * ```html
 * <template is="x-list">
 * <style>
 * :host {
 * display: block;
 * }
 * <p>
 * iron-list {
 * height: 100vh; /* don't use % values unless the parent element is sized.
 * \/
 * }
 * </style>
 * <iron-list items="[[items]]">
 * <template>
 * <div>
 * ...
 * </div>
 * </template>
 * </iron-list>
 * </template>
 * ```
 * #### Main document scrolling -
 * [jsbin](https://jsbin.com/wevirow/edit?html,output)
 * ```html
 * <head>
 * <style>
 * body {
 * height: 100vh;
 * margin: 0;
 * display: flex;
 * flex-direction: column;
 * }
 * <p>
 * app-toolbar {
 * position: fixed;
 * top: 0;
 * left: 0;
 * right: 0;
 * }
 * <p>
 * iron-list {
 * /* add padding since the app-toolbar is fixed at the top *\/
 * padding-top: 64px;
 * }
 * </style>
 * </head>
 * <body>
 * <app-toolbar>App name</app-toolbar>
 * <iron-list scroll-target="document">
 * <template>
 * <div>
 * ...
 * </div>
 * </template>
 * </iron-list>
 * </body>
 * ```
 * <p>
 * `iron-list` must be given a `<template>` which contains exactly one element. In
 * the examples above we used a `<div>`, but you can provide any element (including
 * custom elements).
 * <p>
 * ### Template model
 * <p>
 * List item templates should bind to template models of the following structure:
 * <p>
 * ```js
 * {
 * index: 0,        // index in the item array
 * selected: false, // true if the current item is selected
 * tabIndex: -1,    // a dynamically generated tabIndex for focus management
 * item: {}         // user data corresponding to items[index]
 * }
 * ```
 * <p>
 * Alternatively, you can change the property name used as data index by changing
 * the `indexAs` property. The `as` property defines the name of the variable to
 * add to the binding scope for the array.
 * <p>
 * For example, given the following `data` array:
 * <p>
 * ##### data.json
 * <p>
 * ```js
 * [
 * {"name": "Bob"},
 * {"name": "Tim"},
 * {"name": "Mike"}
 * ]
 * ```
 * <p>
 * The following code would render the list (note the name property is bound from
 * the model object provided to the template scope):
 * <p>
 * ```html
 * <iron-ajax url="data.json" last-response="{{data}}" auto></iron-ajax>
 * <iron-list items="[[data]]" as="item">
 * <template>
 * <div>
 * Name: [[item.name]]
 * </div>
 * </template>
 * </iron-list>
 * ```
 * <p>
 * ### Grid layout
 * <p>
 * `iron-list` supports a grid layout in addition to linear layout by setting
 * the `grid` attribute.  In this case, the list template item must have both fixed
 * width and height (e.g. via CSS). Based on this, the number of items
 * per row are determined automatically based on the size of the list viewport.
 * <p>
 * ### Accessibility
 * <p>
 * `iron-list` automatically manages the focus state for the items. It also
 * provides a `tabIndex` property within the template scope that can be used for
 * keyboard navigation. For example, users can press the up and down keys to move
 * to previous and next items in the list:
 * <p>
 * ```html
 * <iron-list items="[[data]]" as="item">
 * <template>
 * <div tabindex$="[[tabIndex]]">
 * Name: [[item.name]]
 * </div>
 * </template>
 * </iron-list>
 * ```
 * <p>
 * ### Styling
 * <p>
 * You can use the `--iron-list-items-container` mixin to style the container of
 * items:
 * <p>
 * ```css
 * iron-list {
 * --iron-list-items-container: {
 * margin: auto;
 * };
 * }
 * ```
 * <p>
 * ### Resizing
 * <p>
 * `iron-list` lays out the items when it receives a notification via the
 * `iron-resize` event. This event is fired by any element that implements
 * `IronResizableBehavior`.
 * <p>
 * By default, elements such as `iron-pages`, `paper-tabs` or `paper-dialog` will
 * trigger this event automatically. If you hide the list manually (e.g. you use
 * `display: none`) you might want to implement `IronResizableBehavior` or fire
 * this event manually right after the list became visible again. For example:
 * <p>
 * ```js
 * document.querySelector('iron-list').fire('iron-resize');
 * ```
 * <p>
 * ### When should `<iron-list>` be used?
 * <p>
 * `iron-list` should be used when a page has significantly more DOM nodes than the
 * ones visible on the screen. e.g. the page has 500 nodes, but only 20 are visible
 * at a time. This is why we refer to it as a `virtual` list. In this case, a
 * `dom-repeat` will still create 500 nodes which could slow down the web app, but
 * `iron-list` will only create 20.
 * <p>
 * However, having an `iron-list` does not mean that you can load all the data at
 * once. Say you have a million records in the database, you want to split the data
 * into pages so you can bring in a page at the time. The page could contain 500
 * items, and iron-list will only render 20.
 */
public class IronList<ITEM extends Any>
        extends AbstractComponent<IronListElement<ITEM>>
        implements HasComponent<IronListElement<ITEM>, IronList<ITEM>, Template> {
    public IronList() {
        super("iron-list");
    }

    /**
     * An array containing items determining how many instances of the template
     * to stamp and that that each template instance should bind to.
     */
    @Nullable
    public Array<ITEM> items() {
        return getNode().getItems();
    }

    /**
     * An array containing items determining how many instances of the template
     * to stamp and that that each template instance should bind to.
     */
    public IronList<ITEM> items(ITEM... items) {
        getNode().setItems(items);
        return this;
    }

    public IronList<ITEM> items(Array<ITEM> items) {
        getNode().setItems(items);
        return this;
    }

    /**
     * The name of the variable to add to the binding scope for the array
     * element associated with a given template instance.
     */
    @Nullable
    public String as() {
        return getNode().getAs();
    }

    /**
     * The name of the variable to add to the binding scope for the array
     * element associated with a given template instance.
     */
    public IronList<ITEM> as(String as) {
        getNode().setAs(as);
        return this;
    }

    /**
     * The name of the variable to add to the binding scope with the index
     * for the row.
     */
    @Nullable
    public String indexAs() {
        return getNode().getIndexAs();
    }

    /**
     * The name of the variable to add to the binding scope with the index
     * for the row.
     */
    public IronList<ITEM> indexAs(String indexAs) {
        getNode().setIndexAs(indexAs);
        return this;
    }

    /**
     * The name of the variable to add to the binding scope to indicate
     * if the row is selected.
     */
    @Nullable
    public String selectedAs() {
        return getNode().getSelectedAs();
    }

    /**
     * The name of the variable to add to the binding scope to indicate
     * if the row is selected.
     */
    public IronList<ITEM> selectedAs(String selectedAs) {
        getNode().setSelectedAs(selectedAs);
        return this;
    }

    /**
     * When true, the list is rendered as a grid. Grid items must have
     * fixed width and height set via CSS. e.g.
     * <p>
     * ```html
     * <iron-list grid>
     * <template>
     * <div style="width: 100px; height: 100px;"> 100x100 </div>
     * </template>
     * </iron-list>
     * ```
     */
    public boolean grid() {
        return getNode().isGrid();
    }

    /**
     * When true, the list is rendered as a grid. Grid items must have
     * fixed width and height set via CSS. e.g.
     * <p>
     * ```html
     * <iron-list grid>
     * <template>
     * <div style="width: 100px; height: 100px;"> 100x100 </div>
     * </template>
     * </iron-list>
     * ```
     */
    public IronList<ITEM> grid(boolean grid) {
        getNode().setGrid(grid);
        return this;
    }

    /**
     * When true, tapping a row will select the item, placing its data model
     * in the set of selected items retrievable via the selection property.
     * <p>
     * Note that tapping focusable elements within the list item will not
     * result in selection, since they are presumed to have their * own action.
     */
    public boolean selectionEnabled() {
        return getNode().isSelectionEnabled();
    }

    /**
     * When true, tapping a row will select the item, placing its data model
     * in the set of selected items retrievable via the selection property.
     * <p>
     * Note that tapping focusable elements within the list item will not
     * result in selection, since they are presumed to have their * own action.
     */
    public IronList<ITEM> selectionEnabled(boolean selectionEnabled) {
        getNode().setSelectionEnabled(selectionEnabled);
        return this;
    }

    /**
     * When `multiSelection` is false, this is the currently selected item, or
     * `null` if no item is selected.
     */
    @Nullable
    public ITEM selectedItem() {
        return getNode().getSelectedItem();
    }

    /**
     * When `multiSelection` is false, this is the currently selected item, or
     * `null` if no item is selected.
     */
    public IronList<ITEM> selectedItem(ITEM selectedItem) {
        getNode().setSelectedItem(selectedItem);
        return this;
    }

    /**
     * When `multiSelection` is true, this is an array that contains the
     * selected items.
     */
    @Nullable
    public Array<ITEM> selectedItems() {
        return getNode().getSelectedItems();
    }

    /**
     * When `multiSelection` is true, this is an array that contains the
     * selected items.
     */
    public IronList<ITEM> selectedItems(ITEM... selectedItems) {
        getNode().setSelectedItems(selectedItems);
        return this;
    }

    public IronList<ITEM> selectedItems(Array<ITEM> selectedItems) {
        getNode().setSelectedItems(selectedItems);
        return this;
    }

    /**
     * When `true`, multiple items may be selected at once (in this case,
     * `selected` is an array of currently selected items).  When `false`,
     * only one item may be selected at a time.
     */
    public boolean multiSelection() {
        return getNode().isMultiSelection();
    }

    /**
     * When `true`, multiple items may be selected at once (in this case,
     * `selected` is an array of currently selected items).  When `false`,
     * only one item may be selected at a time.
     */
    public IronList<ITEM> multiSelection(boolean multiSelection) {
        getNode().setMultiSelection(multiSelection);
        return this;
    }

    /**
     * The offset top from the scrolling element to the iron-list element.
     * This value can be computed using the position returned by
     * `getBoundingClientRect()` although it's preferred to use a constant value
     * when possible.
     * <p>
     * This property is useful when an external scrolling element is used and
     * there's some offset between the scrolling element and the list. For
     * example: a header is placed above the list.
     */
    public double scrollOffset() {
        return getNode().getScrollOffset();
    }

    /**
     * The offset top from the scrolling element to the iron-list element.
     * This value can be computed using the position returned by
     * `getBoundingClientRect()` although it's preferred to use a constant value
     * when possible.
     * <p>
     * This property is useful when an external scrolling element is used and
     * there's some offset between the scrolling element and the list. For
     * example: a header is placed above the list.
     */
    public IronList<ITEM> scrollOffset(double scrollOffset) {
        getNode().setScrollOffset(scrollOffset);
        return this;
    }

    /**
     * Gets the index of the first visible item in the viewport.
     */
    public int firstVisibleIndex() {
        return getNode().getFirstVisibleIndex();
    }

    /**
     * FIXME type ?
     * Gets the index of the last visible item in the viewport.
     */
    public int lastVisibleIndex() {
        return getNode().getLastVisibleIndex();
    }

    /**
     * Invoke this method if you dynamically update the viewport's
     * size or CSS padding.
     */
    public void updateViewportBoundaries() {
        getNode().updateViewportBoundaries();
    }

    /**
     * Scroll to a specific item in the virtual list regardless
     * of the physical items in the DOM tree.
     *
     * @param item The item to be scrolled to
     */
    public void scrollToItem(ITEM item) {
        getNode().scrollToItem(item);
    }

    /**
     * Scroll to a specific index in the virtual list regardless
     * of the physical items in the DOM tree.
     *
     * @param idx The index of the item
     */
    public void scrollToIndex(int idx) {
        getNode().scrollToIndex(idx);
    }

    /**
     * Selects the given item.
     *
     * @param item The item instance.
     */
    public void selectItem(ITEM item) {
        getNode().selectItem(item);
    }

    /**
     * Selects the item at the given index in the items array.
     *
     * @param index The index of the item in the items array.
     */
    public void selectIndex(int index) {
        getNode().selectIndex(index);
    }

    /**
     * Deselects the given item.
     *
     * @param item The item instance.
     */
    public void deselectItem(ITEM item) {
        getNode().deselectItem(item);
    }

    /**
     * Deselects the item at the given index in the items array.
     *
     * @param index The index of the item in the items array.
     */
    public void deselectIndex(int index) {
        getNode().deselectIndex(index);
    }

    /**
     * Selects or deselects a given item depending on whether the item
     * has already been selected.
     *
     * @param item The item object.
     */
    public void toggleSelectionForItem(ITEM item) {
        getNode().toggleSelectionForItem(item);
    }

    /**
     * Selects or deselects the item at the given index in the items array
     * depending on whether the item has already been selected.
     *
     * @param index The index of the item in the items array.
     */
    public void toggleSelectionForIndex(int index) {
        getNode().toggleSelectionForIndex(index);
    }

    /**
     * Clears the current selection in the list.
     */
    public void clearSelection() {
        getNode().clearSelection();
    }

    /**
     * Updates the size of a given list item.
     *
     * @param item The item instance.
     */
    public void updateSizeForItem(ITEM item) {
        getNode().updateSizeForItem(item);
    }

    /**
     * Updates the size of the item at the given index in the items array.
     *
     * @param index The index of the item in the items array.
     */
    public void updateSizeForIndex(int index) {
        getNode().updateSizeForIndex(index);
    }

    /**
     * @param idx
     */
    public void focusItem(int idx) {
        getNode().focusItem(idx);
    }

    /**
     * Fired when the `selectedItem` property changes.
     */
    public ObservableEvent<PropertyChangeEvent<ITEM>> SelectedItemChangedEvent() {
        return createEvent("selected-item-changed");
    }

    /**
     * Fired when the `selectedItems` property changes.
     */
    public ObservableEvent<PropertyChangeEvent<ITEM>> SelectedItemsChangedEvent() {
        return createEvent("selected-items-changed");
    }
}
