package js.lang.external.vaadin.grid;

import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

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
@NpmPackage(name = "@vaadin/vaadin-grid", version = "^5.7.0-alpha4")
@Import(module = "@vaadin/vaadin-grid/vaadin-grid-tree-toggle.js")
public interface GridTreeToggleElement extends HTMLElement {

    // !wca! get expanded: boolean
    /**
     * Sublevel toggle state.
     */
    @JSProperty("expanded")
    boolean isExpanded();

    // !wca! set expanded: boolean
    /**
     * Sublevel toggle state.
     */
    @JSProperty("expanded")
    void setExpanded(boolean value);

    // !wca! get leaf: boolean
    /**
     * Hides the toggle icon and disables toggling a tree sublevel.
     */
    @JSProperty("leaf")
    boolean isLeaf();

    // !wca! set leaf: boolean
    /**
     * Hides the toggle icon and disables toggling a tree sublevel.
     */
    @JSProperty("leaf")
    void setLeaf(boolean value);

    // !wca! get level: number
    /**
     * Current level of the tree represented with a horizontal offset
     * of the toggle button.
     */
    @JSProperty("level")
    int getLevel();

    // !wca! set level: number
    /**
     * Current level of the tree represented with a horizontal offset
     * of the toggle button.
     */
    @JSProperty("level")
    void setLevel(int value);

    // !wca! get theme: string | null | undefined
}
