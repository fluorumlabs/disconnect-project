package js.lang.external.vaadin.menubar;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;

/**
 * <strong>Mixins:</strong> ElementMixin, ControlStateMixin, ThemableMixin, GestureEventListeners, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-menu-bar", version = "^1.2.0-alpha1")
@Import(module = "@vaadin/vaadin-menu-bar/theme/material/vaadin-menu-bar-button.js")
public interface MenuBarButtonElement extends HTMLElement {

    // !wca! click: (): void
    /**
     */
    @JSMethod("click")
    void click();

    // !wca! get autofocus: boolean | null | undefined

    // !wca! set autofocus: boolean | null | undefined

    // !wca! get disabled: boolean | null | undefined

    // !wca! set disabled: boolean | null | undefined

    // !wca! get focusElement: Element | null

    // !wca! get theme: string | null | undefined
}
