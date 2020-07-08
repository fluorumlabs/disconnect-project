package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponentWithItem;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.core.utils.SerDes;
import js.lang.Unknown;
import js.lang.external.polymer.ArraySelectorElement;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/**
 * Element implementing the <code>ArraySelector</code> mixin, which records dynamic associations between item paths in a master <code>items</code> array and a <code>selected</code> array such that path changes to the master array (at the host) element or elsewhere via data-binding) are correctly propagated to items in the selected array and vice-versa.
 *
 * The <code>items</code> property accepts an array of user data, and via the <code>select(item)</code> and <code>deselect(item)</code> API, updates the <code>selected</code> property which may be bound to other parts of the application, and any changes to sub-fields of <code>selected</code> item(s) will be kept in sync with items in the <code>items</code> array. When <code>multi</code> is false, <code>selected</code> is a property representing the last selected item. When <code>multi</code> is true, <code>selected</code> is an array of multiply selected items.
 *
 * Example:
 *
 * <pre><code class="language-js">import {PolymerElement} from '@polymer/polymer';
 * import '@polymer/polymer/lib/elements/array-selector.js';
 *
 * class EmployeeList extends PolymerElement {
 *    static get _template() {
 *      return html`
 *          &lt;div&gt; Employee list: &lt;/div&gt;
 *          &lt;dom-repeat id="employeeList" items="{{employees}}"&gt;
 *            &lt;template&gt;
 *              &lt;div&gt;First name: &lt;span&gt;{{item.first}}&lt;/span&gt;&lt;/div&gt;
 *                &lt;div&gt;Last name: &lt;span&gt;{{item.last}}&lt;/span&gt;&lt;/div&gt;
 *                &lt;button on-click="toggleSelection"&gt;Select&lt;/button&gt;
 *            &lt;/template&gt;
 *          &lt;/dom-repeat&gt;
 *
 *          &lt;array-selector id="selector"
 *                          items="{{employees}}"
 *                          selected="{{selected}}"
 *                          multi toggle&gt;&lt;/array-selector&gt;
 *
 *          &lt;div&gt; Selected employees: &lt;/div&gt;
 *          &lt;dom-repeat items="{{selected}}"&gt;
 *            &lt;template&gt;
 *              &lt;div&gt;First name: &lt;span&gt;{{item.first}}&lt;/span&gt;&lt;/div&gt;
 *              &lt;div&gt;Last name: &lt;span&gt;{{item.last}}&lt;/span&gt;&lt;/div&gt;
 *            &lt;/template&gt;
 *          &lt;/dom-repeat&gt;`;
 *    }
 *    static get is() { return 'employee-list'; }
 *    static get properties() {
 *      return {
 *        employees: {
 *          value() {
 *            return [
 *              {first: 'Bob', last: 'Smith'},
 *              {first: 'Sally', last: 'Johnson'},
 *              ...
 *            ];
 *          }
 *        }
 *      };
 *    }
 *    toggleSelection(e) {
 *      const item = this.$.employeeList.itemForElement(e.target);
 *      this.$.selector.select(item);
 *    }
 * }
 * </code></pre>
 * <strong>Mixins:</strong> ArraySelectorMixin, ElementMixin, ElementMixin
 */
@CustomElement(tagName = "array-selector", external = true)
public class ArraySelector<T> extends HtmlComponentWithItem<T, ArraySelectorElement<Mirrored<T>>> {
    public ArraySelector() {
    }

    public ArraySelector(Class<T> itemClass) {
        super(itemClass);
    }

    // !wca! clearSelection: (): void
    /**
     * Clears the selection state.
     */
    public void clearSelection() {
        getElement().clearSelection();
    }

    // !wca! deselect: (item: *): void
    /**
     * Deselects the given item if it is already selected.
     *
     * <strong>item</strong>: Item from <code>items</code> array to deselect
     */
    public void deselect(T item) {
        getElement().deselect(SerDes.mirror(item));
    }

    // !wca! deselectIndex: (idx: number): void
    /**
     * Deselects the given index if it is already selected.
     *
     * <strong>idx</strong>: Index from <code>items</code> array to deselect
     */
    public void deselectIndex(int idx) {
        getElement().deselectIndex(idx);
    }

    // !wca! isIndexSelected: (idx: number): boolean
    /**
     * Returns whether the item is currently selected.
     *
     * <strong>idx</strong>: Index from <code>items</code> array to test
     */
    public boolean isIndexSelected(int idx) {
        return getElement().isIndexSelected(idx);
    }

