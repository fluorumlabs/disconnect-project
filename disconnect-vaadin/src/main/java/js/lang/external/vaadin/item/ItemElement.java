package js.lang.external.vaadin.item;

import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

/**
 * <code>&lt;vaadin-item&gt;</code> is a Web Component providing layout for items in tabs and menus.
 *
 * <pre><code>   &lt;vaadin-item&gt;
 *      Item content
 *    &lt;/vaadin-item&gt;
 * </code></pre>
 * <h3>Selectable</h3>
 * <code>&lt;vaadin-item&gt;</code> has the <code>selected</code> property and the corresponding state attribute. Currently, the component sets the <code>selected</code> to false, when <code>disabled</code> property is set to true. But other than that, the <code>&lt;vaadin-item&gt;</code> does not switch selection by itself. In general, it is the wrapper component, like <code>&lt;vaadin-list-box&gt;</code>, which should update the <code>selected</code> property on the items, e. g. on mousedown or when Enter / Spacebar is pressed.
 *
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
 *    <td><code>content</code></td>
 *    <td>The element that wraps the slot</td>
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
 *    <td><code>disabled</code></td>
 *    <td>Set to a disabled item</td>
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
 *    <td>Set when the item is selected</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>active</code></td>
 *    <td>Set when mousedown or enter/spacebar pressed</td>
 *    <td>:host</td>
 *   </tr>
 *  </tbody>
 * </table>
 * <strong>Mixins:</strong> ItemMixin, ThemableMixin, DirMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-item", version = "^2.3.0-alpha1")
@Import(module = "@vaadin/vaadin-item/vaadin-item.js")
public interface ItemElement extends HTMLElement {

    // !wca! get disabled: boolean
    /**
     * If true, the user cannot interact with this element.
     */
    @JSProperty("disabled")
    boolean isDisabled();

    // !wca! set disabled: boolean
    /**
     * If true, the user cannot interact with this element.
     */
    @JSProperty("disabled")
    void setDisabled(boolean value);

    // !wca! get selected: boolean
    /**
     * If true, the item is in selected state.
     */
    @JSProperty("selected")
    boolean isSelected();

    // !wca! set selected: boolean
    /**
     * If true, the item is in selected state.
     */
    @JSProperty("selected")
    void setSelected(boolean value);

    // !wca! get theme: string | null | undefined

    // !wca! get value: string
    /**
     */
    @JSProperty("value")
    String getValue();

    // !wca! set value: string
    /**
     */
    @JSProperty("value")
    void setValue(String value);
}
