package js.lang.external.vaadin.tabs;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.util.collections.ReadonlyArray;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

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
@NpmPackage(name = "@vaadin/vaadin-tabs", version = "^3.2.0-alpha2")
@Import(module = "@vaadin/vaadin-tabs/vaadin-tabs.js")
public interface TabsElement extends HTMLElement {

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
    ReadonlyArray<TabElement> getItems();

    // !wca! get orientation: !ListOrientation
    /**
     * Set tabs disposition. Possible values are <code>horizontal\|vertical</code>
     */
    @JSProperty("orientation")
    String getOrientation();

    // !wca! set orientation: !ListOrientation
    /**
     * Set tabs disposition. Possible values are <code>horizontal\|vertical</code>
     */
    @JSProperty("orientation")
    void setOrientation(String value);

    // !wca! get selected: number
    /**
     * The index of the selected tab.
     */
    @JSProperty("selected")
    int getSelected();

    // !wca! set selected: number
    /**
     * The index of the selected tab.
     */
    @JSProperty("selected")
    void setSelected(int value);

    // !wca! get theme: string | null | undefined
}
