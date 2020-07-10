package com.github.fluorumlabs.disconnect.vaadin.details;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.containers.SlotComponentList;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import com.github.fluorumlabs.disconnect.vaadin.theme.ThemeVariant;
import js.lang.external.vaadin.details.DetailsElement;

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
@CustomElement(tagName = "vaadin-details", external = true)
public class Details extends HtmlComponent<DetailsElement> implements Themable<DetailsElement> {

    public Details() {
    }

    public Details(String textContent) {
        super(textContent);
    }

    public Details(Component<?>... components) {
        super(components);
    }

    private final ComponentList<Component<?>> detailsSlot = new SlotComponentList<>(getElement(), "");

    /**
     * Default container for details
     */
    public ComponentList<Component<?>> detailsSlot() {
        return detailsSlot;
    }

    private final ComponentList<Component<?>> summarySlot = new SlotComponentList<>(getElement(), "summary");

    /**
     * Container for summary
     */
    public ComponentList<Component<?>> summarySlot() {
        return summarySlot;
    }

    private final ComponentList<Component<?>> drawerSlot = new SlotComponentList<>(getElement(), "drawer");


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

    // !wca! get opened: boolean
    /**
     * If true, the details content is visible.
     */
    public boolean isOpened() {
        return getElement().isOpened();
    }

    // !wca! set opened: boolean
    /**
     * If true, the details content is visible.
     */
    public void setOpened(boolean value) {
        getElement().setOpened(value);
    }

    // !wca! observe opened: boolean
    /**
     * If true, the details content is visible.
     */
    public ObservableValue<Boolean> opened() {
        return createObservableValue(this::isOpened, this::setOpened, "opened-changed");
    }

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    public enum Variant implements ThemeVariant {
        FILLED,
        SMALL,
        REVERSE
    }


}
