package com.github.fluorumlabs.disconnect.vaadin.listbox;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.item.Item;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.listbox.ListBoxElement;

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
@CustomElement(tagName = "vaadin-list-box", external = true)
public class ListBox extends HtmlComponent<ListBoxElement> implements Themable<ListBoxElement> {

    public ListBox() {
    }

    public ListBox(String textContent) {
        super(textContent);
    }

    public ListBox(Component<?>... components) {
        super(components);
    }

    // !wca! focus: (): void

    // !wca! get focused: Element | null

    // !wca! observe focused: Element | null

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
    public @Nullable ComponentList<Item> getItems() {
        return new ArrayLikeBackedComponentList<>(getElement().getItems());
    }

    // !wca! observe items: Element[] | undefined

    // !wca! get multiple: boolean | null | undefined
    /**
     * Specifies that multiple options can be selected at once.
     */
    public boolean isMultiple() {
        return getElement().isMultiple();
    }

    // !wca! set multiple: boolean | null | undefined
    /**
     * Specifies that multiple options can be selected at once.
     */
    public void setMultiple(boolean value) {
        getElement().setMultiple(value);
    }

    // !wca! observe multiple: boolean | null | undefined

    // !wca! get selected: number | null | undefined
    /**
     * The index of the item selected in the items array.
     * Note: Not updated when used in <code>multiple</code> selection mode.
     */
    public int getSelected() {
        return getElement().getSelected();
    }

    // !wca! set selected: number | null | undefined
    /**
     * The index of the item selected in the items array.
     * Note: Not updated when used in <code>multiple</code> selection mode.
     */
    public void setSelected(int value) {
        getElement().setSelected(value);
    }

    // !wca! observe selected: number | null | undefined
    /**
     * The index of the item selected in the items array.
     * Note: Not updated when used in <code>multiple</code> selection mode.
     */
    public ObservableValue<Integer> selected() {
        return createObservableValue(this::getSelected, this::setSelected, "selected-changed");
    }

    // !wca! get selectedValues: string[] | null | undefined
    /**
     * Array of indexes of the items selected in the items array
     * Note: Not updated when used in single selection mode.
     */
    public @Nullable int[] getSelectedValues() {
        return getElement().getSelectedValues();
    }

    // !wca! set selectedValues: string[] | null | undefined
    /**
     * Array of indexes of the items selected in the items array
     * Note: Not updated when used in single selection mode.
     */
    public void setSelectedValues(@Nullable int[] value) {
        getElement().setSelectedValues(value);
    }

    // !wca! observe selectedValues: string[] | null | undefined
    /**
     * Array of indexes of the items selected in the items array
     * Note: Not updated when used in single selection mode.
     */
    public ObservableValue<int[]> selectedValues() {
        return createObservableValue(this::getSelectedValues, this::setSelectedValues, "selected-values-changed");
    }

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined
}
