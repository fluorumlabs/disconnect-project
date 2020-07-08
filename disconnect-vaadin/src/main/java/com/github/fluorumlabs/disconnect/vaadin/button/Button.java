package com.github.fluorumlabs.disconnect.vaadin.button;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import com.github.fluorumlabs.disconnect.vaadin.theme.ThemeVariant;
import js.lang.external.vaadin.button.ButtonElement;

/**
 * <code>&lt;vaadin-button&gt;</code> is a Web Component providing an accessible and customizable button.
 *
 * <pre><code class="language-html">&lt;vaadin-button&gt;
 * &lt;/vaadin-button&gt;
 * </code></pre>
 * <pre><code class="language-js">document.querySelector('vaadin-button').addEventListener('click', () =&gt; alert('Hello World!'));
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
 *    <td><code>label</code></td>
 *    <td>The label (text) inside the button</td>
 *   </tr>
 *   <tr>
 *    <td><code>prefix</code></td>
 *    <td>A slot for e.g. an icon before the label</td>
 *   </tr>
 *   <tr>
 *    <td><code>suffix</code></td>
 *    <td>A slot for e.g. an icon after the label</td>
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
 *    <td><code>active</code></td>
 *    <td>Set when the button is pressed down, either with mouse, touch or the keyboard.</td>
 *   </tr>
 *   <tr>
 *    <td><code>disabled</code></td>
 *    <td>Set when the button is disabled.</td>
 *   </tr>
 *   <tr>
 *    <td><code>focus-ring</code></td>
 *    <td>Set when the button is focused using the keyboard.</td>
 *   </tr>
 *   <tr>
 *    <td><code>focused</code></td>
 *    <td>Set when the button is focused.</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, ControlStateMixin, ThemableMixin, GestureEventListeners, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-button", external = true)
public class Button extends HtmlComponent<ButtonElement> implements Themable<ButtonElement> {

    public Button() {
    }

    public Button(String textContent) {
        super(textContent);
    }

    public Button(Component<?>... components) {
        super(components);
    }

    // !wca! click: (): void

    // !wca! get autofocus: boolean | null | undefined
    /**
     * Specify that this control should have input focus when the page loads.
     */
    public boolean isAutofocus() {
        return getElement().isAutofocus();
    }

    // !wca! set autofocus: boolean | null | undefined
    /**
     * Specify that this control should have input focus when the page loads.
     */
    public void setAutofocus(boolean value) {
        getElement().setAutofocus(value);
    }

    // !wca! observe autofocus: boolean | null | undefined

    // !wca! get disabled: boolean | null | undefined
    /**
     * If true, the user cannot interact with this element.
     */
    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    // !wca! set disabled: boolean | null | undefined
    /**
     * If true, the user cannot interact with this element.
     */
    public void setDisabled(boolean value) {
        getElement().setDisabled(value);
    }

    // !wca! observe disabled: boolean | null | undefined

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    public enum Variant implements ThemeVariant {
        SMALL,
        LARGE,
        TERTIARY,
        TERTIARY_INLINE,
        PRIMARY,
        SUCCESS,
        ERROR,
        CONTRAST,
        ICON
    }
}
