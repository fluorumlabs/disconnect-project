package js.lang.external.vaadin.applayout;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

/**
 * The Drawer Toggle component controls the drawer in App Layout component.
 *
 * <pre><code>&lt;vaadin-app-layout&gt;
 *    &lt;vaadin-drawer-toggle slot="navbar"&gt;Toggle drawer&lt;/vaadin-drawer-toggle&gt;
 * &lt;/vaadin-app-layout&gt;
 * </code></pre>
 * <strong>Mixins:</strong> ElementMixin, ControlStateMixin, ThemableMixin, GestureEventListeners, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-app-layout", version = "^2.2.0-alpha1")
@Import(module = "@vaadin/vaadin-app-layout/vaadin-drawer-toggle.js")
public interface DrawerToggleElement extends HTMLElement {

    // !wca! click: (): void

    // !wca! get ariaLabel: ?
    /**
     */
    @JSProperty("ariaLabel")
    String getAriaLabel();

    // !wca! set ariaLabel: ?
    /**
     */
    @JSProperty("ariaLabel")
    void setAriaLabel(String value);

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

    // !wca! get focusElement: Element | null

    // !wca! get theme: string | null | undefined
}
