package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
        name = "@polymer/polymer",
        version = Polymer.VERSION
)
@Import(
        symbols = "ArraySelectorMixin",
        module = "@polymer/polymer/lib/elements/array-selector.js"
)
public interface ArraySelectorMixin<T extends Any> extends ElementMixin {
    /**
     * An array containing items from which selection will be made.
     */
    @Nullable
    @JSProperty
    Array<T> getItems();

    /**
     * An array containing items from which selection will be made.
     */
    @JSProperty
    void setItems(@JSByRef T... items);

    @JSProperty
    void setItems(Array<T> items);

    /**
     * When `true`, multiple items may be selected at once (in this case,
     * `selected` is an array of currently selected items).  When `false`,
     * only one item may be selected at a time.
     */
    @JSProperty
    boolean isMulti();

    /**
     * When `true`, multiple items may be selected at once (in this case,
     * `selected` is an array of currently selected items).  When `false`,
     * only one item may be selected at a time.
     */
    @JSProperty
    void setMulti(boolean multi);

    /**
     * When `multi` is true, this is an array that contains any selected.
     * When `multi` is false, this is the currently selected item, or `null`
     * if no item is selected.
     */
    @JSBody(script = "var result = this.selected; \n" +
            "if ( result && Array.isArray(result)) {\n" +
            "    return result;\n" +
            "} else {\n" +
            "    return result!==null ? [result]:[];\n" +
            "}")
    Array<T> getSelected();

    /**
     * When `multi` is true, this is an array that contains any selected.
     * When `multi` is false, this is the currently selected item, or `null`
     * if no item is selected.
     */
    @JSProperty
    void setSelected(T selected);

    @JSProperty
    void setSelected(@JSByRef T... selected);

    @JSProperty
    void setSelected(Array<T> selected);

    /**
     * When `multi` is false, this is the currently selected item, or `null`
     * if no item is selected.
     */
    @Nullable
    @JSProperty
    T getSelectedItem();

    /**
     * When `multi` is false, this is the currently selected item, or `null`
     * if no item is selected.
     */
    @JSProperty
    void setSelectedItem(T selectedItem);

    /**
     * When `true`, calling `select` on an item that is already selected
     * will deselect the item.
     */
    @JSProperty
    boolean isToggle();

    /**
     * When `true`, calling `select` on an item that is already selected
     * will deselect the item.
     */
    @JSProperty
    void setToggle(boolean toggle);

    /**
     * Clears the selection state.
     */
    void clearSelection();

    /**
     * Returns whether the item is currently selected.
     *
     * @param item Item from `items` array to test
     *
     * @return Whether the item is selected
     */
    boolean isSelected(T item);

    /**
     * Returns whether the item is currently selected.
     *
     * @param idx Index from `items` array to test
     *
     * @return Whether the item is selected
     */
    boolean isIndexSelected(int idx);

    /**
     * Deselects the given item if it is already selected.
     *
     * @param item Item from `items` array to deselect
     */
    void deselect(T item);

    /**
     * Deselects the given index if it is already selected.
     *
     * @param idx Index from `items` array to deselect
     */
    void deselectIndex(int idx);

    /**
     * Selects the given item.  When `toggle` is true, this will automatically
     * deselect the item if already selected.
     *
     * @param item Item from `items` array to select
     */
    void select(T item);

    /**
     * Selects the given index.  When `toggle` is true, this will automatically
     * deselect the item if already selected.
     *
     * @param idx Index from `items` array to select
     */
    void selectIndex(int idx);
}
