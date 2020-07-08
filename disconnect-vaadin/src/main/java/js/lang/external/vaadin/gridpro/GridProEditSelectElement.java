package js.lang.external.vaadin.gridpro;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;

/**
 * The cell editor select element.
 *
 * <h3>Styling</h3>
 * See <a href="https://github.com/vaadin/vaadin-select/blob/master/src/vaadin-select.html"><code>&lt;vaadin-select&gt;</code> documentation</a> for <code>&lt;vaadin-grid-pro-edit-select&gt;</code> parts.
 *
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, ControlStateMixin, ThemableMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-grid-pro", version = "^2.2.0-alpha3")
@Import(module = "@vaadin/vaadin-grid-pro/theme/material/vaadin-grid-pro-edit-select.js")
public interface GridProEditSelectElement extends HTMLElement {

    // !wca! click: (): void

    // !wca! notifyResize: (): void

    // !wca! validate: (): boolean

    // !wca! get autofocus: boolean | null | undefined

    // !wca! set autofocus: boolean | null | undefined

    // !wca! get disabled: boolean | null | undefined

    // !wca! set disabled: boolean | null | undefined

    // !wca! get errorMessage: string

    // !wca! set errorMessage: string

    // !wca! get focusElement: HTMLElement

    // !wca! get invalid: boolean

    // !wca! set invalid: boolean

    // !wca! get label: string | null | undefined

    // !wca! set label: string | null | undefined

    // !wca! get name: string | null | undefined

    // !wca! set name: string | null | undefined

    // !wca! get opened: boolean

    // !wca! set opened: boolean

    // !wca! get options: array

    // !wca! set options: array

    // !wca! get placeholder: string | null | undefined

    // !wca! set placeholder: string | null | undefined

    // !wca! get readonly: boolean

    // !wca! set readonly: boolean

    // !wca! get renderer: SelectRenderer | undefined

    // !wca! set renderer: SelectRenderer | undefined

    // !wca! get required: boolean | null | undefined

    // !wca! set required: boolean | null | undefined

    // !wca! get theme: string | null | undefined

    // !wca! get value: string

    // !wca! set value: string
}
