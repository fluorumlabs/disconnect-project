package com.github.fluorumlabs.disconnect.vaadin.applayout;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.applayout.DrawerToggleElement;
import js.web.dom.Event;

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
@CustomElement(tagName = "vaadin-drawer-toggle", external = true)
public class DrawerToggle extends HtmlComponent<DrawerToggleElement> implements Themable<DrawerToggleElement> {

    public DrawerToggle() {
    }

    public DrawerToggle(String textContent) {
        super(textContent);
    }

    public DrawerToggle(Component<?>... components) {
        super(components);
    }

    // !wca! click: (): void

    // !wca! get ariaLabel: ?
    /**
     */
    public String getAriaLabel() {
        return getElement().getAriaLabel();
    }

    // !wca! set ariaLabel: ?
    /**
     */
    public void setAriaLabel(String value) {
        getElement().setAriaLabel(value);
    }

    // !wca! observe ariaLabel: ?

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

    // !wca! get focusElement: Element | null

    // !wca! observe focusElement: Element | null

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! event drawer-toggle-click: ?
    public ObservableEvent<Event> drawerToggleClickEvent() {
        return createEvent("drawer-toggle-click");
    }
}