    // !wca! isSelected: (item: *): boolean
    /**
     * Returns whether the item is currently selected.
     *
     * <strong>item</strong>: Item from <code>items</code> array to test
     */
    public boolean isSelected(T item) {
        return getElement().isSelected(SerDes.mirror(item));
    }

    // !wca! select: (item: *): void
    /**
     * Selects the given item. When <code>toggle</code> is true, this will automatically
     * deselect the item if already selected.
     *
     * <strong>item</strong>: Item from <code>items</code> array to select
     */
    public void select(T item) {
        getElement().select(SerDes.mirror(item));
    }

    // !wca! selectIndex: (idx: number): void
    /**
     * Selects the given index. When <code>toggle</code> is true, this will automatically
     * deselect the item if already selected.
     *
     * <strong>idx</strong>: Index from <code>items</code> array to select
     */
    public void selectIndex(int idx) {
        getElement().selectIndex(idx);
    }

    // !wca! get items: array
    /**
     * An array containing items from which selection will be made.
     */
    public List<T> getItems() {
        return SerDes.unmirrorList(getElement().getItems(), getItemClass());
    }

    // !wca! set items: array
    /**
     * An array containing items from which selection will be made.
     */
    public void setItems(List<T> value) {
        getElement().setItems(SerDes.mirror(value).cast());
    }

    // !wca! observe items: array
    /**
     * An array containing items from which selection will be made.
     */
    public ObservableValue<List<T>> items() {
        return createObservableValue(this::getItems, this::setItems, "items-changed");
    }

    // !wca! get multi: boolean
    /**
     * When <code>true</code>, multiple items may be selected at once (in this case,
     * <code>selected</code> is an array of currently selected items). When <code>false</code>,
     * only one item may be selected at a time.
     */
    public boolean isMulti() {
        return getElement().isMulti();
    }

    // !wca! set multi: boolean
    /**
     * When <code>true</code>, multiple items may be selected at once (in this case,
     * <code>selected</code> is an array of currently selected items). When <code>false</code>,
     * only one item may be selected at a time.
     */
    public void setMulti(boolean value) {
        getElement().setMulti(value);
    }

    // !wca! observe multi: boolean

    // !wca! get selected: ?Object|?Array<!Object>
    /**
     * When <code>multi</code> is true, this is an array that contains any selected.
     * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
     * if no item is selected.
     */
    public List<T> getSelected() {
        Unknown selected = getElement().getSelected();
        if (isMulti()) {
            return SerDes.unmirrorList(selected.<Mirrored<List<T>>>cast(), getItemClass());
        } else {
            return Collections.singletonList(SerDes.unmirror(selected.cast(), getItemClass()));
        }
    }

    // !wca! set selected: ?Object|?Array<!Object>
    /**
     * When <code>multi</code> is true, this is an array that contains any selected.
     * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
     * if no item is selected.
     */
    public void setSelected(List<T> value) {
        if (isMulti()) {
            getElement().setSelected(SerDes.mirror(value));
        } else {
            getElement().setSelected(value.isEmpty()?null:SerDes.mirror(value.iterator().next()));
        }
    }

    // !wca! observe selected: ?Object|?Array<!Object>
    /**
     * When <code>multi</code> is true, this is an array that contains any selected.
     * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
     * if no item is selected.
     */
    public ObservableValue<List<T>> selected() {
        return createObservableValue(this::getSelected, this::setSelected, "selected-changed");
    }

    // !wca! get selectedItem: ?Object
    /**
     * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
     * if no item is selected.
     */
    @Nullable
    public T getSelectedItem() {
        return SerDes.unmirror(getElement().getSelectedItem(), getItemClass());
    }

    // !wca! set selectedItem: ?Object
    /**
     * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
     * if no item is selected.
     */
    public void setSelectedItem(T value) {
        getElement().setSelectedItem(SerDes.mirror(value));
    }

    // !wca! observe selectedItem: ?Object
    /**
     * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
     * if no item is selected.
     */
    public ObservableValue<T> selectedItem() {
        return createObservableValue(this::getSelectedItem, this::setSelectedItem, "selected-item-changed");
    }

    // !wca! get toggle: boolean
    /**
     * When <code>true</code>, calling <code>select</code> on an item that is already selected
     * will deselect the item.
     */
    public boolean isToggle() {
        return getElement().isToggle();
    }

    // !wca! set toggle: boolean
    /**
     * When <code>true</code>, calling <code>select</code> on an item that is already selected
     * will deselect the item.
     */
    public void setToggle(boolean value) {
        getElement().setToggle(value);
    }

    // !wca! observe toggle: boolean
}
