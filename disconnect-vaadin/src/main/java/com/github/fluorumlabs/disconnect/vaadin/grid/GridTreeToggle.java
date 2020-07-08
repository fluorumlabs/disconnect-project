package com.github.fluorumlabs.disconnect.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import com.github.fluorumlabs.disconnect.vaadin.theme.ThemeVariant;
import js.lang.external.vaadin.grid.GridTreeToggleElement;

/**
 * <code>&lt;vaadin-grid-tree-toggle&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code> that provides toggle and level display functionality for the item tree.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid-column&gt;
 *    &lt;template class="header"&gt;Package name&lt;/template&gt;
 *    &lt;template&gt;
 *      &lt;vaadin-grid-tree-toggle
 *          leaf="[[!item.hasChildren]]"
 *          expanded="{{expanded}}"
 *          level="[[level]]"&gt;
 *        [[item.name]]
 *      &lt;/vaadin-grid-tree-toggle&gt;
 *    &lt;/template&gt;
 * &lt;/vaadin-grid-column&gt;
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
 *    <td><code>toggle</code></td>
 *    <td>The tree toggle icon</td>
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
 *    <td><code>expanded</code></td>
 *    <td>When present, the toggle is expanded</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>leaf</code></td>
 *    <td>When present, the toggle is not expandable, i. e., the current item is a leaf</td>
 *    <td>:host</td>
 *   </tr>
 *  </tbody>
 * </table>
 * The following custom CSS properties are available on the <code>&lt;vaadin-grid-tree-toggle&gt;</code> element:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Custom CSS property</th>
 *    <th>Description</th>
 *    <th>Default</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>--vaadin-grid-tree-toggle-level-offset</code></td>
 *    <td>Visual offset step for each tree sublevel</td>
 *    <td><code>1em</code></td>
 *   </tr>
 *  </tbody>
 * </table>
 * <strong>Mixins:</strong> ThemableMixin, DirMixin, ElementMixin
 */
@CustomElement(tagName = "vaadin-grid-tree-toggle", external = true)
public class GridTreeToggle extends HtmlComponent<GridTreeToggleElement> implements Themable<GridTreeToggleElement> {

    public GridTreeToggle() {
    }

    public GridTreeToggle(String textContent) {
        super(textContent);
    }

    public GridTreeToggle(Component<?>... components) {
        super(components);
    }

    // !wca! get expanded: boolean
    /**
     * Sublevel toggle state.
     */
    public boolean isExpanded() {
        return getElement().isExpanded();
    }

    // !wca! set expanded: boolean
    /**
     * Sublevel toggle state.
     */
    public void setExpanded(boolean value) {
        getElement().setExpanded(value);
    }

    // !wca! observe expanded: boolean
    /**
     * Sublevel toggle state.
     */
    public ObservableValue<Boolean> expanded() {
        return createObservableValue(this::isExpanded, this::setExpanded, "expanded-changed");
    }

    // !wca! get leaf: boolean
    /**
     * Hides the toggle icon and disables toggling a tree sublevel.
     */
    public boolean isLeaf() {
        return getElement().isLeaf();
    }

    // !wca! set leaf: boolean
    /**
     * Hides the toggle icon and disables toggling a tree sublevel.
     */
    public void setLeaf(boolean value) {
        getElement().setLeaf(value);
    }

    // !wca! observe leaf: boolean

    // !wca! get level: number
    /**
     * Current level of the tree represented with a horizontal offset
     * of the toggle button.
     */
    public int getLevel() {
        return getElement().getLevel();
    }

    // !wca! set level: number
    /**
     * Current level of the tree represented with a horizontal offset
     * of the toggle button.
     */
    public void setLevel(int value) {
        getElement().setLevel(value);
    }

    // !wca! observe level: number

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    public enum Variant implements ThemeVariant {
        CONNECTORS
    }
}
