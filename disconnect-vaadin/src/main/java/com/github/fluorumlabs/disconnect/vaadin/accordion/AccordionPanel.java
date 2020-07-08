package com.github.fluorumlabs.disconnect.vaadin.accordion;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.accordion.AccordionPanelElement;
import js.web.dom.HTMLElement;
import org.checkerframework.checker.units.qual.A;

/**
 * The accordion panel element.
 *
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
 *    <td>The wrapper for the collapsible panel content.</td>
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
 */
@CustomElement(tagName = "vaadin-accordion-panel", external = true)
public class AccordionPanel extends HtmlComponent<AccordionPanelElement> implements Themable<AccordionPanelElement> {

    public AccordionPanel() {
    }

    public AccordionPanel(String textContent) {
        super(textContent);
    }

    public AccordionPanel(Component<?>... components) {
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

    // !wca! get focusElement: HTMLElement

    // !wca! observe focusElement: HTMLElement

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
}
