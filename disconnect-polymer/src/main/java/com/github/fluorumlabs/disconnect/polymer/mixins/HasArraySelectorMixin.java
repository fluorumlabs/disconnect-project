package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.ArraySelectorMixin;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.lang.Any;
import js.util.collections.Array;

import javax.annotation.Nullable;

/**
 * Element mixin for recording dynamic associations between item paths in a
 * master `items` array and a `selected` array such that path changes to the
 * master array (at the host) element or elsewhere via data-binding) are
 * correctly propagated to items in the selected array and vice-versa.
 * <p>
 * The `items` property accepts an array of user data, and via the
 * `select(item)` and `deselect(item)` API, updates the `selected` property
 * which may be bound to other parts of the application, and any changes to
 * sub-fields of `selected` item(s) will be kept in sync with items in the
 * `items` array.  When `multi` is false, `selected` is a property
 * representing the last selected item.  When `multi` is true, `selected`
 * is an array of multiply selected items.
 */
public interface HasArraySelectorMixin<ITEM extends Any, E extends ArraySelectorMixin<ITEM>, T extends Component<E>> extends HasElementMixin<E, T> {
    /**
     * An array containing items from which selection will be made.
     */
    @Nullable
    default Array<ITEM> items() {
        return getNode().getItems();
    }

    /**
     * An array containing items from which selection will be made.
     */
    default T items(ITEM... items) {
        getNode().setItems(items);
        return (T) this;
    }

    default T items(Array<ITEM> items) {
        getNode().setItems(items);
        return (T) this;
    }

    /**
     * When `true`, multiple items may be selected at once (in this case,
     * `selected` is an array of currently selected items).  When `false`,
     * only one item may be selected at a time.
     */
    default boolean multi() {
        return getNode().isMulti();
    }

    /**
     * When `true`, multiple items may be selected at once (in this case,
     * `selected` is an array of currently selected items).  When `false`,
     * only one item may be selected at a time.
     */
    default T multi(boolean multi) {
        getNode().setMulti(multi);
        return (T) this;
    }

    /**
     * When `multi` is true, this is an array that contains any selected.
     * When `multi` is false, this is the currently selected item, or `null`
     * if no item is selected.
     */
    default Array<ITEM> selected() {
        return getNode().getSelected();
    }

    /**
     * When `multi` is true, this is an array that contains any selected.
     * When `multi` is false, this is the currently selected item, or `null`
     * if no item is selected.
     */
    default T selected(ITEM selected) {
        getNode().setSelected(selected);
        return (T) this;
    }

    default T selected(ITEM... selected) {
        getNode().setSelected(selected);
        return (T) this;
    }

    default T selected(Array<ITEM> selected) {
        getNode().setSelected(selected);
        return (T) this;
    }

    /**
     * When `multi` is false, this is the currently selected item, or `null`
     * if no item is selected.
     */
    @Nullable
    default ITEM selectedItem() {
        return getNode().getSelectedItem();
    }

    /**
     * When `multi` is false, this is the currently selected item, or `null`
     * if no item is selected.
     */
    default T selectedItem(ITEM selectedItem) {
        getNode().setSelectedItem(selectedItem);
        return (T) this;
    }

    /**
     * When `true`, calling `select` on an item that is already selected
     * will deselect the item.
     */
    default boolean toggle() {
        return getNode().isToggle();
    }

    /**
     * When `true`, calling `select` on an item that is already selected
     * will deselect the item.
     */
    default T toggle(boolean toggle) {
        getNode().setToggle(toggle);
        return (T) this;
    }

    /**
     * Clears the selection state.
     */
    default void clearSelection() {
        getNode().clearSelection();
    }

    /**
     * Returns whether the item is currently selected.
     *
     * @param item Item from `items` array to test
     *
     * @return Whether the item is selected
     */
    default boolean isSelected(ITEM item) {
        return getNode().isSelected(item);
    }

    /**
     * Returns whether the item is currently selected.
     *
     * @param idx Index from `items` array to test
     *
     * @return Whether the item is selected
     */
    default boolean isIndexSelected(int idx) {
        return getNode().isIndexSelected(idx);
    }

    /**
     * Deselects the given item if it is already selected.
     *
     * @param item Item from `items` array to deselect
     */
    default void deselect(ITEM item) {
        getNode().deselect(item);
    }

    /**
     * Deselects the given index if it is already selected.
     *
     * @param idx Index from `items` array to deselect
     */
    default void deselectIndex(int idx) {
        getNode().deselectIndex(idx);
    }

    /**
     * Selects the given item.  When `toggle` is true, this will automatically
     * deselect the item if already selected.
     *
     * @param item Item from `items` array to select
     */
    default void select(ITEM item) {
        getNode().select(item);
    }

    /**
     * Selects the given index.  When `toggle` is true, this will automatically
     * deselect the item if already selected.
     *
     * @param idx Index from `items` array to select
     */
    default void selectIndex(int idx) {
        getNode().selectIndex(idx);
    }
}
