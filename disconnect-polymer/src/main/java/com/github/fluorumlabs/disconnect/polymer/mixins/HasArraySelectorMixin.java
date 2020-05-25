package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.ArraySelectorMixin;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import js.lang.Any;
import js.util.collections.Array;

import javax.annotation.Nullable;

/**
 * Element mixin for recording dynamic associations between item paths in a master <code>items</code> array and a
 * <code>selected</code> array such that path changes to the master array (at the host) element or elsewhere via
 * data-binding) are correctly propagated to items in the selected array and vice-versa.
 * <p>
 * The <code>items</code> property accepts an array of user data, and via the
 * <code>select(item)</code> and <code>deselect(item)</code> API, updates the <code>selected</code> property
 * which may be bound to other parts of the application, and any changes to sub-fields of <code>selected</code> item(s)
 * will be kept in sync with items in the
 * <code>items</code> array.  When <code>multi</code> is false, <code>selected</code> is a property
 * representing the last selected item.  When <code>multi</code> is true, <code>selected</code> is an array of multiply
 * selected items.
 *
 * @param <ITEM> the type parameter
 * @param <E>    the type parameter
 * @param <T>    the type parameter
 */
public interface HasArraySelectorMixin<ITEM extends Any, E extends ArraySelectorMixin<ITEM>, T extends HasElement<E>>
		extends HasElementMixin<E, T> {
	/**
	 * An array containing items from which selection will be made.
	 *
	 * @return the array
	 */
	@Nullable
	default Array<ITEM> items() {
		return getNode().getItems();
	}

	/**
	 * An array containing items from which selection will be made.
	 *
	 * @param items the items
	 *
	 * @return the t
	 */
	default T items(ITEM... items) {
		getNode().setItems(items);
		return (T) this;
	}

	/**
	 * Items t.
	 *
	 * @param items the items
	 *
	 * @return the t
	 */
	default T items(Array<ITEM> items) {
		getNode().setItems(items);
		return (T) this;
	}

	/**
	 * When <code>true</code>, multiple items may be selected at once (in this case,
	 * <code>selected</code> is an array of currently selected items).  When <code>false</code>,
	 * only one item may be selected at a time.
	 *
	 * @return the boolean
	 */
	default boolean multi() {
		return getNode().isMulti();
	}

	/**
	 * When <code>true</code>, multiple items may be selected at once (in this case,
	 * <code>selected</code> is an array of currently selected items).  When <code>false</code>,
	 * only one item may be selected at a time.
	 *
	 * @param multi the multi
	 *
	 * @return the t
	 */
	default T multi(boolean multi) {
		getNode().setMulti(multi);
		return (T) this;
	}

	/**
	 * When <code>multi</code> is true, this is an array that contains any selected. When <code>multi</code> is false,
	 * this is the currently selected item, or <code>null</code> if no item is selected.
	 *
	 * @return the array
	 */
	default Array<ITEM> selected() {
		return getNode().getSelected();
	}

	/**
	 * When <code>multi</code> is true, this is an array that contains any selected. When <code>multi</code> is false,
	 * this is the currently selected item, or <code>null</code> if no item is selected.
	 *
	 * @param selected the selected
	 *
	 * @return the t
	 */
	default T selected(ITEM selected) {
		getNode().setSelected(selected);
		return (T) this;
	}

	/**
	 * Selected t.
	 *
	 * @param selected the selected
	 *
	 * @return the t
	 */
	default T selected(ITEM... selected) {
		getNode().setSelected(selected);
		return (T) this;
	}

	/**
	 * Selected t.
	 *
	 * @param selected the selected
	 *
	 * @return the t
	 */
	default T selected(Array<ITEM> selected) {
		getNode().setSelected(selected);
		return (T) this;
	}

	/**
	 * When <code>multi</code> is false, this is the currently selected item, or <code>null</code> if no item is
	 * selected.
	 *
	 * @return the item
	 */
	@Nullable
	default ITEM selectedItem() {
		return getNode().getSelectedItem();
	}

	/**
	 * When <code>multi</code> is false, this is the currently selected item, or <code>null</code> if no item is
	 * selected.
	 *
	 * @param selectedItem the selected item
	 *
	 * @return the t
	 */
	default T selectedItem(ITEM selectedItem) {
		getNode().setSelectedItem(selectedItem);
		return (T) this;
	}

	/**
	 * When <code>true</code>, calling <code>select</code> on an item that is already selected will deselect the item.
	 *
	 * @return the boolean
	 */
	default boolean toggle() {
		return getNode().isToggle();
	}

	/**
	 * When <code>true</code>, calling <code>select</code> on an item that is already selected will deselect the item.
	 *
	 * @param toggle the toggle
	 *
	 * @return the t
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
	 * @param item Item from <code>items</code> array to test
	 *
	 * @return Whether the item is selected
	 */
	default boolean isSelected(ITEM item) {
		return getNode().isSelected(item);
	}

	/**
	 * Returns whether the item is currently selected.
	 *
	 * @param idx Index from <code>items</code> array to test
	 *
	 * @return Whether the item is selected
	 */
	default boolean isIndexSelected(int idx) {
		return getNode().isIndexSelected(idx);
	}

	/**
	 * Deselects the given item if it is already selected.
	 *
	 * @param item Item from <code>items</code> array to deselect
	 */
	default void deselect(ITEM item) {
		getNode().deselect(item);
	}

	/**
	 * Deselects the given index if it is already selected.
	 *
	 * @param idx Index from <code>items</code> array to deselect
	 */
	default void deselectIndex(int idx) {
		getNode().deselectIndex(idx);
	}

	/**
	 * Selects the given item.  When <code>toggle</code> is true, this will automatically deselect the item if already
	 * selected.
	 *
	 * @param item Item from <code>items</code> array to select
	 */
	default void select(ITEM item) {
		getNode().select(item);
	}

	/**
	 * Selects the given index.  When <code>toggle</code> is true, this will automatically deselect the item if already
	 * selected.
	 *
	 * @param idx Index from <code>items</code> array to select
	 */
	default void selectIndex(int idx) {
		getNode().selectIndex(idx);
	}
}
