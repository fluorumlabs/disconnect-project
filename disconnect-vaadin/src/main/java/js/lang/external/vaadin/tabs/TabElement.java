package js.lang.external.vaadin.tabs;

import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

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
@NpmPackage(name = "@vaadin/vaadin-tabs", version = "^3.2.0-alpha2")
@Import(module = "@vaadin/vaadin-tabs/vaadin-tab.js")
public interface TabElement extends HTMLElement {

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
