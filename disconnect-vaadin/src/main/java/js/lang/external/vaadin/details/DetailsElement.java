package js.lang.external.vaadin.details;

import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

/**
 * <code>&lt;vaadin-details&gt;</code> is a Web Component which the creates an expandable panel similar to <code>&lt;details&gt;</code> HTML element.
 *
 * <pre><code>&lt;vaadin-details&gt;
 *    &lt;div slot="summary"&gt;Expandable Details&lt;/div&gt;
 *    Toggle using mouse, Enter and Space keys.
 * &lt;/vaadin-details&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are exposed for styling:
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
 *    <td><code>summary</code></td>
 *    <td>The element used to open and close collapsible content.</td>
 *   </tr>
 *   <tr>
 *    <td><code>toggle</code></td>
 *    <td>The element used as indicator, can represent an icon.</td>
 *   </tr>
 *   <tr>
 *    <td><code>summary-content</code></td>
 *    <td>The wrapper for the slotted summary content.</td>
 *   </tr>
 *   <tr>
 *    <td><code>content</code></td>
 *    <td>The wrapper for the collapsible details content.</td>
 *   </tr>
 *  </tbody>
 * </table>
 * The following attributes are exposed for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Attribute</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>opened</code></td>
 *    <td>Set when the collapsible content is expanded and visible.</td>
 *   </tr>
 *   <tr>
 *    <td><code>disabled</code></td>
 *    <td>Set when the element is disabled.</td>
 *   </tr>
 *   <tr>
 *    <td><code>focus-ring</code></td>
 *    <td>Set when the element is focused using the keyboard.</td>
 *   </tr>
 *   <tr>
 *    <td><code>focused</code></td>
 *    <td>Set when the element is focused.</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ControlStateMixin, ElementMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-details", version = "^1.2.0-alpha1")
@Import(module = "@vaadin/vaadin-details/vaadin-details.js")
public interface DetailsElement extends HTMLElement {

    // !wca! click: (): void
    /**
     */
    @JSMethod("click")
    void click();

    // !wca! get autofocus: boolean | null | undefined
    /**
     * Specify that this control should have input focus when the page loads.
     */
    @JSProperty("autofocus")
    boolean isAutofocus();

    // !wca! set autofocus: boolean | null | undefined
    /**
     * Specify that this control should have input focus when the page loads.
     */
    @JSProperty("autofocus")
    void setAutofocus(boolean value);

    // !wca! get disabled: boolean | null | undefined
    /**
     * If true, the user cannot interact with this element.
     */
    @JSProperty("disabled")
    boolean isDisabled();

    // !wca! set disabled: boolean | null | undefined
    /**
     * If true, the user cannot interact with this element.
     */
    @JSProperty("disabled")
    void setDisabled(boolean value);

    // !wca! get opened: boolean
    /**
     * If true, the details content is visible.
     */
    @JSProperty("opened")
    boolean isOpened();

    // !wca! set opened: boolean
    /**
     * If true, the details content is visible.
     */
    @JSProperty("opened")
    void setOpened(boolean value);

    // !wca! get theme: string | null | undefined
}
