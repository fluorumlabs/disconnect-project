package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

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
@Import(
        symbols = "IronList",
        module = "@polymer/iron-list/iron-list.js"
)
public interface IronListElement<ITEM extends Any> extends Polymer, HTMLElement {
    /**
     * An array containing items determining how many instances of the template
     * to stamp and that that each template instance should bind to.
     */
    @Nullable
    @JSProperty
    Array<ITEM> getItems();

    /**
     * An array containing items determining how many instances of the template
     * to stamp and that that each template instance should bind to.
     */
    @JSProperty
    void setItems(@JSByRef ITEM... items);
    @JSProperty
    void setItems(Array<ITEM> items);

    /**
     * The name of the variable to add to the binding scope for the array
     * element associated with a given template instance.
     */
    @Nullable
    @JSProperty
    String getAs();

    /**
     * The name of the variable to add to the binding scope for the array
     * element associated with a given template instance.
     */
    @JSProperty
    void setAs(String as);

    /**
     * The name of the variable to add to the binding scope with the index
     * for the row.
     */
    @Nullable
    @JSProperty
    String getIndexAs();

    /**
     * The name of the variable to add to the binding scope with the index
     * for the row.
     */
    @JSProperty
    void setIndexAs(String indexAs);

    /**
     * The name of the variable to add to the binding scope to indicate
     * if the row is selected.
     */
    @Nullable
    @JSProperty
    String getSelectedAs();

    /**
     * The name of the variable to add to the binding scope to indicate
     * if the row is selected.
     */
    @JSProperty
    void setSelectedAs(String selectedAs);

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
    @JSProperty
    boolean isGrid();

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
    @JSProperty
    void setGrid(boolean grid);

    /**
     * When true, tapping a row will select the item, placing its data model
     * in the set of selected items retrievable via the selection property.
     * <p>
     * Note that tapping focusable elements within the list item will not
     * result in selection, since they are presumed to have their * own action.
     */
    @JSProperty
    boolean isSelectionEnabled();

    /**
     * When true, tapping a row will select the item, placing its data model
     * in the set of selected items retrievable via the selection property.
     * <p>
     * Note that tapping focusable elements within the list item will not
     * result in selection, since they are presumed to have their * own action.
     */
    @JSProperty
    void setSelectionEnabled(boolean selectionEnabled);

    /**
     * When `multiSelection` is false, this is the currently selected item, or
     * `null` if no item is selected.
     */
    @Nullable
    @JSProperty
    ITEM getSelectedItem();

    /**
     * When `multiSelection` is false, this is the currently selected item, or
     * `null` if no item is selected.
     */
    @JSProperty
    void setSelectedItem(ITEM selectedItem);

    /**
     * When `multiSelection` is true, this is an array that contains the
     * selected items.
     */
    @Nullable
    @JSProperty
    Array<ITEM> getSelectedItems();

    /**
     * When `multiSelection` is true, this is an array that contains the
     * selected items.
     */
    @JSProperty
    void setSelectedItems(@JSByRef ITEM... selectedItems);

    @JSProperty
    void setSelectedItems(@JSByRef Array<ITEM> selectedItems);

    /**
     * When `true`, multiple items may be selected at once (in this case,
     * `selected` is an array of currently selected items).  When `false`,
     * only one item may be selected at a time.
     */
    @JSProperty
    boolean isMultiSelection();

    /**
     * When `true`, multiple items may be selected at once (in this case,
     * `selected` is an array of currently selected items).  When `false`,
     * only one item may be selected at a time.
     */
    @JSProperty
    void setMultiSelection(boolean multiSelection);

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
    @JSProperty
    double getScrollOffset();

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
    @JSProperty
    void setScrollOffset(double scrollOffset);

    /**
     * Gets the index of the first visible item in the viewport.
     */
    @JSProperty
    int getFirstVisibleIndex();

    /**
     * Gets the index of the last visible item in the viewport.
     */
    @JSProperty
    int getLastVisibleIndex();

    /**
     * Invoke this method if you dynamically update the viewport's
     * size or CSS padding.
     */
    void updateViewportBoundaries();

    /**
     * Scroll to a specific item in the virtual list regardless
     * of the physical items in the DOM tree.
     *
     * @param item The item to be scrolled to
     */
    void scrollToItem(ITEM item);

    /**
     * Scroll to a specific index in the virtual list regardless
     * of the physical items in the DOM tree.
     *
     * @param idx The index of the item
     */
    void scrollToIndex(int idx);

    /**
     * Selects the given item.
     *
     * @param item The item instance.
     */
    void selectItem(ITEM item);

    /**
     * Selects the item at the given index in the items array.
     *
     * @param index The index of the item in the items array.
     */
    void selectIndex(int index);

    /**
     * Deselects the given item.
     *
     * @param item The item instance.
     */
    void deselectItem(ITEM item);

    /**
     * Deselects the item at the given index in the items array.
     *
     * @param index The index of the item in the items array.
     */
    void deselectIndex(int index);

    /**
     * Selects or deselects a given item depending on whether the item
     * has already been selected.
     *
     * @param item The item object.
     */
    void toggleSelectionForItem(ITEM item);

    /**
     * Selects or deselects the item at the given index in the items array
     * depending on whether the item has already been selected.
     *
     * @param index The index of the item in the items array.
     */
    void toggleSelectionForIndex(int index);

    /**
     * Clears the current selection in the list.
     */
    void clearSelection();

    /**
     * Updates the size of a given list item.
     *
     * @param item The item instance.
     */
    void updateSizeForItem(ITEM item);

    /**
     * Updates the size of the item at the given index in the items array.
     *
     * @param index The index of the item in the items array.
     */
    void updateSizeForIndex(int index);

    /**
     * @param idx
     */
    void focusItem(int idx);
}
