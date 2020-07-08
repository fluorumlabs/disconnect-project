package com.github.fluorumlabs.disconnect.vaadin.tabs;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import com.github.fluorumlabs.disconnect.vaadin.theme.ThemeVariant;
import js.lang.external.vaadin.tabs.TabsElement;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-tabs&gt;</code> is a Web Component for easy switching between different views.
 *
 * <pre><code>   &lt;vaadin-tabs selected="4"&gt;
 *      &lt;vaadin-tab&gt;Page 1&lt;/vaadin-tab&gt;
 *      &lt;vaadin-tab&gt;Page 2&lt;/vaadin-tab&gt;
 *      &lt;vaadin-tab&gt;Page 3&lt;/vaadin-tab&gt;
 *      &lt;vaadin-tab&gt;Page 4&lt;/vaadin-tab&gt;
 *    &lt;/vaadin-tabs&gt;
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
 *    <td><code>back-button</code></td>
 *    <td>Button for moving the scroll back</td>
 *   </tr>
 *   <tr>
 *    <td><code>tabs</code></td>
 *    <td>The tabs container</td>
 *   </tr>
 *   <tr>
 *    <td><code>forward-button</code></td>
 *    <td>Button for moving the scroll forward</td>
 *   </tr>
 *  </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Attribute</th>
 *    <th>Description</th>
 *    <th>Part name</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>orientation</code></td>
 *    <td>Tabs disposition, valid values are <code>horizontal</code> and <code>vertical</code>.</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>overflow</code></td>
 *    <td>It's set to <code>start</code>, <code>end</code>, none or both.</td>
 *    <td>:host</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, ListMixin, ThemableMixin, mixinBehaviors, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-tabs", external = true)
public class Tabs extends HtmlComponent<TabsElement> implements Themable<TabsElement> {

    public Tabs() {
    }

    public Tabs(String textContent) {
        super(textContent);
    }

    public Tabs(Component<?>... components) {
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
    public @Nullable ComponentList<Tab> getItems() {
        return new ArrayLikeBackedComponentList<>(getElement().getItems());
    }

    // !wca! observe items: Element[] | undefined

    // !wca! get orientation: !ListOrientation
    /**
     * Set tabs disposition. Possible values are <code>horizontal\|vertical</code>
     */
    public Orientation getOrientation() {
        return LowerCase.parse(Orientation.class, getElement().getOrientation());
    }

    // !wca! set orientation: !ListOrientation
    /**
     * Set tabs disposition. Possible values are <code>horizontal\|vertical</code>
     */
    public void setOrientation(Orientation value) {
        getElement().setOrientation(LowerCase.of(value));
    }

    // !wca! observe orientation: !ListOrientation

    // !wca! get selected: number
    /**
     * The index of the selected tab.
     */
    public int getSelected() {
        return getElement().getSelected();
    }

    // !wca! set selected: number
    /**
     * The index of the selected tab.
     */
    public void setSelected(int value) {
        getElement().setSelected(value);
    }

    // !wca! observe selected: number
    /**
     * The index of the selected tab.
     */
    public ObservableValue<Integer> selected() {
        return createObservableValue(this::getSelected, this::setSelected, "selected-changed");
    }

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    public enum Orientation {
        HORIZONTAL, VERTICAL
    }

    public enum Variant implements ThemeVariant {
        CENTERED,
        SMALL,
        MINIMAL,
        HIDE_SCROLL_BUTTONS,
        EQUAL_WIDTH_TABS
    }
}
