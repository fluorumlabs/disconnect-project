package js.lang.external.vaadin.listbox;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.vaadin.item.ItemElement;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-list-box&gt;</code> is a Web Component for creating menus.
 *
 * <pre><code>   &lt;vaadin-list-box selected="2"&gt;
 *      &lt;vaadin-item&gt;Item 1&lt;/vaadin-item&gt;
 *      &lt;vaadin-item&gt;Item 2&lt;/vaadin-item&gt;
 *      &lt;vaadin-item&gt;Item 3&lt;/vaadin-item&gt;
 *      &lt;vaadin-item&gt;Item 4&lt;/vaadin-item&gt;
 *    &lt;/vaadin-list-box&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Part name</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>items</code></td>
 *    <td>The items container</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, MultiSelectListMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-list-box", version = "^1.4.0-alpha1")
@Import(module = "@vaadin/vaadin-list-box/vaadin-list-box.js")
public interface ListBoxElement extends HTMLElement {

    // !wca! focus: (): void

    // !wca! get focused: Element | null

    // !wca! get items: Element[] | undefined
    /**
     * The list of items from which a selection can be made.
     * It is populated from the elements passed to the light DOM,
     * and updated dynamically when adding or removing items.
     *
     * The item elements must implement <code>Vaadin.ItemMixin</code>.
     *
     * Note: unlike <code>&lt;vaadin-combo-box&gt;</code>, this property is read-only,
     * so if you want to provide items by iterating array of data,
     * you have to use <code>dom-repeat</code> and place it to the light DOM.
     */
    @JSProperty("items")
    @Nullable
    Array<ItemElement> getItems();

    // !wca! get multiple: boolean | null | undefined
    /**
     * Specifies that multiple options can be selected at once.
     */
    @JSProperty("multiple")
    boolean isMultiple();

    // !wca! set multiple: boolean | null | undefined
    /**
     * Specifies that multiple options can be selected at once.
     */
    @JSProperty("multiple")
    void setMultiple(boolean value);

    // !wca! get selected: number | null | undefined
    /**
     * The index of the item selected in the items array.
     * Note: Not updated when used in <code>multiple</code> selection mode.
     */
    @JSProperty("selected")
    int getSelected();

    // !wca! set selected: number | null | undefined
    /**
     * The index of the item selected in the items array.
     * Note: Not updated when used in <code>multiple</code> selection mode.
     */
    @JSProperty("selected")
    void setSelected(int value);

    // !wca! get selectedValues: string[] | null | undefined
    /**
     * Array of indexes of the items selected in the items array
     * Note: Not updated when used in single selection mode.
     */
    @JSProperty("selectedValues")
    @Nullable
    int[] getSelectedValues();

    // !wca! set selectedValues: string[] | null | undefined
    /**
     * Array of indexes of the items selected in the items array
     * Note: Not updated when used in single selection mode.
     */
    @JSProperty("selectedValues")
    void setSelectedValues(@Nullable int[] value);

    // !wca! get theme: string | null | undefined
}
