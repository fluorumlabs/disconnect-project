package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

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
@NpmPackage(name = "@polymer/polymer", version = "^3.4.1")
@Import(module = "@polymer/polymer/lib/elements/array-selector.js")
public interface ArraySelectorElement<T extends Any> extends HTMLElement {

    // !wca! clearSelection: (): void
    /**
     * Clears the selection state.
     */
    @JSMethod("clearSelection")
    void clearSelection();

    // !wca! deselect: (item: *): void
    /**
     * Deselects the given item if it is already selected.
     *
     * <strong>item</strong>: Item from <code>items</code> array to deselect
     */
    @JSMethod("deselect")
    void deselect(T item);

    // !wca! deselectIndex: (idx: number): void
    /**
     * Deselects the given index if it is already selected.
     *
     * <strong>idx</strong>: Index from <code>items</code> array to deselect
     */
    @JSMethod("deselectIndex")
    void deselectIndex(int idx);

    // !wca! isIndexSelected: (idx: number): boolean
    /**
     * Returns whether the item is currently selected.
     *
     * <strong>idx</strong>: Index from <code>items</code> array to test
     */
    @JSMethod("isIndexSelected")
    boolean isIndexSelected(int idx);

    // !wca! isSelected: (item: *): boolean
    /**
     * Returns whether the item is currently selected.
     *
     * <strong>item</strong>: Item from <code>items</code> array to test
     */
    @JSMethod("isSelected")
    boolean isSelected(T item);

    // !wca! select: (item: *): void
    /**
     * Selects the given item. When <code>toggle</code> is true, this will automatically
     * deselect the item if already selected.
     *
     * <strong>item</strong>: Item from <code>items</code> array to select
     */
    @JSMethod("select")
    void select(T item);

    // !wca! selectIndex: (idx: number): void
    /**
     * Selects the given index. When <code>toggle</code> is true, this will automatically
     * deselect the item if already selected.
     *
     * <strong>idx</strong>: Index from <code>items</code> array to select
     */
    @JSMethod("selectIndex")
    void selectIndex(int idx);

    // !wca! get items: array
    /**
     * An array containing items from which selection will be made.
     */
    @JSProperty("items")
    Array<T> getItems();

    // !wca! set items: array
    /**
     * An array containing items from which selection will be made.
     */
    @JSProperty("items")
    void setItems(Array<T> value);

    // !wca! get multi: boolean
    /**
     * When <code>true</code>, multiple items may be selected at once (in this case,
     * <code>selected</code> is an array of currently selected items). When <code>false</code>,
     * only one item may be selected at a time.
     */
    @JSProperty("multi")
    boolean isMulti();

    // !wca! set multi: boolean
    /**
     * When <code>true</code>, multiple items may be selected at once (in this case,
     * <code>selected</code> is an array of currently selected items). When <code>false</code>,
     * only one item may be selected at a time.
     */
    @JSProperty("multi")
    void setMulti(boolean value);

    // !wca! get selected: ?Object|?Array<!Object>
    /**
     * When <code>multi</code> is true, this is an array that contains any selected.
     * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
     * if no item is selected.
     */
    @JSProperty("selected")
    Unknown getSelected();

    // !wca! set selected: ?Object|?Array<!Object>
    /**
     * When <code>multi</code> is true, this is an array that contains any selected.
     * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
     * if no item is selected.
     */
    @JSProperty("selected")
    void setSelected(Any value);

    // !wca! get selectedItem: ?Object
    /**
     * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
     * if no item is selected.
     */
    @JSProperty("selectedItem")
    T getSelectedItem();

    // !wca! set selectedItem: ?Object
    /**
     * When <code>multi</code> is false, this is the currently selected item, or <code>null</code>
     * if no item is selected.
     */
    @JSProperty("selectedItem")
    void setSelectedItem(T value);

    // !wca! get toggle: boolean
    /**
     * When <code>true</code>, calling <code>select</code> on an item that is already selected
     * will deselect the item.
     */
    @JSProperty("toggle")
    boolean isToggle();

    // !wca! set toggle: boolean
    /**
     * When <code>true</code>, calling <code>select</code> on an item that is already selected
     * will deselect the item.
     */
    @JSProperty("toggle")
    void setToggle(boolean value);
}
