package com.github.fluorumlabs.disconnect.vaadin.tabs;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.tabs.TabElement;

/**
 * <code>&lt;vaadin-tab&gt;</code> is a Web Component providing an accessible and customizable tab.
 *
 * <pre><code>   &lt;vaadin-tab&gt;
 *      Tab 1
 *    &lt;/vaadin-tab&gt;
 * </code></pre>
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
 *    <td><code>disabled</code></td>
 *    <td>Set to a disabled tab</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>focused</code></td>
 *    <td>Set when the element is focused</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>focus-ring</code></td>
 *    <td>Set when the element is keyboard focused</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>selected</code></td>
 *    <td>Set when the tab is selected</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>active</code></td>
 *    <td>Set when mousedown or enter/spacebar pressed</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>orientation</code></td>
 *    <td>Set to <code>horizontal</code> or <code>vertical</code> depending on the direction of items</td>
 *    <td>:host</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, ThemableMixin, ItemMixin, ElementMixin
 */
@CustomElement(tagName = "vaadin-tab", external = true)
public class Tab extends HtmlComponent<TabElement> implements Themable<TabElement> {

    public Tab() {
    }

    public Tab(String textContent) {
        super(textContent);
    }

    public Tab(Component<?>... components) {
        super(components);
    }

    // !wca! get disabled: boolean
    /**
     * If true, the user cannot interact with this element.
     */
    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    // !wca! set disabled: boolean
    /**
     * If true, the user cannot interact with this element.
     */
    public void setDisabled(boolean value) {
        getElement().setDisabled(value);
    }

    // !wca! observe disabled: boolean

    // !wca! get selected: boolean
    /**
     * If true, the item is in selected state.
     */
    public boolean isSelected() {
        return getElement().isSelected();
    }

    // !wca! set selected: boolean
    /**
     * If true, the item is in selected state.
     */
    public void setSelected(boolean value) {
        getElement().setSelected(value);
    }

    // !wca! observe selected: boolean
    /**
     * If true, the item is in selected state.
     */
    public ObservableValue<Boolean> selected() {
        return createObservableValue(this::isSelected, this::setSelected, "selected-changed");
    }

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! get value: string

    // !wca! set value: string

    // !wca! observe value: string
}
